package string;

import java.util.*;

// Write a program to find first non repetative character in a String

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String string = "Shivani";
        char[] array = string.toCharArray();
        int sum = 0;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>(array.length);
        for(char c : array)
        {
            if(map.containsKey(c)) {
                sum = map.get(c) + 1;
                map.put(c, sum);
            }
            map.put(c,sum);
        }
       System.out.println(map);
   /*    Set set = map.keySet();
       for(Object o : set)
       {
          if(map.get(o)==0)
          {
              System.out.println("first non repetative char is " + o);
              break;
          }
       } */


        System.out.println(map.entrySet().stream().filter(i -> i.getValue()==0).findFirst().get().getKey());
        System.out.println(map);
    }


}
