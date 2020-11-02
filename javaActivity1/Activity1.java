package javaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car jaguar = new Car();
		jaguar.make = 2014;
		jaguar.color = "Black";
		jaguar.transmission = "Manual";
		
		jaguar.displayCharacteristics();
		jaguar.accelarate();
		jaguar.brake();
		
	}

}
