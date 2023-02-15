package tutorial22;

public class Archer {
	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		if(temp.name == this.name && temp.power == this.power) {
			return true;
		} else {
			return false;
		}
	}

	public Archer() {
	}
}
