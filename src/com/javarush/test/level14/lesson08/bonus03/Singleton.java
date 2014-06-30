package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by SERGE on 20.03.14.
 */
public class Singleton {
    private Singleton(){}
    private static final Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
}
