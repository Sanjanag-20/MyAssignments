package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

     int[] a = {13,1,5,8,2,10};
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
      
    int length = a.length;
    //System.out.println(length);
    for (int i=1;i<a.length;i++)
    {
    	if(i!=a[i-1]) {
    	System.out.println(i);
    	break;
    					}
	}

											}
						}