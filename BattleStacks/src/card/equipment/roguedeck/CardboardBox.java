package card.equipment.roguedeck;

import card.equipment.Equipment;

public class CardboardBox extends Equipment{
	
	public CardboardBox() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Cardboard Box");
		this.setDesc("Never leave Mother Base without one.");
		this.setStr(0);
		this.setDex(0);
		this.setCon(5);
		this.setIntell(5);

		return this;
	}
}