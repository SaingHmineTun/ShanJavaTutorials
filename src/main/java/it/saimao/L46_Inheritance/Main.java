package it.saimao.L46_Inheritance;

public class Main {
    public static void main(String[] args) {

//        Parent parent = new Parent();
//        System.out.println(parent.getIncome());

        Child child = new Child();
        System.out.println("Parent's income - " + child.getIncome());
        child.withdraw(50_000);
        System.out.println("Remaining income - " + child.getIncome());

    }
}
