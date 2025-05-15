package com.java.Collections;

// Import the HashMap class
import java.util.HashMap;

public class MaHashMapEx {
	public static void main(String[] args) {
		// Create a HashMap object called HM
		HashMap<String, String> HM = new HashMap<String, String>();

		// Add keys and values (Country, City)
		HM.put("Name", "Jasmin");
		HM.put("Age", "24");
		HM.put("City", "Chennai");
		HM.put("Gender", "Female");
		System.out.println(HM);
	}
}