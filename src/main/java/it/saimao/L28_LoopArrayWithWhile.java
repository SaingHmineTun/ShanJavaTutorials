package it.saimao;

public class L28_LoopArrayWithWhile {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println("First index of chars " + chars[0]);
        System.out.println("Length of chars " + chars.length);
        System.out.println("Last index of chars " + chars[chars.length - 1]);

        int i = chars.length - 1;
        while (i >= 0) {
            System.out.println(i + " : " + chars[i]);
            i--;
        }
    }
}
