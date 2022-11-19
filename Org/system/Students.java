package Org.system;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student Id is:" +id);
			
		}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id and name is:"+ id+name);
			
		}
	public void getStudentInfo(String email,long ph) {
		System.out.println("Student email and Phonenumber is:"+ (email+ph));
			
		}
	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(501);
		st.getStudentInfo(501, "SaiNandhan");
		st.getStudentInfo("sai.nandhan@gmail.com", 9912345020l);
	}

}
