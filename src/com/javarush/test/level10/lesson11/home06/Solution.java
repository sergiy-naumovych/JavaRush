package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human h1 = new Human("h1");
        Human h2 = new Human("h2", 18);
        Human h3 = new Human("h3", 18, 50);
        Human h4 = new Human("h4", 18, 50, true);
        Human h5 = new Human("h5", 18, 50, true, null);
        Human h6 = new Human("h6", 18, 50, true, null, 180);
        Human h7 = new Human("h7", 18, false);
        Human h8 = new Human("h8", null);
        Human h9 = new Human("h9", null, true);
        Human h10 = new Human("h10", false, 168);
    }

    public static class Human
    {
        String name;
        int age = 18;
        int weight = 50;
        Boolean sex = true;
        String address = null;
        int height = 190;

        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, int age, int weight, Boolean sex)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }
        public Human(String name, int age, int weight, Boolean sex, String address)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.address = address;
        }
        public Human(String name, int age, int weight, Boolean sex, String address, int height)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.address = address;
            this.height = height;
        }
        public Human(String name, int age, Boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, String address)
        {
            this.name = name;
            this.address = address;
        }
        public Human(String name, String address, Boolean sex)
        {
            this.name = name;
            this.address = address;
            this.sex = sex;
        }
        public Human(String name, Boolean sex, int height)
        {
            this.name = name;
            this.sex = sex;
            this.height = height;
        }

    }
}
