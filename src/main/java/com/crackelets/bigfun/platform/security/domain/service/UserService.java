package com.crackelets.bigfun.platform.security.domain.service;

import com.crackelets.bigfun.platform.security.domain.model.entity.User;
import com.crackelets.bigfun.platform.security.domain.service.communication.AuthenticateRequest;
import com.crackelets.bigfun.platform.security.domain.service.communication.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    ResponseEntity<?> authentication(AuthenticateRequest request);
    ResponseEntity<?>  register(RegisterRequest request);
    List<User> getAll();
}
