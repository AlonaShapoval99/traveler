package com.shapoval.traveler.model;

import com.shapoval.traveler.entity.Role;

public class RoleModel {
    private long roleId;
    private String roleName;

    public RoleModel() {
    }

    public RoleModel(long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public RoleModel(Role role) {
        roleId = role.getRoleId();
        roleName = role.getRoleName();
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
