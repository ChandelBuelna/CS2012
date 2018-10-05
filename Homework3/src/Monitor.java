
public class Monitor {

	private String name;
	private double size;
	private double price;
	
	public Monitor (String name, double size, double price)
	{
		this.name = name;
		this.size = size;
		this.price = price;
	}
	public String getName()
	{
		return this.name;
	}
	public double getSize()
	{
		return this.size;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		String toString = "";
		toString = " Name: " + this.name +  "\n" + "   Size: "+ this.size + "\"" + "\n" +"   Price:.........................$" +this.price + "\n" + "\n"+ "\n";
		return toString;
	}
}
