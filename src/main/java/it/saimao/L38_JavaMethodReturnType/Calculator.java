package it.saimao.L38_JavaMethodReturnType;

public class Calculator {
    int firstNumber;
    int secondNumber;

    void printInfo() {
        System.out.printf("First number is %d%nSecond number is %d%n", firstNumber, secondNumber);
    }

    int addition() {
        int addition = firstNumber + secondNumber;
        return addition;
    }

    int subtraction() {
        return firstNumber - secondNumber;
    }

    int multiplication() {
        return firstNumber * secondNumber;
    }

    double division() {
        return (double) firstNumber / secondNumber;
    }

    int modulus() {
        return firstNumber % secondNumber;
    }

}
