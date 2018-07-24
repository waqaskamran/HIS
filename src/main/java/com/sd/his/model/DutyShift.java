package com.sd.his.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sd.his.enums.DutyShiftEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
 * @Package   : com.sd.his.DutyShift
 * @FileName  : DutyShift
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */
@Entity
@Table(name = "DUTY_SHIFT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DutyShift extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Enumerated(value = EnumType.STRING) //DutyShiftEnum
    @Column(name = "SHIFT_NAME")
    private DutyShiftEnum shiftName;

    @Temporal(TemporalType.TIME)
    @Column(name = "START_TIME")
    private Date startTime;

    @Temporal(TemporalType.TIME)
    @Column(name = "END_TIME")
    private Date endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIFT_ID")
    private Doctor doctor;


    public DutyShiftEnum getShiftName() {
        return shiftName;
    }

    public void setShiftName(DutyShiftEnum shiftName) {
        this.shiftName = shiftName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}