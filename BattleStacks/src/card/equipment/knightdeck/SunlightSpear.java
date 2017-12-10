package card.equipment.knightdeck;

import card.equipment.Equipment;

public class SunlightSpear extends Equipment{
	
	public SunlightSpear() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Sunlight Spear");
		this.setDesc("Your faith transforms your weapon into a"
				+ " spear made of pure Sunlight.");
		this.setStr(4);
		this.setDex(0);
		this.setCon(0);
		this.setIntell(0);

		return this;
	}
}