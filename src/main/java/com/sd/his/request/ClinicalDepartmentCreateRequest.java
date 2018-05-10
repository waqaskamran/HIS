package com.sd.his.request;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/*
 * @author    : Arif Heer
 * @Date      : 4/10/2018
 * @version   : ver. 1.0.0
 *
 * ________________________________________________________________________________________________
 *
 *  Developer    Date       Version  Operation  Description
 * ________________________________________________________________________________________________
 *
 *
 * ________________________________________________________________________________________________
 *
 * @Project   : Irfan Nasim
 * @Package   : com.sd.his.request
 * @FileName  : ClinicalDepartmentCreateRequest
 *
 * Copyright ©
 * SolutionDots,
 * All rights reserved.
 *
 */
@JsonIgnoreProperties
public class ClinicalDepartmentCreateRequest {

    private String name;
    private String description;
    private long branchId;
    private long departmentId;

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

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}