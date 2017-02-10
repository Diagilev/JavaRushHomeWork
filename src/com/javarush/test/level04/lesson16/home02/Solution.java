package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    //int a;
  //  int b;
   // int c;
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        if (a1<b1 && b1<c1)
            System.out.println(b1);
        else if (c1<b1 && b1<a1)
            System.out.println(b1);

        else if (a1<c1 && c1<b1)
            System.out.println(c1);
        else if (b1<c1 && c1<a1)
            System.out.println(c1);

        else if (c1<a1 && a1<b1)
        System.out.println(a1);
        else //   if (b<a and a<c)
        System.out.println(a1);

//a b c
    //Solution s = new Solution();
       // int n =  s.getMean(a1, b1 ,c1);

      //  System.out.println(n);

    }
/*    public int getMean(int a, int b, int c){
        this.a=a;
        this.b=c;
        this.c=c;
        int res=null;
        if (a<b || b>c){
            res=b;
        }
        else if (b<a || a>c){
            res=a;
        }
        else if (b<c || c>a){
            res=c;
        }
        return 0;
    }*/
}
