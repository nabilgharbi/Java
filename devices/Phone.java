
public class Phone extends Device {
	public String makeCall() {
		if(this.battery < 5) {
			System.out.println("Battery too low.");
			return "b";
		}
		else if(this.battery < 10) {
			System.out.println("Battery critical");
			return "c";
		}
		else {
			this.battery -= 5;
			System.out.println("Making a call.");
			this.batteryPowerMessage();
			return "a";
		}
	}
	public String playGame() {
		if(this.battery < 10) {
			System.out.println("Battery critical");
			return "c";
		}
		else if(this.battery < 25) {
			System.out.println("battery too low to game.");
			return "b";
		}
		else {
			this.battery -= 20;
			System.out.println("Playing a game.");
			this.batteryPowerMessage();
			return "a";
		}
		
	}
	public void chargePhone() {
		int counter = 0;
		while(battery < 100) {
			if(counter < 50) {
				this.battery += 1;
				counter ++;
			}
			else {
				break;
			}
		}
		System.out.println("Charging phone");
		this.batteryPowerMessage();
	}
	
}
