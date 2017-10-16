package com.harward.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PhoneNumberNotFoundException extends RuntimeException{

	
	public PhoneNumberNotFoundException() {
        super();
    }
    public PhoneNumberNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public PhoneNumberNotFoundException(String message) {
        super(message);
    }
    public PhoneNumberNotFoundException(Throwable cause) {
        super(cause);
    }
}
