/**
 * Sprint 42 - Nesting Loops
 */
public class Sprint42 {
    public static void main(String[] args){
        // Building a grid
        System.out.println("Building a grid");
        System.out.println("\t0:\t1:\t2:\t3:\t4:\t5:\t6:\t7:\t8:\t9:");
        for (int i = 0; i < 10; i++){
            System.out.printf("%d:\t",i);
            for (int j = 0; j < 10; j++) System.out.printf("%d\t", i * j);
            System.out.print("\n");
        }
    }
}
