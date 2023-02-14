package tutorial13;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[10000000];
		int sum = 0;
		double average = 0.0;
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int) (Math.random() * 100) + 1;	// 1 <= x <= 100
			sum += array[i];
//			System.out.print("array[" + i + "] = " + array[i]);
//			System.out.println(", sum = " + sum);
		}
		
		average = (double)sum/array.length;
		
		System.out.println("average = " + average);
		
	}
	

}
