
public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car("Ford", "Escape", 2006, 123456,"Golden",7000,'A');
		
		car1.printCar();
		car2.printCar();
		
		car2.Pricechange(-9);
		System.out.println();
		car1.Pricechange(9000);
		car2.printCar();
		System.out.println(car1.GetPrice());
		System.out.println(car2.GetPrice());
		
		System.out.println("For VIN checking: if TRUE the VIN is not negative, if FALSE negative numbers");
		System.out.println(car1.VINchecking());
		System.out.println(car2.VINchecking());
		System.out.println();
		System.out.println(car1.TransmitionDisplay());
		System.out.println(car2.TransmitionDisplay());
		System.out.println(car2.VINcounter());
				
	}

};