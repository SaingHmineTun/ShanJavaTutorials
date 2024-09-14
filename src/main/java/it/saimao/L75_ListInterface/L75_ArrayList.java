package it.saimao.L75_ListInterface;

import java.util.ArrayList;
import java.util.List;
/*
1) ArrayList
2) Vector
3) Stack
4) LinkedList
 */
public class L75_ArrayList {
    public static void main(String[] args) {
        // Create
        List<String> names = new ArrayList<>();

        // Add
        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("Jack");
        names.add("Bob");
        names.add(1, "Michael");

        System.out.println(names.size());
        for (String name : names) {
            System.out.println(name);
        }

        // Retrieve
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        // Update
        System.out.println("Before update : " + names.get(3));
        names.set(3, "James");
        System.out.println("After update : " + names.get(3));

        // Delete
        System.out.println("Before Delete : " + names.size() + " & " + names.get(1));
        names.remove(1);
        System.out.println("After Delete : " + names.size() + " & " + names.get(1));

        // Index of
        int index = names.indexOf("Jack");
        System.out.println("Index of Jack - " + index);

        // Contain
        System.out.println(names.contains("Jack1"));

    }
}

/*
1. Add note             | id | desc
2. Read note by id      | id -> desc |
3. Read all note        | all (id & desc)
4. Delete note by id    | id | delete
5. Clear all note
6. Update note by id    | id | desc
7. Exit
 */