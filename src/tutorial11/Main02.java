package tutorial11;

public class Main02 {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int num) {
		
		if(num == 1)
			return 1;
		else
			System.out.println("num1 = " + num + ", " + num * factorial(num -1));
			return num * factorial(num - 1);
	}
	
}
