package it.saimao.L54_Interface;

public class Main {
    public static void main(String[] args) {
        playGame(new SuperContra("Super Contra"));
        playGame(new SuperMario());
    }

    public static void playGame(GamingConsole gamingConsole) {
        gamingConsole.printInfo();
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }

}
