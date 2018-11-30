package com.sd.his.wrapper;

import com.sd.his.model.*;
//import com.sd.his.model.Profile;
//import com.sd.his.utill.DateUtil;
import com.sd.his.utill.HISConstants;
import com.sd.his.wrapper.RaceWrapper;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jamal on 6/7/2018.
 */
public class PatientWrapper {
    //////IMPORTANT INFORMATION
    private String patientId;//natural id of patient
    private long id;         //pk of patient
    private Long patient;
    private long selectedDoctor = -1;
    private String primaryDoctorFirstName;
    private String primaryDoctorLastName;
    private String titlePrefix = "-1";
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private byte[] profileImg;
    private String homePhone = "";
    private String cellPhone = "";
    private boolean disableSMSTxt = true;
    private String officePhone = "";
    private String email = "";
    private String userName = "";
    private String preferredCommunication = "";
    private boolean status = true;
    /////// DEMOGRAPHY
    //private long profileId;
    private String patientSSN = "";
    private String dob = "";
    private String gender = "";
    private String country = "";
    private Long countryId;
    private String streetAddress = "";
    private String city = "";
    private Long cityId;
    private String state = "";
    private Long stateId;
    private String marital = "";
    private String emergencyContactName = "";
    private String emergencyContactPhone = "";
    private String emergencyContactRelation = "";
    private boolean profileStatus = true;

    ///////////////// INSURANCE
    private Long insuranceId;// primary key , i m 100 percent source
    private String company = "";
    private String insuranceIdNumber = "";// normal field
    private String groupNumber = "";// normal field
    private String planName = "";
    private String planType = "";
    private String cardIssuedDate = "";
    private String cardExpiryDate = "";
    private String primaryInsuranceNotes = "";
    private byte[] photoFront;
    private byte[] photoBack;
    private String profileImgURL;
    private String photoFrontURL;
    private String photoBackURL;
    ////////////Appointment
    List<AppointmentWrapper> futureAppointments;
    List<AppointmentWrapper> pastAppointments;
    private String label;
    private long value;

    ////////////Smoking Status
    private List<SmokingStatus> smokingStatuses;
    private boolean hasChild;//this object has child then true otherwise false

    public PatientWrapper() {
    }

    public PatientWrapper(Long id, String patientId, String patientSSN, String firstName, String lastName, String email, com.sd.his.model.City city, String address, String cellPhone) {
        this.id = id;
        this.patientId = patientId;
        this.patientSSN = patientSSN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddress = address;
        this.cellPhone = cellPhone;
        this.label = firstName;
        this.value = id;

        if (city != null) {
            this.city = city.getName();
            this.cityId = city.getId();

            this.state = city.getState().getName();
            this.stateId = city.getState().getId();

            this.country = city.getCountry().getName();
            this.countryId = city.getCountry().getId();
        }

    }

    public PatientWrapper(Patient patient) {
        this.id = patient.getId();
        this.patientId = patient.getPatientId();
        this.patientSSN = patient.getPatientSSN();
        this.firstName = patient.getFirstName();
        this.lastName = patient.getLastName();
        this.email = patient.getEmail();
        this.streetAddress = patient.getStreetAddress();
        this.cellPhone = patient.getCellPhone();
        this.label = patient.getFirstName();
        this.value = patient.getId();

        if (patient.getCity() != null) {
            this.city = patient.getCity().getName();
            this.cityId = patient.getCity().getId();

            this.state = patient.getCity().getState().getName();
            this.stateId = patient.getCity().getState().getId();

            this.country = patient.getCity().getCountry().getName();
            this.countryId = patient.getCity().getCountry().getId();
        }

    }

