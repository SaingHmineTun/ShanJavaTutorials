package it.saimao.L91_ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\Desktop\\Hello World.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }


    }
}
