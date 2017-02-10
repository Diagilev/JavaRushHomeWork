package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i<5; i++)
        {
            list.add(sc.next());
        }
        int size = list.size();
        String buf;
        for (int i =0 ; i<13; i++)
        {
           buf = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, buf);

        }
        for(String i: list)
        System.out.println(i);
    }
}