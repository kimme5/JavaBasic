package tutorial22;

public class Main01 extends Archer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archer archer1 = new Archer("ȫ�浿", "��");
		Archer archer2 = new Archer("ȫ�浿", "��");
		
		System.out.println(archer1 == archer2);			// false --> ���� ������ ��ü ��ü�� �ٸ�
		System.out.println(archer1.equals(archer2)); 	// true --> ��ü�� ������ �ִ� ���� ���ϹǷ� true�� ��
 	}

}
