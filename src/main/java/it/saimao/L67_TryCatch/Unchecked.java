package it.saimao.L67_TryCatch;

public class Unchecked {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        System.out.println("Start");
        try {
            System.out.println(numbers[3]);
        } catch (Exception e) {
            System.out.println("Index 3 isn't available!");
        }
        System.out.println("End");

    }
}
