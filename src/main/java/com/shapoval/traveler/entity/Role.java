package com.shapoval.traveler.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shapoval.traveler.model.RoleModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Role")
public class Role {
    @Id
    @Column(name = "role_id", nullable = false, unique = true)
    private long roleId;
    @Column(name = "role_name", nullable = false)
    private String roleName;

    public Role() {
    }

    public Role(long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Role(RoleModel role) {
        roleId = role.getRoleId();
        roleName = role.getRoleName();
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        roleName = roleName;
    }
}
