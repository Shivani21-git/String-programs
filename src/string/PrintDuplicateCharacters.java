package string;

import java.util.LinkedHashSet;

public class PrintDuplicateCharacters {
    //Program to print duplicate characters from String
    public static void main(String[] args) {
        String s1 = "ShivaniKashyap";
        char[] chararray = s1.toCharArray();
        LinkedHashSet set = new LinkedHashSet();
        LinkedHashSet newset = new LinkedHashSet();
        for(int i=0;i<chararray.length;i++)
        {
            if( !set.add(chararray[i]))
            {
                newset.add(chararray[i]);

            }

        }
        System.out.println(newset);
    }

}
