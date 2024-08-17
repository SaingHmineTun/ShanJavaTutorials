package it.saimao.L47_Polymorphism;

public class Main {
    public static void main(String[] args) {
        SuperClass subClass = new SubClass(); // SuperClass, SubClass, Object
        printIncome(new SubClass());
        printIncome(new ChildClass());
    }

    public static void printIncome(SuperClass superClass) {
        System.out.println(superClass.getIncome());
    }

}
