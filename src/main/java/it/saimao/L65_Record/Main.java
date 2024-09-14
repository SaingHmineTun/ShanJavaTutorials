package it.saimao.L65_Record;

public class Main {
    public static void main(String[] args) {
        var person = new User("Sai", 20);
        System.out.println(person);
        var person1 = new User("Sai", 20);
        System.out.println(person1);

        System.out.println(person.equals(person1));
    }
}
