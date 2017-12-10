package card.equipment.minorcharFighterdeck;

import card.equipment.Equipment;

public class Loincloth extends Equipment {
	public Loincloth() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Loincloth of Grog");
		this.setDesc("Furry and warm is good.");
		this.setStr(99);
		this.setDex(3);
		this.setCon(3);
		this.setIntell(0);
		
		return this;
	}
}