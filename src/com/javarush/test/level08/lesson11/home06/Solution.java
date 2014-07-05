package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> childrens = new ArrayList<Human>();
        Human kid1 = new Human("Kid1",true,5,new ArrayList<Human>());
        Human kid2 = new Human("Kid2",false,10,new ArrayList<Human>());
        Human kid3 = new Human("Kid3",true,1,new ArrayList<Human>());

        childrens.add(kid1);
        childrens.add(kid2);
        childrens.add(kid3);
        Human father = new Human("Father",true,38,childrens );
        Human mother = new Human("Mother", false,35,childrens);
        ArrayList<Human> childrens2 = new ArrayList<Human>();
        childrens2.add(father);
        Human gpa1 = new Human("Gpa1",true,75,childrens2);
        Human gma1 = new Human("Gma1",false,73,childrens2);
        ArrayList<Human> childrens3 = new ArrayList<Human>();
        childrens3.add(mother);
        Human gpa2 = new Human("Gpa2",true,80,childrens3);
        Human gma2 = new Human("Gma2",true,75,childrens3);
        System.out.println(gpa1);
        System.out.println(gma1);
        System.out.println(gpa2);
        System.out.println(gma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
