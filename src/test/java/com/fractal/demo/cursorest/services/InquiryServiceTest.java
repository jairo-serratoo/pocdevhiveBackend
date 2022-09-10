//package com.fractal.demo.cursorest.services;
//
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.fractal.demo.cursorest.dao.InquiryDao;
//import com.fractal.demo.cursorest.dto.InquiryDTO;
//
//@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner.class)
//class InquiryServiceTest {
//
//	@InjectMocks
//	InquiryService inquiryService;
//
//	@Mock
//	InquiryDao inquiryDao;
//
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//    @Test
//	void listInquiries() throws Exception {
//    	List<InquiryDTO> inquirysMocks = new ArrayList<InquiryDTO>();
//    	InquiryDTO newInquiry = new InquiryDTO();
//    	newInquiry.setId("123456");
//    	newInquiry.setContainerId("456123");
//    	inquirysMocks.add(newInquiry);
//
//    	when(inquiryDao.getAll()).thenReturn(inquirysMocks);
//
//    	List<InquiryDTO> inquirys = inquiryService.listInquiries();
//    	assertNotNull(inquirys);
//    }
//
//
//}
