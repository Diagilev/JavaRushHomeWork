package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] arr = new int[20];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (i<=9)
                arr2[i]=arr[i];
            else
            for (int j = 0; j < arr2.length; j++){
                arr3[j] = arr[i];
                i++;
            }

        }
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }

}