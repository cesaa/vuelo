package com.rappi.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
}
