package it.saimao.L58_NormalInnerClass;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo");
        Computer.Ram ram = computer.new Ram("DDR3", 8);
        ram.printInfo();
    }
}
