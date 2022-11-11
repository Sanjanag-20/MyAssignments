package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		int num=20;
		int firstnum=0;
		int secondnum=1;
		int sum;
		
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=0;i<=num;i++)
		{
			sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.println(sum);
			
		}

	}

}
