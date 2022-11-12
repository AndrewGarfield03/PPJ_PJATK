public class OneLiners {

    public static boolean hasTwoRoots(double a,
                                      double b, double c) {
        return (Math.pow(b, 2) - 4*a*c) > 0 && a > 0;
    }

    public static boolean monot(double a,
                                double b, double c) {
        return (a > b && b > c) || (a < b && b < c);
    }

    public static double maxEl(double a,
                               double b, double c) {
        return (a > b && a > c) ? a : (b > a && b > c)? b : c;
    }

    public static int numPos(double a,
                             double b, double c) {
        return (a>0 && b>0 && c>0)? 3 : a>0 && b>0 ? 2 : a>0 ? 1 : b > 0 && c > 0 ? 2 : b>0 ? 1 : c > 0 ? 1 : 0;
    }
}
