
public class Case {

	private String name;
	private double height;
	private double width;
	private double depth;
	private String type;
	private double price;
	
	public Case(String name, double height, double width, double depth, String type, double price)
	{
		this.name = name;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.type = type;
		this.price = price;
	}
	public String getName()
	{
		return this.name;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getDepth()
	{
		return this.depth;
	}
	public String getType()
	{
		return this.type;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		String toString = "";
		toString = " Name: " + this.name +   "\n" +
		"   Dimensions: "+ this.depth + "\"" + "x " + this.width + "\"" + "x " + this.height + "\"" + " (L, W, H)" + "\n" +
		"   Type: " + this.type +  "\n"+
		"   Price:.........................$" + this.price + "\n" + "\n"+ "\n";
		return toString;
	}
	
}
