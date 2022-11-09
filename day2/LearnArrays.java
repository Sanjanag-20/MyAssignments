package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//array declaration
		//int[] values = new int[3];// index starts from 0
		//values[0] = 20;
		//values[1]= 10;
		//values[2]= 40;
		int[] values = {1,2,3,4};
		
		int size = values.length;
		//System.out.println(size);
//System.out.println(values[2]);
     Arrays.sort(values);
    System.out.println("second largest is:" + values[values.length - 2]);
    for(int i=0;i< size; i++ )
	System.out.println(values[i]);
	}
}
