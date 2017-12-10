package card.equipment.knightdeck;

import card.equipment.Equipment;

public class BountifulSunlight extends Equipment{
	
	public BountifulSunlight() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Bountiful Sunlight");
		this.setDesc("If only I could be grossly incandescent.");
		this.setStr(99);
		this.setDex(2);
		this.setCon(3);
		this.setIntell(99);

		return this;
	}
}