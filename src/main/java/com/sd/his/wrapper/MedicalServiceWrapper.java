package com.sd.his.wrapper;

import com.sd.his.model.*;
import com.sd.his.wrapper.response.BranchResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/*
 * @author    : Jamal
 * @Date      : 31-July-18
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
 * @Package   : com.sd.his.wrapper
 * @FileName  : MedicalServiceWrapper
 *
 * Copyright ©
 * SolutionDots,
 * All rights reserved.
 *
 */
public class MedicalServiceWrapper {
    private long id;
    private String name;
    private String code;
    private double fee;
    private double cost;
    private boolean status;
    private String description;
    private long duration;
    private TaxWrapper tax;
    private long checkedDepartmentCount;
    private long checkedBranchCount;
    private long value;
    private String label;

    private List<BranchResponseWrapper> branches;//checkedBranch
    private List<BranchResponseWrapper> checkedBranches;
    private List<DepartmentWrapper> departments;
    private List<DepartmentWrapper> checkedDepartments;
    private List<TaxWrapper> taxes;
    private boolean hasChild;


    public MedicalServiceWrapper() {
    }

    public MedicalServiceWrapper(MedicalServiceWrapper medicalServiceWrapper) {
        this.id = medicalServiceWrapper.getId();
        this.name = medicalServiceWrapper.getName();
        this.code = medicalServiceWrapper.getCode();
        this.fee = medicalServiceWrapper.getFee();
        this.cost = medicalServiceWrapper.getCost();
        this.status = medicalServiceWrapper.isStatus();
        this.description = medicalServiceWrapper.getDescription();
        this.duration = medicalServiceWrapper.getDuration();
    }

    public MedicalServiceWrapper(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public MedicalServiceWrapper(MedicalService ms) {
        /*if (ms.getTax() == null) {
            this.tax = new TaxWrapper();
            this.tax.setId(-1);
        } else {
            this.tax = new TaxWrapper(ms.getTax());
        }*/
        this.id = ms.getId();
        this.label= ms.getName();
        this.value = ms.getId();
        this.name = ms.getName();
        this.code = ms.getCode();
        this.fee = ms.getFee();
        this.cost = ms.getCost();
        this.status = ms.getStatus();
        this.description = ms.getDescription();
        //this.duration = ms.getDuration();
       /* this.checkedBranchCount = ms.getBranchMedicalServices() == null ? 0 : ms.getBranchMedicalServices().size();
        this.checkedDepartmentCount = ms.getDepartmentMedicalServices() == null ? 0 : ms.getDepartmentMedicalServices().size();

        if (ms.getDoctorMedicalServices() != null && ms.getDoctorMedicalServices().size() > 0 ||
                ms.getAppointment() != null && ms.getAppointment().size() > 0) {
            this.hasChild = true;
        }*/

       if(ms.getBranchMedicalServices().size() != 0){
           this.setBranchServices(ms.getBranchMedicalServices());
       }

    }
    public void setBranchServices(List<BranchMedicalService> list){
        this.branches = list.stream()
                .map(x->new BranchResponseWrapper(x.getBranch().getId(),x.getBranch().getName()))
                .collect(Collectors.toList());
    }

    public MedicalServiceWrapper(MedicalService ms, String search) {
        if (ms.getTax() == null) {
            this.tax = new TaxWrapper();
            this.tax.setId(-1);
        } else {
            this.tax = new TaxWrapper(ms.getTax());
        }
        this.id = ms.getId();
        this.name = ms.getName();
        this.name = ms.getName();
        this.fee = ms.getFee();
        this.cost = ms.getCost();
        this.status = ms.getStatus();
        this.description = ms.getDescription();
        this.duration = ms.getDuration();
        if (ms.getDoctorMedicalServices() != null && ms.getDoctorMedicalServices().size() > 0 ||
                ms.getAppointment() != null && ms.getAppointment().size() > 0) {
            this.hasChild = true;
        }
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public TaxWrapper getTax() {
        return tax;
    }

    public void setTax(TaxWrapper tax) {
        this.tax = tax;
    }

    public List<BranchResponseWrapper> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchResponseWrapper> branches) {
        this.branches = branches;
    }

    public List<BranchResponseWrapper> getCheckedBranches() {
        return checkedBranches;
    }

    public void setCheckedBranches(List<BranchResponseWrapper> checkedBranches) {
        this.checkedBranches = checkedBranches;
    }

    public List<DepartmentWrapper> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentWrapper> departments) {
        this.departments = departments;
    }

    public List<DepartmentWrapper> getCheckedDepartments() {
        return checkedDepartments;
    }

    public void setCheckedDepartments(List<DepartmentWrapper> checkedDepartments) {
        this.checkedDepartments = checkedDepartments;
    }

    public List<TaxWrapper> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<TaxWrapper> taxes) {
        this.taxes = taxes;
    }

    public long getCheckedDepartmentCount() {
        return checkedDepartmentCount;
    }

    public void setCheckedDepartmentCount(long checkedDepartmentCount) {
        this.checkedDepartmentCount = checkedDepartmentCount;
    }

    public long getCheckedBranchCount() {
        return checkedBranchCount;
    }

    public void setCheckedBranchCount(long checkedBranchCount) {
        this.checkedBranchCount = checkedBranchCount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }
}
