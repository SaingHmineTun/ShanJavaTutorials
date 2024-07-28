package it.saimao;

public class L30_ForLoop {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }

        String names = "Luffy, Sanji, Zoro, Nami, Robin, Chopper";
        String[] strings = names.split(",");
        for (int i = 0; i < strings.length; i++) {
            String name = strings[i].strip();
            System.out.println(name);
        }
    }
}
