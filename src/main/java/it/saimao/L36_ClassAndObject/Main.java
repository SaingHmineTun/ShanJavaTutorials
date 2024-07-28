package it.saimao.L36_ClassAndObject;

/*
DEFAULT values for STATE
byte, short, int, long, float, double, char => 0
boolean => false
Reference type => null
 */
public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.age = 18;
        myClass.name = "Sai Sai";
        System.out.println("Age : " + myClass.age);
        System.out.println("Active : " + myClass.active);
        System.out.println("Name : " + myClass.name);


    }
}
