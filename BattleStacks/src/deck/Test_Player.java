package deck;

import card.characters.Knight;

public class Test_Player {

	public static void main(String[] args) {
		Knight knight = new Knight();
		knight.initialize();

		Player p1 = new Player(knight);

		//p1.getInfo();
		//p1.showHand();
		System.out.println("\n\nDrawing Cards into Hand...\n\n");
		p1.drawCards();
		System.out.println("\n\nDisplay Cards in Hand...\n\n");
		p1.showHand();
		System.out.println("\n\nDisplaying Cards Left Over In Deck...\n\n");
		p1.getInfo();
		
		//FieldStack p1Main = new FieldStack(knight);
		
		System.out.println("\n\nFieldStack of Main Knight before Play. \n\n");
		p1.main.getInfo();
		
		System.out.println(p1.getCardInHandByIndex(0).getName()
				 + " being played on to FieldStack of Main Knight.\n");
		p1.playCard(0, p1.main);
		
		System.out.println("\n\nFieldStack of Main Knight after Play.\n");
		p1.main.getInfo();
		
		p1.showHand();
		
		// adds Spellbook to p1.main Stack
		p1.playCard(3, p1.main);
		
		p1.main.getInfo();
		
		p1.drawCards();
		
		p1.showHand();
		
		// adds Bubonic Plague to p1.main Stack
		p1.playCard(3, p1.main);
		
		p1.main.getInfo();
		
		p1.main.pop();
		
		
	}

}
