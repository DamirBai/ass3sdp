public class Kelvin implements Temperature{
    private final double temperature;
    public Kelvin(double temp){
        this.temperature = temp;
    }
    @Override
    public double getTemp() {
        return temperature;
    }
}
