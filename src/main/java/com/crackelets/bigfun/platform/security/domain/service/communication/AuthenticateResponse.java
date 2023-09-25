package com.crackelets.bigfun.platform.security.domain.service.communication;

import com.crackelets.bigfun.platform.security.resource.AuthenticateResource;
import com.crackelets.bigfun.platform.shared.domain.service.communication.BaseResponse;

import lombok.Getter;
import lombok.Setter;

public class AuthenticateResponse extends BaseResponse<AuthenticateResource> {

    public AuthenticateResponse(String message) {
        super(message);
    }

    public AuthenticateResponse(AuthenticateResource resource) {
        super(resource);
    }

}
