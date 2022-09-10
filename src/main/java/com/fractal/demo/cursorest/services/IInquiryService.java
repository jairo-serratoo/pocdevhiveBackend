package com.fractal.demo.cursorest.services;

import java.util.List;

import com.fractal.demo.cursorest.dto.InquiryDTO;

public interface IInquiryService {
	List<InquiryDTO> listInquiries() throws Exception;

}
