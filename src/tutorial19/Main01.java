package tutorial19;

/* Parent 클래스가 final이면 다른 클래스에서 Parent 클래스를 상속할 수 없음 */
public class Main01 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int number = 10;
		System.out.println(number);
		
		Main01 main = new Main01();
		main.show();
	}
	
	/* Parent 클래스의 show() 메서드가 final이면 Overriding 불가함 */
	@Override
	public void show() {
		System.out.println("Hello");
	}

}
