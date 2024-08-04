package it.saimao.L37_JavaMethods;

public class Main {
    public static void main(String[] args) {

        Phone ph1 = new Phone();
        ph1.brand = "Oppo";
        ph1.ram = 6;
        ph1.powerOn = true;
        ph1.playML();

        System.out.println("########################");
        Phone ph2 = new Phone();
        ph2.playML();


    }
}
