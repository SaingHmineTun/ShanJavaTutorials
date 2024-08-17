package it.saimao.L48_MethodOverwriting;

public class Main {

    public static void main(String[] args) {

        Parent son = new Son();
        son.printIncome();
        System.out.println(new Daughter());

    }

}
