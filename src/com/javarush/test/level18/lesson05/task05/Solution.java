package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть все потоки ввода-вывода
2.2 выбросить исключение DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in;

        while(true){
            in = new FileInputStream(new File(reader.readLine()));
            if(in.available() < 1000){
                in.close();
                reader.close();
                throw new DownloadException();
            }
            in.close();
        }


    }

    public static class DownloadException extends Exception{

    }
}
