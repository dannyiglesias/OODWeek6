
public class ProxyAccess implements CarComputerAccess {
	
	private String endPoint;
	private RemoteCarComputerAccess remAccess;
		public ProxyAccess(String endPoint) {
			this.endPoint = endPoint;
		}
		
		public void driverAccess() {
			if(getCommand(endPoint) > 3) {
				remAccess = new RemoteCarComputerAccess(endPoint);
				remAccess.driverAccess();
			}
			else
			{
				System.out.println("Endpoints programmed to slots 1-3 are not available for dynamic configuration");
			}
		}
		
		public int getCommand(String endPoint) {
			if(endPoint == "Suspension") {
				return 8;
			}
			else if(endPoint == "Brakes") {
				return 7;
			}
			else if(endPoint == "Tires") {
				return 2;
			}
			else if(endPoint == "Aero") {
				return 1;
			}
			else {
				return 0;
			}
		}
}



