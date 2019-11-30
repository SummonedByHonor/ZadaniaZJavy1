package Zadanie1;

public class TemperatureConverter {
    public static void convertCelsiusToFahrenheit (int celsiusTemperature){
        System.out.println((celsiusTemperature * 1.8) + 32);
    }
    public static void main(String[] args) {
        convertCelsiusToFahrenheit(20);
    }
}
