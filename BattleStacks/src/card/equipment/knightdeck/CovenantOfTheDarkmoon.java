package card.equipment.knightdeck;

import card.equipment.Equipment;

public class CovenantOfTheDarkmoon extends Equipment{
	
	public CovenantOfTheDarkmoon() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Covenant of the Darkmoon");
		this.setDesc("Sever your connection with the Gods"
				+ " and drink from the cup of the Darkmoon for"
				+ " unbridled strength.");
		this.setStr(5);
		this.setDex(5);
		this.setCon(-5);
		this.setIntell(-3);

		return this;
	}
}