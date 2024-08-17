package it.saimao.L49_UpcastingVsDowncasting;

public class Main {

    public static void main(String[] args) {

        Parent daughter = new Daughter(); // Upcasting (Implicit Casting)
        deposit(daughter);
        deposit(new Son());

    }

    private static void deposit(Parent parent) {
        if (parent instanceof Daughter) {
            Daughter daughter = (Daughter) parent; // Down-casting (Explicit Casting)
            daughter.deposit(5000);
            System.out.println(daughter);
        } else {
            System.out.println("Sorry, you're not daughter!");
        }
    }

}
