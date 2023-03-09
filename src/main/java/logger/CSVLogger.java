package logger;
import au.com.bytecode.opencsv.CSVWriter;
import functions.System;
import functions.log.Ln;
import functions.log.Log10;
import functions.log.Log3;
import functions.log.Log5;
import functions.trig.Cos;
import functions.trig.Sin;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVLogger {
    private static final double ACCURACY = 0.001;
    private final Sin sin;
    private final Cos cos;
    private final Ln ln;
    private final Log3 log3;
    private final Log5 log5;
    private final Log10 log10;

    private final System system;

    public CSVLogger() {
        this.cos = new Cos(ACCURACY);
        this.sin = new Sin(ACCURACY, cos);
        this.ln = new Ln(ACCURACY);
        this.log3 = new Log3(ACCURACY, ln);
        this.log5 = new Log5(ACCURACY, ln);
        this.log10 = new Log10(ACCURACY, ln);
        this.system = new System(ACCURACY, sin, cos, log3, log5, log10);
    }

    public void writeCSV(String funcName, double start, double end, double step) {
        List<String[]> data = new ArrayList<>();
        switch (funcName) {
            case "Sin" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(sin.compute(i))});
                }
                write(data, "sin_res.csv");
            }
            case "Cos" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(cos.compute(i))});
                }
                write(data, "cos_res.csv");
            }
            case "Ln" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(ln.compute(i))});
                }
                write(data, "ln_res.csv");
            }
            case "Log3" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(log3.compute(i))});
                }
                write(data, "log_two_res.csv");
            }
            case "Log5" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(log5.compute(i))});
                }
                write(data, "log_two_res.csv");
            }
            case "Log10" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(log10.compute(i))});
                }
                write(data, "log_two_res.csv");
            }
            case "System" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(system.compute(i))});
                }
                write(data, "my_func_res.csv");
            }
        }
    }

    private void write(List<String[]> data, String path) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(path));
            data.forEach(writer::writeNext);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
