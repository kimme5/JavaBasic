package tutorial5;

public class Main04 {
	
	static final int N = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = N ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
