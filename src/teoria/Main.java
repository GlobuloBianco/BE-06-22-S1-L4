package teoria;

public class Main {

	public static void main(String[] args) {

		Car c1 = new UtilityCar("ford", "blue", 140);
		Car c2 = new UtilityCar("fiat", "red", 120);
		
		Car c3 = new SuperCar("ferrari", "red", 300);
		Car c4 = new SuperCar("bugatti", "black", 320);

		Car[] cars = { c1, c2, c3, c4};
		
		for( Car c : cars) {
			c.getInfo();
			if ( c instanceof SuperCar) {
				c.run();
			}
		}
		
		for(int i = 0; i< 21; i++) {
			c4.accelera();
			System.out.println("velocità attuale: " + c4.getSpeed());
		}
		c4.spegni();
	}

}

