package functions.log;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogFactory {

    public static Ln getLnMock() {
        Ln lnFunction = mock(Ln.class);

        when(lnFunction.compute(Mockito.eq(2d))).thenReturn(0.69314718056);
        when(lnFunction.compute(Mockito.eq(3d))).thenReturn(1.09861228867);
        when(lnFunction.compute(Mockito.eq(4d))).thenReturn(1.38629436112);
        when(lnFunction.compute(Mockito.eq(5d))).thenReturn(1.60943791243);
        when(lnFunction.compute(Mockito.eq(6d))).thenReturn(1.79175946923);
        when(lnFunction.compute(Mockito.eq(7d))).thenReturn(1.94591014906);
        when(lnFunction.compute(Mockito.eq(8d))).thenReturn(2.07944154168);
        when(lnFunction.compute(Mockito.eq(9d))).thenReturn(2.19722457734);

        when(lnFunction.compute(Mockito.eq(-10.0))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-100.0))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-1000.0))).thenReturn(Double.NaN);

        when(lnFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(lnFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(lnFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return lnFunction;
    }

    public static Log3 getLog3Mock() {
        Log3 log3Function = mock(Log3.class);

        when(log3Function.compute(Mockito.eq(2d))).thenReturn(0.63092975357);
        when(log3Function.compute(Mockito.eq(3d))).thenReturn(1.00000000000);
        when(log3Function.compute(Mockito.eq(4d))).thenReturn(1.26185950714);
        when(log3Function.compute(Mockito.eq(5d))).thenReturn(1.46497352072);
        when(log3Function.compute(Mockito.eq(6d))).thenReturn(1.63092975357);
        when(log3Function.compute(Mockito.eq(7d))).thenReturn(1.77124374916);
        when(log3Function.compute(Mockito.eq(8d))).thenReturn(1.89278926071);
        when(log3Function.compute(Mockito.eq(9d))).thenReturn(2.00000000000);

        when(log3Function.compute(Mockito.eq(-10.0))).thenReturn(Double.NaN);
        when(log3Function.compute(Mockito.eq(-100.0))).thenReturn(Double.NaN);
        when(log3Function.compute(Mockito.eq(-1000.0))).thenReturn(Double.NaN);

        when(log3Function.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(log3Function.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(log3Function.compute(Double.NaN)).thenReturn(Double.NaN);

        return log3Function;
    }

    public static Log5 getLog5Mock() {
        Log5 log5Function = mock(Log5.class);

        when(log5Function.compute(Mockito.eq(2d))).thenReturn(0.43067655807);
        when(log5Function.compute(Mockito.eq(3d))).thenReturn(0.68260619448);
        when(log5Function.compute(Mockito.eq(4d))).thenReturn(0.86135311614);
        when(log5Function.compute(Mockito.eq(5d))).thenReturn(1.00000000000);
        when(log5Function.compute(Mockito.eq(6d))).thenReturn(1.11328275256);
        when(log5Function.compute(Mockito.eq(7d))).thenReturn(1.20906195512);
        when(log5Function.compute(Mockito.eq(8d))).thenReturn(1.29202967422);
        when(log5Function.compute(Mockito.eq(9d))).thenReturn(1.36521238897);

        when(log5Function.compute(Mockito.eq(-10.0))).thenReturn(Double.NaN);
        when(log5Function.compute(Mockito.eq(-100.0))).thenReturn(Double.NaN);
        when(log5Function.compute(Mockito.eq(-1000.0))).thenReturn(Double.NaN);

        when(log5Function.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(log5Function.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(log5Function.compute(Double.NaN)).thenReturn(Double.NaN);

        return log5Function;
    }

    public static Log10 getLog10Mock() {
        Log10 log10Function = mock(Log10.class);

        when(log10Function.compute(Mockito.eq(2d))).thenReturn(0.30102999566);
        when(log10Function.compute(Mockito.eq(3d))).thenReturn(0.47712125472);
        when(log10Function.compute(Mockito.eq(4d))).thenReturn(0.60205999132);
        when(log10Function.compute(Mockito.eq(5d))).thenReturn(0.69897000433);
        when(log10Function.compute(Mockito.eq(6d))).thenReturn(0.77815125038);
        when(log10Function.compute(Mockito.eq(7d))).thenReturn(0.84509804001);
        when(log10Function.compute(Mockito.eq(8d))).thenReturn(0.90308998699);
        when(log10Function.compute(Mockito.eq(9d))).thenReturn(0.95424250943);

        when(log10Function.compute(Mockito.eq(-10.0))).thenReturn(Double.NaN);
        when(log10Function.compute(Mockito.eq(-100.0))).thenReturn(Double.NaN);
        when(log10Function.compute(Mockito.eq(-1000.0))).thenReturn(Double.NaN);

        when(log10Function.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(log10Function.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(log10Function.compute(Double.NaN)).thenReturn(Double.NaN);

        return log10Function;
    }
}