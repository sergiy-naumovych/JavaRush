package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("name", 20, "address");
        Man man2 = new Man("name2", 20, "address");
        Woman woman1 = new Woman("name", 20, "address");
        Woman woman2 = new Woman("name2", 20, "address");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.address = address;
            this.age = age;
            this.name = name;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.address = address;
            this.age = age;
            this.name = name;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }


}
