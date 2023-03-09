package functions.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Log10 tests")
public class Log10Test {

    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.0001;

    private Log10 log10Function;

    @BeforeEach
    void setUp() {
        this.log10Function = new Log10(ACCURACY, LogFactory.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions/log/log10_data_test.csv")
    @DisplayName("General log10 tests")
    public void tableValuesTest(double x, double expected) {
        //LogFactory.getLnMock().compute(x)
        double actual = log10Function.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test log two negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = log10Function.compute(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test log two positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = log10Function.compute(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test log two nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = log10Function.compute(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }
}