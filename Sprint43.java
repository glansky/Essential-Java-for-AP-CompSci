/**
 * Sprint 43 - Strings as Collections
 */
public class Sprint43 {
    public static void main(String[] args){
        //String s = new String();
        String s;
        s = "Doug Winnie";
        System.out.printf("String: %s\n", s);

        // Getting a String Length
        System.out.printf("String length: %d\n",s.length());

        // Getting a Specific Character from a String
        System.out.printf("The first character: %s\n", s.charAt(0));

        // Finding a Character in a String
        char character = 'i';
        System.out.printf("Index of the character '%s':\n",character);
        int index = 0;
        while (index != -1) {
            index = s.indexOf(character,index);
            if(index != -1){
                System.out.println(index);
                index++;
            }
        }

        // Getting the last instance of a character in the string
        System.out.printf("Index of the last instance of '%s': %s\n", character, s.lastIndexOf(character));

        // Extracting a Substring
        // Getting a substring from the end
        System.out.printf("%s (getting a substring from the index 1)\n",s.substring(1));
        // Getting a substring from the middle
        System.out.printf("%s (getting a substring from the indices 1-3)\n",s.substring(1,3));

        // Comparing Strings
        System.out.printf("String \"%s\" is equal to \"Doug Winnie\": %b\n",s,s.equals("Doug Winnie"));
        System.out.printf("String \"%s\" is equal to \"DOUG Winnie\": %b (ignoring case)\n",s,s.equalsIgnoreCase("DOUG Winnie"));
    }
}
