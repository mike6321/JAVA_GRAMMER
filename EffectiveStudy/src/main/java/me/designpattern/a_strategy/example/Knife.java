package me.designpattern.a_strategy.example;

/**
 * Project : croissant
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/20
 * Time : 1:09 오전
 */
public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("Knife Attack");
    }
}
