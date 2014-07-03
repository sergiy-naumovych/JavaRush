package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out = new FileOutputStream(new File(reader.readLine()));

        while(in.available() > 0){
            byte[] res = new byte[in.available()];
            int count = in.read(res);

            for(int i = 0; i < res.length / 2; i++){
                byte tmp = res[i];
                res[i] = res[res.length-i-1];
                res[res.length-i-1] = tmp;
            }

            out.write(res, 0, count);
        }


        reader.close();
        in.close();
        out.close();

    }
}
