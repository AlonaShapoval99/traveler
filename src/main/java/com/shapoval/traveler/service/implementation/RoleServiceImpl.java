package com.shapoval.traveler.service.implementation;

import com.shapoval.traveler.model.RoleModel;
import com.shapoval.traveler.repository.RoleRepository;
import com.shapoval.traveler.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleModel findRoleByName(String name) {
        return new RoleModel(roleRepository.findAllByRoleName(name));
    }
}
