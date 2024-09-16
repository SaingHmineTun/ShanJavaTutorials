package it.saimao.L93_Serializable;

import java.io.*;

public class ReadObjectFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("person.sr");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
