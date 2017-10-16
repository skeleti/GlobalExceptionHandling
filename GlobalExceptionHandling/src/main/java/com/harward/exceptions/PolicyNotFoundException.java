package com.harward.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PolicyNotFoundException extends RuntimeException{

	
	public PolicyNotFoundException() {
        super();
    }
    public PolicyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public PolicyNotFoundException(String message) {
        super(message);
    }
    public PolicyNotFoundException(Throwable cause) {
        super(cause);
    }
}
