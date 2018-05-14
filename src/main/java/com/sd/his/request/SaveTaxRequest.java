package com.sd.his.request;

import com.sd.his.model.Tax;

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
 * @Package   : com.sd.his.request
 * @FileName  : SaveTaxRequest
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */
public class SaveTaxRequest {

    private Long id;
    private String name;
    private String description;
    private Double rate;
    private Long fromDate;
    private Long toDate;
    private boolean active;

    public SaveTaxRequest() {
    }


    public SaveTaxRequest(Tax tax) {
        this.id = tax.getId();
        this.name = tax.getName();
        this.description = tax.getDescription();
        this.rate = tax.getRate();
        this.fromDate = tax.getFromDate();
        this.toDate = tax.getToDate();
        this.active = tax.isActive();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getFromDate() {
        return fromDate;
    }

    public void setFromDate(Long fromDate) {
        this.fromDate = fromDate;
    }

    public Long getToDate() {
        return toDate;
    }

    public void setToDate(Long toDate) {
        this.toDate = toDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
