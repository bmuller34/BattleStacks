package card.equipment.knightdeck;

import card.equipment.Equipment;

public class Lightbrand extends Equipment{
	
	public Lightbrand() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Lightbrand");
		this.setDesc("Sword blessed with Divine Light.");
		this.setStr(1);
		this.setDex(0);
		this.setCon(2);
		this.setIntell(0);

		return this;
	}
}