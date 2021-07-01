package com.stakater.assignment.helloapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.stakater.assignment.helloapp.exception.HelloStakaterExecption;

@Service
public class HelloStakaterService {
	/** Get Name from environment variable. */
	@Value("${stakater.name}")
	private String name;

	private static final String ERROR_MESSAGE = "No Name Found";

	public String getName() throws HelloStakaterExecption {
		if (StringUtils.hasText(name)) {
			return name;
		}
		throw new HelloStakaterExecption(ERROR_MESSAGE);

	}

}
