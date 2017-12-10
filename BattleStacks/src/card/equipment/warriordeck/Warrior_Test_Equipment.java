package card.equipment.warriordeck;

import card.equipment.Equipment;

public class Warrior_Test_Equipment extends Equipment{
	
	public Warrior_Test_Equipment() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Loincloth of the Legendary Strongarm Swellstrike");
		this.setDesc("Tattered loincloth that once "
				+ "was worn by the warrior of legend.");
		this.setStr(4);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(99);
		
		return this;
	}
}
