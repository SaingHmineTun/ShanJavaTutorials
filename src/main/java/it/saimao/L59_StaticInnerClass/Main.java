package it.saimao.L59_StaticInnerClass;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User.Builder().setAge(18).setActive(true).setName("Sai").setBirthday(LocalDate.of(2000, 1, 1)).build();
        System.out.println(user);
//        printNames("Sai", "Nan", "Mg", "Ma");
    }


    private static void printNames(String... names) { // var-args
        for (String name : names) {
            System.out.println(name);
        }
    }

}
