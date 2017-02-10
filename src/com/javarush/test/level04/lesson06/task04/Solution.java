package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        int length1 = name1.length();
        int length2 = name2.length();

if (name1.equals(name2)){
    System.out.println("Имена идентичны");
}
        else if (length1 == length2){
    System.out.println("Длины имен равны");
    }
    }
}
