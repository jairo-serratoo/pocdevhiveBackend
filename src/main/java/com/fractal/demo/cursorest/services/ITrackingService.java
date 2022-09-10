package com.fractal.demo.cursorest.services;

import java.util.List;

import com.fractal.demo.cursorest.model.TrackingModel;

public interface ITrackingService {

	List<TrackingModel> listTracking() throws Exception;

	String saveTracking(TrackingModel trackingModel) throws Exception;

	void deleteTracking(String id) throws Exception;
}
