package it.saimao.L75_ListInterface;

import java.util.LinkedList;

/*
ArrayList
Add First - 3207 ms
Add Last - 76 ms

LinkedList
Add First - 80 ms
Add Last - 66 ms
 */
public class L79_ArrayListVsLinkedList {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            list.addLast("" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Duration : " + (end - start));

    }
}
