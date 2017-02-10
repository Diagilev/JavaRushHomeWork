package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength)
    {
        this.name = name;
        this.weight=weight;
        this.strength = strength;
        this.age=age;

    }

    public Cat(int age, int weight, int strength)
    {
        this.weight=weight;
        this.strength = strength;
        this.age=age;

    }

    public boolean fight(Cat anotherCat)
    {
        int winChance1 = this.strength * this.weight  / this.age;
        int winChance2 = anotherCat.strength * anotherCat.weight / anotherCat.age;
        return winChance1 > winChance2;

    }
public static void main (String[] args){

    Cat cat1 = new Cat(5, 80, 4);
    Cat cat2 = new Cat(5, 80, 4);

    System.out.println(cat1.fight(cat2));
    System.out.println(cat2.fight(cat1));


}




}
