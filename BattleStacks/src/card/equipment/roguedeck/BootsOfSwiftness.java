package card.equipment.roguedeck;

import card.equipment.Equipment;

public class BootsOfSwiftness extends Equipment{
	
	public BootsOfSwiftness() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Boots of Swiftness.");
		this.setDesc("Boots--don't leave home without 'em!");
		this.setStr(99);
		this.setDex(3);
		this.setCon(0);
		this.setIntell(0);

		return this;
	}
}