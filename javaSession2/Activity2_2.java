package javaSession2;

public class Activity2_2 {
	
	public static void main(String[] args) throws InterruptedException {
  
        Plane plane = new Plane(10);
        
        plane.onboard("Wei Wuxian");
        plane.onboard("Lan Wangji");
        plane.onboard("San Lang");
        plane.onboard("Xie Lian");
        plane.onboard("Mo Ran");
        plane.onboard("Chu Wanning");
        
        System.out.println("Plane took off at: " + plane.takeOff());
        
        System.out.println("People on the plane: " + plane.getPassengers());
        
        Thread.sleep(5000);
        
        plane.land();
        
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }

}
