package functions;

import functions.log.Ln;
import functions.log.Log;
import functions.trig.Cos;
import functions.trig.Sin;

public class System extends Function {
    private final Sin sin;
    private final Cos cos;
    private final Log log3;
    private final Log log5;
    private final Log log10;

    public System(double accuracy, Sin sin, Cos cos, Log log3, Log log5, Log log10) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
    }

    @Override
    public double compute(double x) {
        if (x <= 0) {
            return ( (Math.pow(cos.compute(x), 2)/cos.compute(x)) - cos.compute(x)/sin.compute(x) )*sin.compute(x)
                    - ( ((1d/sin.compute(x)) / (cos.compute(x)/sin.compute(x))) + 1d/cos.compute(x) ) * (1d/cos.compute(x));
        } else {
            return Math.pow ( (( (log10.compute(x) + log3.compute(x)) * log3.compute(x) ) / ( log5.compute(x) * log10.compute(x) )), 3 )
                    * log3.compute(x) / log5.compute(x);
        }
    }
}
