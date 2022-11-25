/**
 * Sprint 40 - Simplified Assignment Operators
 */
public class Sprint40 {
    private static int a;
    public static void main(String[] args){
        // Combined Assignment
        a = 12;
        System.out.printf("a = %d\n",a);
        System.out.printf("a += 3: %d\n",a += 3);
        a = 12;
        System.out.printf("a -= 3: %d\n",a -= 3);
        a = 12;
        System.out.printf("a /= 3: %d\n",a /= 3);
        a = 12;
        System.out.printf("a *= 2: %d\n",a *= 2);
        a = 12;
        System.out.printf("a %%= 7: %d\n",a %= 7);

        // Increment and Decrement
        a = 12;
        System.out.printf("a += 1: %d\n",a += 1);
        a = 12;
        System.out.printf("a++: %d (post increment)\n",a++);
        a = 12;
        System.out.printf("++a: %d (pre increment)\n",++a);
    }
}
