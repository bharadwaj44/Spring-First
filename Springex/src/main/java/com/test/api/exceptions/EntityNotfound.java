package com.test.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class EntityNotfound extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public EntityNotfound(String s){
		
		super(s);
		
	}
	public EntityNotfound(Throwable t){
		
		
		super(t);
	}
	
	
	
	
}
