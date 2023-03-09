package functions.log;

import functions.Function;

public class Log3 extends Function {
    private final static int BASIS = 3;

    private final Ln lnFunc;

    public Log3(double accuracy, Ln lnFunc) {
        super(accuracy);
        this.lnFunc = lnFunc;
    }

    @Override
    public double compute(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return lnFunc.compute(x) / lnFunc.compute(BASIS);
    }
}