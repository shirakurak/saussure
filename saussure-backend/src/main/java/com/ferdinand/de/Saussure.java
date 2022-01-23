package com.ferdinand.de;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdinand.de.generator.Signified;

@RestController
public class Saussure {
	
	@Autowired
	Signified signified;
	
	@RequestMapping("/")
	public String home() {
		
		return signified.generate();
	}
}
