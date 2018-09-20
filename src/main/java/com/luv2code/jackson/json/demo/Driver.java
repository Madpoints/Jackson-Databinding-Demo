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
			System.out.println("Name: \n " + 
								theStudent.getFirstName() + " " +
								theStudent.getLastName());
			
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Address: \n " + tempAddress.getStreet() + ", " +
								tempAddress.getCity() + ", " +
								tempAddress.getState() + ", " +
								tempAddress.getZip() + ", " +
								tempAddress.getCountry());
			
			System.out.println("Coding Languages: ");
			
			for (String language : theStudent.getLanguages()) {
				System.out.println(" " + language);
			}
			
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		
	}

}
