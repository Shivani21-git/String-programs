package string;

import java.util.*;

//Program to find smallest substring in a given string containing all characters of another string
public class SubstringFromAnotherString {
    public static void main(String[] args) {
        System.out.println("Please enter thr string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        String given = "tist";
        List<HashMap<Character, Boolean>> givenList = new ArrayList<>();
        //Map<List<Character>,Boolean> givenMap = new HashMap<>();
        for (int i = 0; i < given.length(); i++) {
            HashMap map = new HashMap();
            map.put(given.charAt(i), false);
            givenList.add(map);
        }
        for (int i = 0; i <= input.length() - 1; i++) {

            char ch = input.charAt(i);
            //System.out.println(ch + " "+given.indexOf(ch));
            for (int j = 0; j < givenList.size(); j++) {
                int counter = 0;
                if (givenList.get(j).containsKey(ch)) {
                    givenList.get(j).put(ch, true);
                    /*givenList.forEach(m -> {
                        if (m.containsKey(ch)) {
                            m.put(m.get(ch), true);
                        }
                    });*/

                    for (Map m : givenList) {
                        counter++;
                        if (!m.containsValue(false) && counter == givenList.size()) {
                            System.out.println(input.substring(0, i + 1));
                        }
                    }
                }
            }
        }
        //System.out.println(sb.toString());
    }
}


