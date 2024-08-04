package it.saimao.L41_Constructor;

public class Person {

    String name;
    int age;

    void printName() {
        System.out.println("My name is " + name);
    }

    void printInfo() {
        printName();
        System.out.println("I am " + age + " years old!");
    }

    Person() { // no argument constructor
        System.out.println("I'm constructor!");
    }

    Person(String name) {
        System.out.println("Constructor Parameter - " + name);
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
