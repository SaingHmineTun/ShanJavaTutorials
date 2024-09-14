package it.saimao.L60_StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder number0To999 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            number0To999.append("(").append(i).append(")").append(" ");
        }
        String str = number0To999.toString();
        System.out.println(str);
    }
}
