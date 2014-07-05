package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set cats = createCats();
        Set dogs = createDogs();

        Set pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set createCats()
    {
        HashSet result = new HashSet();

        for(int i = 0; i < 4; i++)
        {
            result.add(new Cat());
        }

        return result;
    }

    public static Set createDogs()
    {
        HashSet result = new HashSet();

        for(int i = 0; i < 3; i++)
        {
            result.add(new Dog());
        }

        return result;
    }

    public static Set join(Set cats, Set dogs)
    {
        HashSet pets = new HashSet(dogs);
        pets.addAll(cats);

        return pets;
    }

    public static void removeCats(Set pets, Set cats)
    {
        pets.removeAll(cats);
    }

    public static void printPets(Set pets)
    {
        for(Object object : pets)
        {
            System.out.println(object);
        }
    }

    public static class Cat
    {

    }
    public static class Dog
    {

    }
}

