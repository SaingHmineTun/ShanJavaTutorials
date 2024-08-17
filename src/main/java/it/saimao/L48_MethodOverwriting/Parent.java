package it.saimao.L48_MethodOverwriting;

public class Parent {

    protected int income = 50000;

    public void printIncome() {
        System.out.println("Parent's income is = " + income);
    }

    public String toString() {
        return "Income : " + income;
    }
}
