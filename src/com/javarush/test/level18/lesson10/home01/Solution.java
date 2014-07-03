package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        int count = 0;
        if(args.length > 0){
            FileInputStream in = new FileInputStream(args[0]);

            while(in.available() > 0){
                int data = in.read();
                if((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z'))
                        || (data >= Integer.valueOf('a') && data <= Integer.valueOf('z'))){
                    count++;
                }
            }

            in.close();
        }

        System.out.println(Integer.valueOf(count));

    }
}
