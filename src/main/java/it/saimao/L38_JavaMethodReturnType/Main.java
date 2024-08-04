package it.saimao.L38_JavaMethodReturnType;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.firstNumber = 6;
        calculator.secondNumber = 10;
        calculator.printInfo();
        int addition = calculator.addition();
        System.out.println("Addition : " + addition);
        System.out.println("Multiplication : " + calculator.multiplication()); // 6 * 10
        System.out.println("Division : " + calculator.division());
    }
}
