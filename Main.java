public class Main {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(38);
        TemperatureAdapter adapter = new TemperatureAdapter();
        Fahrenheit fahrenheit = adapter.convertCelsiusToFahrenheit(celsius);
        System.out.println(fahrenheit.getTemp() + " degrees Fahrenheit");
        System.out.println("There could be another convertations");
    }
}