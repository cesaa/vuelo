package com.rappi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class TiquetModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4759874609808627147L;
	
	private Integer itineraryid;
	private String name;
	private Date departureDate;
	private Date arrivalDate;
	private String cityOrigin;
	private String cityDestination;
	private boolean baggage;
	private BigDecimal cost;
	private Time departureHour;
	private Time arrivalHour;
}
