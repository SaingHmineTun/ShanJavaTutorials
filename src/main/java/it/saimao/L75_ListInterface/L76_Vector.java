package it.saimao.L75_ListInterface;

import java.util.List;
import java.util.Vector;

/*
1) ArrayList
2) Vector
3) Stack
4) LinkedList
 */
public class L76_Vector {
    public static void main(String[] args) {
        // Create
        List<String> vector = new Vector<>(); // Upcasting
        Vector<String> names = (Vector<String>) vector; // Downcasting

        // Add
        names.addElement("John");
        names.add("Doe");
        names.add("Jane");
        names.add("Jack");
        names.add("Bob");
        names.add(1, "Michael");

        System.out.println(names.size());
        var it = names.elements();
        while (it.hasMoreElements()) { // 1, 2, 3, 4
            System.out.println(it.nextElement());
        }

        // Retrieve
        System.out.println(names.firstElement());
        System.out.println(names.lastElement());

        // Update
        System.out.println("Before update : " + names.get(3));
        names.insertElementAt("James", 3);
        System.out.println("After update : " + names.get(3));

        // Delete
        System.out.println("Before Delete : " + names.size() + " & " + names.get(1));
        names.removeElementAt(1);
        System.out.println("After Delete : " + names.size() + " & " + names.get(1));

        // Index of
        int index = names.indexOf("Jack");
        System.out.println("Index of Jack - " + index);

        // Contain
        System.out.println(names.contains("Jack1"));

    }
}