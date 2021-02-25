package string;

import java.util.*;

public class RemoveCommonCharfromStrings {
    public static void main(String[] args) {
        String firststring = "abcfgh";
        String secondstring = "gh";
        String common = "";
        for (int i = 0; i < firststring.length(); i++) {
            for (int j = 0; j < secondstring.length(); j++) {
                if (firststring.charAt(i) == secondstring.charAt(j)) {
                    common += firststring.charAt(i);
                }
            }
        }

        for (int k = 0; k < common.length(); k++) {
            String charToRemove = common.charAt(k) + "";
            firststring = firststring.replace(charToRemove, "");
            secondstring = secondstring.replace(charToRemove, "");
        }
        System.out.println(firststring);
        System.out.println(secondstring);
    }

}
