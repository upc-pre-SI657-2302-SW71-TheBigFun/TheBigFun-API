package com.crackelets.bigfun.platform.shared.domain.service.communication;

import lombok.Getter;

@Getter
public abstract class BaseResponse<T> {

    private boolean success;
    private String message;
    private T resource;


    public BaseResponse(String message) {
        this.success = false;
        this.message = message;
        this.resource = null;
    }

    public BaseResponse(T resource) {
        this.success = true;
        this.message = "";
        this.resource = resource;
    }
}
