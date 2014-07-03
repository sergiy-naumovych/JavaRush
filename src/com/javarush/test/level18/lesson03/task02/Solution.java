package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        int min = 300;
        int tmp;


        while(in.available() > 0){
            tmp = in.read();
            if(tmp < min){
                min = tmp;
            }
        }

        System.out.println(min);
        reader.close();
        in.close();
    }
}
