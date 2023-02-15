package tutorial20;

public class Main01 implements Dog, Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main01 main = new Main01();
		main.crying();
		main.show();
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("Па! Па!");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("Two Cat");
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("One Dog");		
	}

}
