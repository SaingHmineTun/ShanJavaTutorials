package it.saimao.L67_TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    public static void main(String[] args) {

        // 1. Compile time exception
        System.out.println("Start");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println("Cannot sleep for 1 second");
//        }

        File file = new File("test.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("test.txt cannot be found!");
        }

        System.out.println("End");

    }
}
