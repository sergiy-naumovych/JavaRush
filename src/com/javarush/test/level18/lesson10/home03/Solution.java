package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out1 = new FileOutputStream(new File(reader.readLine()), true);
        FileInputStream in2 = new FileInputStream(new File(reader.readLine()));
        FileInputStream in3 = new FileInputStream(new File(reader.readLine()));

        while(in2.available() > 0){
            byte[] res = new byte[in2.available()];
            int count = in2.read(res);

           out1.write(res, 0, count);
        }

        while(in3.available() > 0){
            byte[] res = new byte[in3.available()];
            int count = in3.read(res);

            out1.write(res, 0, count);
        }


        reader.close();
        out1.close();
        in2.close();
        in3.close();
    }
}
