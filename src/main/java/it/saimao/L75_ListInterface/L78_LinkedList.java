package it.saimao.L75_ListInterface;

import java.util.LinkedList;

/*
1) ArrayList (GET, UPDATE)
2) Vector
3) Stack
4) LinkedList (ADD, REMOVE)
 */
public class L78_LinkedList {
    public static void main(String[] args) {
        // Create
        LinkedList<String> names = new LinkedList<>();

        // Add
        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("Jack");
        names.add("Bob");
        names.add(1, "Michael");

        System.out.println(names.size());
        System.out.println("##################");
        var it = names.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("###################");

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