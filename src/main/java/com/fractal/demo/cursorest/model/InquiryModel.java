package com.fractal.demo.cursorest.model;

import lombok.Data;

@Data
public class InquiryModel {

	private String id;
	private String idApointment;
	private String status;
	private String supplier;
	private String tractorId;
	private String containerId;
	private String vendorId;
	private String orderId;
	private String operationDate;
	private String operationTime;

	public InquiryModel() {
		// TODO Auto-generated constructor stub
	}

}
