package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem6 {
    public static void main(String[] args) {
        String userFood = "not dog";
        System.out.println(letterH(userFood));
    }

    public static String letterH(String food){
        String lowerCaseFood = food.toLowerCase();
        int firstLetterFood = lowerCaseFood.charAt(0);
        if (firstLetterFood == 'h'){
            return "Yum!";
        } else {
            return "Yuck!";
        }
    }
}
