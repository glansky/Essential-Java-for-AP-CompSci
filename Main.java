public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Date\t\tDish\tPrice\tCount\t\"Tips\"\tTotal\n");
        System.out.print("31/10/22\tVine\t$10.93\t1\t\t$1.00\t$11.93\n");
        System.out.println("==================================================");
        // Decimal Formatters
        System.out.println(2.3f);       //2.3
        System.out.printf("%.2f",2.3f); //2,30
        System.out.println();
        System.out.printf("%.3f",2.3f); //2,300
        System.out.println();
        // Thousands Formatters
        System.out.println(1000000);        //1000000
        System.out.printf("%,d",1000000);   //1�000�000
        System.out.println();
        // Currency Formatters
        System.out.println(1000.2f);            //1000.2
        System.out.printf("$%.2f",1000.2f);     //$1000,20
        System.out.println();
        System.out.printf("₽%,.2f",1000.2f);    //?1�000,20
        System.out.println();
        // Spacing and Alignment Formatters
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
        // Multiple Items in Formatters
        System.out.printf("%10s $%.2f\n","Apples",1.4f);                    //    Apples $1,40
        System.out.printf("%10s $%.2f\n","Brownies",0.8f);                  //  Brownies $0,80
    }
}