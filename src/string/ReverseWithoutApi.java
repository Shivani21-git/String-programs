package string;

public class ReverseWithoutApi {
    public static void main(String[] args) {
        String s1 = "Reverse";
        StringBuilder newy = new StringBuilder();
        char[] array = s1.toCharArray();
        for( int i=array.length-1; i>=0 ; i--)
        {
            newy.append(array[i]);


        }
    }


}
