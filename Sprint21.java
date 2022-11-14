import java.util.Random;

public class Sprint21 {
    public static void main(String args[]) {

        // I: Create random number generator
        Random rand = new Random();

        // II: Generate a number from 0 to 9
        System.out.printf("Random <10: %d\n", rand.nextInt(10));

        // III: Roll a die
        int die = rand.nextInt(6) + 1;
        System.out.printf("Random die: %d\n", die);

        // IV: Generate a decimal from -5 to 5
        double max = 5;
        double min = -5;
        double decimal = rand.nextDouble() * (max - min) + min;
        System.out.printf("Random -5 < x <5: %f\n", decimal);
    }
}
