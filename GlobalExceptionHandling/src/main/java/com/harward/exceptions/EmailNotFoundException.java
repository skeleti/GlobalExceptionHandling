package com.harward.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class EmailNotFoundException extends RuntimeException{

	
	public EmailNotFoundException() {
        super();
    }
    public EmailNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public EmailNotFoundException(String message) {
        super(message);
    }
    public EmailNotFoundException(Throwable cause) {
        super(cause);
    }
}
