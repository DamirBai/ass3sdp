public class TemperatureAdapter {
    public Fahrenheit convertCelsiusToFahrenheit(Celsius celsius){
        return new Fahrenheit((celsius.getTemp() * 9/5) + 32);
    }
    public Kelvin convertCelsiusToKelvin(Celsius celsius){
        return new Kelvin(celsius.getTemp() + 273.15);
    }
    public Celsius convertFahrenheitToCelsius(Fahrenheit fahrenheit){
        return new Celsius((fahrenheit.getTemp() - 32) * 5/9);
    }
    public Celsius convertKelvinToCelsius(Kelvin kelvin){
        return new Celsius(kelvin.getTemp() - 273.15);
    }
    public Fahrenheit convertKelvinToFahrenheit(Kelvin kelvin){
        return new Fahrenheit((kelvin.getTemp() - 273.15) * 9/5 + 32);
    }
    public Kelvin convertFahrenheitToKelvin(Fahrenheit fahrenheit){
        return new Kelvin((fahrenheit.getTemp() + 459.67) * 5/9);
    }
}
