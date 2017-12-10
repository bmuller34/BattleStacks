package card.equipment.minorcharFighterdeck;

import card.equipment.Equipment;

public class Smarts extends Equipment {
	public Smarts() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Smarts of Grog");
		this.setDesc("Use to find derivative.");
		this.setStr(99);
		this.setDex(-1);
		this.setCon(0);
		this.setIntell(3);
		
		return this;
	}
}
