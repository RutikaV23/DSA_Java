package observableInterface;

public class Mobile implements observer
{
	float temp1;
	
	//constructor
	public void setTemp1(float temp1) 
	{
		this.temp1 = temp1;
	}

	public float getTemp1() {
		return temp1;
	}
	
	//methods
	@Override
	public void update(float newtemp) 
	{
		this.temp1 = newtemp;
		System.out.println("Mobile Updated Temperature: " + newtemp);	
	}	
}

