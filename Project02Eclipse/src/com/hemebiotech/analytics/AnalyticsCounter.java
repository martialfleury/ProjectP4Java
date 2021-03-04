package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class AnalyticsCounter {


	public static void main(String args[]) throws Exception {

		// instancieé la classe ReadSymtomDataFromFile et lire le fichier Symptoms.txt	ET AFFCIHER le contenu du fichier

		ReadSymptomDataFromFile rs = new ReadSymptomDataFromFile("C:\\Users\\moi\\Desktop\\Developpement\\ProjectP4Java\\Project02Eclipse\\symptoms.txt");

		ArrayList<String> symptoms = rs.GetSymptoms();

		System.out.println("fichier" + rs.GetSymptoms());

		// compter le nombre d'occurences de chaque symptomes dans la list
           Counter counter = new Counter();
           TreeMap<String,Integer> countMap = counter.count(rs.GetSymptoms());
           System.out.println(countMap);



















	}
}
