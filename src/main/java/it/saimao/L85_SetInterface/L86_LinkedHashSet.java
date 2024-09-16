package it.saimao.L85_SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// INSERTION ORDER
public class L86_LinkedHashSet {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();

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
