package tutorial9;

import java.util.Scanner;

public class GreatCommonDivisor {
	
	private static int i, j, k, z = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		i = sc.nextInt();
		System.out.println("첫번째 정수 값은 " + i + "입니다");
		System.out.print("두번째 정수를 입력하세요 : ");
		j = sc.nextInt();
		System.out.println("두번째 정수 값은 " + j + "입니다");
		System.out.print("세번째 정수를 입력하세요 : ");
		k = sc.nextInt();
		System.out.println("세번째 정수 값은 " + k + "입니다");
		sc.close();
		
		z = getGCD(i, j, k);
		System.out.println("z= " + z);
		
		if(z == 1) {
			System.out.println("3개의 정수 " + i + ", " + j + ", " + k + "는 공약수가 1 외에는 없는 서로소입니다.");
		} else {
			System.out.println("3개의 정수 " + i + ", " + j + ", " + k + "의 최대공약수는 " + z + " 입니다.");
		}
		
	}
	
	public static int getGCD(int a, int b, int c) {
		int result = 0;
		
		for(int i = a ; i >= 1 ; i--) {
			if(a % i == 0) {
//				System.out.println("i=" + i + "이고 나머지는" + gcd1 % i + "입니다.");
				if(b % i == 0) {
//					System.out.println("나머지는" + gcd2 % i + "입니다.");
					if(c % i == 0) {
						result = i;
						break;
					}
				}
			}
		}
		return result;
	}

}
