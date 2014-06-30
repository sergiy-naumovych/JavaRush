package com.javarush.test.level14.lesson08.bonus01;

import sun.awt.SunToolkit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {
        try
        {
            float i = 1 / 0;
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        exceptions.add(new NullPointerException());
        exceptions.add(new IOException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new TimeoutException());
        exceptions.add(new InterruptedException());
        exceptions.add(new RuntimeException());
        exceptions.add(new EmptyStackException());



        //Add your code here

    }
}
