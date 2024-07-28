package it.saimao;

public class L26_WhileLoop {
    public static void main(String[] args) {

        String name = "Sai Mao";
        var is = name.startsWith("Saii");
        while (is) { // Infinite loop
            System.out.println("Looping...");
        }
        System.out.println("End of Loop");

    }
}
