import java.util.InputMismatchException;
import java.util.Scanner;

public class Sprint34 {
    private static Scanner sc;

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        try{
            int intValue = sc.nextInt();
            System.out.printf("You entered %d.\n",intValue);
        }catch (Exception e){
            System.out.println("There was an error. Here is more info...");
            System.out.println(e.toString());
        }

        sc = new Scanner(System.in);
        System.out.print("Enter a short value (must be between -32 768 and 32 767): ");
        try{
            short shortValue = sc.nextShort();
            System.out.printf("You entered %d.\n",shortValue);
        }catch (InputMismatchException e){
            System.out.println("The value is the wrong type. May be it is too big or small?");
        }catch (Exception e){
            System.out.println("There was an error. Here is more info...");
            System.out.println(e.toString());
        }finally {
            System.out.println("Thank you for your answer (finally block)!");
        }

        System.out.println("Thank you for your answer (after try and catch blocks)!");
    }
}
