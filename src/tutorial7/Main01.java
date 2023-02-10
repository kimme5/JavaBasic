package tutorial7;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 30;
		
		for(int i = 0 ; i < count ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i == 10) break;
		}

	}

}
