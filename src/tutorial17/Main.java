package tutorial17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student1 = new Student("홍길동", 50, 170, 75, "9819636", 3, 3.14);
//		Student student2 = new Student("이순신", 48, 159, 47, "9819697", 2, 4.09);
//		student1.show();
//		student2.show();

//		Teacher teacher1 = new Teacher("이미자", 50, 158, 52, "ACB123980", 7500000, 23);
//		Teacher teacher2 = new Teacher("강미경", 31, 170, 51, "JCB981672", 3000000, 5);
//		teacher1.show();
//		teacher2.show();

//		Student[] students = new Student[10];
//		for(int i = 0 ; i < students.length ; i++) {
//			students[i] = new Student("김성우", (int)(Math.random() * 10) + 21, (int)(Math.random() * 10) + (int)(Math.random() * 10) + 166, (int)(Math.random()*100)+1, "9809" + i + 1, (int)(Math.random()*10)+1, (Math.random()*100)+1) ;
//			students[i].show();
//		}

		Scanner sc = new Scanner(System.in);
		System.out.print("총 몇명의 학생이 존재합니까? ");
		int number = sc.nextInt();

		Student[] students = new Student[number];
		for(int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			
			System.out.println("--------------------------------");
			System.out.println("[ " + ++i + " ] 번째 학생 입력 정보");
			System.out.print("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = sc.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.print("학생의 몸무게 입력하세요 : ");
			weight = sc.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = sc.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = sc.nextDouble();

			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0 ; i < number ; i++) {
			students[i].show();
		}
		sc.close();
	}

}
