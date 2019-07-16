package com.open4j.usermanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author navand
 */
@Entity
@Table(name = "Role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "description")
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime_created", insertable = false, updatable = false)
    private Date datetimeCreated;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime_modified", insertable = false, updatable = false)
    private Date datetimeModified;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
