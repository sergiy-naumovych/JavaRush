package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by SERGE on 23.03.14.
 */
public class Plane implements Flyable
{
    int passengers;

    public Plane(int passengers)
    {
        this.passengers = passengers;
    }

    @Override
    public void fly()
    {

    }
}
