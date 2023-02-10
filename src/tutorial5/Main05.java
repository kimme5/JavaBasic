package tutorial5;

public class Main05 {
	
	static final int N = 15;
	
	public static void main(String[] args) {
		// x^2 + y^2 = r^2
		for(int i = -N ; i <= N ; i++) {
			for(int j = -N ; j <= N ; j++) {
				if(i*i + j*j <= N*N) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}

}
