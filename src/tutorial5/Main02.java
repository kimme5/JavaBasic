package tutorial5;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Man";
		int age = 21;
		
		if(a.equalsIgnoreCase("man")) {
			System.out.println("a�� �����Դϴ�.");
		} else {
			System.out.println("a�� ���ڰ� �ƴմϴ�.");
		}
		
		if(a.equalsIgnoreCase("man") && age >= 20) {
			System.out.println("a�� �����̰� �����Դϴ�.");
		} else {
			System.out.println("a�� ���ڰ� �ƴϰų� ������ �ƴմϴ�.");
		}
		
	}

}
