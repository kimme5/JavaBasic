package tutorial4;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 50;
		double c = 50.0f;
		int d = (int) 50.8;
		System.out.println("a�� b�� ��������? " + (a == b));
		System.out.println("a�� c�� ��������? " + (a == c));
		System.out.println("a�� d�� ��������? " + (a == d));
		
		System.out.println("a�� b�� �����鼭 a�� 30���� ū����? " + ((a == b) && (a > 30)));
		System.out.println("a�� 50�� �ƴѰ���? " + !(a == 50));
	}

}
