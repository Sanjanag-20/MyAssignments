package week1.day2;
import week1.day1.MyCar;

public class OwnCar {

	 int a = 30;
	
 public void sum() {
	 System.out.println("global variable:" + a);
   int a = 20;
   System.out.println("local variable:" + a);
 
 }
	public static void main(String[] args) {
		 
		//cretae object to execute methods
				MyCar car = new MyCar();
				//call method using object
				car.driveCar();
				
				OwnCar carr = new OwnCar();
				carr.sum();
	}

}
