package card.equipment.knightdeck;

import card.equipment.Equipment;

public class HolyScaleMailOfTheWhale extends Equipment{
	
	public HolyScaleMailOfTheWhale() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Holy Scale Mail of the Whale");
		this.setDesc("Scale Mail with an engraving of a Whale. Blessed with Holy Light.");
		this.setStr(0);
		this.setDex(-1);
		this.setCon(5);
		this.setIntell(99);

		return this;
	}
}