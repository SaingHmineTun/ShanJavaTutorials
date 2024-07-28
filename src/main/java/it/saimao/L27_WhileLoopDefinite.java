package it.saimao;

public class L27_WhileLoopDefinite {
    public static void main(String[] args) {

        // 1. initialize value
        int i = 0;
        while (i < 5) { // 2. Boolean expression
            System.out.println("Looping " + i);
            i++; // 3. Update expression
        }
        System.out.println("End of loop");
    }
}
