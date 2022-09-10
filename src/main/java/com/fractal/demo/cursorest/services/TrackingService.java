package com.fractal.demo.cursorest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fractal.demo.cursorest.dao.TrackingDao;
import com.fractal.demo.cursorest.model.TrackingModel;

@Service
public class TrackingService implements ITrackingService {

	@Autowired
	TrackingDao trackingDao;

	@Override
	public List<TrackingModel> listTracking() throws Exception {
		final List<TrackingModel> response = trackingDao.getAll();
		for (final TrackingModel trackingModel : response) {
			trackingModel.setLatitude("19.4183168");
			trackingModel.setLongitude("-99.155968");
		}
		return response;
	}

	@Override
	public String saveTracking(final TrackingModel trackingModel) throws Exception {
		final String id = trackingDao.save(trackingModel);
		return id;
	}

	@Override
	public void deleteTracking(final String id) throws Exception {
		trackingDao.delete(id);
	}

}
