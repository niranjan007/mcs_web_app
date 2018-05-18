package com.mcswebapp.mcs_producer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@RequestMapping("/")
	public String testController() {
		return "Its working fine just edited";
	}
}
