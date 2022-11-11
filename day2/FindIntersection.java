package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a= {1,3,10,5,6,7,8};
		int[] b= {2,4,5,8,6,10,14};
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<b.length;j++) {
				 if(a[i]==b[j]) {
					 System.out.println(a[i]);
				 }
			 }
		 }
		}

	}


