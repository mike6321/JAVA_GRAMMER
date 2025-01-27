package me.choi.item52;

import java.math.BigInteger;
import java.util.*;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/06
 * Time : 11:33 오후
 */
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "집합";
    }

    public static String classify(List<?> list) {
        return "리스트";
    }

    public static String classify(Collection<?> c) {
        return "그외";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>()
        };


        for (Collection<?> collection : collections) {

            System.out.println(classify(collection));
        }
    }
}
