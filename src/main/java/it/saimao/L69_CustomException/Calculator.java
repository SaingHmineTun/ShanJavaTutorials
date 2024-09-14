package it.saimao.L69_CustomException;

public class Calculator {
    public static int calculatePositive(int fn, int sn) throws InvalidException {
        if (sn > fn) throw new InvalidException("Second number cannot be greater than first number!");
        return fn - sn;
    }
}
