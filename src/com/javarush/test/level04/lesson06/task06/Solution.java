package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       // System.out.println("Введите имя:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
       // System.out.println("Введите возраст:");
        int old = sc.nextInt();
        if (old > 20){
            System.out.println("И 18-ти достаточно");

    }
}
}
