package javaSession2;

public class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears, speed;
	
	public Bicycle(int gears, int speed){
		
		this.gears = gears;
		this.speed = speed;
		
	}
	
	public void applyBrake(int num) {
		
		speed = speed-num;
		System.out.println("Current speed: " + speed);
	}
	
	public void speedUp(int num) {
		
		speed = speed+num;
		System.out.println("Current speed: " + speed);
		
	}

	public String bicycleDesc() {
		
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
		
	}

}
