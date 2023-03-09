package functions;

import functions.log.Log10;
import functions.log.Log3;
import functions.log.Log5;
import functions.trig.Cos;
import functions.trig.Sin;

public class System extends Function {
    private final Sin sin;
    private final Cos cos;
    private final Log3 log3;
    private final Log5 log5;
    private final Log10 log10;

    public System(double accuracy, Sin sin, Cos cos, Log3 log3, Log5 log5, Log10 log10) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
    }

    @Override
    public double compute(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= 0) {
            return ( (Math.pow(cos.compute(x), 2)/cos.compute(x)) - cos.compute(x)/sin.compute(x) )*sin.compute(x)
                    - ( ((1d/sin.compute(x)) / (cos.compute(x)/sin.compute(x))) + 1d/cos.compute(x) ) * (1d/cos.compute(x));
        } else {
            return Math.pow ( (( (log10.compute(x) + log3.compute(x)) * log3.compute(x) ) / ( log5.compute(x) * log10.compute(x) )), 3 )
                    * log3.compute(x) / log5.compute(x);
        }
    }
}
