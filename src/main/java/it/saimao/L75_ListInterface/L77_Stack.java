package it.saimao.L75_ListInterface;

import java.util.List;
import java.util.Stack;

/*
1) ArrayList
2) Vector
3) Stack
4) LinkedList
 */
public class L77_Stack {
    public static void main(String[] args) {
        // Create
        List<String> stack = new Stack<>(); // Upcasting
        Stack<String> names = (Stack<String>) stack; // Downcasting

        // Add
        names.addElement("John");
        names.push("Doe"); // names.addLast
        names.addLast("Jane");
        names.add("Jack");
        names.add("Bob");
        names.add(1, "Michael");

        System.out.println(names.size());
        var it = names.elements();
        System.out.println("#########################");
        while (it.hasMoreElements()) { // 1, 2, 3, 4
            System.out.println(it.nextElement());
        }
        System.out.println("#########################");

        // Search
        System.out.println("Search for John - " + names.search("John"));
        System.out.println("Index of John - " + names.indexOf("John"));
        System.out.println("Search for Doe - " + names.search("Doe"));
        System.out.println("Index of Doe - " + names.indexOf("Doe"));
        System.out.println("Search for Bob - " + names.search("Bob"));
        System.out.println("Index of Bob - " + names.indexOf("Bob"));

        // Retrieve
        System.out.println(names.firstElement());
        System.out.println("Get last - " + names.getLast());
        System.out.println("Last element - " + names.lastElement());
        System.out.println("Peek - " + names.peek());
        System.out.println("Before pop - " + names.size());
        System.out.println("Pop - " + names.pop()); // getLast() + removeLast()
        System.out.println("After pop - " + names.size());

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