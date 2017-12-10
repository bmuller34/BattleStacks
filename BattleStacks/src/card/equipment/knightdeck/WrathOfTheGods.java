package card.equipment.knightdeck;

import card.equipment.Equipment;

public class WrathOfTheGods extends Equipment{
	
	public WrathOfTheGods() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Wrath Of The Gods");
		this.setDesc("Blindly enforce the Will of the Gods.");
		this.setStr(2);
		this.setDex(2);
		this.setCon(0);
		this.setIntell(-2);

		return this;
	}
}