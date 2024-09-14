package it.saimao.L74_Generic;

public class Main {
    public static void main(String[] args) {

        User1 user1 = new User1();
        user1.name = "Sai Sai";
        user1.password = "1234";

        User2 user2 = new User2();
        user2.name = "Sai Sai";
        user2.password = 1234;

        UserGeneric<String> userGeneric = new UserGeneric<>();
        userGeneric.name = "Mg Mg";
        userGeneric.password = "1234.5";

        String i = userGeneric.print("123");

    }
}
