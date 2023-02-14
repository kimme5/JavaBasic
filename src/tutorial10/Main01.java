package tutorial10;

import java.util.Scanner;

public class Main01 {
	
	private static int inVal, thCD = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받은 정수의 값 : ");
		inVal = sc.nextInt();
		System.out.print("약수의 위치 : ");
		thCD = sc.nextInt();
		
		sc.close();
		
		System.out.println(function(inVal, thCD));
	}
	
	public static int function(int a, int b) {
		
		int j = 0;
		int result = 0;

		for(int i = 1 ; i <= a ; i++) {
			if(a % i == 0) {
				j++;
				System.out.println("j=" + j + ", i =" + i);
				if(j == b) {
					result = i;
					break;
				}
			}
		}
		return result;
	}
}
