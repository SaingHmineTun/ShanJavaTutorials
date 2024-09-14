package it.saimao.L80_MapInterface;

import java.util.Random;
import java.util.TreeMap;

/*
HashMap - 67 ms
LinkedHashMap - 96 ms
TreeMap - 153 ms
 */

public class L84_HashMapVsLinkedHashMapVsTreeMap {
    public static void main(String[] args) {
        var map = new TreeMap<Integer, String>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            map.put(new Random().nextInt(), "" + i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration - " + duration);
    }
}
