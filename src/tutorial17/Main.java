package tutorial17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student1 = new Student("ȫ�浿", 50, 170, 75, "9819636", 3, 3.14);
//		Student student2 = new Student("�̼���", 48, 159, 47, "9819697", 2, 4.09);
//		student1.show();
//		student2.show();

//		Teacher teacher1 = new Teacher("�̹���", 50, 158, 52, "ACB123980", 7500000, 23);
//		Teacher teacher2 = new Teacher("���̰�", 31, 170, 51, "JCB981672", 3000000, 5);
//		teacher1.show();
//		teacher2.show();

//		Student[] students = new Student[10];
//		for(int i = 0 ; i < students.length ; i++) {
//			students[i] = new Student("�輺��", (int)(Math.random() * 10) + 21, (int)(Math.random() * 10) + (int)(Math.random() * 10) + 166, (int)(Math.random()*100)+1, "9809" + i + 1, (int)(Math.random()*10)+1, (Math.random()*100)+1) ;
//			students[i].show();
//		}

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�? ");
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
			System.out.println("[ " + ++i + " ] ��° �л� �Է� ����");
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = sc.next();
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age = sc.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = sc.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			weight = sc.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID = sc.next();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = sc.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = sc.nextDouble();

			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0 ; i < number ; i++) {
			students[i].show();
		}
		sc.close();
	}

}
