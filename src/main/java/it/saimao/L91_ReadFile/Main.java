package it.saimao.L91_ReadFile;

import java.io.*;

/*
1) BufferedReader
 */
public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\Hello World.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(file.getAbsoluteFile() + " cannot be found");
        } catch (IOException e) {
            System.out.println("Cannot read line!");
        }
    }

}
/*
My Notepad (note.txt)
1) Read file  (read => read)
2) Write file (input => file)
3) Exit
 */