package card.equipment.knightdeck;

import card.equipment.Equipment;

public class ChainmailOfTheGods extends Equipment{
	
	public ChainmailOfTheGods() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Chainmail of the Gods");
		this.setDesc("Finely linked chainmail armor said "
				+ "to have been forged by the Goddess of War.");
		this.setStr(99);
		this.setDex(99);
		this.setCon(4);
		this.setIntell(99);
		
		return this;
	}
}
