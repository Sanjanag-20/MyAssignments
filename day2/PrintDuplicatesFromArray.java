package week1.day2;

public class PrintDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a= {12,4,5,15,20,8,9,3,5,12,20};
		//to take the data one by one
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
			}
		}

	}

}
