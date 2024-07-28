package it.saimao;

import java.util.Random;

public class L37_Random {
    public static void main(String[] args) {
        var random = new Random();
        int num = random.nextInt(100); // 0 - 9
        System.out.println(num);

    }
}
/*

HOMEWORK - Dice Rolling
loop:
Random => 1 - 6
Input => 1 - 6
Random = Input => You guessed correct
Random != Try again => go to loop

 */