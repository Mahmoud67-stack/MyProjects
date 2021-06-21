package SoftwareDesign.LAB9.Question2;

public class Driver {

    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();
        AC ac =  new AC(weatherStation);
        Heater heater =  new Heater(weatherStation);
        Humidifier humidifier =  new Humidifier(weatherStation);
    }
}
