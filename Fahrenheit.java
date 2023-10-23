public class Fahrenheit implements Temperature {
    private final double temperature;
    public Fahrenheit(double temp){
        this.temperature = temp;
    }

    @Override
    public double getTemp() {
        return temperature;
    }
}
