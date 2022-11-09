package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int addition= num1+num2+num3;
		System.out.println("addition is: " + addition);
		return addition;
	}
	public int sub(int num1, int num2) {
		int substraction = num1-num2;
		System.out.println("substraction is: " + substraction);
		return substraction;
	}
	public double mul(double num1, double num2) {
		double multiplication = num1*num2;
		System.out.println("multiplication is: " + multiplication);	
		return multiplication;
	}
	public float divide(float num1, float num2) {
		float division = num1/num2;
		System.out.println("division is: " + division);
		return division;
	}

	public static void main(String[] args) {
		
		Calculator result = new Calculator();
   int res= result.add(10, 20, 30);
   int res1= result.sub(100, 50);
   double res2= result.mul(20.5678, 30.4738);
   float res3= result.divide(30.30f, 10.10f);
	}
}
