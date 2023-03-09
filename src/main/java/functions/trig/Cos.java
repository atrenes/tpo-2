package functions.trig;

import functions.Function;

public class Cos extends Function {
    private static final int MAX_ITER = 1_000_000;

    public Cos(double accuracy) {
        super(accuracy);
    }

    private long fact(int x) {
        long y = 1;
        for (int i = 1 ; i <= x ; i++) y *= i;
        return y;
    }

    @Override
    public double compute(double x) {
        int period = (int) (x / (Math.PI * 2d));
        x -= period * Math.PI * 2;

        double result = 0d;
        double prev = 0d;
        int sign = 1;
        int i = 0;
        if (Double.isNaN(x) || Double.isInfinite(x)) {
            return Double.NaN;
        }
        while (getAccuracy() <= Math.abs((sign * Math.pow(x, 2 * i))) / Math.abs(fact(2 * i) - prev)
                && i < MAX_ITER) {
            result += (sign * Math.pow(x, 2 * i)) / fact(2 * i);
            prev = (sign * Math.pow(x, 2 * i)) / fact(2 * i);
            sign = -sign;
            i++;
        }
        return result;
    }
}
