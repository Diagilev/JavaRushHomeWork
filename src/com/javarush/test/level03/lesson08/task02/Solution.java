package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int pay = scan.nextInt();
        int year = scan.nextInt();
        System.out.println(name + " получает " + pay+ " через " + year + " лет.");

    }
}