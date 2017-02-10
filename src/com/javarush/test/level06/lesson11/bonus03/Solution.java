package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [5];
        for (int i=0; i<arr.length; i++)
        arr[i] = Integer.parseInt(reader.readLine());
        for (int i=0; i<arr.length; i++){
            int min = arr[i];
            int min_el = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_el=j;
                }
            }
            if (i != min_el)
            {
                int tmp = arr[i];
                arr[i] = arr[min_el];
                arr[min_el] = tmp;
            }
        }
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }

}
