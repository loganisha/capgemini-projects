package com.capgemini.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	public static final Logger l = LoggerFactory.getLogger(MessageController.class);

	@GetMapping("/checking")
	public String getMessage() {
		l.info("i am info");
		l.debug("i am debug");
		l.error("i am error");
		return "Welcome to spring boot";
	}
}
