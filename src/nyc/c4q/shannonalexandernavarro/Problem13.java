package nyc.c4q.shannonalexandernavarro;
import java.util.Scanner;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Problem13 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hi! What's your name? \n>");
            String name = scanner.next();
            System.out.print("Ok " + name + ", what flavor of ice-cream would you like today? \n>");
            String flavor = scanner.next();
            System.out.print("Would you like hot fudge? Type yes or no \n>");
            String fudge = scanner.next();
            System.out.print("Would you like sprinkles? Type yes or no \n>");
            String sprinkles = scanner.next();
            System.out.print("Would you like butterscotch? Type yes or no \n>");
            String bScotch = scanner.next();
            int cost = 233;
            int toppingCost = 33;
            int numTopping = 0;
            if(fudge.equals("yes") && sprinkles.equals("yes") && bScotch.equals("yes")){
                numTopping = 3;
            } else if (fudge.equals("yes") && sprinkles.equals("yes")){
                numTopping = 2;
            } else if(fudge.equals("yes") && bScotch.equals("yes")){
                numTopping = 2;
            } else if (sprinkles.equals("yes") && bScotch.equals("yes")){
                numTopping= 2;
            }else if (fudge.equals("yes") || sprinkles.equals("yes") || bScotch.equals("yes")){
                numTopping = 1;
            }

            if (fudge.equals("yes") && sprinkles.equals("yes") && bScotch.equals("yes")){
                cost = cost + (toppingCost * 3);
            } else if (sprinkles.equals("yes") && bScotch.equals("yes")){
                cost = cost + (toppingCost * 2);
            } else if(fudge.equals("yes")&& bScotch.equals("yes")){
                cost = cost + (toppingCost * 2);
            } else if(fudge.equals("yes") && sprinkles.equals("yes")){
                cost = cost + (toppingCost * 2);
            } else if(sprinkles.equals("yes") || bScotch.equals("yes") || fudge.equals("yes")){
                cost = cost + toppingCost;
            }

            int time = (int) (Math.random()*60);
            System.out.println("Thanks for your order " + name + ". Your " + flavor + " ice cream with " + numTopping + " toppings is $" + cost/100d + " and will arrive in " + time + " minutes.");
        }
    }


