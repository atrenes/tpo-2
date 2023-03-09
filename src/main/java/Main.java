import logger.CSVLogger;

public class Main {
    public static void main(String[] args) {
        /*Ln ln = new Ln(0.00001);
        Log10 log10 = new Log10(0.0001, ln);
        Log3 log3 = new Log3(0.0001, ln);
        Log5 log5 = new Log5(0.0001, ln);
        Cos cos = new Cos(0.0001);
        Sin sin = new Sin(0.0001, cos);

        System system = new System(0.0001, sin, cos, log3, log5, log10);
        for (double x = -20 ; x < 10 ; x += 2) {
            out.print(x + ", ");
            out.println(system.compute(x));
        }*/

        CSVLogger logger = new CSVLogger();

        logger.writeCSV("System", -5d, 100d, 1);
    }
}
