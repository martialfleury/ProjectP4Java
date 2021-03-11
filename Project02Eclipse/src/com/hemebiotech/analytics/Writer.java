package com.hemebiotech.analytics;

import java.util.Map;
import java.io.*;
import java.util.TreeMap;

public class Writer implements IWriter {
    @Override
    public void writeFileOut(String file, TreeMap<String, Integer> symptomsMap) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (Map.Entry symptom : symptomsMap.entrySet()) {
                System.out.println(symptom.getKey() + " " + symptom.getValue());
                fileWriter.write(symptom.getKey() + " " + symptom.getValue()+ "\n");
            }
            fileWriter.close();
            System.out.println("l'écriture a étè fait avec succès");
        } catch (IOException e) {
            System.out.println("une erreur s'est produite");
            e.printStackTrace();
        }
    }
}