package card.equipment.minorcharFighterdeck;

import card.equipment.Equipment;

public class Rage extends Equipment {
	public Rage() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Rage of Grog");
		this.setDesc("Find reason to smash.");
		this.setStr(5);
		this.setDex(-1);
		this.setCon(4);
		this.setIntell(-1);
		
		return this;
	}
}