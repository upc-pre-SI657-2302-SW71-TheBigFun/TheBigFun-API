package com.crackelets.bigfun.platform.security.domain.persistence;


import com.crackelets.bigfun.platform.security.domain.model.entity.Role;
import com.crackelets.bigfun.platform.security.domain.model.enumeration.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(Roles name);
    boolean existsByName(Roles name);

}
