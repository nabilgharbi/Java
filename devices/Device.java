public class Device {
	protected int battery = 100;
	
	public Device() {
	}
	
	protected int batteryPowerMessage() {
		System.out.println("Battery level: " + this.battery);
		return battery;
	}
}
