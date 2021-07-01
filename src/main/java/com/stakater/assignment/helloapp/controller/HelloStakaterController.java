package com.stakater.assignment.helloapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stakater.assignment.helloapp.exception.HelloStakaterExecption;
import com.stakater.assignment.helloapp.service.HelloStakaterService;

@RestController
@RequestMapping("/")
public class HelloStakaterController {

	private static final Logger logger = LoggerFactory.getLogger(HelloStakaterController.class);
	@Autowired
	private HelloStakaterService helloStakaterService;

	@GetMapping(value = "/getName", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> multicastEmailNotificationJob() throws HelloStakaterExecption {
		logger.info("Get Name");
		return new ResponseEntity<>(helloStakaterService.getName(), HttpStatus.OK);
	}

}
