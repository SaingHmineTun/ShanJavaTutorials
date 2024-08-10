package it.saimao.L45_Encapsulation;

public class Human {

    private String name;
    private int age;

    // Get method : Read access
    public String getName() {
        if (name == null) return "default";
        return name;
    }

    // Set method : Write access
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) return;
        this.age = age;
    }
}
/*
HOMEWORK - ATM
State of ATM - name, pin, amount (100,000)
Behaviors of ATM - deposit, withdraw, info

1. Enter your name
2. Enter your pin

Welcome to name's ATM
while (true)
    1. Deposit => Enter amount (50,000)
    2. Withdraw => Enter amount (100,000)
    3. Balance
    4. Exit
 */