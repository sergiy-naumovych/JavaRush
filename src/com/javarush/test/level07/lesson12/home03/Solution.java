package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        int  maximum;
        int  minimum;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(reader.readLine());
        }

        maximum = max(arr);
        minimum = min(arr);

        System.out.println(maximum);
        System.out.println(minimum);
    }

    private static int max(int[] arr){
        int max = -2147400000;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }

        return max;
    }

    private static int min(int[] arr){
        int min = 2147400000;
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }

        return min;
    }
}
