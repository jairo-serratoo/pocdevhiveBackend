package com.fractal.demo.cursorest.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fractal.demo.cursorest.model.TrackingModel;
import com.google.cloud.firestore.CollectionReference;

@Component("tracking-dao")
public class TrackingDao extends GenericDaoAPI<TrackingModel> implements ITrackingDao {

//	@Autowired
//	private Firestore firestore;
	final Logger logger = LoggerFactory.getLogger(TrackingDao.class);

	@Override
	public CollectionReference getCollection() {
		// TODO Auto-generated method stub
//		return firestore.collection("tracking");
		return null;
	}

}
