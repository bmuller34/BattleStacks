package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;

public class Smile extends Equipment{
	
	public Smile () {}

	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Smile of the Orphan Thief");
		this.setDesc("Disarming.");
		this.setStr(-2);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(-1);

		return this;
	}
}
