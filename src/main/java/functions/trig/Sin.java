package functions.trig;

import functions.Function;

public class Sin extends Function {
    private final Cos cos;

    public Sin(double accuracy, Cos cos) {
        super(accuracy);
        this.cos = cos;
    }

    @Override
    public double compute(double x) {
        int period  = (int) (x / Math.PI * 2d);
        x -= period * Math.PI * 2;

        int sign;

        sign = (x > Math.PI && x < Math.PI * 2) || (x < 0.0 && x > -Math.PI) ? -1 : 1;

        return sign * Math.sqrt(1 - Math.pow(cos.compute(x), 2));
    }
}
