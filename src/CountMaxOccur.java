import com.sun.deploy.util.StringUtils;

public class CountMaxOccur {
    // Program to count the maximum number of a character in the string
  static String s1 = " Hello Everyone, my name is Shivanie";
    public static void main(String[] args)
    {
        int count = usingForLoop();
        System.out.println(count);
        int count1 = usingForEachLoop();
        System.out.println(count1);
        //3rd way using Spring framework StringUtils class for finding occurrence of another String
     //   int count2 = StringUtils.countOccurrencesOf(s1, "a");



    }
    // 1st way using for loop
    public static int usingForLoop()
    {
        int charcount = 0;
        for(int i=0;i<s1.length();i++) {

            if (s1.charAt(i) == 'e') {
                charcount++;

            }
        }
        return charcount;

    }
    //2nd way using forEach loop
    public static int usingForEachLoop()
    {
        int charcount1 = 0;
        //ForEach loop is not applicable for String. Therefore, converting it into CharArray.
        for(char i : s1.toCharArray())
        {
            if(i == 's')
            {
                charcount1++;

            }

        }
        return charcount1;
    }
}
