package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(reader.readLine());
        }

        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }

    }
}
