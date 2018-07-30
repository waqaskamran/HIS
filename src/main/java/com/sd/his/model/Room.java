package com.sd.his.model;/*
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ROOM")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Room extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "ROOM_NAME")
    private String roomName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BRANCH_ID", nullable = false)
    private Branch branch;

    @Column(name = "IS_ACTIVE", columnDefinition = "boolean default true", nullable = false)
    private Boolean active;

    @Column(name = "ALLOW_ONLINE_SCHEDULING")
    private Boolean allowOnlineScheduling;


    @Transient
    private Long id;

//    @JsonIgnore
//    @OneToMany(targetEntity = Appointment.class, mappedBy = "room", fetch = FetchType.LAZY)
//    private List<Appointment> appointments;


    public Room() {
    }

    public Room(Long id,String roomName, Boolean allowOnlineScheduling) {
        this.roomName = roomName;
        this.id=id;
        this.allowOnlineScheduling = allowOnlineScheduling;
    }
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAllowOnlineScheduling() {
        return allowOnlineScheduling;
    }

    public void setAllowOnlineScheduling(Boolean allowOnlineScheduling) {
        this.allowOnlineScheduling = allowOnlineScheduling;
    }
}