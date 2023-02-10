package tutorial4;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 50;
		double c = 50.0f;
		int d = (int) 50.8;
		System.out.println("a와 b는 같은가요? " + (a == b));
		System.out.println("a와 c는 같은가요? " + (a == c));
		System.out.println("a와 d는 같은가요? " + (a == d));
		
		System.out.println("a와 b가 같으면서 a가 30보다 큰가요? " + ((a == b) && (a > 30)));
		System.out.println("a가 50이 아닌가요? " + !(a == 50));
	}

}
