package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;

public class Speed extends Equipment{
	
	public Speed() {}

	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Speed of the Orphan Thief");
		this.setDesc("The little bugger is an artful dodger.");
		this.setStr(0);
		this.setDex(3);
		this.setCon(0);
		this.setIntell(99);

		return this;
	}
}
