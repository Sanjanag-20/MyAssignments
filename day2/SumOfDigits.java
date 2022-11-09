package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
	int i=567;
	int sum=0;
	while(i>0) {
		int rem = i%10;
		sum=sum + rem;
		i=i/10;
	}
System.out.println("sum is:" + sum);
	}

}
