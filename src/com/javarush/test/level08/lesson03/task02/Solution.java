package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – овощ
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        String[] keys = {"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        String[] values = {"ягода", "трава", "ягода", "фрукт", "овощ", "куст", "корень", "ягода", "цветок", "клубень"};

        for (int i = 0; i < keys.length; i++)
        {
            map.put(keys[i], values[i]);
        }

        for (Map.Entry<String, String> pair: map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
