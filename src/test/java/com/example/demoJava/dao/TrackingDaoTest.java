//package com.example.demoJava.dao;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.demoJava.models.TrackingModel;
//import com.google.cloud.firestore.Firestore;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//class TrackingDaoTest {
//
//	@Autowired
//	TrackingDao trackingDao;
//
//	@Autowired
//	Firestore firestore;
//
//	@Test
//	void testGetAll() {
//		List<TrackingModel> response;
//		try {
//			response = trackingDao.getAll();
//			Assert.assertNotNull(response);
//		} catch (final Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}
