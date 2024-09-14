package it.saimao.L54_Interface;

public abstract class GamingConsole {

    public String gameName;

    public void printInfo() {
        System.out.println("Game name - " + gameName);
    }

    abstract void up();

    abstract void down();

    abstract void left();

    abstract void right();

}
