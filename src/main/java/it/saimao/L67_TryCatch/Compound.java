package it.saimao.L67_TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Compound {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Sai Mao\\Desktop\\Teach Python.txt");
        char[] chars = {'a'};
        System.out.println("Start");
        try {
            FileReader reader = new FileReader(file); // Compile time exception
            System.out.println(chars[1]); // Runtime exception
        } catch (FileNotFoundException e) {
            System.out.println("test.txt not found");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index 1 isn't available");
        } finally {
            System.out.println("Finally!");
        }

    }
}
