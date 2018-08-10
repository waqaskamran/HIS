package com.sd.his.service;

import com.sd.his.enums.GenderTypeEnum;
import com.sd.his.enums.MaritalStatusTypeEnum;
import com.sd.his.enums.ModuleEnum;
import com.sd.his.enums.PatientStatusTypeEnum;
import com.sd.his.model.Doctor;
import com.sd.his.model.Insurance;
import com.sd.his.model.Patient;
import com.sd.his.repository.DoctorRepository;
import com.sd.his.repository.PatientRepository;
import com.sd.his.utill.DateTimeUtil;
import com.sd.his.utill.HISConstants;
import com.sd.his.wrapper.PatientWrapper;
import com.sd.his.wrapper.RaceWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private HISUtilService hisUtilService;

    private void populatePatientWrapper(PatientWrapper patientWrapper, Patient patient) {
        patientWrapper.setId(patient.getId());//patient pk
        patientWrapper.setPatientId(patient.getPatientId());//patient natural id
        patientWrapper.setTitlePrefix(patient.getTitle());
        patientWrapper.setPatientSSN(patient.getPatientSSN());
        patientWrapper.setFirstName(patient.getFirstName());
        patientWrapper.setMiddleName(patient.getMiddleName());
        patientWrapper.setLastName(patient.getLastName());
        patientWrapper.setForeignName(patient.getForeignName());
        if(patient.getDob()!=null)
            patientWrapper.setDob( patient.getDob()+"" );

        patientWrapper.setHomePhone(patient.getHomePhone());
        patientWrapper.setCellPhone(patient.getCellPhone());
        patientWrapper.setOfficePhone(patient.getOfficePhone());
        patientWrapper.setOfficeExtension(patient.getOfficeExtension());
        patientWrapper.setGender(patient.getGender().name());
        //image profile
        patientWrapper.setCountry(patient.getCountry());
        patientWrapper.setEmail(patient.getEmail());
        patientWrapper.setMarital(patient.getMaritalStatus().name());

        patientWrapper.setStatusUser(patient.getStatus().name().equalsIgnoreCase("ACTIVE"));

        //patientWrapper.setProfileStatus( patient.getStatus().name().equalsIgnoreCase("ACTIVE") );
        patientWrapper.setDisableSMSTxt(patient.getDisableSMSText());
        patientWrapper.setPreferredCommunication(patient.getPreferredCommunication());
        patientWrapper.setReminderLanguage(patient.getReminderLanguage());
        patientWrapper.setStreetAddress(patient.getStreetAddress());
        patientWrapper.setZipCode(patient.getZipCode());
        patientWrapper.setCity(patient.getCity());
        patientWrapper.setState(patient.getState());
        patientWrapper.setFormattedAddress(patient.getFormattedAddress());
        patientWrapper.setEmergencyContactName(patient.getEmergencyContactName());

        if (patient.getEmergencyContactPhone() != null)
            patientWrapper.setEmergencyContactPhone(patient.getEmergencyContactPhone());
        if (patient.getEmergencyContactRelation() != null)
            patientWrapper.setEmergencyContactRelation(patient.getEmergencyContactRelation());
        if (patient.getSignatureOnFile() != null)
            patientWrapper.setSignatureOnFile(patient.getSignatureOnFile());
        patientWrapper.setPatientId(hisUtilService.getPrefixId(ModuleEnum.PATIENT));
    }

    private void populatePatient(Patient patient, PatientWrapper patientWrapper) throws ParseException {
        patient.setTitle(patientWrapper.getTitlePrefix());
        patient.setPatientSSN(patientWrapper.getPatientSSN());
        patient.setFirstName(patientWrapper.getFirstName());
        patient.setMiddleName(patientWrapper.getMiddleName());
        patient.setLastName(patientWrapper.getLastName());
        patient.setForeignName(patient.getForeignName());
        if(!patientWrapper.getDob().isEmpty())
            patient.setDob(DateTimeUtil.getDateFromString(patientWrapper.getDob(), HISConstants.DATE_FORMATE_ONE));
        patient.setHomePhone(patientWrapper.getHomePhone());
        patient.setCellPhone(patientWrapper.getCellPhone());
        patient.setOfficePhone(patientWrapper.getOfficePhone());
        patient.setOfficeExtension(patientWrapper.getOfficeExtension());
        patient.setGender(GenderTypeEnum.valueOf(patientWrapper.getGender().toUpperCase()));
        //image profile
        patient.setCountry(patientWrapper.getCountry());
        patient.setEmail(patientWrapper.getEmail());
        patient.setMaritalStatus(MaritalStatusTypeEnum.valueOf(patientWrapper.getMarital().toUpperCase()));
        patient.setStatus(patientWrapper.isStatusUser() ? PatientStatusTypeEnum.ACTIVE : PatientStatusTypeEnum.INACTIVE);
        patient.setDisableSMSText(patientWrapper.isDisableSMSTxt());
        patient.setPreferredCommunication(patientWrapper.getPreferredCommunication());
        patient.setReminderLanguage(patientWrapper.getReminderLanguage());
        patient.setStreetAddress(patientWrapper.getStreetAddress());
        patient.setZipCode(patientWrapper.getZipCode());
        patient.setCity(patientWrapper.getCity());
        patient.setState(patientWrapper.getState());
        patient.setFormattedAddress(patientWrapper.getFormattedAddress());
        patient.setEmergencyContactName(patientWrapper.getEmergencyContactName());
        patient.setEmergencyContactPhone(patientWrapper.getEmergencyContactPhone());
        patient.setEmergencyContactRelation(patientWrapper.getEmergencyContactRelation());
        patient.setSignatureOnFile(patientWrapper.isSignatureOnFile());
        if(patient.getId() == null)
            patient.setPatientId(hisUtilService.getPrefixId(ModuleEnum.PATIENT));
    }

    private void populateInsurance(Insurance insurance, PatientWrapper patientWrapper) throws ParseException {
        insurance.setCompany(patientWrapper.getCompany());
        insurance.setInsuranceID(patientWrapper.getInsuranceId());
        insurance.setGroupNumber(patientWrapper.getGroupNumber());
        insurance.setPlanName(patientWrapper.getPlanName());
        insurance.setPlanType(patientWrapper.getPlanType());
        if (!patientWrapper.getCardIssuedDate().isEmpty())
            insurance.setCardIssuedDate(DateTimeUtil.getDateFromString(patientWrapper.getCardIssuedDate(), HISConstants.DATE_FORMATE_ONE));
        if (!patientWrapper.getCardExpiryDate().isEmpty())
            insurance.setCardExpiryDate(DateTimeUtil.getDateFromString(patientWrapper.getCardExpiryDate(), HISConstants.DATE_FORMATE_ONE));
        insurance.setPrimaryInsuranceNotes(patientWrapper.getPrimaryInsuranceNotes());
    }

    private void populateInsurance(PatientWrapper patientWrapper, Patient patient){
        patientWrapper.setCompany(patient.getInsurance().getCompany());
        patientWrapper.setInsuranceId(patient.getInsurance().getInsuranceID());
        patientWrapper.setGroupNumber(patient.getInsurance().getGroupNumber());
        patientWrapper.setPlanName(patient.getInsurance().getPlanName());
        patientWrapper.setPlanType(patient.getInsurance().getPlanType());
        if ( patient.getInsurance().getCardIssuedDate()!=null )
            patientWrapper.setCardIssuedDate(patient.getInsurance().getCardIssuedDate().toString());
        if ( patient.getInsurance().getCardExpiryDate()!=null )
            patientWrapper.setCardExpiryDate(patient.getInsurance().getCardExpiryDate().toString());
        patientWrapper.setPrimaryInsuranceNotes(patientWrapper.getPrimaryInsuranceNotes());
    }

    public String savePatient(PatientWrapper patientWrapper) throws Exception {
        Patient patient = null;
        if(patientWrapper.getId()>0){
            patient = patientRepository.findOne(patientWrapper.getId());
            if(patient==null)
                patient = new Patient();
        }else{
            patient = new Patient();
        }


        this.populatePatient(patient, patientWrapper);
        Insurance insurance = new Insurance();
        this.populateInsurance(insurance, patientWrapper);
        patient.setInsurance(insurance);
        Doctor doctor = doctorRepository.findOne(patientWrapper.getSelectedDoctor());
        patient.setPrimaryDoctor(doctor);
        List<String> racesList = patientWrapper.getRaces().stream().filter(ps -> ps.isSelected())
                .map(x -> x.getNameRace()).collect(Collectors.toList());
        patient.setRaces(racesList);

        patient = patientRepository.save(patient);
        //patientWrapper.

        /*
        Profile profile = new Profile(patientWrapper);
        UserRole userRole;
        User selectedDoctor = this.userRepository.findOne(patientWrapper.getSelectedDoctor());
        Insurance insurance = new Insurance(patientWrapper);
        User patient = new User(patientWrapper, UserTypeEnum.PATIENT.toString());
        patient.setPrimaryDoctor(selectedDoctor);

        this.profileRepository.save(profile);
        this.insuranceRepository.save(insurance);
        patient.setProfile(profile);
        patient.setInsurance(insurance);
        this.userRepository.save(patient);
        userRole = new UserRole(patient, roleRepo.findByName(UserTypeEnum.PATIENT.getValue()));
        userRoleRepository.save(userRole);
*/
        /// now saving images against user id

        ///profile photo save
        /*
        String url = null;
        if (patientWrapper.getProfileImg() != null) {
            url = userService.saveImage(patientWrapper.getProfileImg(),
                    HISConstants.S3_USER_PROFILE_DIRECTORY_PATH,
                    patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_PROFILE_THUMBNAIL_GRAPHIC_NAME,
                    patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_PROFILE_GRAPHIC_NAME,
                    "/"
                            + HISConstants.S3_USER_PROFILE_DIRECTORY_PATH
                            + patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_PROFILE_THUMBNAIL_GRAPHIC_NAME);
        }


        if (HISCoreUtil.isValidObject(url)) {
            patient.setProfileImgURL(url);
            this.patientRepository.save(patient);
            url = null;
        }
        ///profile photo save

        ///front photo save

        if (patientWrapper.getPhotoFront() != null) {
            url = userService.saveImage(patientWrapper.getPhotoFront(),
                    HISConstants.S3_USER_INSURANCE_DIRECTORY_PATH,
                    patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_INSURANCE_FRONT_PHOTO_THUMBNAIL_GRAPHIC_NAME,
                    patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_INSURANCE_FRONT_PHOTO_GRAPHIC_NAME,
                    "/"
                            + HISConstants.S3_USER_INSURANCE_DIRECTORY_PATH
                            + patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_INSURANCE_FRONT_PHOTO_THUMBNAIL_GRAPHIC_NAME);

        }
        if (HISCoreUtil.isValidObject(url)) {
            patient.getInsurance().setPhotoFrontURL(url);
            this.patientRepository.save(patient);
            url = null;
        }
        ///back photo save
        if (patientWrapper.getPhotoBack() != null) {
            url = userService.saveImage(patientWrapper.getPhotoBack(),
                    HISConstants.S3_USER_INSURANCE_DIRECTORY_PATH,
                    patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_INSURANCE_BACK_PHOTO_THUMBNAIL_GRAPHIC_NAME,
                    patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_INSURANCE_BACK_PHOTO_GRAPHIC_NAME,
                    "/"
                            + HISConstants.S3_USER_INSURANCE_DIRECTORY_PATH
                            + patient.getId()
                            + "_"
                            + patient.getInsurance().getId()
                            + "_"
                            + HISConstants.S3_USER_INSURANCE_BACK_PHOTO_THUMBNAIL_GRAPHIC_NAME);
        }

        if (HISCoreUtil.isValidObject(url)) {
            patient.getInsurance().setPhotoBackURL(url);
            this.patientRepository.save(patient);
            url = null;
        }
        */
        return patient.getId() + "";

    }

    public boolean isEmailAlreadyExists(String email) {
        Patient patient = this.patientRepository.findAllByEmail(email);
        return patient!=null;
    }

    public int countAllPaginatedPatients() {
        return this.patientRepository.findAll().size();
    }

    public List<PatientWrapper> findAllPaginatedPatients(int offset, int limit) {
        Pageable pageable = new PageRequest(offset, limit);
        List<Patient> patientList = patientRepository.getAllPaginatedPatients(pageable);
        return this.getPatientWrapperList(patientList);
        /*List<PatientWrapper> patientWrapperList = new ArrayList<>();
        for (Patient p: patientList) {
            patientWrapper = new PatientWrapper();
            this.populatePatientWrapper(patientWrapper, p );
            patientWrapperList.add(patientWrapper);
        }
        return patientWrapperList;*/
    }

    public PatientWrapper getPatientById(long id) {
        Patient patient = patientRepository.findOne(id);
        PatientWrapper patientWrapper = new PatientWrapper();
        this.populatePatientWrapper(patientWrapper, patient);
        patientWrapper.setSelectedDoctor(patient.getPrimaryDoctor().getId());
        this.populateRaces(patientWrapper, patient);
        this.populateInsurance(patientWrapper, patient);
        return patientWrapper;
    }

    private void populateRaces(PatientWrapper patientWrapper, Patient patient){
        List<RaceWrapper> raceWrapperList = new ArrayList<>();
        RaceWrapper raceWrapper = null;
        for (String raceName : patient.getRaces()) {
            raceWrapper = new RaceWrapper();
            raceWrapper.setNameRace(raceName);
            raceWrapper.setSelected(true);
            raceWrapperList.add(raceWrapper);
        }
        patientWrapper.setRaces(raceWrapperList);
    }

    public void deletePatientById(long patientId) {
        patientRepository.delete(patientId);
    }

    public List<PatientWrapper> searchAllPaginatedPatient(int offset, int limit, String searchString) {//searchString may contain patient name or cell number
        Pageable pageable = new PageRequest(offset, limit);
        List<Patient> patientList = patientRepository.searchPatientByNameOrCellNbr(pageable, searchString.toLowerCase());
        return this.getPatientWrapperList(patientList);
    }

    private List<PatientWrapper> getPatientWrapperList(List<Patient> patientList){
        PatientWrapper patientWrapper = new PatientWrapper();
        List<PatientWrapper> patientWrapperList = new ArrayList<>();
        for (Patient p: patientList) {
            patientWrapper = new PatientWrapper();
            this.populatePatientWrapper(patientWrapper, p );
            patientWrapperList.add(patientWrapper);
        }
        return patientWrapperList;
    }
}
