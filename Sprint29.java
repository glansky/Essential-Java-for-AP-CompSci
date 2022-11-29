import java.util.Scanner;

/**
 * Sprint 29 - Conditional Statements
 */
public class Sprint29 {
    public static void main(String[] args){
        System.out.println("Please, enter a double value:");

        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();

        // Simple Conditional Statements
        if (i > 0) System.out.println("i > 0");
        else System.out.println("i <= 0");

        // The ternary operator
        String msg = i > 0 ? "i > 0" : "i <= 0";
        System.out.println(msg);

        if (i > 0) {
            if (i > 1) System.out.println("i > 1");
            else System.out.println("i > 0 AND i <= 1");
        }
        else System.out.println("i <= 0");
        
        // Switch Statement
        System.out.println("Please, enter a char value:");
        char val = sc.next().charAt(0);
        switch (val){
            case 'a': System.out.println('a');
            break;
            case 'b': case 'B': System.out.println("B | b");
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + val);
        }
    }
}
