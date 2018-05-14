package com.sd.his.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/*
 * @author    : irfan
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
public class MedicalService {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "COST")
    private String cost;

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

    @ManyToOne
    @JoinColumn(name = "TAX_ID")
    private Tax tax;

    @JsonIgnore
    @OneToMany(targetEntity = BranchMedicalService.class, mappedBy = "medicalService", fetch = FetchType.LAZY)
    private List<BranchMedicalService> branches;

    @JsonIgnore
    @OneToMany(targetEntity = ClinicalDepartmentMedicalService.class, mappedBy = "medicalService", fetch = FetchType.LAZY)
    private List<ClinicalDepartmentMedicalService> departments;

    public MedicalService() {
    }

    @Override
    public String toString() {
        return "MedicalService{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
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

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public List<BranchMedicalService> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchMedicalService> branches) {
        this.branches = branches;
    }

    public List<ClinicalDepartmentMedicalService> getDepartments() {
        return departments;
    }

    public void setDepartments(List<ClinicalDepartmentMedicalService> departments) {
        this.departments = departments;
    }
}
