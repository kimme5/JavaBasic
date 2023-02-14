package tutorial12;

// 피보나치 수열에서 특정 위치의 값을 확인하는 메서드
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("피보나치 수열 중 49번째 값 = " + fibonacci(49));
		System.out.println("피보나치 수열 중 49번째 값 = " + fibonacci2(49));
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
	
	// 재귀함수 --> fibonacci2(50) 하면 for문보다 훨씬 오래 걸림 --> 재귀함수를 호출하는 빈도가 높을 수록 계산을 위한 연산작용을 거듭해야 함
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
