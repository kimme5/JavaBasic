package tutorial10;

/* max() �Լ��� ���� �ִ밪�� ��� �� */
public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(100, 101));
		System.out.println(max2(100, 200, 300));
	}
	
	public static int max(int a, int b) {
		// ���׿�����
		return (a > b) ? a : b;
	}
	
	public static int max2(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

}
