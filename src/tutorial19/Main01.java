package tutorial19;

/* Parent Ŭ������ final�̸� �ٸ� Ŭ�������� Parent Ŭ������ ����� �� ���� */
public class Main01 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int number = 10;
		System.out.println(number);
		
		Main01 main = new Main01();
		main.show();
	}
	
	/* Parent Ŭ������ show() �޼��尡 final�̸� Overriding �Ұ��� */
	@Override
	public void show() {
		System.out.println("Hello");
	}

}
