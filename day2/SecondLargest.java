package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		 int[] a = {13,1,5,8,2,10};
	      Arrays.sort(a);
	      System.out.println(Arrays.toString(a));
	      System.out.println(a.length);
	      System.out.println(a[a.length-2]);

	}

}
