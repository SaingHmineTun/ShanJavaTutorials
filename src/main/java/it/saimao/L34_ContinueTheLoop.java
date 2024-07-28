package it.saimao;

public class L34_ContinueTheLoop {
    public static void main(String[] args) {
        for (char ch = 'က'; ch <= 'အ'; ch ++) {
            if (ch == 'ဉ') continue;
            System.out.println(ch);
        }
    }
}
