//package com.fractal.demo.cursorest.dao;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.fractal.demo.cursorest.dto.InquiryDTO;
//import com.google.cloud.firestore.Firestore;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//class InquiryDaoTest {
//
//	@Autowired
//	@Qualifier("inquiry-dao")
//    InquiryDao inquiryDao;
//
//
//	@Autowired
//	Firestore firestore;
//
//
//    @Test
//	void getAllInquiry() throws Exception {
//    	List<InquiryDTO> result =  inquiryDao.getAll();
//    	assertNotNull(result);
//	}
//
//}
