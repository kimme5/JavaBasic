package tutorial21;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		// ������(Polymorphism) : �θ� Ŭ���� Ÿ���� ���������� �ڽ� Ŭ������ ��ü�� ������ �� ����
		Fruit peach = new Peach();
		peach.show();
		Fruit banana = new Banana();
		banana.show();
		
		System.out.println("------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ : 1,  �ٳ��� : 2 ? ");
		int input = sc.nextInt();
		Fruit fruit;
		if(input == 1) {
			fruit = new Peach();
		} else {
			fruit = new Banana();
		}
		fruit.show();
	
	}

}
