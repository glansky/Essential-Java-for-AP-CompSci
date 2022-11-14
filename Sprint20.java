public class Sprint20 {
    public static void main(String[] args) {
        int a = 11;
        int b = 4;
        double x = 11;
        double y = 4;

        // I: Numbers in string concatenation
        System.out.println(a / b + ", " + x / y + ", " + a / y);    //2, 2.75, 2.75

        // III: Convert using the base value type's toString() method
        //String c = "Value: " + b;                                 //Value: 4
        String c = "Value: " + Integer.toString(b);                 //Value: 4
        System.out.println(c);

        // IV: Parse (Convert) a string to a number
        double d = Double.parseDouble("2.64");
        System.out.println(d);

        // V: Casting values
        double foo = 3.00;
        int bar = (int)foo;
        System.out.println(bar);

        // VI: Casting issues
        int value1 = 2, value2 = 5;
        System.out.println((float)value2 / (float)value1);          //2.5
    }
}
