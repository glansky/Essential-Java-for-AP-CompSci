import java.util.Scanner;

public class Sprint22 {
    public static void main(String[] args){
        // I: Create a scanner, point to the system input
        Scanner sc = new Scanner(System.in);

        // II: Capture a string
        System.out.print("What's your name? ");
        String name = sc.next();
        System.out.printf("Hey there, %s!\n", name);

        // III: Capture an integer
        System.out.print("How many do you wish to buy? ");
        int qty = sc.nextInt();
        System.out.printf("Buying %d items\n", qty);

        // IV: Capture a decimal
        System.out.print("What is the price? ");
        double price = sc.nextDouble();
        System.out.printf("The item costs $%.2f.\n", price);
    }
}
