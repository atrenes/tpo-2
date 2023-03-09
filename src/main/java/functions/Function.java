package functions;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public abstract class Function {
    private final double accuracy;

    public Function(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getAccuracy() {return this.accuracy;}

    public abstract double compute(double x);

    public double writeToCSV(double x, Writer out) {
        double res = this.compute(x);
        try (CSVPrinter printer = CSVFormat.DEFAULT.print(out)) {
            printer.printRecord(x, res);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
