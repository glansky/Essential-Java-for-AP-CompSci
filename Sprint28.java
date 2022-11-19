public class Sprint28 {
    public static void main(String[] args){
        int a = 5;
        boolean result;

        result = true || false;
        display(result);

        result = (a < 5) || (a / 2 < 5);
        display(result);

        result = (a < 5) && (a / 2 < 5);
        display(result);
    }

    private static void display(boolean result){
        System.out.println("The value is " + result);
    }
}
