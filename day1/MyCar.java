package week1.day1;


public class MyCar {
	
	int noOfWheels = 10;
	long range = 6484933938L;
	double fuelCapacity = 60.5;
	boolean isPunctue = true;
	char fuelType = 'P';
	public static void main(String[] args) {
		
		MyCar car = new MyCar();
		car.driveCar();
		double fuelCapacity = 30.5;
		System.out.println(fuelCapacity);
		System.out.println(car.range);
		
	}
	public void driveCar() {
		System.out.println(fuelCapacity);
		System.out.println(noOfWheels);
		System.out.println("My first program");
		System.out.println("Using shortcuts");
		
	}
	
}


