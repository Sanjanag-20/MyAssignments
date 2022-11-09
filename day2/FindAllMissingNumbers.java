package week1.day2;

import java.util.Arrays;

public class FindAllMissingNumbers {

	public static void main(String[] args) {
		
		int[] a= {12,5,18,2,11,15,8,20};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i]+1)
			{
				continue;
			}
			else {
				for(int j=a[i]+1;j<a[i+1];j++)
					System.out.println(j);
			}
		}
		

	}

}
