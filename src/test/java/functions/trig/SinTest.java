package functions.trig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sin tests")
public class SinTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Sin sinFunction;

    @BeforeEach
    void setUp() {
        this.sinFunction = new Sin(ACCURACY, TrigFactory.getCosMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions/trig/sin_data_test.csv")
    @DisplayName("General sin tests")
    public void generalValueTest(double numerator, double denominator, double expected) {
        double actual = sinFunction.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Negative sin infinity test")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = sinFunction.compute(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Positive sin infinity test")
    public void positiveInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = sinFunction.compute(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
    @Test
    @DisplayName("Nan sin test")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = sinFunction.compute(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }
}
