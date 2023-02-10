package tutorial4;

public class Main05 {
	
	public static void main(String[] args) {
		int x = 50;
		int y = 53;
		System.out.println(max(x, y));
	}
	
	static int max(int a, int b) {
		// »ïÇ× ¿¬»êÀÚ
		int result = (a > b) ? a : b;
		return result;
	}
	
}
