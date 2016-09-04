package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem7 {
    public static void main(String[] args) {
        String aStatement = " I am a very long statement";
        System.out.println(shorterString(aStatement));
    }
    public static String shorterString(String anyString){
        //1st compare length of string to 7, if it is 7 or less return the original string. else return the new string
        int lengthOfStatement = anyString.length();
        int lastLetterOfStatement = anyString.length()-1;
        if (lengthOfStatement > 7) {
            return anyString.substring(0,2) + "..." + anyString.charAt(lastLetterOfStatement);
        } else {
            return anyString;
        }
    }
}
