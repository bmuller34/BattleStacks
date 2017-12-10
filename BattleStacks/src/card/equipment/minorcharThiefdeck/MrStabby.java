package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;

public class MrStabby extends Equipment{
	
	public MrStabby() {}

	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Mr. Stabby");
		this.setDesc("Lovingly named after its best use.");
		this.setStr(2);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(0);

		return this;
	}
}
