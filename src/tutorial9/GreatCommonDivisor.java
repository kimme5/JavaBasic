package tutorial9;

import java.util.Scanner;

public class GreatCommonDivisor {
	
	private static int i, j, k, z = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		i = sc.nextInt();
		System.out.println("ù��° ���� ���� " + i + "�Դϴ�");
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		j = sc.nextInt();
		System.out.println("�ι�° ���� ���� " + j + "�Դϴ�");
		System.out.print("����° ������ �Է��ϼ��� : ");
		k = sc.nextInt();
		System.out.println("����° ���� ���� " + k + "�Դϴ�");
		sc.close();
		
		z = getGCD(i, j, k);
		System.out.println("z= " + z);
		
		if(z == 1) {
			System.out.println("3���� ���� " + i + ", " + j + ", " + k + "�� ������� 1 �ܿ��� ���� ���μ��Դϴ�.");
		} else {
			System.out.println("3���� ���� " + i + ", " + j + ", " + k + "�� �ִ������� " + z + " �Դϴ�.");
		}
		
	}
	
	public static int getGCD(int a, int b, int c) {
		int result = 0;
		
		for(int i = a ; i >= 1 ; i--) {
			if(a % i == 0) {
//				System.out.println("i=" + i + "�̰� ��������" + gcd1 % i + "�Դϴ�.");
				if(b % i == 0) {
//					System.out.println("��������" + gcd2 % i + "�Դϴ�.");
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
