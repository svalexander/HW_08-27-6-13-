package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem8 {

    public static void main(String[] args) {

        System.out.println(makeTriangle(4));
    }

    public static String makeTriangle(int size) {
        String triangle = "";
        for (int y = size; y > 0; y--) {
            triangle += "#";
            for (int x = y; x < size; x++) {
                triangle += "#";
            }
            triangle += "\n";
        }
        return triangle;
    }
}