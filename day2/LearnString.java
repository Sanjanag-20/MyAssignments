package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		//String literal
		String s = "TestLeaf";
		//string object
		String s2 = new String("Testleaf");
		//compare 2 strings
		boolean isEqual=s.equals(s2);
		System.out.println(isEqual);
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s == s2);
		//number of characters in string
		System.out.println(s.length());
		//to convert string to char array
		char[] charArray = s.toCharArray();
		System.out.println(charArray[7]);
		/*for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}*/
		//to get a particular character
		char charAt = s.charAt(s.length()-1);
		System.out.println(charAt);
		System.out.println(charArray[7]);
		//to get the position of specific char
		int indexOf = s.indexOf('L');
		System.out.println(indexOf);
		// to check if a string contains a specific text
		boolean contains = s.contains("Leaf");
		System.out.println(contains);
		//to split the string
		String s3= "Welcome to testleaf";
		String[] split = s3.split(" ");
		for(int i=0;i<split.length;i++)
		System.out.println(split);
		
		
	}

}
