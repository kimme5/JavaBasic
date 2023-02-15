package tutorial23;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero[] heros = new Hero[3];
		
		heros[0] = new Warrior("Barbarian");
		heros[1] = new Archer("Amazon");
		heros[2] = new Wizard("Soscirous");
				
		for(int i = 0 ; i < heros.length ; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) {
				Warrior temp = (Warrior) heros[i];
				temp.groundCutting();
			} else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			} else {
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
			
		}

	}

}
