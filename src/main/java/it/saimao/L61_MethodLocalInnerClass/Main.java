package it.saimao.L61_MethodLocalInnerClass;

public class Main {

    public static void main(String[] args) {

        class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof Woof");
            }
        }

        makeSound(new Dog());
        makeSound(new Dog());
    }

    public static void makeSound(Animal animal) {
        animal.makeSound();
    }


}
