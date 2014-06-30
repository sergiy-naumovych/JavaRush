package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        reverseArray(array);
        print(array);
        //System.out.println(max);
    }

    private static void reverseArray(int[] array)
    {
        int middle = array.length / 2;
        int total = array.length - 1;
        for (int i = 0; i < middle; i++)
        {
            int tmp = array[i];
            array[i] = array[total - i];
            array[total - i] = tmp;
        }
    }

    public static int[] initializeArray() throws IOException
    {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
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
