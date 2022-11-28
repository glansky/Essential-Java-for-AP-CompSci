/**
 * Sprint 45 - Creating Arrays from Strings
 */
public class Sprint45 {
    public static void main(String[] args){
        String s = "Doug,Mike,Janet,Matt,Tim,Doris";
        System.out.printf("String: \"%s\"\n",s);
        String[] names = s.split(",");
        for (String name : names) System.out.println(name);

        String n = "1,3,5,7,9";
        System.out.printf("String: \"%s\"\n",n);
        String[] list = n.split(",");
        int[] numbers = new int[list.length];
        for (int i = 0; i < list.length; i++){
            numbers[i] = Integer.parseInt(list[i]);
        }
        for (int i : numbers) System.out.println(i);
    }
}
