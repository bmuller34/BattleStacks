package card.equipment.knightdeck;

import card.equipment.Equipment;

public class MoonlightBreaker extends Equipment{
	
	public MoonlightBreaker() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Moonlight Breaker");
		this.setDesc("Channel the protective power of Moonlight into your shield.");
		this.setStr(0);
		this.setDex(2);
		this.setCon(5);
		this.setIntell(-1);

		return this;
	}
}