import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MainMenu mm = new MainMenu();
		int option = 0;
		int caseInd =0;
		int monitorInd =0;
		int cpuInd = 0;
		int videoCardInd = 0;
		int hardDriveInd = 0;
		int memoryInd = 0;
		Computer cp = new Computer(mm.inStockCases[caseInd], mm.inStockMonitors[monitorInd], mm.inStockCPU[cpuInd],mm.inStockVideoCards[videoCardInd],mm.inStockHardDrives[hardDriveInd], mm.inStockMemory[memoryInd]);
		
		do
		{
			mm.DisplayMenu();
			option = sc.nextInt();
							
			switch(option )
			{
			case 1:
				System.out.println(mm.PrintinStockCases());
				System.out.println("	Please choose a case:");
				caseInd = sc.nextInt();
		
								
				break;
			case 2:
				System.out.println(mm.PrintinStockMonitors());
				System.out.println("	Please choose a Monitor:");
				monitorInd = sc.nextInt();
				
				break;
			case 3:
				System.out.println(mm.PrintinStockCPU());
				System.out.println("	Please choose a CPU:");
			    cpuInd = sc.nextInt();
				
				break;
			case 4:
				System.out.println(mm.PrintinStockVideoCards());
				System.out.println("	Please choose a Video Card:");
			    videoCardInd = sc.nextInt();
				
				break;
				
			case 5:
				System.out.println(mm.PrintinStockHardDrives());
				System.out.println("	Please choose a Hard Drive:");
			    hardDriveInd = sc.nextInt();
				
				break;
			case 6:
				
				System.out.println(mm.printinStockMemory());
				System.out.println("	Please choose a Memory:");
			    memoryInd = sc.nextInt();
				
				break;
			case 7:
				//delete current computer
				
				caseInd =0;
				monitorInd =0;
				cpuInd = 0;
				videoCardInd = 0;
			    hardDriveInd = 0;
			    memoryInd = 0;
				mm.DisplayMenu();
				option = sc.nextInt();
				
				break;
				
			case 8:
				Computer cp1 = new Computer(mm.inStockCases[caseInd], mm.inStockMonitors[monitorInd], mm.inStockCPU[cpuInd],mm.inStockVideoCards[videoCardInd],mm.inStockHardDrives[hardDriveInd], mm.inStockMemory[memoryInd]);
				cp = cp1;
				cp1.displayRecipt();
			    System.out.println(cp1.getTotalCost());
			    mm.DisplayMenu();
				option = sc.nextInt();
			    break;
				// Display Receipt
			case 9:
				// exit
				System.out.print("BYE BYE");
				System.exit(0);
				break;			
			default:
				System.out.println("Invalid input");
			}
		}
	
			while (option != 9 );
		
	
		
		
	sc.close();	
		
	}

}
