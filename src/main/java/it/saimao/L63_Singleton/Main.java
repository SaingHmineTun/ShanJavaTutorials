package it.saimao.L63_Singleton;

public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance("Sai");
        User user2 = User.getInstance("Mg");
        System.out.println(user1 + " : " + user2);
    }
}
