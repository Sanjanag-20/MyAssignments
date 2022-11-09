package week1.day2;

public class LearnInputAndOutput {
	
	public void sum(int a, double b) {
		//int a=10;
		//int b=20;
		System.out.println(a+b);		
}
	public double add(int a, int b, double c) {
		double result = a + b +c;
		System.out.println("i am from method:" +result);
		return result;		
}
	public void getEmpInfo(String firstName) {
		System.out.println(firstName);
	}
	
	public static void main(String[] args) {
		LearnInputAndOutput abc = new LearnInputAndOutput();
		abc.sum(40,20.66);
		abc.getEmpInfo("sanjana");
		double res = abc.add(120, 60, 50.55);
		System.out.println("i am from main method" +res);
		
	}
}

