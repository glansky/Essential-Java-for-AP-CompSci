/**
 * The main class defines the entire project
 * @author Gregory L.
 * @version 1.0
 */
public class Sprint36 {
    /**
     * The main method executes automatically when the program launches
     * @param args [Not used] Holds launch arguments for the program
     */
    public static void main(String[] args){
        String a = "foo";
        int b = 5;
        double c = 1.25;
        String x = format(a,b,c);
        //String x = String.format("a: %s, b: %d, c: %.3f",a,b,c);
        System.out.println(x);
    }

    /**
     * String formatter
     * @param a String for the first parameter
     * @param b Integer for the second parameter
     * @param c Double for the third parameter
     * @return formatted String
     */
    public static String format(String a, int b, double c){
        return String.format("a: %s, b: %d, c: %.3f",a,b,c);
    }
}
