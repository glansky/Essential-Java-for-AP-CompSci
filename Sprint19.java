public class Sprint19 {
    public static void main(String[] args) {
        // I: Number methods
        double a = Math.floor(1.99);
        double b = Math.ceil(1.01);
        double c = Math.round(1.49);
        //Rounding >> floor 1,000000 >> ceil 2,000000 >> round 1,000000
        System.out.printf("Rounding >> floor %f >> ceil %f >> round %f \n", a, b, c);

        // II: Algebraic methods
        double d = Math.pow(2,8);
        double e = Math.sqrt(256);
        double f = Math.cbrt(27);
        double g = Math.PI;
        double h = Math.E;
        double i = Math.log(50);
        double j = Math.log10(50);
        double k = Math.abs(-1);
        //256,000000, 16,000000, 3,000000, 3,141593, 2,718282, 3,912023, 1,698970, 1,000000
        System.out.printf("%f, %f, %f, %f, %f, %f, %f, %f\n", d, e, f, g, h, i, j, k);

        // III: Trigonometric methods
        double l = Math.sin(2);
        double m = Math.cos(2);
        double n = Math.tan(2);
        double o = Math.asin(1);
        double p = Math.acos(1);
        double q = Math.atan(2);
        double r = Math.toRadians(90.0);
        double s = Math.toDegrees(Math.PI * 2);
        double t = Math.cos(Math.toRadians(Math.PI * 2));
        //0,909297, -0,416147, -2,185040, 1,570796, 0,000000, 1,107149, 1,570796, 360,000000, 0,993993
        System.out.printf("%f, %f, %f, %f, %f, %f, %f, %f, %f\n", l, m, n, o, p, q, r, s, t);

        // IV: Comparison methods
        double max = Math.max(1,2);
        double min = Math.min(1,2);
        /* 2,000000, 1,000000 */
        System.out.printf("%f, %f",max,min);
    }
}
