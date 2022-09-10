package com.fractal.demo.cursorest.facade;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fractal.demo.cursorest.model.TrackingModel;
import com.fractal.demo.cursorest.services.TrackingService;

@RestController
@RequestMapping(value = "/tracking")
@CrossOrigin("*")
public class TrackingController {
	final Logger logger = LoggerFactory.getLogger(TrackingController.class);

	@Autowired
	TrackingService trackingService;

	@GetMapping
	public ResponseEntity<List<TrackingModel>> listTracking() throws Exception {
		logger.info("inicia peticion en el controller");
		return new ResponseEntity<List<TrackingModel>>(trackingService.listTracking(), HttpStatus.OK);
	}

//	@ResponseStatus(HttpStatus.OK)
//	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
//	@ResponseBody
//	public String saveTracking(@RequestBody final TrackingModel trackingModel) throws Exception {
//		logger.info("inicia peticion createTracking");
//		final String id = trackingService.save(trackingModel);
//		return id;
//	}
//
//	@ResponseStatus(HttpStatus.OK)
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
//	@ResponseBody
//	public void deleteTracking(@PathVariable final String id) throws Exception {
//		logger.info("inicia peticion deleteTracking");
//		trackingService.delete(id);
//	}

}
