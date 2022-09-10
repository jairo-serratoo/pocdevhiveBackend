package com.fractal.demo.cursorest.dto;

import lombok.Data;

@Data
public class TrackingDTO {
	private String appointmentId;
	private String name;
	private String lastName;
	private String mail;
	private String phoneNumber;
	private String transportType;
	private String companyName;
	private String state;

	public TrackingDTO() {
		// TODO Auto-generated constructor stub
	}

}
