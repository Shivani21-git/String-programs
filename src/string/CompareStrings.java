package string;

import java.util.TreeMap;

public class CompareStrings {
    public static void main(String[] args)
    {
        String s1 = "ShivaniShivani";
        String s2 = "Suman";
        // This below will give error
      // String s3 = "Suman";
        /*  System.out.println(s2==s3);
        System.out.println(s1.equals(s2)); */
         int last  = s1.lastIndexOf("vani",6 ); //3   // 6 index ke aage se count hoga matlab 6 ke bad 0 ho jayega wha se count hoga
         System.out.println("Last occurrence of a substring inside a substring is " + last);
        //Replace a substring inside a substring by another one
        String s3 = s1.replaceAll("Shivani","Kashyap");
        System.out.println(s3); //KashyapKashyap
         // To remove a particular character from a String
        System.out.println(removeCharAt("Suman",3)); //sumn
        // To reverse a String
        StringBuffer sb = new StringBuffer("Suman");
        sb.reverse();
        System.out.println(sb);
        //To search a word inside a String
        boolean b = s1.contains("a");
        System.out.println(b);
        // To split a string into number of substring
        String[] words = s1.split("i",2); // i se break hoga matlab i nhi hoga output me
        for(String i : words)
        {
            System.out.println(i); // sh  vanishivani
        }
        // To convert a String into UpperCase
         String upper = s1.toUpperCase(); //SHIVANISHIVANI
        System.out.println(upper);
        // To match regions in a String
        boolean result = s1.regionMatches(true,4,s2,3,2);
        System.out.println(result);
       // To compare performance of two strings
       Long startime=  System.currentTimeMillis();
        for(int i=0;i<5000;i++)
        {
            String first = "OldString";
            String second = "NewString";

        }
        Long endtime = System.currentTimeMillis();
        System.out.println("Performance of String literal " + (endtime-startime));
        Long startime1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++)
        {
            String first1 = new String("OldString");
            String second1 = new String("NewString");

        }
        Long endtime1 = System.currentTimeMillis();
        System.out.println("Performance of String from heap area " + (endtime1-startime1));
        // To format String
        String format = String.format("Value of String is %S", s1);
        System.out.println(format);
        // To concat two Strings
        String con = s1.concat(s2);
        System.out.println(con);
        //To get the unicode
        //codePointBefore method  returns unicode of  character before the specified index
        int unicode = s1.codePointBefore(5);
        System.out.println(unicode);



    }

    // V V I
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }


}


