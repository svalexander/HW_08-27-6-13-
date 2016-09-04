package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem10 {
    public static void main(String[] args) {
        String randomString = "There are lots of vowels here";
        System.out.println(howManyVowels(randomString));
    }
    public static int howManyVowels( String anyGivenString){

        int vowelCount = 0;
        for( int i = 0; i < anyGivenString.length(); i++){
            if (anyGivenString.charAt(i) == 'a' || anyGivenString.charAt(i) == 'e' || anyGivenString.charAt(i) == 'i' || anyGivenString.charAt(i) == 'o' || anyGivenString.charAt(i) =='u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
