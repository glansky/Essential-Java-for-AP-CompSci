import java.util.ArrayList;

/**
 * Sprint 49 - Introducing Generics
 */
public class Sprint49 {
    public static void main(String[] args){
        ArrayList values = new ArrayList();
        values.add(1);
        values.add('2'); // Perfectly legal, but undesired
        values.add("3"); // Perfectly legal, but undesired
        values.add(4);
        System.out.println(values);

        int x = ((int) values.get(0)); // Cast required since Object is returned

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        //numbers.add('3'); // Generates an error

        int y = numbers.get(1); // Cast doesn't required
        System.out.println(y/2);

        int[] set = new int[]{1,2,3,4,5};
        // Convert that array to an ArrayList<Integer>
        System.out.println(convert(set));
    }

    private static ArrayList<Integer> convert(int[] set){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < set.length; i++){
            list.add(set[i]);
        }
        return list;
    }
}
