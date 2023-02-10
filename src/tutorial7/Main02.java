package tutorial7;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.format("입력된 정수는 %d 입니다.\n", i);
		sc.close();
	}

}
