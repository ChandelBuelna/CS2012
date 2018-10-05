
public class VideoCard {

	
	private String name;
	private int memorySize;
	private double price;
	
	public VideoCard(String name, int memorySize, double price)
	{
		this.name= name;
		this.memorySize = memorySize;
		this.price = price;
	}
	public String getName()
	{
		return this.name;
	}
	public int MemorySize()
	{
		return this.memorySize;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		String toString ="";
		toString = " Name:" +this.name +  "\n" + "   Memory Size: "+ this.memorySize + "GB" + "\n" +"   Price:.........................$" +this.price + "\n" + "\n"+ "\n";
		return toString;
	}
}
