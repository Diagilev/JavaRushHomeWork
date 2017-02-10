package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
     HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Петров0", "Уася");
        map.put("Петров1", "Уася");
        map.put("Петров2", "Петя");
        map.put("Петров3", "Петя");
        map.put("Петров4", "Андрон");
        map.put("Петров5", "Андрон");
        map.put("Петров6", "Димон");
        map.put("Петров7", "й");
        map.put("Петров8", "ц");
        map.put("Петров9", "у");
        map.put("Петров10", "к");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Set<String> values = new HashSet<>();
        Set<String> dubValues = new HashSet<>();
        String value;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            value = pair.getValue();
            if (values.contains(value))
                dubValues.add(value);
            else
            {
                values.add(value);
            }
        }
        for (String name: dubValues){
            removeItemFromMapByValue(map, name);
        }
        System.out.println(map);
    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
