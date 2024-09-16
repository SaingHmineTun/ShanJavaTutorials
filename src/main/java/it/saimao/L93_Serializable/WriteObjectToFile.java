package it.saimao.L93_Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {
    public static void main(String[] args) throws IOException {

        File file = new File("person.sr");
        Person person = new Person("Sai Mao", 28);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(person);
        }

    }
}
