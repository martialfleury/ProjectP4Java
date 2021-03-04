package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public interface ICounter {
    // Definir la methode count
    TreeMap<String,Integer> count(ArrayList<String> symptoms);
    
}
