package it.saimao;

public class L20_2DArray {
    public static void main(String[] args) {

        char[][] chars = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm'}
        };

        // Access value from 2D Array
        char[] row1 = chars[2];
        char l = row1[1];
        System.out.println(l);

        // Update value in 2D Array
        System.out.println("Before update : " + chars[2][0]);
        chars[2][0] = 'o';
        System.out.println("After update : " + chars[2][0]);

        // Get the length of array
        System.out.println("Array length - " + chars.length);
        System.out.println("Row 1 length - " + chars[1].length);

    }
}
