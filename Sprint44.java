/**
 * Sprint 44 - Make Collections Using Arrays
 */
public class Sprint44 {
    public static void main(String[] args){

        // Creating an array from values
        int[] a = new int[] {1,2,3,4,5};
        System.out.println("Creating an array from values:");

        // Getting the Number of Values in an Array
        System.out.printf("The length of \"a\" array: %d\n",a.length);

        // Looping Through an Array
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d\n",i,a[i]);
        }

        // Getting a Value from an Array
        //System.out.println(a[0]);

        // Creating an Array by Size
        int[] b = new int[5];
        System.out.println("Creating an array by size:");
        System.out.printf("The length of \"b\" array: %d\n",b.length);
        b[0] = 5; // Assigning values to an array
        System.out.printf("b[1] = %d as it was not assigned\n",b[1]);
    }
}
