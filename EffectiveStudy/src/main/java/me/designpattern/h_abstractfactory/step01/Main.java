package me.designpattern.h_abstractfactory.step01;

import me.designpattern.h_abstractfactory.step01.abst.BikeFactory;
import me.designpattern.h_abstractfactory.step01.gt.GtBikeFactory;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:33 오후
 */
public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new GtBikeFactory();

        System.out.println(factory.createBody().getClass());
        System.out.println(factory.createWheel().getClass());
    }
}
