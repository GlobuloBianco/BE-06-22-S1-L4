package teoria;

public class SuperCar extends Car {
	
	public SuperCar(String name, String color, int maxSpeed) {
		super (name, color, maxSpeed);
	}
	
	@Override
	public void run() {
		System.out.println("supercar");
	}
}
