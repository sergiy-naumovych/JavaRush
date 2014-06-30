package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {

        StackTraceElement[] stackTraceElements =  Thread.currentThread().getStackTrace();
        method2();
        return stackTraceElements[2].getMethodName();

    }

    public static String method2()
    {

        StackTraceElement[] stackTraceElements =  Thread.currentThread().getStackTrace();
        method3();
        return stackTraceElements[2].getMethodName();

    }

    public static String method3()
    {

        StackTraceElement[] stackTraceElements =  Thread.currentThread().getStackTrace();
        method4();
        return stackTraceElements[2].getMethodName();

    }

    public static String method4()
    {
        StackTraceElement[] stackTraceElements =  Thread.currentThread().getStackTrace();
        method5();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }

        return stackTraceElements[2].getMethodName();

    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElements =  Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements[2].getMethodName();

    }
}
