package card.equipment;

import card.Card;

/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * This class extends from Card and further defines Ability/Equipment cards
 * Characters may use in the game.
 * 
 * These cards will be played during the game and alter the attributes of
 * Characters.
 * 
 */
public class Equipment extends Card {

	/*
	 * Specific Equipment Cards must have:
	 * 
	 * -If they are general-purpose or for a specific Character to use.
	 * -How they impact the 4 base stats (Str, Dex, Con, Int)
	 * 		This is where we will determine transparency or not.
	 * 		Could be negative or some high positive value.
	 * -Special effects (If top card, adds/removes)
	 * -"Played" boolean to know if it's been played in the hand?
	 * 
	 * Note: I'm honestly note sure how useful these variables will be
	 * when it comes to playing the game. They're here just in case.
	 * 
	 * If we wind up needing them then sweet. If not, then we'll get
	 * rid of them.
	 * 
	 */
	
	public Equipment() {}
	
	private boolean isGeneralUse = false;
	private boolean isPlayed = false;
	
	public boolean isGeneralUse() {
		return isGeneralUse;
	}
	public void setGeneralUse(boolean isGeneralUse) {
		this.isGeneralUse = isGeneralUse;
	}

	public boolean isPlayed() {
		return isPlayed;
	}

	public void setPlayed(boolean isPlayed) {
		this.isPlayed = isPlayed;
	}
	
	public void getInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Description: " + this.getDesc());
		System.out.println("Strength: " + this.getStr());
		System.out.println("Dexterity: " + this.getDex());
		System.out.println("Constitution: " + this.getCon());
		System.out.println("Intelligence: " + this.getIntell());
		System.out.println("Is General Use: " + this.isGeneralUse());
		System.out.println("Has Been Played?: " + this.isPlayed());
	}
	
	public String toString() {
		String s = "Name: " + this.getName() +
		"\nDescription: " + this.getDesc() +
		"\nStrength: " + this.getStr() +
		"\nDexterity: " + this.getDex() +
		"\nConstitution: " + this.getCon() +
		"\nIntelligence: " + this.getIntell();
		
		return s;
	}
}
