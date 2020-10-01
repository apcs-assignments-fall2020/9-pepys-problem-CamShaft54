import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int count = 0;
        int x = 0;
        for (int i = 0; i < 60000; i++) {
            if (new Random().nextInt(6) == 5) x++;
            if (i % 6 == 0) {
                if (x > 0) count++;
                x = 0;
            }
        }
        return count/100d;
        //The line below contains a one line version that may or may not work. It is not recommended to use this version due to extreme inefficiencies
        //return IntStream.range(0, 60000).boxed().mapToInt(s -> (s % 6 == 0) ? ((Arrays.stream(Arrays.copyOfRange(IntStream.range(0, 60000).boxed().mapToInt(u -> (new Random().nextInt(6) == 5) ? 1 : 0).toArray(), s, s+6)).anyMatch(t -> t == 1)) ? 1 : 0) : 0).sum()/100d;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count = 0;
        int x = 0;
        for (int i = 0; i < 120000; i++) {
            if (new Random().nextInt(6) == 5) x++;
            if (i % 12 == 0) {
                if (x > 1) count++;
                x = 0;
            }
        }
        return count/100d;
        //The line below contains a one line version that may or may not work. It is not recommended to use this version due to extreme inefficiencies
        //return IntStream.range(0, 120000).boxed().mapToInt(s -> (s % 6 == 0) ? ((Arrays.stream(Arrays.copyOfRange(IntStream.range(0, 120000).boxed().mapToInt(u -> (new Random().nextInt(6) == 5) ? 1 : 0).toArray(), s, s+12)).sum() >= 2) ? 1 : 0) : 0).sum()/100d;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count = 0, x = 0;
        for (int i = 0; i < 180000; i++) {
            if (new Random().nextInt(6) == 5) x++;
            if (i % 18 == 0) {
                if (x > 2) count++;
                x = 0;
            }
        }
        return count/100d;
        //The line below contains a one line version that may or may not work. It is not recommended to use this version due to extreme inefficiencies
        //return IntStream.range(0, 180000).boxed().mapToInt(s -> (s % 6 == 0) ? ((Arrays.stream(Arrays.copyOfRange(IntStream.range(0, 180000).boxed().mapToInt(u -> (new Random().nextInt(6) == 5) ? 1 : 0).toArray(), s, s+18)).sum() >= 3) ? 1 : 0) : 0).sum()/100d;
    }


    public static void main(String[] args) {
        System.out.println("One six: " + probabilityOneSix());
        System.out.println("Two sixes: " + probabilityTwoSixes());
        System.out.println("Three sixes: " + probabilityThreeSixes());
    }
}
