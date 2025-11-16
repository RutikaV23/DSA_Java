package observableInterface;

public class Main {

	public static void main(String[] args) 
	{
		WeatherStation w1 = new WeatherStation();
		
		Moblie m1 = new Moblie();
		Moblie m2 = new Moblie();
		
		w1.registered(m1);
		w1.registered(m2);
		
		w1.tempchanged(2.5f); 
		
		w1.tempchanged(30.0f);
		
		w1.unregistered(m1);
		w1.tempchanged(27.0f);
	}

}
