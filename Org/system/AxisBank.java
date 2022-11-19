package Org.system;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("I have deposited 1000 rupees, i am from AxisBank class");
			
		}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
	}

}
