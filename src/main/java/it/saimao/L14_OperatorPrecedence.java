package it.saimao;

public class L14_OperatorPrecedence {
    public static void main(String[] args) {

        int x = 100 + 100 - 50 * 2;
        System.out.println(x); // Left to right is 300. But the result is 100. Because it follows operator precedence

    }
}
