package JavaWeek01.GLCcode;


public class TestMain {

	public static void main(String args[]) {

		TestStudent tobj = new TestStudent();
		
		tobj.setStudentName("Kausik Sarkar");

		String receivedStudentName = tobj.getStudentName();
		
		String schoolName=tobj.getSchoolName();

		System.out.println("Name of the Student Set in this class : " + receivedStudentName);
		System.out.println("Name of the School: " + schoolName);

	}
	
}
