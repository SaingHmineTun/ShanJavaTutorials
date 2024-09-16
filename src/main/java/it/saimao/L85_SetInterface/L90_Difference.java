package it.saimao.L85_SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class L90_Difference {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Naruto");
        set1.add("Sasuke");
        set1.add("Sakura");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Naruto");
        set2.add("Hinata");
        set2.add("Shikamaru");

        // DIFFERENCE (removeAll)
        set1.removeAll(set2);
        for (String s: set1) {
            System.out.println(s);
        }

    }
}
