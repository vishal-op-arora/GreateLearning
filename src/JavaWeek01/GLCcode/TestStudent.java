package JavaWeek01.GLCcode;


public class TestStudent {

	int rollNo;
	String schollName;
	String studentName;

	TestStudent() {
		schollName = "DPS";
		System.out.println("I am inside the TestStudent class - With Default Constructor");
	}

	TestStudent(String sname) {
		this();
		this.studentName = sname;
		System.out.println("I am inside the TestStudent class - With Parameterized Constructor");
	}

	public void setStudentName(String studentName) {

		this.studentName = studentName;

	}

	public String getStudentName() {

		return studentName;
	}

	public String getSchoolName() {

		return schollName;
	}

	private void setSchoolName(String sname) {

		this.schollName=sname;
	}
	
}
