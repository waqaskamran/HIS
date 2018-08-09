package com.sd.his.wrapper.response;

import com.sd.his.model.User;

/*
 * @author    : waqas kamran
 * @Date      : 17-Apr-18
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
 * @Package   : com.sd.his.*
 * @FileName  : UserAuthAPI
 *
 * Copyright ©
 * SolutionDots,
 * All rights reserved.
 *
 */
public class OrganizationResponseWrapper {

    Long id;
    Long branchId;
    String branchName;
    String firstName;
    String lastName;
    String companyName;
    String password;
    String fax;
    String confirmPassword;
    String homePhone;
    String cellPhone;
    String officePhone;
    String timezone;
    String appointmentSerial;
    String website;
    String defaultBranch;
    Long durationOfExam;
    Long durationFollowUp;
    String companyEmail;
    String speciality;
    User user;
    String username;
    String email;
    String address;
    String userType;

    public OrganizationResponseWrapper(Long id, String companyName, String officePhone, String website, String email,String homePhone, Long durationFollowUp,Long durationOFExam, String timezone,String speciality ,String fax,String address,String branchName
    ) {
        this.id = id;
        this.companyName = companyName;
        this.officePhone = officePhone;
//        this.appointmentSerial = appointmentSerial;
        this.website = website;
        this.companyEmail = email;
        this.website=website;
        this.homePhone=homePhone;
        this.durationOfExam=durationOFExam;
        this.durationFollowUp=durationFollowUp;
        this.speciality=speciality;
        this.fax=fax;
        this.address=address;
     //   this.branchId =brId;
     //   this.branchName =brName;

    }

    //organization pagination cons
    public OrganizationResponseWrapper(Long id, String companyName, String officePhone, String website, String email,String homePhone, Long durationFollowUp,Long durationOFExam, String timezone,String speciality ,String fax,String address
    ) {
        this.id = id;
        this.companyName = companyName;
        this.officePhone = officePhone;
//        this.appointmentSerial = appointmentSerial;
        this.website = website;
        this.companyEmail = email;
        this.website=website;
        this.homePhone=homePhone;
        this.durationOfExam=durationOFExam;
        this.durationFollowUp=durationFollowUp;
        this.speciality=speciality;
        this.fax=fax;
        this.address=address;
        //   this.branchId =brId;
        //   this.branchName =brName;

    }

    public OrganizationResponseWrapper(Long id,String userType,String userName,String email,String firstName,String lastName,
                                       String cellPhone,String homePhone,String address,String branchName,Long branchId) {
        this.id = id;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
        this.username = userName;
        this.email =email;
        this.userType =userType;
        this.firstName =firstName;
        this.lastName =lastName;
        this.address =address;
        this.branchId =branchId;
        this.branchName = branchName;


    }



    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

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

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAppointmentSerial() {
        return appointmentSerial;
    }

    public void setAppointmentSerial(String appointmentSerial) {
        this.appointmentSerial = appointmentSerial;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Long getDurationOfExam() {
        return durationOfExam;
    }

    public void setDurationOfExam(Long durationOfExam) {
        this.durationOfExam = durationOfExam;
    }

    public Long getDurationFollowUp() {
        return durationFollowUp;
    }

    public void setDurationFollowUp(Long durationFollowUp) {
        this.durationFollowUp = durationFollowUp;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}