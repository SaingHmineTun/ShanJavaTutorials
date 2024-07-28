package it.saimao;

public class L31_EnhancedForLoop {
    public static void main(String[] args) {

        String names = "Luffy, Sanji, Zoro, Nami, Robin, Chopper";
        String[] strings = names.split(",");
        for (String name : strings) {
            System.out.println(name.trim());
        }
    }
}
