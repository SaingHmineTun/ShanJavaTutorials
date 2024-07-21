package it.saimao;

public class L25_NewSwitch {
    public static void main(String[] args) {
        int grade = 8;
        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Go to primary school department");
            case 5, 6, 7, 8 -> System.out.println("Go to middle school department");
            case 9, 10 -> System.out.println("Go to high school department");
            default -> System.out.println("Go to head master's office!");
        }
    }
}
