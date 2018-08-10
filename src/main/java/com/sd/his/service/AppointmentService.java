package com.sd.his.service;

import com.google.gson.Gson;
import com.sd.his.enums.AppointmentStatusTypeEnum;
import com.sd.his.enums.AppointmentTypeEnum;
import com.sd.his.enums.ModuleEnum;
import com.sd.his.enums.UserTypeEnum;
import com.sd.his.model.*;
import com.sd.his.repository.*;
import com.sd.his.utill.HISCoreUtil;
import com.sd.his.wrapper.AppointmentWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/*
 * @author    : Irfan Nasim
 * @Date      : 08-Jun-18
 * @version   : ver. 1.0.0
 *
 * ________________________________________________________________________________________________
 *
 *  Developer				Date		     Version		Operation		Description
 * ________________________________________________________________________________________________
 *
 *
 * ________________________________________________________________________________________________
 *
 * @Project   : HIS
 * @Package   : com.sd.his.service
 * @FileName  : AppointmentService
 *
 * Copyright ©
 * SolutionDots,
 * All rights reserved.
 *
 */
@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    BranchRepository branchRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    HISUtilService hisUtilService;

    public List<AppointmentWrapper> findAllPaginatedAppointments(int offset, int limit) {
        Pageable pageable = new PageRequest(offset, limit);
         // List<AppointmentWrapper> list= appointmentRepository.findAllPaginatedAppointments(pageable);
      //   return appointmentRepository.findAllPaginatedAppointments(pageable);
      return null;
    }

    public List<AppointmentWrapper> findAllAppointments() {
        List<AppointmentWrapper> list = appointmentRepository.findAllAppointments();
        return appointmentRepository.findAllAppointments();

    }

    public Appointment findById(long id){
        return appointmentRepository.findOne(id);
    }

    public int countAllAppointments() {
        return appointmentRepository.findAll().size();
    }
    public Appointment saveAppointment(AppointmentWrapper appointmentWrapper){
        Appointment appointment =new Appointment();
        Branch branch = branchRepository.findOne(appointmentWrapper.getBranchId());
        // appointment.setRecurringDays(new Gson().toJson(appointmentWrapper.getSelectedRecurringDays()));
         Date scheduleDate = HISCoreUtil.convertToDate(appointmentWrapper.getScheduleDate());
         appointment.setSchdeulledDate(scheduleDate);
        Date date2 = Date.from(Instant.parse(appointmentWrapper.getScheduleDate()));
        appointment.setStartedOn(date2);
       //  appointment.setStartedOn(HISCoreUtil.convertToTime(scheduleDate));
         appointment.setEndedOn(HISCoreUtil.addTimetoDate(scheduleDate,appointmentWrapper.getDuration()));

      //   Date newDate = new Date(appointment.getSchdeulledDate().getTime() + appointment.getDuration());

       // appointment.setEndedOn(newDate);
        appointment.setReason(appointmentWrapper.getReason());
        appointment.setNotes(appointmentWrapper.getNotes());
        appointment.setColor(appointmentWrapper.getColor());
        appointment.setType(new Gson().toJson(appointmentWrapper.getAppointmentType()));
        appointment.setDuration(appointmentWrapper.getDuration());
        appointment.setStatus(AppointmentStatusTypeEnum.valueOf(appointmentWrapper.getStatus()));

     //   appointment.setEndedOn(appointmentWrapper.getStart() + appointmentWrapper.getDuration()*60*1000);


        appointment.setAppointmentId(hisUtilService.getPrefixId(ModuleEnum.APPOINTMENT));
      /*  appointment.setRecurring(appointmentWrapper.isRecurringAppointment());
        appointment.setFirstAppointmentOn(HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getFirstAppointment()));
        appointment.setLastAppointmentOn(HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getLastAppointment()));
        appointment.setType(new Gson().toJson(appointmentWrapper.getAppointmentType()));
        appointment.setStatus(appointmentWrapper.getStatus());
        appointment.setFollowUpReasonReminder(appointmentWrapper.getFollowUpReason());
        appointment.setFollowUpReminder(appointmentWrapper.getFollowUpReminder());
        appointment.setFollowUpDate(HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getFollowUpDate()));*/
        appointment.setName(appointmentWrapper.getTitle());
        appointment.setBranch(branch);
        Room room = findExamRoomById(appointmentWrapper.getRoomId());
        if(HISCoreUtil.isValidObject(room)){appointment.setRoom(room);}
        Doctor doctor = doctorRepository.findOne(appointmentWrapper.getDoctorId());
        appointment.setDoctor(doctor);

        /*if(appointmentWrapper.getAppointmentType().contains(AppointmentTypeEnum.NEW_PATIENT.getValue())) {
            User user = new User();
            Profile profile = new Profile();
            user.setPassword(bCryptPasswordEncoder.encode(appointmentWrapper.getTitle()));
            user.setEmail(appointmentWrapper.getEmail());
            user.setUsername(appointmentWrapper.getTitle());
            user.setUserType(String.valueOf(UserTypeEnum.PATIENT));
            user.setDeleted(false);
            user.setActive(true);

            profile.setType(String.valueOf(UserTypeEnum.PATIENT));
            profile.setFirstName(appointmentWrapper.getTitle());
            profile.setLastName(appointmentWrapper.getTitle());
            profile.setDeleted(false);
            profile.setActive(true);
            profile.setHomePhone(appointmentWrapper.getCellPhone());
            profile.setCellPhone(appointmentWrapper.getCellPhone());
            profile.setUpdatedOn(System.currentTimeMillis());
            profile.setCreatedOn(System.currentTimeMillis());
            profile.setGender(appointmentWrapper.getGender());
          //  appointment.setAge(Long.valueOf(appointmentWrapper.getAge()).longValue());
            user.setProfile(profile);
            userRepository.save(user);
            appointment.setPatient(user);
            appointmentRepository.save(appointment);
        }else {
            User user = userRepository.findByUsername(appointmentWrapper.getPatient());
            appointment.setPatient(user);
            appointmentRepository.save(appointment);
        }*/
        Patient patient = patientRepository.findOne(1L);
        appointment.setPatient(patient);
        appointmentRepository.save(appointment);
        return appointment;
    }

    public Appointment updateAppointment(AppointmentWrapper appointmentWrapper,Appointment alreadyExistAppointment){

        Branch branch = branchRepository.findOne(appointmentWrapper.getBranchId());
        // appointment.setRecurringDays(new Gson().toJson(appointmentWrapper.getSelectedRecurringDays()));

        Date scheduleDate = HISCoreUtil.convertToDate(appointmentWrapper.getScheduleDate());
        alreadyExistAppointment.setSchdeulledDate(scheduleDate);
        alreadyExistAppointment.setEndedOn(HISCoreUtil.addTimetoDate(scheduleDate,appointmentWrapper.getDuration()));
        alreadyExistAppointment.setReason(appointmentWrapper.getReason());
        alreadyExistAppointment.setNotes(appointmentWrapper.getNotes());
        alreadyExistAppointment.setColor(appointmentWrapper.getColor());
        alreadyExistAppointment.setType(new Gson().toJson(appointmentWrapper.getAppointmentType()));
        alreadyExistAppointment.setDuration(appointmentWrapper.getDuration());
        alreadyExistAppointment.setStatus(AppointmentStatusTypeEnum.valueOf(appointmentWrapper.getStatus()));
        //  alreadyExistAppointment.setName(appointmentWrapper.getTitle());
        alreadyExistAppointment.setBranch(branch);
        Room room = findExamRoomById(appointmentWrapper.getRoomId());
        if(HISCoreUtil.isValidObject(room)){alreadyExistAppointment.setRoom(room);}
        Doctor doctor = doctorRepository.findOne(appointmentWrapper.getDoctorId());
        alreadyExistAppointment.setDoctor(doctor);

        Patient patient = patientRepository.findOne(1L);
        alreadyExistAppointment.setPatient(patient);
        appointmentRepository.save(alreadyExistAppointment);
        return alreadyExistAppointment;
    }

   public List<AppointmentWrapper> getPageableSearchedAppointments(Long doctorId ,Long branchId) {
        //Pageable pageable = new PageRequest(offset, limit);
        List<AppointmentWrapper> test = appointmentRepository.findAllAppointmentsByDoctor(doctorId,branchId);
        return appointmentRepository.findAllAppointmentsByDoctor(doctorId,branchId);
    }

     public int countSearchedAppointments(Long doctorId,Long branchId) {
        Doctor doctor = doctorRepository.findOne(doctorId);
        Branch branch = branchRepository.findOne(branchId);
        return appointmentRepository.findByDoctorAndBranch(doctor,branch).size();
    }
    /*
        public Appointment updateAppointment(AppointmentWrapper appointmentWrapper,Appointment appointment) {
            Branch branch = branchRepository.getOne(appointmentWrapper.getBranchId());

            appointment.setRecurringDays(new Gson().toJson(appointmentWrapper.getSelectedRecurringDays()));
            long startTime= HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getStart());
            appointment.setStartedOn(startTime);
            appointment.setEndedOn(startTime + appointmentWrapper.getDuration()*60*1000);
            appointment.setUpdatedOn(System.currentTimeMillis());
            appointment.setDeleted(false);
            appointment.setActive(true);
            appointment.setRecurring(appointmentWrapper.isRecurringAppointment());
            appointment.setDuration(appointmentWrapper.getDuration());
    *//*
       if(HISCoreUtil.isValidObject((HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getFirstAppointment())))){
           appointment.setFirstAppointmentOn(HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getFirstAppointment()));
        }
        if(HISCoreUtil.isValidObject((HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getLastAppointment())))){
            appointment.setFirstAppointmentOn(HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getLastAppointment()));
        }
*//*
        appointment.setNotes(appointmentWrapper.getNotes());
        appointment.setColor(appointmentWrapper.getColor());
        appointment.setReason(appointmentWrapper.getReason());
        appointment.setType(new Gson().toJson(appointmentWrapper.getAppointmentType()));
        appointment.setStatus(appointmentWrapper.getStatus());
        appointment.setFollowUpReasonReminder(appointmentWrapper.getFollowUpReason());
        appointment.setFollowUpReminder(appointmentWrapper.getFollowUpReminder());
     // appointment.setFollowUpDate(HISCoreUtil.convertDateToMilliSeconds(appointmentWrapper.getFollowUpDate()));
        appointment.setFollowUpReasonReminder(appointmentWrapper.getReason());
        appointment.setName(appointmentWrapper.getTitle());
        appointment.setBranch(branch);
        roomRepository.getOne(appointmentWrapper.getRoomId());
        if(appointmentWrapper.getAppointmentType().contains(AppointmentTypeEnum.NEW_PATIENT.getValue())) {
            User user = userRepository.findByUsernameOrEmail(appointmentWrapper.getPatient(), appointmentWrapper.getEmail());
            Profile profile = user.getProfile();
            user.setUsername(appointmentWrapper.getPatient());
            user.setUserType(String.valueOf(UserTypeEnum.PATIENT));
            user.setDeleted(false);
            user.setActive(true);
            appointment.setAge(Long.valueOf(appointmentWrapper.getAge()).longValue());

            profile.setType(String.valueOf(UserTypeEnum.PATIENT));
            profile.setFirstName(appointmentWrapper.getTitle());
            profile.setLastName(appointmentWrapper.getTitle());
            profile.setDeleted(false);
            profile.setActive(true);
            profile.setHomePhone(appointmentWrapper.getCellPhone());
            profile.setCellPhone(appointmentWrapper.getCellPhone());
            profile.setUpdatedOn(System.currentTimeMillis());
            profile.setGender(appointmentWrapper.getGender());
            user.setProfile(profile);
            userRepository.save(user);
            appointment.setPatient(user);
            appointmentRepository.save(appointment);
        }else {
            appointmentRepository.save(appointment);}
            return appointment;
    }
*/
    public Room findExamRoomById(Long id) {
        if (id != null) {
            Room room = roomRepository.findOne(id);
            return room;
        }
        return null;
    }

  /*  public void deleteAppointment(Appointment appointment) {
        appointment.setDeleted(true);
        appointmentRepository.save(appointment);
    }
*/
}