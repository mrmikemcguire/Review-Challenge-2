
public class Car extends Vehicle implements Flyable
	{
	public static void main(String[] args)
		{
		Car c = new Car();
		c.carryPassengers();
		c.fly();	
		}

	@Override
	public void carryPassengers()
		{
		System.out.println("Let's take a ride!");	
		}

	@Override
	public void fly()
		{
		System.out.println("Up, up, and away!");	
		}	
	}
