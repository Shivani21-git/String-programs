package string;
// Program to check if two Strings are rotations of each other
public class CheckRotation {
    public static void main(String[] args) {
        String s1 = "XYZ";
        String s2 = "ZYX";
        StringBuffer sb = new StringBuffer(s1);
      //  StringBuilder sbx= new StringBuilder(s1);
        StringBuffer sb2 = new StringBuffer(s2);
        //String doesn't have reverse method, StirngBuffer or StringBuilder has
        // String class equals method is overridden , not StringBuffer and StringBuilder class.
        StringBuffer news1 = sb.reverse();
        System.out.println(news1);
        boolean result = news1.toString().equals(sb2.toString());
        String z1 = "Hi";
        String z2 = "Hi";
        boolean res = z1.equals(z2);
        System.out.println(res);
        System.out.println(result);


    }
}

