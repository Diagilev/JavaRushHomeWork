package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);

        int i=0;
        //int s;
        for (; true; )
        {

           String s = sc.next();


            if ("сумма".equals(s))
            {
                System.out.println(i);
                break;
            }
            else {
                try {
                int n=Integer.parseInt(s);
                i+=n;
                }
                catch (Exception e) {
                    break;}
            }
        }

    }
}
