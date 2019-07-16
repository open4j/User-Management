package com.open4j.usermanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author navand
 */
@Entity
@Table(name = "RolePermission")
public class RolePermission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolepermission_id")
    private long rolepermissionId;
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "permission_id")
    private long permissionId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime_created", insertable = false, updatable = false)
    private Date datetimeCreated;

    public long getRolepermissionId() {
        return rolepermissionId;
    }

    public void setRolepermissionId(long rolepermissionId) {
        this.rolepermissionId = rolepermissionId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public Date getDatetimeCreated() {
        return datetimeCreated;
    }

    public void setDatetimeCreated(Date datetimeCreated) {
        this.datetimeCreated = datetimeCreated;
    }
}
