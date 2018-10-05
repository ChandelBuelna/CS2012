
public class Computer {
	
	private Case towerCase;
	private Monitor monitor;
	private CPU cpu;
	private VideoCard videoCard;
	private HardDrive hardDrive;
	private Memory memory;
	
	public Computer(Case towerCase, Monitor monitor, CPU cpu, VideoCard videoCard, HardDrive hardDrive, Memory memory) 
	{
		this.towerCase = towerCase;
		this.monitor = monitor;
		this.cpu = cpu;
		this.videoCard = videoCard;
		this.hardDrive = hardDrive;
		this.memory = memory;	
	}
	public Case getCase()
	{
		return this.towerCase;
	}
	public Monitor getMonitor ()
	{
		return this.monitor;
	}
	public CPU getCPU()
	{
		return this.cpu;
	}
	public VideoCard getVideoCard()
	{
		return this.videoCard;
	}
	public HardDrive getHardDrive()
	{
		return this.hardDrive;
	}
	public Memory getMemory()
	{
		return this.memory;
	}
	public double getTotalCost()
	{
		double totalCost = towerCase.getPrice() + monitor.getPrice() + cpu.getPrice() + videoCard.getPrice() + hardDrive.getPrice() + memory.getPrice();
		return totalCost;
	}
	public void displayRecipt()
	{
		
		System.out.print("************************Receipt**********************" + "\n" + "\n");
		System.out.print(towerCase.toString());
		System.out.print(monitor.toString());
		System.out.print(cpu.toString());
		System.out.print(videoCard.toString());
		System.out.print(hardDrive.toString());
		System.out.print(memory.toString());
		System.out.print("Total Cost:  $");
	}
	
}
