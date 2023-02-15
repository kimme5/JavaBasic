package tutorial21;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		// 다형성(Polymorphism) : 부모 클래스 타입의 참조변수로 자식 클래스의 객체를 생성할 수 있음
		Fruit peach = new Peach();
		peach.show();
		Fruit banana = new Banana();
		banana.show();
		
		System.out.println("------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("복숭아 : 1,  바나나 : 2 ? ");
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
