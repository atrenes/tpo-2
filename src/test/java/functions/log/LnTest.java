package functions.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ln tests")
public class LnTest {

    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.0001;

    private Ln lnFunction;

    @BeforeEach
    void setUp() {
        this.lnFunction = new Ln(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions/log/ln_data_test.csv")
    @DisplayName("General ln tests")
    public void generalValueTest(double x, double expected) {
        double actual = lnFunction.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test ln negative infinity")
    public void negativeInfinityTest() {
        double expected = Double.NaN;
        double actual = lnFunction.compute(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test ln positive infinity")
    public void positiveInfinityTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = lnFunction.compute(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test ln nan")
    public void nanTest() {
        double expected = Double.NaN;
        double actual = lnFunction.compute(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }
}