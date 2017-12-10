package card.equipment.roguedeck;

import card.equipment.Equipment;

public class CheapShot extends Equipment{
	
	public CheapShot() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("CheapShot.");
		this.setDesc("Only OK to use if nobody's playing attention.");
		this.setStr(-2);
		this.setDex(-2);
		this.setCon(-2);
		this.setIntell(-2);

		return this;
	}
}