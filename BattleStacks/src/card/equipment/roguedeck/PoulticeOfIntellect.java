package card.equipment.roguedeck;

import card.equipment.Equipment;

public class PoulticeOfIntellect extends Equipment{
	
	public PoulticeOfIntellect() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Poultice of Intellect.");
		this.setDesc("Makes you real smart! But leaves you wanting elsewhere.");
		this.setStr(-1);
		this.setDex(-1);
		this.setCon(-1);
		this.setIntell(3);

		return this;
	}
}