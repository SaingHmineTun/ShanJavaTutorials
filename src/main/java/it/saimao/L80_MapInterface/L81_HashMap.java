package it.saimao.L80_MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
/*
NO ORDER (NO INSERTION, NO ASCENDING)
 */
public class L81_HashMap {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        // Add new elements into map
        dictionary.put("app", "APPLE");
        dictionary.put("org", "ORANGE");
        dictionary.put("ban", "BANANA");
        dictionary.put("man", "MANGO");
        dictionary.put("ava", "AVOCADO");
        dictionary.put("dur", "DURIAN");
        dictionary.putIfAbsent("app", "GOLDEN APPLE");



        // Know the size of map
        System.out.println("Size of map - " + dictionary.size());

        // Get element in map with key
        System.out.println("app - " + dictionary.get("apple"));

        // Remove with key
        System.out.println("Before remove org - " + dictionary.get("org"));
        dictionary.remove("org", "ORANGE");
        System.out.println("After remove org - " + dictionary.get("org"));

        // Replace value with key
        System.out.println("Before replace : " + dictionary.get("ban"));
        System.out.println(dictionary.replace("ban", "GOLDEN BANANA"));
        System.out.println("After replace : " + dictionary.get("ban"));

        System.out.println("Contains key ban - " + dictionary.containsKey("ban"));
        System.out.println("Contains value BANANA - " + dictionary.containsValue("BANANA"));

        // Loop map with forEach
        System.out.println("############# forEach Loop #################");
        dictionary.forEach((key, value) -> System.out.printf("Key - %s and Value - %s%n", key, value));

        // Loop with Map.Entry<String, String>
        System.out.println("############### Map.Entry ###############");
        for(var entry: dictionary.entrySet()) {
            System.out.printf("Key - %s and Value - %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println("#################### KeySet #################");
        for (String key: dictionary.keySet()) {
            System.out.printf("Key - %s and Value - %s%n", key, dictionary.get(key));
        }

    }
}
