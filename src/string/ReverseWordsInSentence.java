package string;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String string = "Hello Everyone my name is Shivani";
        String[] words = string.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--)
        {
            sb.append(words[i]+" ");


        }
        System.out.println(sb.toString());
    }
}
