package functions.trig;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigFactory {
    public static Sin getSinMock() {
        Sin sinFunction = mock(Sin.class);

        when(sinFunction.compute(Mockito.eq(0.0))).thenReturn(0.0);
        when(sinFunction.compute(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.7067842085771167);
        when(sinFunction.compute(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.9999995999142226);
        when(sinFunction.compute(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.7070474764175622);
        when(sinFunction.compute(Mockito.eq(1 * Math.PI))).thenReturn(0.014174995495036776);
        when(sinFunction.compute(Mockito.eq(5 * Math.PI / 4))).thenReturn(-0.7069612773674072);
        when(sinFunction.compute(Mockito.eq(3 * Math.PI / 2))).thenReturn(-0.9999999812434475);
        when(sinFunction.compute(Mockito.eq(7 * Math.PI / 4))).thenReturn(-0.7073520743080889);
        when(sinFunction.compute(Mockito.eq(2 * Math.PI))).thenReturn(0.0);

        when(sinFunction.compute(Mockito.eq(-Math.PI / 4))).thenReturn(-0.7067842085771167);
        when(sinFunction.compute(Mockito.eq(-Math.PI / 2))).thenReturn(-0.9999995999142226);
        when(sinFunction.compute(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7070474764175622);
        when(sinFunction.compute(Mockito.eq(-Math.PI))).thenReturn(0.014174995495036776);
        when(sinFunction.compute(Mockito.eq(-5 * Math.PI / 4))).thenReturn(0.7069612773674072);
        when(sinFunction.compute(Mockito.eq(-3 * Math.PI / 2))).thenReturn(0.9999999812434475);
        when(sinFunction.compute(Mockito.eq(-7 * Math.PI / 4))).thenReturn(0.7073520743080889);
        when(sinFunction.compute(Mockito.eq(-2 * Math.PI))).thenReturn(0.0);

        when(sinFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return sinFunction;
    }

    public static Cos getCosMock() {
        Cos cosFunction = mock(Cos.class);

        when(cosFunction.compute(Mockito.eq(0.0))).thenReturn(1.0);
        when(cosFunction.compute(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.707429206709773);
        when(cosFunction.compute(Mockito.eq(1 * Math.PI / 2))).thenReturn(-8.945229984747317E-4);
        when(cosFunction.compute(Mockito.eq(3 * Math.PI / 4))).thenReturn(-0.7071660809820822);
        when(cosFunction.compute(Mockito.eq(1 * Math.PI))).thenReturn(-0.9998995297042177);
        when(cosFunction.compute(Mockito.eq(5 * Math.PI / 4))).thenReturn(-0.7072522550710206);
        when(cosFunction.compute(Mockito.eq(3 * Math.PI / 2))).thenReturn(1.9368300065366424E-4);
        when(cosFunction.compute(Mockito.eq(7 * Math.PI / 4))).thenReturn(0.7068614029440594);
        when(cosFunction.compute(Mockito.eq(2 * Math.PI))).thenReturn(1.0);

        when(cosFunction.compute(Mockito.eq(-Math.PI / 4))).thenReturn(0.707429206709773);
        when(cosFunction.compute(Mockito.eq(-Math.PI / 2))).thenReturn(-8.945229984747317E-4);
        when(cosFunction.compute(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7071660809820822);
        when(cosFunction.compute(Mockito.eq(-Math.PI))).thenReturn(-0.9998995297042177);
        when(cosFunction.compute(Mockito.eq(-5 * Math.PI / 4))).thenReturn(-0.7072522550710206);
        when(cosFunction.compute(Mockito.eq(-3 * Math.PI / 2))).thenReturn(1.9368300065366424E-4);
        when(cosFunction.compute(Mockito.eq(-7 * Math.PI / 4))).thenReturn(0.7068614029440594);
        when(cosFunction.compute(Mockito.eq(-2 * Math.PI))).thenReturn(1.0);

        when(cosFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(cosFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(cosFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return cosFunction;
    }
}