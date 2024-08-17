package it.saimao.L49_UpcastingVsDowncasting;


public class Daughter extends Parent {
    public void deposit(int amount) {
        income += amount;
    }

    public void withdraw(int amount) {
        income -= amount;
    }
}
