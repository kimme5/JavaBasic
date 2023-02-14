package tutorial11;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

//		System.out.println(factorial(5));
		Scanner sc = new Scanner(System.in);
		System.out.print("Factorial Number : ");
		System.out.println(factorial(sc.nextInt()));
		sc.close();
	}
	
	public static int factorial(int a) {
		
		int result = 1;
		
		for(int i = a ; i >= 1 ; i--) {
			System.out.print(i + " * " + result + " = ");
			result *= i ;
			System.out.println(result);
		}
		return result;
	}

}
