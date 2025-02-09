package Methods;

//Author: Sharwan jung kunwar
//Purpose: To calculate temperature Celsius to Fahrenheit using method.

public class TemperatureConverter {
    public static void main(String[] args) {
        double result = celsiusToFahrenheit(25);
        System.out.println("25°C in Fahrenheit: " + result);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
