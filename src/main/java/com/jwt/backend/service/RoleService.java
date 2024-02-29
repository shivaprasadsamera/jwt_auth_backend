package com.jwt.backend.service;

import com.jwt.backend.entity.Role;
import com.jwt.backend.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;


    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
