package com.crackelets.bigfun.platform.security.domain.service.communication;

import com.crackelets.bigfun.platform.security.resource.UserResource;
import com.crackelets.bigfun.platform.shared.domain.service.communication.BaseResponse;

public class RegisterResponse extends BaseResponse<UserResource> {
    public RegisterResponse(String message) {
        super(message);
    }

    public RegisterResponse(UserResource resource) {
        super(resource);
    }
}
