package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem11 {
    public static void main(String[] args) {
        String myString = "this is a boring sentence";
        System.out.println(cutString(myString, 'b'));
    }
    public static String cutString(String anyString, char anyChar){
        int i = anyString.indexOf(anyChar);
        String newString = anyString.substring(i);
        return newString;
    }
}
