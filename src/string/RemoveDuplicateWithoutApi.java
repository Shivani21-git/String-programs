package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDuplicateWithoutApi {
    static String s = "vickyisvickybutnotnishant";

    public static void main(String[] args) {
        char[] stringarray = s.toCharArray();
        StringBuffer newarray = new StringBuffer();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        //Arrays.sort(stringarray);
        System.out.println("sorted "+(new StringBuffer()).append(stringarray));

        //usingStringBuffer(stringarray, newarray);
        for (int i = 0; i < stringarray.length; i++) {
            if(map.containsKey(stringarray[i])){
                map.put(stringarray[i],map.get(stringarray[i])+1);
            }else{
                map.put(stringarray[i],1);
            }
        }
        StringBuffer s = new StringBuffer();
        s.append(map.keySet());
        System.out.println(s);
    }

    private static void usingStringBuffer(char[] stringarray, StringBuffer newarray) {
        char previous = stringarray[0];
        newarray.append(previous);
        for (int i = 1; i < stringarray.length; i++) {
            if (previous != stringarray[i]) {
                newarray.append(stringarray[i]);
            }
            previous = newarray.charAt(newarray.length()-1);
        }
        System.out.println(newarray);
    }

}
