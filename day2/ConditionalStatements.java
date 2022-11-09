package week1.day2;

public class ConditionalStatements {

	public static void main(String[] args) {
		 int age = 25;
		 if(age >= 18 && age<60) {
			 System.out.println("i am adult");
			 System.out.println("i will drive a car");
		 }
		 else if(age < 5)
			 System.out.println("i am minor");
		 else if(age >= 60)
			 System.out.println("senior citizen");

		 
		 System.out.println("end of program");

	}

}
