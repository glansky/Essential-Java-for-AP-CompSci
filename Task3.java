public class Task3 {
    public static void main(String[] args){
        for (int step = 1; step < 100; step++){
            double[] price1 = factor(5.86,0.98,step);
            double[] price2 = factor(1.24,2.43,step);
            for (int j = 0; j < price1.length; j++){
                for (int k = 0; k < price2.length; k++){
                    if (Math.abs(price1[j] - price2[k]) < 0.2) {
                        System.out.printf("step: %d\n",step);
                    }
                }
            }
        }
    }

    private static double[] factor(double a, double b, int step){
        double[] factor = new double[step + 1];
        for (int i = 0; i <= step; i++){
            factor[i] = Math.pow(a, step - i) * Math.pow(b, i);
        }
        return factor;
    }
}
