import java.util.Arrays;
import java.util.Random;

public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            boolean x = false;
            for (int j = 0; j < 6; j++) {
                if (1+rand.nextInt(6) == 6)
                    x = true;
            }
            if (x) {
                count++;
            }
        }
        return count/100d;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            int x = 0;
            for (int j = 0; j < 12; j++) {
                if (1+rand.nextInt(6) == 6)
                    x++;
            }
            if (x >= 2) {
                count++;
            }
        }
        return count/100d;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            int x = 0;
            for (int j = 0; j < 18; j++) {
                if (1+rand.nextInt(6) == 6)
                    x++;
            }
            if (x >= 3) {
                count++;
            }
        }
        return count/100d;
    }


    public static void main(String[] args) {
        System.out.println("One six: " + probabilityOneSix());
        System.out.println("Two sixes: " + probabilityTwoSixes());
        System.out.println("Three sixes: " + probabilityThreeSixes());
    }
}
