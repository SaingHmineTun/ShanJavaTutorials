package it.saimao;

public class L18_Array {
    public static void main(String[] args) {

        // Create array
        int[] numbers = {5, 10, 15, 20};
        String[] names = {"Luffy", "Zoro", "Sanji", "Nami"};

        // Access value in array
        System.out.println(names[0]);
        String zoro = names[1];
        System.out.println(zoro);

        // Update value in array
        System.out.println("Before update : " + numbers[3]);
        names[3] = "Rabin";
        System.out.println("After update : " + names[3]);

        // Create array with new keyword
        char[] chars = new char[3]; // {0, 0, 0}
        chars[0] = 'ၵ';
        chars[1] = '\u1001';
        chars[2] = 0x1002;
        System.out.println(chars[2]);
        // System.out.println(chars[3]); // ERROR Code

        // Create array from String
        // 1. String to char[]
        String str = "Hello"; // {'H', 'e', 'l', 'l', 'o'}
        char[] chs = str.toCharArray();
        System.out.println(chs[4]);
        // 2. String to String[]
        String csv = "Luffy,Zoro,Sanji"; // comma separated value
        String[] strings = csv.split(","); // {"Luffy", "Zoro", "Sanji"}
        System.out.println(strings[2]);
    }
}
