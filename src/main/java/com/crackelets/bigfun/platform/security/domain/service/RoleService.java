package com.crackelets.bigfun.platform.security.domain.service;

import com.crackelets.bigfun.platform.security.domain.model.entity.Role;

import java.util.List;

public interface RoleService {

    void seed();
    List<Role> getAll();

}
