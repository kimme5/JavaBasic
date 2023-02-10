package tutorial5;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Man";
		int age = 21;
		
		if(a.equalsIgnoreCase("man")) {
			System.out.println("a는 남자입니다.");
		} else {
			System.out.println("a는 남자가 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && age >= 20) {
			System.out.println("a는 남자이고 성인입니다.");
		} else {
			System.out.println("a는 남자가 아니거나 성인이 아닙니다.");
		}
		
	}

}
