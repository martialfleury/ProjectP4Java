package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Main Class to execute the whole programm
 */
public class AnalyticsCounter {

	public static void main(String args[])  {
		// Read symptoms from input file
		ReadSymptomDataFromFile rs = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		ArrayList<String> symptoms = rs.getSymptoms();
		// Count each symptom number
		Counter counter = new Counter();
		TreeMap<String,Integer> countMap = counter.count(symptoms);
		// Write symptom number to output file
		String result = "result.out";
		Writer writer = new Writer();
		writer.writeFileOut(result,countMap);
	}
}