package functions;

public abstract class Function {
    private final double accuracy;

    public Function(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getAccuracy() {return this.accuracy;}

    public abstract double compute(double x);
}
