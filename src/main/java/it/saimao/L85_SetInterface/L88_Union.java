package it.saimao.L85_SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class L88_Union {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Naruto");
        set1.add("Sasuke");
        set1.add("Sakura");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Naruto");
        set2.add("Hinata");
        set2.add("Shikamaru");

        // UNION (addAll)
        set1.addAll(set2);
        for (String s: set1) {
            System.out.println(s);
        }

    }
}
