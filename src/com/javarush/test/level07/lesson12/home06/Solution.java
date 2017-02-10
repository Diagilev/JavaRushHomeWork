package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Petya", 60, true);
        Human ded2 = new Human("Kolya", 56, true);
        Human bab1 = new Human("Masha",55,false);
        Human bab2 = new Human("Rita", 45, false);
        Human fat1 = new Human("Sasha", 33, true ,ded1, bab1);
        Human mam1 = new Human("Olya",  35,false, ded2, bab2);
        Human kid1 = new Human("Anna",  10,false, fat1, mam1);
        Human kid2 = new Human("Nadja",  12,false, fat1, mam1);
        Human kid3 = new Human("Vasja", 12, false, fat1, mam1);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(fat1);
        System.out.println(mam1);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human
    {String name;
        boolean sex;
        int age;
        String mother;
        String father;


        public Human(String name ,int age,boolean sex ){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name ,int age, boolean sex , Human father,Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father.name;
            this.mother = mother.name;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father;

            if (this.mother != null)
                text += ", мать: " + this.mother;

            return text;
        }
    }

}