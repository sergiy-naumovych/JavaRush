package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 12 2012".
*/

import java.util.Calendar;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        Date t = new Date();
        System.out.println(t);
        Calendar today = Calendar.getInstance();

        System.out.print(today.get(Calendar.DATE) + " " + (today.get(Calendar.MONTH) + 1) + " " + today.get(Calendar.YEAR));
    }
}
