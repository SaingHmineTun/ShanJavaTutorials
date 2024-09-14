package it.saimao.L66_Exception;

import java.io.File;
import java.io.FileReader;

public class Main {

    static String name;

    public static void main(String[] args) {

        System.out.println("Start");
        // Thread.sleep(1000); // checked or compile-time exception
        System.out.println(name.toLowerCase()); // unchecked or runtime exception
        System.out.println("Finish");

    }

    public static void stackoverflow() {

        System.out.println("Stackoverflow");
        stackoverflow();

    }

}
