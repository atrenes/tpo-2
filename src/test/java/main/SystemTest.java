package main;

import functions.System;
import functions.log.*;
import functions.trig.Cos;
import functions.trig.Sin;
import functions.trig.TrigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SystemTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.00001;

    static System system;


    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    @DisplayName("General system test")
    public void allStubsTest(double x, double expected) {
        system = new System(ACCURACY, TrigFactory.getSinMock(), TrigFactory.getCosMock(), LogFactory.getLog3Mock(), LogFactory.getLog5Mock(), LogFactory.getLog10Mock());
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void firstStubTest(double x, double expected) {
        Ln ln = new Ln(ACCURACY);
        Log10 log10 = new Log10(ACCURACY, ln);
        system = new System(ACCURACY, TrigFactory.getSinMock(), TrigFactory.getCosMock(), LogFactory.getLog3Mock(), LogFactory.getLog5Mock(), log10);
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void secondStubTest(double x, double expected) {
        Ln ln = new Ln(ACCURACY);
        Log10 log10 = new Log10(ACCURACY, ln);
        Log5 log5 = new Log5(ACCURACY, ln);
        system = new System(ACCURACY, TrigFactory.getSinMock(), TrigFactory.getCosMock(), LogFactory.getLog3Mock(), log5, log10);
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void thirdStubTest(double x, double expected) {
        Ln ln = new Ln(ACCURACY);
        Log10 log10 = new Log10(ACCURACY, ln);
        Log3 log3 = new Log3(ACCURACY, ln);
        Log5 log5 = new Log5(ACCURACY, ln);
        system = new System(ACCURACY, TrigFactory.getSinMock(), TrigFactory.getCosMock(), log3, log5, log10);
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void fourthStubTest(double x, double expected) {
        Ln ln = new Ln(ACCURACY);
        Log10 log10 = new Log10(ACCURACY, ln);
        Log3 log3 = new Log3(ACCURACY, ln);
        Log5 log5 = new Log5(ACCURACY, ln);
        Cos cos = new Cos(ACCURACY);
        system = new System(ACCURACY, TrigFactory.getSinMock(), cos, log3, log5, log10);
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void fifthStubTest(double x, double expected) {
        Ln ln = new Ln(ACCURACY);
        Log10 log10 = new Log10(ACCURACY, ln);
        Log3 log3 = new Log3(ACCURACY, ln);
        Log5 log5 = new Log5(ACCURACY, ln);
        Cos cos = new Cos(ACCURACY);
        Sin sin = new Sin(ACCURACY, TrigFactory.getCosMock());
        system = new System(ACCURACY, sin, cos, log3, log5, log10);
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void noStubTest(double x, double expected) {
        Ln ln = new Ln(ACCURACY);
        Log10 log10 = new Log10(ACCURACY, ln);
        Log3 log3 = new Log3(ACCURACY, ln);
        Log5 log5 = new Log5(ACCURACY, ln);
        Cos cos = new Cos(ACCURACY);
        Sin sin = new Sin(ACCURACY, cos);
        system = new System(ACCURACY, sin, cos, log3, log5, log10);
        double actual = system.compute(x);
        assertEquals(expected, actual, DELTA);
    }
}
