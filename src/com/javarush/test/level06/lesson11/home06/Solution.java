package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(KissMyShinyMetalAss.r1);
    }

    public static class KissMyShinyMetalAss
    {
       static KissMyShinyMetalAss r1 = new KissMyShinyMetalAss();
    }

}
