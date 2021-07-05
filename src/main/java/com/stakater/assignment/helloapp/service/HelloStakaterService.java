package com.stakater.assignment.helloapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.stakater.assignment.helloapp.exception.HelloStakaterExecption;
import com.stakater.assignment.helloapp.model.Response;

@Service
public class HelloStakaterService {
	/** Get Name from environment variable. */
	@Value("${stakater.name}")
	private String name;

	private static final String PREFIX = "Hello";

	private static final String ERROR_MESSAGE = "No Name Found";

	public Response getName() throws HelloStakaterExecption {
		if (StringUtils.hasText(name)) {
			Response response = new Response();
			response.setName(PREFIX + " " + name);
			return response;
		}
		throw new HelloStakaterExecption(ERROR_MESSAGE);

	}

}
