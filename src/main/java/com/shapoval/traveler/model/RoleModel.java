package com.shapoval.traveler.model;

import com.shapoval.traveler.entity.Role;

public class RoleModel {
    private long roleId;
    private String roleName;
//add comment
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
        roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        roleName = roleName;
    }
}
