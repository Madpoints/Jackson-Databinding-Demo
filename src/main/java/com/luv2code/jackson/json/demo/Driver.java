package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			// object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map to Java POJO: data/sample-lite.json
			Student theStudent =
					mapper.readValue(
							new File("data/sample-full.json"), Student.class)
;			
			System.out.println("Name: " + 
								theStudent.getFirstName() + " " +
								theStudent.getLastName());
			
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		
	}

}
