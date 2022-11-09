public class Main {

    public static void main(String[] args) {
        // Text Literals and Output (Sprint 10)
        System.out.println("Hello World!");
        System.out.print("Date\t\tDish\tPrice\tCount\t\"Tips\"\tTotal\n");
        System.out.print("31/10/22\tVine\t$10.93\t1\t\t$1.00\t$11.93\n");
        System.out.println("==================================================");
        // Decimal Formatters (Sprint 12)
        System.out.println(2.3f);       //2.3
        System.out.printf("%.2f",2.3f); //2,30
        System.out.println();
        System.out.printf("%.3f",2.3f); //2,300
        System.out.println();
        // Thousands Formatters (Sprint 12)
        System.out.println(1000000);        //1000000
        System.out.printf("%,d",1000000);   //1�000�000
        System.out.println();
        // Currency Formatters (Sprint 12)
        System.out.println(1000.2f);            //1000.2
        System.out.printf("$%.2f",1000.2f);     //$1000,20
        System.out.println();
        System.out.printf("₽%,.2f",1000.2f);    //?1�000,20
        System.out.println();
        // Spacing and Alignment Formatters (Sprint 12)
        System.out.println("Hello!");                                       //Hello!
        System.out.printf("|%20s|","Hello!");                               //|              Hello!|
        System.out.println();
        System.out.printf("|%-20s|","Hello!");                              //|Hello!              |
        System.out.println();
        System.out.printf("|%-20s|","Hello, this is a long sentence.");     //|Hello, this is a long sentence.|
        System.out.println();
        System.out.printf("|%-20.20s|","Hello, this is a long sentence.");  //|Hello, this is a lon|
        System.out.println();
        System.out.printf("|%-20.04s|","Hello, this is a long sentence.");  //|Hell                |
        System.out.println();
        // Multiple Items in Formatters (Sprint 12)
        System.out.printf("%10s $%.2f\n","Apples",1.4f);                    //    Apples $1,40
        System.out.printf("%10s $%.2f\n","Brownies",0.8f);                  //  Brownies $0,80
        // Variables (Sprint 17)
        int quantity = 5;
        double price = 2.50;
        String name = "Doug";
        char initial = 'W';
        // Doug W. bought 5 items priced at 2,500000 each
        System.out.printf("%s %s. bought %d items priced at $%.2f each\n", name, initial, quantity, price);
        // Math (Sprint 18)
        int a = 2, b = 5;
        float foo = 3.0f, bar = 10.5f, baz = 85.25f;
        // VI: Modulo
        System.out.printf("The remainder is: %d\n", b % a);                 //The remainder is: 1
        // VII: Integer division
        System.out.printf("The integer quotient is: %d\n", b / a);          //The integer quotient is: 2
        // X: Integer to Float Division
        float c = b / a;
        System.out.printf("The quotient is: %f\n", c);                      //The quotient is: 2,000000
        // XII: String concatenation
        System.out.println("Doug" + ' ' + "Winnie");                        //Doug Winnie
        // XIII: Concatenation literal
        // The product of 2 and 5 is 10.
        System.out.println("The product of " + a + " and " + b + " is " + a * b + ".");
        // Math Methods (Sprint 19)
    }
}
