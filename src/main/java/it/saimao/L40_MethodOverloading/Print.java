package it.saimao.L40_MethodOverloading;

/*
1. Numbers of parameter
2. Parameter data type
 */
public class Print {


    void println(String val) {
        System.out.println("String : " + val);
    }

    void println(int val) {
        System.out.println("Integer : " + val);
    }

    void println(String val1, int val2) {
        System.out.println("String : " + val1);
        System.out.println("Integer : " + val2);
    }

    void println() {
        System.out.println("No arg method");
    }

}