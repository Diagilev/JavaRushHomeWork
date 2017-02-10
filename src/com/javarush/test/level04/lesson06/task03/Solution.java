package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      int num[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int n=0; n<num.length; n++){
            num[n]= sc.nextInt();
            }
        for (int i=0; i<num.length; i++){
            int max = num[i];
            int max_i = i;
            for (int j=i+1; j<num.length; j++ ){
                if (num[j] > max){
                    max = num[j];
                    max_i = j;
                }
            }
            if (i!= max_i){
                int tmp = num [i];
                num [i] = num[max_i];
                num[max_i]= tmp;
            }
        }
        for (int i=0; i<3; i++){
        System.out.print(num[i]+" ");
    }
}
}
