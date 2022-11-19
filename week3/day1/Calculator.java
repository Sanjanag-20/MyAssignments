package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("Addition is:"+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Addition is:"+(a+b+c));
	}
	public void sub(int a, int b) {
		System.out.println("Difference is:"+(a-b));
	}
	public void sub(double a, double b) {
		System.out.println("Difference is:"+(a-b));
	}
	public void mul(int a, double b) {
		System.out.println("Multiplication is:"+(a*b));
	}
	public void mul(double a, double b) {
		System.out.println("Multiplication is:"+(a*b));
	}
	public static void main(String[] args) {
	Calculator cal= new Calculator();
cal.add(10, 20);
cal.add(10, 20, 30);
cal.sub(50, 20);
cal.sub(50.00, 20.00);
cal.mul(20.40, 30.70);
cal.mul(20, 30.66);

	}

}
