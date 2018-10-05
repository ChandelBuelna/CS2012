
public class MainMenu {
	
    Case [] inStockCases = new Case [4];
	Monitor [] inStockMonitors = new Monitor[4];
	CPU [] inStockCPU = new CPU[4];
	VideoCard [] inStockVideoCards = new VideoCard [4];
	HardDrive [] inStockHardDrives = new HardDrive[4];
	Memory [] inStockMemory = new Memory[4];
	
	// METHODS
	//**********************************************************************
	
	// Print method, prints all the Memory options that are in stock
	public String printinStockMemory()
	{ 
		String Memories = "";
		
		inStockMemory[0] = new Memory ("Empty", 0, 0.0);
		inStockMemory[1] = new Memory ("Corsair Vengance", 8, 69.99);
		inStockMemory[2] = new Memory("G.Skill Ares Series", 16, 149.99);
		inStockMemory[3] = new Memory ("Kingston Black Series", 8, 79.99);
		System.out.println("****************Memory Menu*******************");
		System.out.println();
		
		for (int i=1; i <inStockMemory.length; i++)
		{
			int j = i;
			Memories = Memories + j  + "." + this.inStockMemory[i].toString();
		}
		return Memories;
	}
	
	// Print method, prints all the Hard Drive options that are in stock
	public String PrintinStockHardDrives()
	{
		String HardDrives = "";
		inStockHardDrives[0] = new HardDrive ("Empty", 0, 0.0);
		inStockHardDrives[1] = new HardDrive ("Samsung MZ-7PD256BW", 256, 199.99);
		inStockHardDrives[2] = new HardDrive("Corsair CSSD-F240GBGT-BK", 240, 206.99);
		inStockHardDrives[3] = new HardDrive ("Crucial CT128M4SSD1", 128, 199.99);
		System.out.println("****************Hard Drives Menu*******************");
		System.out.println();
		
		for (int i=1; i <inStockHardDrives.length; i++)
		{
			int j = i;
			HardDrives = HardDrives + j  + "." +this.inStockHardDrives[i].toString();
		}
		return HardDrives;
	}
	
	// Print method, prints all the Video Card options that are in stock
	public String PrintinStockVideoCards()
	{
		String VideoCards = "";
		inStockVideoCards[0] = new VideoCard ("Empty", 0, 0.0);
		inStockVideoCards[1] = new VideoCard ("Nvidia GeForce GTX 770", 2, 346.99);
		inStockVideoCards[2] = new VideoCard ("Nvidia GeForce GTX 670", 2, 333.99);
		inStockVideoCards[3] = new VideoCard ("AMD Radeon HD 7950", 3, 399.99);
		System.out.println("****************Video Cards Menu*******************");
		System.out.println();
		
		for (int i=1; i <inStockVideoCards.length; i++)
		{
			int j = i;
			VideoCards = VideoCards + j  + "." +this.inStockVideoCards[i].toString();
		}
		return VideoCards;
	}
	
	// Print method, prints all the Cases options that are in stock
	public String PrintinStockCases()
	{
		String Cases = "";
		inStockCases[0]= new Case("Empty", 0.0,0.0, 0.0,"Empty" ,0.0);
		inStockCases[1]= new Case("Antec Twelve hundred V3", 20.2,8.38, 22.87,"ATX Full Tower" ,154.99);
		inStockCases[2]= new Case("BitPhenix Phenom M Artic White", 9.8, 12.95, 14.69,"MicroATX Mini Tower" ,89.99);
		inStockCases[3]= new Case("Corsair 25OD", 13.8 ,10.9, 11.4,"MicroATX Tower" ,99.99);
		
		System.out.println("****************Case Menu*******************");
		System.out.println();
		
		for (int i=1; i <inStockCases.length; i++)
		{
			int j = i;
			Cases = Cases + j  + "." +this.inStockCases[i].toString();
		}
		
		return Cases;
	}
	
	// Print method, prints all the Monitors options that are in stock
	public String  PrintinStockMonitors()
	{
		String Monitors = "";
		inStockMonitors[0] = new Monitor ("Empty", 0.0, 0.0);
		inStockMonitors[1] = new Monitor ("Asus PB278Q", 27.0, 549.99);
		inStockMonitors[2] = new Monitor ("Dell U2412M", 24.0, 263.99);
		inStockMonitors[3] = new Monitor ("Samsung S22C300H", 21.5, 139.99);
		System.out.println("****************Monitor Menu*******************");
		System.out.println();
		
		for (int i=1; i <inStockMonitors.length; i++)
		{
			int j = i;
			Monitors = Monitors + j  + "." +this.inStockMonitors[i].toString();
		}
		return Monitors;
	}
	
	// Print method, prints all the CPU options that are in stock
	public String PrintinStockCPU()
	{
		String CPUs = "";
		inStockCPU[0] = new CPU ("Empty", 0.0, 0.0);
		inStockCPU[1] = new CPU ("AMD FX-8350", 4.0, 188.99);
		inStockCPU[2] = new CPU ("Intel Core i5-3570K", 3.4, 179.99);
		inStockCPU[3] = new CPU ("Intel Core i7-3770K", 3.5, 249.99);
		System.out.println("****************CPU Menu*******************");
		System.out.println();
		
		for (int i=1; i <inStockCPU.length; i++)
		{
			int j= i;
			CPUs = CPUs + j  + "." + this.inStockCPU[i].toString();
		}
		return CPUs;
	}
	
	// Display method, Displays the Menu to build a computer
	public void DisplayMenu()
	{
		System.out.println("***************************Main Menu*********************");
		System.out.println("\n"+"\n");
		System.out.println("		1. Choose a Case");
		System.out.println("		2. Choose a Monitor");
		System.out.println("		3. Choose a CPU");
		System.out.println("		4. Choose a Video Card");
		System.out.println("		5. Choose a Hard Drive");
		System.out.println("		6. Choose a Memory");
		System.out.println("		7. Delete Current Computer");
		System.out.println("		8. Display Reciept");
		System.out.println("		9. Exit program");
		System.out.println("\n"+"\n");
		System.out.println("************************************************************");
		System.out.println();
		System.out.print("Please choose an option build your computer");
		System.out.println("\n"+ "\n");
		
	}

}

