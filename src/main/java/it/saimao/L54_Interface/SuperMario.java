package it.saimao.L54_Interface;

public class SuperMario extends GamingConsole {

    public SuperMario() {
        this.gameName = "Super Mario";
    }

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Go inside the hole");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Move on");

    }
}
