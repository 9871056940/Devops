package com.rohit.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Autowired 
	
	private Configuration configuration;
    
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		
		//instaed of hard cord we can call configuration.getminum and maximub
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
}
}