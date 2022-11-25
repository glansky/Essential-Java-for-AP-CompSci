/**
 * Sprint 41 - The for Loop
 */
public class Sprint41 {
    public static void main(String[] args){
        int timesTrue = 0;
        int timesFalse = 0;
        int timesRun = 1000000;

        for (int i = 0; i <= timesRun; i++){
            int result = (int)Math.round(Math.random());
            if(result == 0) timesTrue++;
            else timesFalse++;
        }
        float perTrue = (float) timesTrue / (float) timesRun * 100;
        float perFalse = (float) timesFalse / (float) timesRun * 100;
        System.out.printf("Out of %d tests \n",timesRun);
        System.out.printf("Times true : %d, or %.2f %%\n",timesTrue,perTrue);
        System.out.printf("Times false: %d, or %.2f %%\n",timesFalse,perFalse);
    }
}
