package it.saimao.L92_WriteFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\Admin\\Desktop\\MyTest.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Hello");
            writer.newLine();
            writer.write("World");
        }
    }
}
