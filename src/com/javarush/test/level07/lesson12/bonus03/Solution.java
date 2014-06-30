package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    private static void sort(int[] arr) {
        int minIndex, minItem = 0;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            minItem = arr[barrier];
            minIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (minItem > arr[index]) {
                    minItem = arr[index];
                    minIndex = index;
                }
            }
            swap(arr, minIndex, barrier);
        }
        invert(arr);
    }
    private static void invert(int[] arr) {
        int middle = arr.length / 2;
        int secondIndex;
        for(int i = (middle-1); i >= 0; i--){
            secondIndex = arr.length-(i+1);
            swap(arr, i, secondIndex);
        }


    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }
}
