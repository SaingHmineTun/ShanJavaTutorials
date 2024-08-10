package it.saimao.L46_Inheritance;

import it.saimao.L46_Inheritance.models.Parent;

/*
public/protected members
 */
public class Child extends Parent {


    public void deposit(int amount) {
        setIncome(getIncome() + amount);
    }

    public void withdraw(int amount) {
        setIncome(getIncome() - amount);
    }


}
