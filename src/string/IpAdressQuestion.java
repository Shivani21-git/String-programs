package string;

import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class IpAdressQuestion {
    public static void main(String[] args)
    {
        String IP = "201.196.162.321";
      String[] array =  IP.split("\\.");
      System.out.println(array.length);
        HashMap<Integer, String> map =  new HashMap<>();
      for(int i=0; i<array.length;i++)
      {
          //numarray[i]= Integer.parseInt(array[i]);
          char[] numberArray = array[i].toCharArray();
          int sum = 0;
          int first = Integer.parseInt(Character.toString(numberArray[0]));
          int second = Integer.parseInt(Character.toString(numberArray[1]));
          int third = Integer.parseInt(Character.toString(numberArray[2]));
          if (first < second) {
              sum = first +second;
          }
          if(second < third) {
              sum = sum == 0 ? second+third: sum+third;
          }
          map.put(sum,array[i]);
      }
      StringBuilder builder = new StringBuilder();
        map.entrySet().forEach(i -> {System.out.println("Key : "+i.getKey() + " Value : "+ i.getValue());
        builder.append(i.getValue()+".");
        });
       System.out.println(builder.toString().substring(0,builder.length()-1));


    }
}
