package it.saimao.L46_Inheritance.models;

public class Parent {
    private int income;

    public Parent() {
        income = 100_000;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
