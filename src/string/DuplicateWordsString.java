package string;

import java.util.HashSet;
import java.util.Set;
// Program to find duplicate words in a String
public class DuplicateWordsString {
   static String str = "Hello Hi Hello Shivani Suman Shivani Suman Hi";
    public static void main(String[] args)
    {
        System.out.println(str);
        Set<String> duplicate = findDuplicate();
        System.out.println(duplicate);

    }
    public static Set<String> findDuplicate()
    {
        Set<String> duplicate = new HashSet<>();
        Set<String> set = new HashSet<>();
   /*     byte[] array = str.getBytes();
        for(byte b : array)
        {
            System.out.println(b);
        } */
        String[] words= str.split("\\s");
        for(String s : words)
        {
            if(!set.add(s))
            {
                duplicate.add(s);
            }
        }
        return duplicate;
    }

}
