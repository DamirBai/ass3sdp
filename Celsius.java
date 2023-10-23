import javax.xml.transform.SourceLocator;

public class Celsius implements Temperature{
    private final double temperature;
    @Override
    public double getTemp() {
        return temperature;
    }
    public Celsius(double temp){
        this.temperature = temp;
    }
}
