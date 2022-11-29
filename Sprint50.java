import java.util.ArrayList;

/**
 * Sprint 50 - Looping with ArrayLists
 * Sprint 51 - Using for...each Loops
 */
public class Sprint50 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int i = 0; i < numbers.size(); i++){
            System.out.printf("%d ", numbers.get(i));
        }
        System.out.println();

        for (Integer item:numbers) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        // ArrayLists Without Generics
        ArrayList values = new ArrayList();
        values.add(5);
        values.add(3.14159);
        values.add('a');
        values.add("Hello!");

        for (Object item:values) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Arrays work too
        int[] numbs = new int[]{1,2,3,4,5};
        for (int item:numbs){
            System.out.printf("%d ", item);
        }
    }
}
