package com.hemebiotech.analytics;

import javax.swing.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Counter implements ICounter {


    @Override
    public TreeMap<String, Integer> count(ArrayList<String> symptoms) {

        TreeMap<String, Integer> countMap = new TreeMap<String, Integer>();
        Integer countSymptoms;
        for (String symptom : symptoms) {
            countSymptoms = countMap.get(symptom);
            if (countSymptoms ==null) {
                countSymptoms = 0;

            }

            countMap.put(symptom,countSymptoms+1);














        }

        return countMap;
    }
}