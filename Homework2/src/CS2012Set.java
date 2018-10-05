import java.util.Arrays;

public class CS2012Set {
	// Data Fields
	private int [] set = null;
	
	
	public CS2012Set()
	{
		set = new int  [0];
		Arrays.sort(set);
	}
	
	public CS2012Set( int ... set )
	{
		this.set = set;
		Arrays.sort(set);
	}
	
	public  boolean existsInSet(int num)
	{
		for (int i = 0; i< set.length; i++ )
		{
			if ( set[i]== num)
			{
				return true;
			}
		}
		return false;
	}
	
	public void addToSet(int numToAdd)
	{
		int [] newset = new int [set.length + 1];
	
		Boolean	exist=existsInSet(numToAdd);
		
		if ( exist == true)
		{
			System.out.println("The value you are trying to add already exist on the set");
		}
		else 
		{
			
			for (int i = 0 ; i< this.set.length ; i++)
			{
				newset[i] = this.set[i];
			}
			newset[set.length] = numToAdd;
			Arrays.sort(newset);
			this.set= newset;
		
		}
	
	}
	
	public void removeFromSet(int numToRemove)
	{
		int [] newset = new int [set.length - 1];
		Boolean exist = false;
		exist = existsInSet(numToRemove);
		
		if (exist == false)
		{
			System.out.println("The value you are trying to remove does not exist in the set");
		}
		else 
		{
			
			for (int i =0 ; i< this.set.length-1; i++)
			{
				if (this.set[i]== numToRemove)
				{
					
					
					newset[i]= this.set[this.set.length-1];	
					
				
				}
				else
				{
					newset[i] = this.set[i];
					
					
				}
			}
			Arrays.sort(newset);
			this.set = newset;
		}
		

	}
	
	public int get(int index)
	{	
		int value = 0;
		if(value == 0)
		{
			value = set[index];
		}
		else
		{
			value = set[index-1];
		}
		return  value;
	}
	
	public int size()
	{
		return set.length;
	}
	
	public String toString()
	{
		String toString = "";
			if (set.length == 0)
		{
				
			toString =  "";
		}
		else 
		{
			
			for (int i = 0; i <set.length; i++)
			{
				 toString=   toString + set[i] + "," ;
			}
		
		}
			toString = toString.replaceAll(",$", "");
			toString = "{" + toString + "}";
		return toString ;
	}
	
	
}