   /* public PatientWrapper(Long id, String patientId, String firstName, String lastName, String email,
                          com.sd.his.model.City city, String address, String cellPhone, List<Appointment> appointments) {
        this.id = id;
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddress = address;
        this.cellPhone = cellPhone;
        this.label = firstName;
        this.value = id;

        if (city != null) {
            this.city = city.getName();
            this.cityId = city.getId();

            this.state = city.getState().getName();
            this.stateId = city.getState().getId();

            this.country = city.getCountry().getName();
            this.countryId = city.getCountry().getId();
        }

        if(appointments.size()>0){
//            for(int i=0; i<appointments.size(); i++){
//                AppointmentWrapper futureAppointmentWrapper = new AppointmentWrapper();
//                AppointmentWrapper pastAppointmentWrapper = new AppointmentWrapper();
//                Appointment appointment = appointments.get(i);
//                if(appointment.getSchdeulledDate().after(LocalDateTime.now()));{
//                    futureAppointmentWrapper = new AppointmentWrapper(appointment);
//                }
//            }
        }

    }*/

    /*public PatientWrapper(User user, Profile profile, Insurance insurance) {
        this.userId = user.getId();
        this.userName = user.getUsername();
        this.statusUser = user.isActive();
//        this.deleted = user.isDeleted();
        this.email = user.getEmail();
//        this.Type = user.getUserType();

        this.profileId = profile.getId();
        this.patientSSN = profile.getPatientSSN();
        this.firstName = profile.getFirstName();
        this.middleName = profile.getMiddleName();
        this.lastName = profile.getLastName() == null ? "" : profile.getLastName();
        this.foreignName = profile.getForeignName();
        this.homePhone = profile.getHomePhone() == null ? "" : profile.getHomePhone();
        this.cellPhone = profile.getCellPhone() == null ? "" : profile.getCellPhone();
        this.officePhone = profile.getOfficePhone();
        this.officeExtension = profile.getOfficeExtension();
        this.preferredCommunication = profile.getPreferredCommunication();
        this.reminderLanguage = profile.getReminderLanguage();
        this.emergencyContactName = profile.getEmergencyContactName();
        this.emergencyContactPhone = profile.getEmergencyContactPhone();
        this.emergencyContactRelation = profile.getEmergencyContactRelation();
        this.disableSMSTxt = profile.getDisableSMSText();
        this.formattedAddress = profile.getFormattedAddress();
        this.streetAddress = profile.getStreetAddress();
        this.marital = profile.getMaritalStatus();
        this.zipCode = profile.getZipCode();
        this.signatureOnFile = profile.getSignatureOnFile();

        this.gender = profile.getGender() == null ? null : profile.getGender();
        this.profileImg = profile.getProfileImg() == null ? "" : profile.getProfileImg();
        this.city = profile.getCity() == null ? "" : profile.getCity();
        this.state = profile.getState() == null ? "" : profile.getState();
        this.country = profile.getCountry() == null ? "" : profile.getCountry();
        this.racesString = profile.getRaces();
        this.dob = profile.getDob() == null ? "" : DateUtil.getFormattedDateFromDate(profile.getDob(), HISConstants.DATE_FORMATE_THREE);

        this.titlePrefix = profile.getTitlePrefix();
        if (user.getPrimaryDoctor() != null) {
            this.selectedDoctor = user.getPrimaryDoctor().getId();
        }

        this.insuranceId = insurance.getId();
        this.company = insurance.getCompany();
        this.insuranceIdNumber = insurance.getInsuranceIDNumber();
        this.groupNumber = insurance.getGroupNumber();
        this.planName = insurance.getPlanName();
        this.planType = insurance.getPlanType();
        this.cardIssuedDate = insurance.getCardIssuedDate() == null ? "" : DateUtil.getFormattedDateFromDate(insurance.getCardIssuedDate(), HISConstants.DATE_FORMATE_THREE);
        this.cardExpiryDate = insurance.getCardExpiryDate() == null ? "" : DateUtil.getFormattedDateFromDate(insurance.getCardExpiryDate(), HISConstants.DATE_FORMATE_THREE);
        this.primaryInsuranceNotes = insurance.getPrimaryInsuranceNotes();
        *//*this.photoFront = insurance.getPhotoFront();
        this.photoBack = insurance.getPhotoBack();*//*
    }*/

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getPhotoFrontURL() {
        return photoFrontURL;
    }

