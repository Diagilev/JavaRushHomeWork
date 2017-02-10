package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 0;
        for (; true; )
        {
            i = sc.nextInt();
            n+=i;
            if (i<=-1)
            {
                System.out.println(n);
                break;
            }
            }

        }

    }