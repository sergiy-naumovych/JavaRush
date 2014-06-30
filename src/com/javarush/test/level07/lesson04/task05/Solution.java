package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        System.arraycopy(array, 0, arr1, 0, 10);
        System.arraycopy(array, 10, arr2, 0, 10);
        //reverseArray(array);
        print(arr2);
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
        int[] arr = new int[20];
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
