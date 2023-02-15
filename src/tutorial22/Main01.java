package tutorial22;

public class Main01 extends Archer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archer archer1 = new Archer("홍길동", "상");
		Archer archer2 = new Archer("홍길동", "상");
		
		System.out.println(archer1 == archer2);			// false --> 값은 같더라도 객체 자체가 다름
		System.out.println(archer1.equals(archer2)); 	// true --> 객체가 가지고 있는 값을 비교하므로 true가 됨
 	}

}
