package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner c = new Scanner(System.in);
        int j = 0;
        int [] numbers = new int [4];
        for(int i: numbers){
          numbers[i] = c.nextInt();
           if(numbers[i] > j){
               j=numbers[i];

           }
            System.out.println(j);
        }
    }
}
