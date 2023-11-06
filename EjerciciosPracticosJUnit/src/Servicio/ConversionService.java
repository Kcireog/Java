package Servicio;

public class ConversionService {

    public double celciusF(double temp) {
        return (temp * 1.8) + 32;
    }

    public double celciusK(double temp) {
        return temp + 273.15;
    }

    public double faKelvin(double temp) {
        return (5 / 9) * (temp - 32) + 273.15;
    }

    public double kelvinF(double temp) {
        return 1.8 * (temp - 273.15) + 32;
    }

    public double faCelcius(double temp) {
        return (temp - 32) / 1.8;
    }

    public double kCelcius(double temp) {
        return temp - 273.15;
    }

}
