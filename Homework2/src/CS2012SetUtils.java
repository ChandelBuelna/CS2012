
public class CS2012SetUtils {
	
	//private CS2012SetUtils()
	//}
		
	//}
	
	public static CS2012Set  union(CS2012Set item1, CS2012Set item2  )
	{
		CS2012Set newset = new CS2012Set();
		newset = item1;
		
		for (int i=0; i < item2.size() ; i++)
			{
				if (newset.existsInSet(item2.get(i)))
				{
					
				}
				else 
				{
					newset.addToSet(item2.get(i));
				}
				
			}
		
		return newset;
	}
	
	public static CS2012Set intersection(CS2012Set item1, CS2012Set item2)
	{
		CS2012Set newset = new CS2012Set();
		
		
		for (int i=0; i< item2.size(); i++)
		{
			if(item1.existsInSet(item2.get(i)))
			{
				newset.addToSet(item2.get(i));
			}
			else
			{
				
			}
		}
		
		return newset;
	}
	
	
	
	
}
