package observableInterface;

import java.util.ArrayList;

public class WeatherStation implements obserable 
{
	float temp;	  

	ArrayList<observer> Observers = new ArrayList(); 
	//constructor
	public WeatherStation() 
	{
		this.temp = 0;
	}
	
	public WeatherStation(float temp) 
	{
		this.temp = temp;
	}

	//getter and setters
	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	
	@Override
	public void registered(observer o) 
	{
		Observers.add(o);
		System.out.println("user is register");
	}

	@Override
	public void unregistered(observer o) 
	{
		Observers.remove(o);
		System.out.println("user is unregister");
	}

	@Override
	public void notifyToAll() 
	{
		for(observer obj:Observers) 
		{
				obj.update(temp); 
		}
	}
	
	void tempchanged(float newtemp) 
	{
		this.temp = newtemp;
		 notifyToAll();
	}


}
