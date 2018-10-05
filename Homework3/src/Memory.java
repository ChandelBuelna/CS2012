
public class Memory {
	private String name;
	private int size; 
	private double price;
	
	public Memory (String name, int size, double price)
	{
		this.name = name;
		this.size = size;
		this.price = price;
	}
	public String getName()
	{
		return this.name;
	}
	public int getSize()
	{
		return this.size;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		String toString ;
		toString = " Name: " +this.name +  "\n" + "   Size: "+ this.size + "GB" + "\n" +"   Price:.........................$" +this.price + "\n" + "\n"+ "\n";
		return toString;
		
	}
} 
