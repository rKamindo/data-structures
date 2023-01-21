package algorithms;

public class BinarySearch {

    private static final double EPS = 0.00000001;

    public static double binarySearch(double lo, double hi, double target) {
        if (hi < lo) throw  new IllegalArgumentException("hi should be greater than low");

        double mid;

        do {

            // find the middle point
            mid = (hi - lo) / 2.0;

            double value = mid;

            if (value > target) {
                hi = mid;
            }
            else {
                lo = mid;
            }
        } while ((hi - lo) > EPS);
        return mid;
    }
}
