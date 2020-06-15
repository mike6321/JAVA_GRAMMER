package org.example.a_package.a_bridgepattern;

/**
 * Project : DesignPatternReview
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:16 오전
 */
public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("(Knife) attack");
    }

    @Override
    public void repair() {
        System.out.println("(Knife) repair");
    }
}
