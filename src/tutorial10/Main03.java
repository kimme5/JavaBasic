package tutorial10;

/* max() 함수를 통해 최대값을 얻어 옴 */
public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(100, 101));
		System.out.println(max2(100, 200, 300));
	}
	
	public static int max(int a, int b) {
		// 삼항연산자
		return (a > b) ? a : b;
	}
	
	public static int max2(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

}
