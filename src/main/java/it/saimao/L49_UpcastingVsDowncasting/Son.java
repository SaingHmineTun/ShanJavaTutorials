package it.saimao.L49_UpcastingVsDowncasting;

public class Son extends Parent {

    public void printIncome() {
        super.printIncome();
        System.out.println("Son's income is " + income);
    }

}
