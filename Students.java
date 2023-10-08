package polymorphismAssignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The Student id is " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student name with "+id+ " is " +name);
	}
	
	public void getStudentInfo(String email, int phoneno) {
		System.out.println("Email is " +email+ "   Phone no is " +phoneno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj = new Students();
		obj.getStudentInfo(123456);
		obj.getStudentInfo(246929, "Rose");
		obj.getStudentInfo("afdhdsh@gmail.com", 123456789);
		

	}

}
