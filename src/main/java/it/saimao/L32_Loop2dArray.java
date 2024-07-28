package it.saimao;

public class L32_Loop2dArray {
    public static void main(String[] args) {

        char[][] consonants = {
                {'ၵ', 'ၶ', 'င'},
                {'ၸ', 'သ', 'ၺ'},
                {'တ', 'ထ', 'ၼ'},
                {'ပ', 'ၽ', 'ၾ'},
                {'မ', 'ယ', 'ရ'},
                {'လ', 'ဝ', 'ႁ'},
                {'ဢ'}
        };

        System.out.println("With normal loop");
        for (int i = 0; i < consonants.length; i++) {
            for (int x = 0; x < consonants[i].length; x++) {
                System.out.print(consonants[i][x] + "\t");
            }
            System.out.println();
        }

        System.out.println("With enhanced for loop");
        for (char[] row : consonants) {
            for (char column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }

    }
}
