package it.saimao.L48_MethodOverwriting;

public class Son extends Parent {

    public void printIncome() {
        super.printIncome();
        System.out.println("Son's income is " + income);
    }

}
