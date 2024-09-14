package it.saimao.L53_AbstractClass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        makeSound(dog);
        makeSound(cat);
    }

    public static void makeSound(Animal animal) {
        animal.makeSound();
    }


}
