package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] array = initializeArray();
        int[] numbers = initializeArray(array);
        print(numbers);
        //System.out.println(max);
    }

    private static int[] initializeArray(String[] arr)
    {
        int[] res = new int[10];
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++)
        {
            res[i] = arr[i].length();
        }
        //
        // initialize(create and fill) an array here - инициализируйте (создайте и заполните) массив тут
        return res;
    }

    public static String[] initializeArray() throws IOException
    {
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = reader.readLine();
        }
        //
        // initialize(create and fill) an array here - инициализируйте (создайте и заполните) массив тут
        return arr;
    }

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