    public void setPhotoFrontURL(String photoFrontURL) {
        this.photoFrontURL = photoFrontURL;
    }

    public String getPhotoBackURL() {
        return photoBackURL;
    }

    public void setPhotoBackURL(String photoBackURL) {
        this.photoBackURL = photoBackURL;
    }

    public String getProfileImgURL() {
        return profileImgURL;
    }

    public void setProfileImgURL(String profileImgURL) {
        this.profileImgURL = profileImgURL;
    }

    public String getPrimaryDoctorFirstName() {
        return primaryDoctorFirstName;
    }

    public void setPrimaryDoctorFirstName(String primaryDoctorFirstName) {
        this.primaryDoctorFirstName = primaryDoctorFirstName;
    }

    public String getPrimaryDoctorLastName() {
        return primaryDoctorLastName;
    }

    public void setPrimaryDoctorLastName(String primaryDoctorLastName) {
        this.primaryDoctorLastName = primaryDoctorLastName;
    }

    public List<AppointmentWrapper> getFutureAppointments() {
        return futureAppointments;
    }

    public void setFutureAppointments(List<AppointmentWrapper> futureAppointments) {
        this.futureAppointments = futureAppointments;
    }

    public List<AppointmentWrapper> getPastAppointments() {
        return pastAppointments;
    }

    public void setPastAppointments(List<AppointmentWrapper> pastAppointments) {
        this.pastAppointments = pastAppointments;
    }

    public Long getPatient() {
        return patient;
    }

    public void setPatient(Long patient) {
        this.patient = patient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public long getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(long selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    public String getTitlePrefix() {
        return titlePrefix;
    }

    public void setTitlePrefix(String titlePrefix) {
        this.titlePrefix = titlePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*public File getPatientPhoto() {
        return patientPhoto;
    }*/

    /*public void setPatientPhoto(File patientPhoto) {
        this.patientPhoto = patientPhoto;
    }*/

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public boolean isDisableSMSTxt() {
        return disableSMSTxt;
    }

    public void setDisableSMSTxt(boolean disableSMSTxt) {
        this.disableSMSTxt = disableSMSTxt;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPreferredCommunication() {
        return preferredCommunication;
    }

    public void setPreferredCommunication(String preferredCommunication) {
        this.preferredCommunication = preferredCommunication;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /*public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }*/

    public String getPatientSSN() {
        return patientSSN;
    }

    public void setPatientSSN(String patientSSN) {
        this.patientSSN = patientSSN;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getInsuranceIdNumber() {
        return insuranceIdNumber;
    }

    public void setInsuranceIdNumber(String insuranceIdNumber) {
        this.insuranceIdNumber = insuranceIdNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getCardIssuedDate() {
        return cardIssuedDate;
    }

    public void setCardIssuedDate(String cardIssuedDate) {
        this.cardIssuedDate = cardIssuedDate;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getPrimaryInsuranceNotes() {
        return primaryInsuranceNotes;
    }

    public void setPrimaryInsuranceNotes(String primaryInsuranceNotes) {
        this.primaryInsuranceNotes = primaryInsuranceNotes;
    }

    public byte[] getPhotoFront() {
        return photoFront;
    }

    public void setPhotoFront(byte[] photoFront) {
        this.photoFront = photoFront;
    }

    public byte[] getPhotoBack() {
        return photoBack;
    }

    public void setPhotoBack(byte[] photoBack) {
        this.photoBack = photoBack;
    }

    public boolean isProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(boolean profileStatus) {
        this.profileStatus = profileStatus;
    }

    public byte[] getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(byte[] profileImg) {
        this.profileImg = profileImg;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    public List<SmokingStatus> getSmokingStatus() {
        return smokingStatuses;
    }

    public void setSmokingStatuses(List<SmokingStatus> smokingStatuses) {
        this.smokingStatuses = smokingStatuses;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }
}
