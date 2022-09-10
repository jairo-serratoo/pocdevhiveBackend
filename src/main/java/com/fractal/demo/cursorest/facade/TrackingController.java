package com.fractal.demo.cursorest.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tracking")
public class TrackingController {
	final Logger logger = LoggerFactory.getLogger(TrackingController.class);

	@GetMapping(value = "/{id}")
	public ResponseEntity<String> getTracking(@PathVariable("id") final String id) throws Exception {
		logger.info("inicia peticion en el controller");
		return new ResponseEntity<String>("Eladio", HttpStatus.OK);
	}
}
