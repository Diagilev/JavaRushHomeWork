package com.javarush.test.level03.lesson08.task03;

/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner scan = new Scanner(System.in);
        String name1;
        name1 = scan.next();
        System.out.println(name1 +" зарабатывает $5,000. Ха-ха-ха!");

    }
}