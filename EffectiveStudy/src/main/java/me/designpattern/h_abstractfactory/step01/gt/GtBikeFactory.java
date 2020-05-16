package me.designpattern.h_abstractfactory.step01.gt;

import me.designpattern.h_abstractfactory.step01.abst.BikeFactory;
import me.designpattern.h_abstractfactory.step01.abst.Body;
import me.designpattern.h_abstractfactory.step01.abst.Wheel;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:37 오후
 */
public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
