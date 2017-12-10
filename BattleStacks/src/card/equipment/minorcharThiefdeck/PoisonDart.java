package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;

public class PoisonDart extends Equipment{
	
	public PoisonDart() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Poison Dart");
		this.setDesc("Inflicts a numbing poison to its target.");
		this.setStr(-1);
		this.setDex(-1);
		this.setCon(-1);
		this.setIntell(99);

		return this;
	}
}
