package com.fractal.demo.cursorest.model;

import lombok.Data;

@Data
public class TrackingModel {
	private String id;
	private String appointmentId;
	private String name;
	private String lastName;
	private String mail;
	private String phoneNumber;
	private String transportType;
	private String companyName;
	private String state;
	private String latitude;
	private String longitude;

}
