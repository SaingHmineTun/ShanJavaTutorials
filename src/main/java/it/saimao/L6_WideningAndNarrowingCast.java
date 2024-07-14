package it.saimao;

public class L6_WideningAndNarrowingCast {
    public static void main(String[] args) {
        byte b = 100;
        short s = b; // 1 byte => 2 bytes // implicit casting // widening

        int i = 130;
        byte ss = (byte) i; // 4 bytes => 2 bytes // explicit casting // narrowing
        System.out.println(ss); // Data loss (ၶေႃႈမု်းၸၢင်ႈႁၢႆ)
    }
}
