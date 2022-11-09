package week1.day1;

import week1.day1.Mobile;

public class OfficeCar {

	public static void main(String[] args) {
	
		
		int a = 10;
		int b = 30;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		MyCar car = new MyCar();
		
		car.driveCar();
		
		Mobile myMobile= new Mobile();
	      myMobile.makeCall();
	      myMobile.sendMsg();

	}

}
