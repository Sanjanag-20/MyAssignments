package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {

        int num=371;
        int sum=0, temp, rem;
        
        temp=num;
        while(num >0)
        {
       rem=num%10;
       sum=sum+(rem*rem*rem);
       num=num/10;
	}
 if(temp==sum)
	 System.out.println("The given number is Amstrong Number");
 else
	 System.out.println("The given number is not an Amstrong Number");
}
}
