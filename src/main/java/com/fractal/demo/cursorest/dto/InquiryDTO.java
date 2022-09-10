package com.fractal.demo.cursorest.dto;

import lombok.Data;

@Data
public class InquiryDTO {
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
	
	public InquiryDTO() {
		// TODO Auto-generated constructor stub
	}

}
