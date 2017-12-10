package card.characters;

public class Test_MainCharacters {

	public static void main(String[] args) {
		Warrior Warrior = new Warrior();
		
		Warrior.initialize();
		Warrior.getInfo();
		
		System.out.println();
		
		Rogue Rogue = new Rogue();
		
		Rogue.initialize();
		Rogue.getInfo();
		
		System.out.println();
		
		Knight Knight = new Knight();
		
		Knight.initialize();
		Knight.getInfo();
		
		System.out.println();
		
		Wizard Wizard = new Wizard();
		
		Wizard.initialize();
		Wizard.getInfo();
	}
}
