package it.saimao;

/*
Arithmetic operator (Binary operators)
int + int = int
int + float = float
float + int = float
float + float = float
+
-
*
/
%
 */
public class L8_ArithmeticOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); // int / int = int
        System.out.println(x / 20.0); // int / floating = floating
        System.out.println(x % y); // Remainder ၸႅၵ်ႇလိူဝ် မၢႆၵိုတ်ႉ

    }
}
