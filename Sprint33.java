public class Sprint33 {
    public static void main(String[] args){
        // New strings that are built using literals
        String a = "CompSci";
        String b = "CompSci";

        boolean result = (a == b);
        System.out.println(result); //  true, because the references are identical

        // New strings that are built as instances of a class
        String c = new String("CompSci");
        String d = new String("CompSci");

        result = (c == d);
        System.out.println(result); //  false, because the references are different

        result = c.equals(d);
        System.out.println(result); //  true, because the values are identical
    }
}
