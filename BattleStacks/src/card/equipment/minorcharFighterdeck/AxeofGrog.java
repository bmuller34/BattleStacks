package card.equipment.minorcharFighterdeck;

import card.equipment.Equipment;

public class AxeofGrog extends Equipment {
	public AxeofGrog() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Axe of Grog");
		this.setDesc("Use to smash.");
		this.setStr(4);
		this.setDex(0);
		this.setCon(3);
		this.setIntell(0);
		
		return this;
	}
}
