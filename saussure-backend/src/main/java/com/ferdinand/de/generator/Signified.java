package com.ferdinand.de.generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Signified {

	@Autowired
	Synonyms synonyms;
	@Autowired
	Image image;

	public String generate() {

		String s = synonyms.get();
		String i = image.get();

		return s + "and" + i;
	}
}
