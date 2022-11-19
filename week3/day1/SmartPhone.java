package week3.day1;

public class SmartPhone extends AndriodPhone{
	
	public void connectWhatsApp() {
		System.out.println("I am Connecting to whatsApp");
	}
	public void takeVideo() {
		System.out.println("I am Taking videos from smartphone");
	}
	public static void main(String[] args) {
		SmartPhone sp= new SmartPhone();
		sp.connectWhatsApp();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();

	}

}
