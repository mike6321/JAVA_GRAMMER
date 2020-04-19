package me.designpattern.strategypattern;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("Sword Attack");
    }
}
