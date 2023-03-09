package functions.log;

import functions.Function;

import java.text.DecimalFormat;

public class Log extends Function {


    private final int basis;

    private final Ln lnFunc;

    private final DecimalFormat df = new DecimalFormat("#.#####");

    public Log(double accuracy, Ln lnFunc, int basis) {

        super(accuracy);
        this.basis = basis;
        this.lnFunc = lnFunc;
    }

    @Override
    public double compute(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return Double.parseDouble(df.format(lnFunc.compute(x) / lnFunc.compute(basis)).replace(",", "."));
    }
}