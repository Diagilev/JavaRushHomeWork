package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;
import java.util.Scanner;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(){};
        list.add("dfdsf");
        list.add("dfdsf2");
        list.add("dfdsf4");
        list.add("dfdsf5");
        list.add("dfdsf6");

        System.out.println(list.size());
        for (String object: list) {
            System.out.println(object);
        }
    }
}
