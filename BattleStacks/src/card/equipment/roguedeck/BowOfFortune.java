package card.equipment.roguedeck;

import card.equipment.Equipment;

public class BowOfFortune extends Equipment{
	
	public BowOfFortune() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Bow of Fortune.");
		this.setDesc("Standard yew bow but it has a rabbit's foot attached to it.");
		this.setStr(1);
		this.setDex(2);
		this.setCon(99);
		this.setIntell(1);

		return this;
	}
}