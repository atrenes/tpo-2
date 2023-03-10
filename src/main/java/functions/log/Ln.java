package functions.log;

import functions.Function;

import java.text.DecimalFormat;

public class Ln extends Function {
    private static final int COUNT_ITERATION = 1000000;

    public Ln(double accuracy) {
        super(accuracy);
    }

    @Override
    public double compute(double x) {
        if (Double.isNaN(x) || x <= 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }

        double currentValue = 0;
        double previousValue;
        int iteration = 1;

        if (Math.abs(x - 1) <= 1) {
            do {
                previousValue = currentValue;
                currentValue += ((Math.pow(-1, iteration - 1) * Math.pow(x - 1, iteration)) / iteration);
                iteration++;
            } while (getAccuracy() <= Math.abs(currentValue - previousValue) && iteration < COUNT_ITERATION);
        } else {
            do {
                previousValue = currentValue;
                currentValue += ((Math.pow(-1, iteration - 1) * Math.pow(x - 1, -iteration)) / iteration);
                iteration++;
            } while (getAccuracy() <= Math.abs(currentValue - previousValue) && iteration < COUNT_ITERATION);

            currentValue += compute(x - 1);
        }

        DecimalFormat df = new DecimalFormat("#.#####");

        return Double.parseDouble(df.format(currentValue).replace(",", "."));
    }
}