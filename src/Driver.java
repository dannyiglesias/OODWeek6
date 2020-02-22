
public class Driver {
	
	//main method
	public static void main(String[] args)
	{
		System.out.println("Driver commencing dynamic vehicle configuration test...");
		System.out.println("");
		System.out.println("Driver attempting to access Suspension settings:...");
		CarComputerAccess carAccess = new ProxyAccess("Suspension");
		carAccess.driverAccess();
		System.out.println("Driver attempting to access Brakes for adjustment:...");
		CarComputerAccess carAccess1 = new ProxyAccess("Brakes");
		carAccess1.driverAccess();
		System.out.println("Driver attempting to access Tire pressure settings:...");
		CarComputerAccess carAccess2 = new ProxyAccess("Tires");
		carAccess2.driverAccess();
		System.out.println("Driver attempting to access Aero for downforce optimization:...");
		CarComputerAccess carAccess3 = new ProxyAccess("Aero");
		carAccess3.driverAccess();
		System.out.println("");
		System.out.println("Dynamic vehicle configuration test completed");
	}
}
