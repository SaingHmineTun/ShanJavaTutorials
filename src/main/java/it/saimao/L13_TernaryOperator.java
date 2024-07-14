package it.saimao;

/*
boolean_expression ? value1 : value2
if true => value1
if false => value2
 */
public class L13_TernaryOperator {
    public static void main(String[] args) {

        int num = 12345;
        String gender = num % 2 == 0 ? "male" : "famale";
        System.out.println(gender);

    }
}
