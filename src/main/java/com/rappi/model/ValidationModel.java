package com.rappi.model;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ValidationModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus status;
	private Object response;
}
