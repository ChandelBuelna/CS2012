
public class CPU {
	
	private String name;
	private double speed;
	private double price;
	
	public CPU(String name, double speed, double price)
	{
		this.name = name;
		this.speed = speed;
		this.price = price;
	}
	public String getName()
	{
		return this.name;
	}
	public double getSpeed()
	{
		return this.speed;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		String toString= "";
		toString = " Name: " + this.name +  "\n" + "   Speed: "+ this.speed + "GHz" + "\n" +"   Price:..........................$" +this.price + "\n" + "\n"+ "\n";
		return toString;
	}
}
