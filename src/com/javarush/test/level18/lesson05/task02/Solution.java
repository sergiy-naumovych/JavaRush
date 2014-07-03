package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));


        int count = 0;
        while(in.available() > 0){
            if(in.read() == 44){
                count ++;
            }
        }

        System.out.println(count);


        reader.close();
        in.close();
    }
}
