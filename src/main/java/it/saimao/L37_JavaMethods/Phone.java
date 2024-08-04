package it.saimao.L37_JavaMethods;

public class Phone {
    String brand;
    int ram;
    boolean powerOn;

    /*
    1. Method return type
    2. Method name
    3. Method parameter
    4. Method body
     */
    void playML() {
        if (powerOn) {
            System.out.println("Go to screen that has ML game installed");
            System.out.println("Click on its launcher");
            System.out.println("Wait for server loading...");
            System.out.println("Go to classic or rank mode");
        } else {
            System.out.println("Please turn on your phone first");
        }
    }

    void loop2dArray() {
        char[][] consonants = {
                {'ၵ', 'ၶ', 'င'},
                {'ၸ', 'သ', 'ၺ'},
                {'တ', 'ထ', 'ၼ'},
                {'ပ', 'ၽ', 'ၾ'},
                {'မ', 'ယ', 'ရ'},
                {'လ', 'ဝ', 'ႁ'},
                {'ဢ'}};

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
