package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Лох0"));
        System.out.println(getCountTheSameLastName(map, "Уася"));

    }


    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        //for(int i=0; i<10; i++){
            map.put("Лох0", "Уася");
            map.put("Лох1", "Уася");
            map.put("Лох2", "Уася1");
            map.put("Лох3", "Уася1");
            map.put("Лох4", "Уася2");
            map.put("Лох5", "Уася2");
            map.put("Лох6", "Уася3");
            map.put("Лох7", "Уася3");
            map.put("Лох8", "Уася4");
            map.put("Лох9", "Уася4");
      //  }
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count=0;
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String s=pair.getValue();
            if(s.equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count=0;
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String s=pair.getKey();
            if(s.equals(lastName))
                count++;
        }
        return count;
    }
}
