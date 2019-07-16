package com.open4j.usermanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author navand
 */
@Entity
@Table(name = "UserRole")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userrole_id")
    private long userroleId;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "characteristic_id")
    private long characteristicId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime_created", insertable = false, updatable = false)
    private Date datetimeCreated;

    public long getUserroleId() {
        return userroleId;
    }

    public void setUserroleId(long userroleId) {
        this.userroleId = userroleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getCharacteristicId() {
        return characteristicId;
    }

    public void setCharacteristicId(long characteristicId) {
        this.characteristicId = characteristicId;
    }

    public Date getDatetimeCreated() {
        return datetimeCreated;
    }

    public void setDatetimeCreated(Date datetimeCreated) {
        this.datetimeCreated = datetimeCreated;
    }
}
