package com.example.demoJava.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJava.models.TrackingModel;
import com.example.demoJava.service.TrackingService;

@RestController
@RequestMapping(value = "/tracking")
public class TrackingController {
	final Logger logger = LoggerFactory.getLogger(TrackingController.class);

	@Autowired
	TrackingService trackingService;

	@GetMapping
	public List<TrackingModel> listTracking() throws Exception {
		logger.info("inicia peticion en el controller");
		return trackingService.listTracking();
	}

//	@GetMapping(value = "/{id}")
//	public TrackingModel getTracking(@PathVariable("id") final String id) throws Exception {
//		logger.info("inicia peticion en el controller");
//		return trackingService.getTracking(id);
//	}
//
//	@PostMapping
//	public String saveTracking(@RequestBody final TrackingModel trackingModel) throws Exception {
//		logger.info("inicia peticion createTracking");
//		final String id = trackingService.saveTracking(trackingModel);
//		return id;
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public void deleteTracking(@PathVariable final String id) throws Exception {
//		logger.info("inicia peticion deleteTracking");
//		trackingService.deleteTracking(id);
//	}
//
//	@PutMapping(value = "/{id}")
//	public void updateByAccountNumber(@PathVariable("id") final String id,
//			@RequestBody final TrackingModel trackingModel) throws Exception {
//		logger.info("inicia peticion updateTracking");
//		trackingService.updateTracking(trackingModel, id);
//
//	}
}
