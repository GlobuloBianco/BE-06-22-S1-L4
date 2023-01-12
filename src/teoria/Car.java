package teoria;

abstract public class Car implements CarActions {
	
	private String name;
	private String color;
	private int maxSpeed;
	
	private boolean motoreAcceso;
	private int speed = 0;
	
	public Car(String name, String color, int maxSpeed) {
		super();
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void getInfo() {
		System.out.println( "Info macchina: " + getName() + " colore: " + getColor() + " max speed: " + getMaxSpeed());
		System.out.println("motore acceso: " + motoreAcceso + " velocità attuale: " + speed);
	}
	
	abstract public void run();
	
	public void accendi() {
		System.out.println("motore acceso");
		motoreAcceso = true;
	}
	
	public void spegni() {
		System.out.println("motore spento");
		motoreAcceso = false;
	}
	
	public void accelera() {
		if(speed + 15 < maxSpeed)
		speed += 15;
	}
	
	public int getSpeed() {
		return speed;
	}
}
