package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());

        FileInputStream in1 = new FileInputStream(file1);

        FileInputStream in2 = new FileInputStream(file2);

        byte[] data2 = new byte[0];
        byte[] data1 = new byte[0];


        while(in2.available() > 0){
            data2 = new byte[in2.available()];
            int count = in2.read(data2);
        }

        while(in1.available() > 0){
            data1 = new byte[in1.available()];
            int count = in1.read(data1);
        }

        in1.close();
        FileOutputStream out1 = new FileOutputStream(file1);

        byte[] res = new byte[data1.length + data2.length];

        System.arraycopy(data2, 0, res, 0, data2.length);
        System.arraycopy(data1, 0, res, data2.length, data1.length);

        out1.write(res);


        reader.close();

        in2.close();
        out1.close();


    }
}
