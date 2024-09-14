package it.saimao.L54_Interface;

import it.saimao.L47_Polymorphism.SuperClass;

public class SuperContra extends GamingConsole {

    public SuperContra(String name) {
        this.gameName = name;
    }

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Lay down");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Shoot");
    }
}
