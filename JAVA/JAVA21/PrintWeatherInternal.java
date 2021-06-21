import java.util.Random;

class Weather {

	public Weather() {
		super();
	}

	public synchronized int getTemp() {
		return new Random().nextInt(50);
	}

	public synchronized int windSpeed() {
		return new Random().nextInt(60);
	}

	public synchronized int humidity() {
		return new Random().nextInt(100);
	}

 public synchronized void printWeatherData(String city) {
		System.out.println("City = " + city);
		int temp = getTemp();
		deviceDelay(10);
		System.out.println("Temp = " + temp);
		int speed = windSpeed();
		deviceDelay(10);
		System.out.println("Wind speed =" + speed);
		int humid = humidity();
		deviceDelay(10);
		System.out.println("Humidity = " + humid);

	}

	public synchronized void deviceDelay(int msecs)// delay is in milli seconds
	{
		try {
			Thread.sleep(msecs);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

	}
}

class DisplayWeather implements Runnable {
	Weather weather;
	String city;

	public DisplayWeather(String city, Weather weather) {
		super();
		this.city = city;
		this.weather = weather;
	}

	@Override
	public void run() 
	{
		/*synchronized(weather)*/
		{
			weather.printWeatherData(city);
		}
	}

}

 public class PrintWeatherInternal {
	public static void main(String args[]) {
		Weather wd = new Weather();
		DisplayWeather sharjah = new DisplayWeather("Sharjah", wd);
		DisplayWeather dubai = new DisplayWeather("Dubai", wd);
		Thread t1 = new Thread(sharjah);
		Thread t2 = new Thread(dubai);
		t1.start();
		t2.start();
	}

}
