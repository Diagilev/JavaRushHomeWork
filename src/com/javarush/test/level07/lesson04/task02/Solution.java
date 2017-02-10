package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] arr = new String [10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<8; i++){
            arr[i] = sc.next();
        }
        for(int i=arr.length-1; i>=0; i--) System.out.println(arr[i]);
}
}