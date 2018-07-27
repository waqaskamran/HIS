package com.sd.his.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

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
 * @FileName  : RolePermission
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */

@Entity
@Table(name = "ROLE_PERMISSION")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RolePermission extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERMISSION_ID", nullable = false)
    private Permission permission;

    @Column(name = "CAN_UPDATE", columnDefinition = "boolean default true", nullable = false)
    private Boolean update;

    @Column(name = "CAN_CREATE", columnDefinition = "boolean default true", nullable = false)
    private Boolean create;

    @Column(name = "CAN_DELETE", columnDefinition = "boolean default true", nullable = false)
    private Boolean delete;

    public RolePermission(){}

    public RolePermission(Role role, Permission permission, Boolean update, Boolean create, Boolean delete) {
        this.role = role;
        this.permission = permission;
        this.update = update;
        this.create = create;
        this.delete = delete;

    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public Boolean getCreate() {
        return create;
    }

    public void setCreate(Boolean create) {
        this.create = create;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }


}
