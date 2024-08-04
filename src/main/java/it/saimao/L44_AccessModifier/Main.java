package it.saimao.L44_AccessModifier;

import it.saimao.L44_AccessModifier.models.Animal;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Sai Mao";
        System.out.println(animal.name);
        animal.printName();
    }

}
