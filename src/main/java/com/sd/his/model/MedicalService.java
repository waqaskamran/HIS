package com.sd.his.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/*
 * @author    : Irfan Nasim
 * @Date      : 14-May-18
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
 * @FileName  : MedicalService
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */
@Entity
@Table(name = "MEDICAL_SERVICE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MedicalService extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COST")
    private Double cost;

    @Column(name = "FEE")
    private Double fee;

    @Column(name = "DURATION")
    private Long duration;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMG_URL")
    private String imgURL;

    @Column(name = "STATUS")
    private Boolean status;

//    @ManyToOne
//    @JoinColumn(name = "TAX_ID")
//    private Tax tax;

    @JsonIgnore
    @OneToMany(targetEntity = DepartmentMedicalService.class, mappedBy = "medicalService")
    private List<DepartmentMedicalService> departments;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<DepartmentMedicalService> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentMedicalService> departments) {
        this.departments = departments;
    }
}
