package week1.day1;

public class TwoWheeler {

	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 5373858L;
	boolean isPunctured = true;
	String bikeName = "Hero Honda"; 
	double runningKM = 12345.56789;
	
	public static void main(String[] args) {
		
		TwoWheeler abc = new TwoWheeler();
		System.out.println(abc.noOfWheels);
		System.out.println(abc.noOfMirrors);
		System.out.println(abc.chassisNumber);
		System.out.println(abc.isPunctured);
		System.out.println(abc.bikeName);
		System.out.println(abc.runningKM);
	
	}

}
