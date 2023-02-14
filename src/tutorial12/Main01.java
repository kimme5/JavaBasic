package tutorial12;

// �Ǻ���ġ �������� Ư�� ��ġ�� ���� Ȯ���ϴ� �޼���
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ǻ���ġ ���� �� 49��° �� = " + fibonacci(49));
		System.out.println("�Ǻ���ġ ���� �� 49��° �� = " + fibonacci2(49));
	}

//	public static int fibonacci(int fIdx) {
//		int a = 0;
//		int b = 0;
//		int result = 0;
//		
//		for(int i = 1 ; i <= fIdx ; i++) {
//			
//			if(i <= 2) {
//				System.out.println("i = " + i + ", f(x) = " + a);
//			} else {
//				if(i % 2 == 0) {
//					b = a + b;
//					System.out.println("i = " + i + ", f(x) = " + b);
//					result = b;
//				} else {
//					a = a + b;
//					System.out.println("i = " + i + ", f(x) = " + a);
//					result = a;
//				}
//			}
//		}
//		return result;
//	}

	public static int fibonacci(int fIdx) {
		int a = 1;
		int b = 1;
		int result = -1;
		
		if(fIdx == 1) {
			result = a;
		} else if(fIdx == 2) {
			result = b;
		} else {
			for (int i = 3; i <= fIdx; i++) {
				result = a + b;
				a = b;
				b = result;
			}
		}
		return result;
	}
	
	// ����Լ� --> fibonacci2(50) �ϸ� for������ �ξ� ���� �ɸ� --> ����Լ��� ȣ���ϴ� �󵵰� ���� ���� ����� ���� �����ۿ��� �ŵ��ؾ� ��
	public static int fibonacci2(int fIdx) {
		if(fIdx == 1) {
			return 1;
		} else if(fIdx == 2) {
			return 1;
		} else {
			return fibonacci2(fIdx - 1) + fibonacci2(fIdx - 2);
		}
		
	}
	
}
