
public class RemoteCarComputerAccess implements CarComputerAccess {
	
	private String endPoint;
	public RemoteCarComputerAccess(String carEP) {
		this.endPoint = carEP;
	}
	
	public void driverAccess() {
		System.out.println("Access to " + endPoint + " through vehicle mounted CPU for configuration granted");
	}

}
