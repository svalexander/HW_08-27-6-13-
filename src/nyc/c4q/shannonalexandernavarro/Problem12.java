package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem12 {
    public static void main(String[] args) {

        String[] day = {
                "first",
                "second",
                "third",
                "fourth",
                "fifth",
                "sixth",
                "seventh",
                "eighth",
                "ninth",
                "tenth",
                "eleventh",
                "twelve"
        };

        String[] gift = {
                " a Partridge in a pear tree.",
                " two turtles Dove and",
                " three French Hens,",
                " four Calling Birds,",
                " five Gold Rings,",
                " six Geese a-Laying,",
                " seven Swans a-Swimming,",
                " eight Maids a-Milking,",
                " nine Ladies Dancing,",
                " ten Lords a-Leaping,",
                " eleven Pipers Piping,",
                " twelve Drummers Drumming,"
        };

        for (int i = 0; i < 12; i++){
            System.out.println("On the " + day[i] + " day of Christmas my true love gave to me ");
            for (int j = i; j >=0; j--){
                System.out.println(gift[j]);
            }
        }
    }
}
