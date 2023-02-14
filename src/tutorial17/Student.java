package tutorial17;

public class Student extends Person {
	
	private String studentID;
	private int grade;
	private double gPA;
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		this.gPA = gPA;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getgPA() {
		return gPA;
	}

	public void setgPA(double gPA) {
		this.gPA = gPA;
	}
	
	public void show() {
		System.out.println("--------------------------------------------");
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
		System.out.println("Ű : " + getHeight());
		System.out.println("������ : " + getWeight());
		System.out.println("�й� : " + getStudentID());
		System.out.println("�г� : " + getGrade());
		System.out.println("���� : " + getgPA());
	}
	
}
