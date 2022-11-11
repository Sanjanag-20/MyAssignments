package week1.day2;

public class ConvertNegativeNumberToPositive {

	public static void main(String[] args) {
		 int a=-50;
		 
		 if(a<0)
		 {
			 a=a*(-1);
			 System.out.println("Converted number is:" +a); 
		 }
		 else
			 System.out.println("Its a positive number:" +a);

	}

}
