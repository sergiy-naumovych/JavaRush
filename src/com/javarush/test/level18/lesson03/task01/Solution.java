package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        int max = 0;
        int tmp;


        while(in.available() > 0){
            tmp = in.read();
            if(tmp > max){
                max = tmp;
            }
        }

        System.out.println(max);
        reader.close();
        in.close();
    }
}
