package com.example.demoJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJava.dao.TrackingDao;
import com.example.demoJava.models.TrackingModel;

@Service
public class TrackingService {

	@Autowired
	TrackingDao trackingDao;

	public List<TrackingModel> listTracking() throws Exception {
		final List<TrackingModel> response = trackingDao.findAll();
		return response;

	}

//	public TrackingModel getTracking(final String id) throws Exception {
//		final TrackingModel response = trackingDao.get(id);
//		return response;
//	}
//
//	public String saveTracking(final TrackingModel trackingModel) throws Exception {
//		final String id = trackingDao.save(trackingModel);
//		return id;
//	}
//
//	public void updateTracking(final TrackingModel trackingModel, final String id) throws Exception {
//		trackingDao.save(trackingModel, id);
//	}
//
//	public void deleteTracking(final String id) throws Exception {
//		trackingDao.delete(id);
//	}

}
