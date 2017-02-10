package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1= sc.nextInt();
        n2= sc.nextInt();
        int n = Math.min(n1,n2);
        System.out.println(n);

    }
}