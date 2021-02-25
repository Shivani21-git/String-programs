package string;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Shivani";
        char[] array = s1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=array.length-1;i>=0;i--)
        {
          sb.append(array[i]);

        }
        System.out.println(sb);
    }


}
