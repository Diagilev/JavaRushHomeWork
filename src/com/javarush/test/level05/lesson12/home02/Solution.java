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
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String getMan(){
            return name +" "+ age +" "+ address;
        }
    }
public static class Woman{
        String name;
        int age;
        String address;
        public Woman (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    public String getWoman(){
        return name +" "+ age +" "+ address;
    }
    }

    public static void main(String[] args)
    {
        Man man1 = new Man("sdfsdf", 20, "sdfsdf");
        Man man2 = new Man("sdfsdf", 20, "sdfsdf");
        Woman w1 = new Woman("sfgdsfsdff", 20, "dsfsdf");
        Woman w2 = new Woman("dfdffdf", 20, "gfgdfg");
        System.out.println(man1.getMan());
        System.out.println(man2.getMan());
        System.out.println(w1.getWoman());
        System.out.println(w2.getWoman());
    }
}
