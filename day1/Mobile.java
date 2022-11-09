package week1.day1;

public class Mobile {

	String mobileBrandName = "Oneplus";
	char mobileLogo = 'O';
	short noOfMobilePieces = 5;
	int modelNumber= 3545;
	long modelmeiNumber = 123456789L; 
	float mobilePrice = 12345.6789f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		
       Mobile myMobile= new Mobile();
      myMobile.makeCall();
      myMobile.sendMsg();
      System.out.println(myMobile.mobileBrandName);
      System.out.println(myMobile.mobileLogo);
      System.out.println(myMobile.noOfMobilePieces);
      System.out.println(myMobile.modelmeiNumber);
      System.out.println(myMobile.mobilePrice);
      System.out.println(myMobile.isDamaged);
	}
	public void makeCall() {
System.out.println("I am making a call");
	}
	
	public void sendMsg() {
	
		System.out.println("I am sending message");

	}
}
