package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        //int middle;

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        bubbleSort(arr);
        System.out.println(arr[1]);
    }

    private static void bubbleSort(int[] arr) {
        boolean flag;
        for(int barrier = 0; barrier < arr.length; barrier++){
            flag = false;
            for(int index = arr.length-1; index > barrier; index--){
                //System.out.println(index);
                if(arr[index] < arr[index-1]){
                    flag = true;
                    swap(arr, index, index-1);
                }
            }
            if(!flag){
                return;
            }
        }
    }

   private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }
}
