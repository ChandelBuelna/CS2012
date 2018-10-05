
public class Car {
	
	String Maker;
	String Model;
	int Year;
	long VIN;
	String Color;
	double Price;
	char Transmission;
	
	// Default Constructor
	public Car()
	{
		Maker = "Not Assigned";
		Model = "Not Assigned";
		Year = 0000;
		VIN = 000000000;
		Color = "Not Assigned";
		Transmission = 'X';
		Price = 0.0;
	}
	// Constructor with parameters
	public Car (String newMaker, String newModel, int newYear, long newVIN,
				String newColor, double newPrice, char newTransmission)
	{
		Maker = newMaker;
		Model = newModel;
		if (newYear > 2019)
		{
			int x = newYear - 2019;
			int newestYear =newYear - x;
			Year = newestYear;
		}
		else 
		{
			Year = newYear;
		}
		VIN = newVIN;
		Color = newColor;
		Price = newPrice;
		Transmission = newTransmission;
		
	}
	
	// Methods 
	// 1.Displaying Info 
	public void printCar()
	{
		System.out.println("Maker:\t"+ Maker );
		System.out.println("Model: \t"+ Model);
		System.out.println("Year:\t"+ Year );
		System.out.println("VIN:\t"+ VIN );
		System.out.println("Color:\t"+ Color );
		System.out.println("Price:$\t"+ Price );
		System.out.println("Transmission:\t"+ Transmission );
		System.out.println();
		
	}
	// 2. Price Changing
	public double Pricechange(double newCost)
	{	
		if (newCost <= 0.0)
		{
			System.out.print("Can't update the price ");
			
			return Price;
		}
		else 
		{
			return Price = newCost;
		}
	}
	// 3 Checking VIN Numbers
	public boolean VINchecking()
	{
		if (VIN >=0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	// 4 Checking transmission 
	public String TransmitionDisplay()
	{
		String description = "";
		switch (Transmission)
		{
		case  'a':
		case  'A':
			description = "Your car has an Automatic transmission";
			break;
		case 'm':
		case 'M':
			description = "Your cas has a manual transmission";
		break;
		default:
			System.out.println("not a valid transmission");
		}
		return description;	
	}
	// 5 Get price 
	public double GetPrice ()
	{
		return Price;
	}
	// 6 counter of digits in VIN 
	public int VINcounter()
	{
		int ct = 0;
		ct = String.valueOf(this.VIN).length();
		if (ct == 1)
		{
			System.out.println("Digits on you VIN");
			return 0;
		}
		else 
		{
			System.out.println("Digits on you VIN");
			return ct;
		}
	}
	
}
