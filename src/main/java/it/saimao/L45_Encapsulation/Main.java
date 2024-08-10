package it.saimao.L45_Encapsulation;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        String name = human.getName();
        System.out.println(name.toLowerCase());
        human.setAge(-10);
        System.out.println(human.getAge());

        Person person = new Person("Sai Mao"); // immutable object
        System.out.println(person.getName());


    }
}
