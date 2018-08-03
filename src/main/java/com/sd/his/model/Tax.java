package com.sd.his.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sd.his.utill.DateTimeUtil;
import com.sd.his.utill.HISConstants;
import com.sd.his.wrapper.DepartmentWrapper;
import com.sd.his.wrapper.TaxWrapper;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/*
 * @author    : Irfan Nasim
 * @Date      : 24-Apr-18
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
 * @Package   : com.sd.his.model
 * @FileName  : ClinicalDepartment
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */
@Entity
@Table(name = "TAX")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tax extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RATE")
    private Double rate;

    @Temporal(TemporalType.DATE)
    @Column(name = "FROM_DATE")
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TO_DATE")
    private Date toDate;

    @Column(name = "IS_ACTIVE", columnDefinition = "boolean default true", nullable = false)
    private Boolean active;

    @JsonIgnore
    @OneToMany(targetEntity = MedicalService.class, mappedBy = "tax")
    private List<MedicalService> medicalServices;

    public Tax() {
    }

    public Tax(TaxWrapper taxRequest) throws ParseException {
        this.name = taxRequest.getName();
        this.description = taxRequest.getDescription();
        this.rate = taxRequest.getRate();
        this.fromDate = DateTimeUtil.getDateFromString(taxRequest.getFromDate(), HISConstants.DATE_FORMATE_THREE);
        this.toDate = DateTimeUtil.getDateFromString(taxRequest.getToDate(), HISConstants.DATE_FORMATE_THREE);
        this.active = taxRequest.isActive();
    }

    public Tax(Tax dbTax, TaxWrapper taxRequest) throws ParseException {
        dbTax.setName(taxRequest.getName());
        dbTax.setDescription(taxRequest.getDescription());
        if (taxRequest.isHasChild()){
            dbTax.setRate(taxRequest.getRate());
        }
        dbTax.setFromDate(DateTimeUtil.getDateFromString(taxRequest.getFromDate(), HISConstants.DATE_FORMATE_THREE));
        dbTax.setToDate(DateTimeUtil.getDateFromString(taxRequest.getToDate(), HISConstants.DATE_FORMATE_THREE));
        dbTax.setActive(taxRequest.isActive());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<MedicalService> getMedicalServices() {
        return medicalServices;
    }

    public void setMedicalServices(List<MedicalService> medicalServices) {
        this.medicalServices = medicalServices;
    }
}
