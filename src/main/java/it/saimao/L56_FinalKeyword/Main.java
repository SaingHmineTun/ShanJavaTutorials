package it.saimao.L56_FinalKeyword;

// Final Variable - cannot re-assign its value
public class Main {

    public final static String name = "Main";

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.printName();
        System.out.println(name);

    }
}
