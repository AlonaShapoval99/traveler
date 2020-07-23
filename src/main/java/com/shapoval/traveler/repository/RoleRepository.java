package com.shapoval.traveler.repository;

import com.shapoval.traveler.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findAllByRoleName(String roleName);
}
