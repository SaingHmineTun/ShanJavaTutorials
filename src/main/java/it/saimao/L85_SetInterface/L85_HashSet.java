package it.saimao.L85_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class L85_HashSet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        // Add value into set (NARUTO)
        names.add("Naruto");
        names.add("Sasuke");
        names.add("Sakura");
        names.add("Hinata");
        names.add("Rock Lee");
        names.add("Choji");
        names.add("Ino");
        names.add("Shikamaru");

        // Loop set
        System.out.println("#################");
        var it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("#######################");

        // Remove value from set
        System.out.println("Before remove - " + names.size());
        names.remove("Rock Lee");
        names.remove("Hinata");
        System.out.println("After remove - " + names.size());


    }

}
