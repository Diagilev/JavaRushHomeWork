package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
            //System.out.println(array[i]);
        }
        int min1 = min(array);
        System.out.println(min1);
    }


    public static int min(int a[])
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (min>a[i]) {
                min = a[i];
        }
        }
        return min;
    }
}