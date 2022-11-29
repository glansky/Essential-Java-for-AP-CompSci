import java.util.ArrayList;

/**
 * Sprint 48 - Beyond Arrays with ArrayLists
 */
public class Sprint48 {
    public static void main(String[] args){
        // Create an ArrayList
        ArrayList names = new ArrayList();

        // Add Items to ArrayList
        names.add("Doug");
        names.add("Mike");
        names.add("Matt");

        // Get Elements in ArrayLists
        System.out.println(names.get(0));

        String element = names.get(0).toString();
        System.out.println(element);

        System.out.println(names);

        // Remove Elements from ArrayLists
        names.remove(2);
        System.out.println(names);

        // Find Items in ArrayList
        System.out.printf("Index of \"Mike\": %d\n",names.indexOf("Mike"));
        System.out.printf("\"%s\" has been removed\n",names.remove(names.indexOf("Mike")));

        // Replace Items in ArrayLists
        names.set(0,"Sarah");
        System.out.println(names);

        // Get the Size of an ArrayList
        System.out.printf("Size of    names: %d\n",names.size());

        // Copy Elements to a New ArrayList
        ArrayList newNames = new ArrayList();
        newNames.addAll(names);
        System.out.printf("Size of newNames: %d\n",newNames.size());
    }
}
