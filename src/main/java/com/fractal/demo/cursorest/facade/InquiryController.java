//package com.fractal.demo.cursorest.facade;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fractal.demo.cursorest.dao.InquiryDao;
//import com.fractal.demo.cursorest.dto.InquiryDTO;
//
//@RestController
//@RequestMapping(value = "/inquiry")
//public class InquiryController {
//	final Logger logger = LoggerFactory.getLogger(InquiryController.class);
//
//	@Autowired
//	InquiryDao inquiryService;
//
//
//	@ResponseBody
//	@RequestMapping(value = "/",method = RequestMethod.GET,produces="application/json" )
//	public List<InquiryDTO> listInquiries() throws Exception {
//		logger.info("inicia peticion en el controller");
//		List<InquiryDTO> listInquiries = inquiryService.getAll();
//		return listInquiries;
//
//	}
//
//}
