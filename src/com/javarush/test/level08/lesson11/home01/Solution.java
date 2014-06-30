package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }
    /*
        public String toString()
        {
            return name;
        }
*/
        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (!(o instanceof Cat)) return false;

            Cat cat = (Cat) o;

            if (!name.equals(cat.name)) return false;

            return true;
        }

        @Override
        public int hashCode()
        {
            return name.hashCode();
        }
    }

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        cats.remove(new Cat("name0"));

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++)
        {
            cats.add(new Cat("name" + i));
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
}
