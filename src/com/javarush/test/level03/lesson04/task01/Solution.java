package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution
{
    public static void main(String[] args)
    {
        Date date = new Date("09/13/1991");

        System.out.println(date.toLocaleString());

    }
}