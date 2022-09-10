//package com.fractal.demo.cursorest.dao;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
//import com.fractal.demo.cursorest.dto.InquiryDTO;
//import com.fractal.demo.cursorest.model.InquiryModel;
//import com.google.cloud.firestore.CollectionReference;
//import com.google.cloud.firestore.Firestore;
//@Component("inquiry-dao")
//public class InquiryDao extends GenericDaoAPI<InquiryModel, InquiryDTO> implements IInquiryDao{
//		final Logger logger = LoggerFactory.getLogger(InquiryDao.class);
//		@Autowired
//		private Firestore firestore;
//
//		@Override
//		public CollectionReference getCollection() {
//			// TODO Auto-generated method stub
//			return firestore.collection("inquiry");
//		}
//	}
//
//
