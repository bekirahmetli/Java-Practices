package org.example.week3;

import java.util.HashMap;
import java.util.Map;

public class MapEntryPrinter {
    public static void main(String[] args){
        // Create a HashMap to store city names and their corresponding codes
        Map<String,Integer> cities = new HashMap<>();

        // Add city-code pairs to the map
        cities.put("Manisa",45);
        cities.put("İzmir",35);
        cities.put("İStanbul",34);
        cities.put("Muğla",48);
        cities.put("Ankara",06);

        // Iterate over the map entries using a for-each loop
        for (Map.Entry<String,Integer> entry : cities.entrySet()){
            // Print each key-value pair with an arrow separator
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
