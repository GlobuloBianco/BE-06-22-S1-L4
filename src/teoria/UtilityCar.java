package teoria;

public class UtilityCar extends Car {
		
	public UtilityCar(String name, String color, int maxSpeed) {
		super (name, color, maxSpeed);
	}
	
	@Override
	public void run() {
		System.out.println("sono un vigile");
	}
}
