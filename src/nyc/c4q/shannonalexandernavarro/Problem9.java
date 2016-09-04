package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem9 {
    public static void main(String[] args) {
        String longString = "codexxcope";
        System.out.println(howManyTimes(longString));
    }

    public static int howManyTimes(String givenString) {
        int countCode = 0;
        int i = givenString.indexOf('c');
        for (int j = 0; j < givenString.length(); j++){
            if(givenString.charAt(j) =='c' && givenString.charAt(j+1) =='o' && givenString.charAt(j+3) == 'e'){
                countCode++;
            }
        }
        return countCode;
    }
}
