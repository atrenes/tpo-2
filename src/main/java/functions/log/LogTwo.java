package functions.log;

import functions.Function;

import java.text.DecimalFormat;

public class LogTwo extends Function {
    private final static int BASIS = 2;

    private final Ln lnFunc;
    private final DecimalFormat df = new DecimalFormat("#.#####");

    public LogTwo(double accuracy, Ln lnFunc) {
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
        return Double.parseDouble(df.format(lnFunc.compute(x) / lnFunc.compute(BASIS)).replace(",", "."));
    }
}