package com.open4j.usermanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author navand
 */
@Entity
@Table(name = "Permission")
public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private long permissionId;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "permitted")
    private String permitted;
    @Column(name = "description")
    private String description;
    @Column(name = "datetime_created" , insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeCreated;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime_modified", insertable = false)
    private Date datetimeModified;

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPermitted() {
        return permitted;
    }

    public void setPermitted(String permitted) {
        this.permitted = permitted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatetimeCreated() {
        return datetimeCreated;
    }

    public void setDatetimeCreated(Date datetimeCreated) {
        this.datetimeCreated = datetimeCreated;
    }

    public Date getDatetimeModified() {
        return datetimeModified;
    }

    public void setDatetimeModified(Date datetimeModified) {
        this.datetimeModified = datetimeModified;
    }
}
