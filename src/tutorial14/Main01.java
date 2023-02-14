package tutorial14;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 50;
		int array[][] = new int[N][N];
		int sum = 0;
		float average = 0.0f; 
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				array[i][j] = (int) (Math.random() * 10);
				System.out.print(array[i][j] + " ");
				sum += array[i][j];
			}
			System.out.println();
		}
		System.out.println("array length = " + array.length * array.length + ", sum = " + (float)sum + ", average = " + (float)sum/(array.length * array.length));
	}

}
