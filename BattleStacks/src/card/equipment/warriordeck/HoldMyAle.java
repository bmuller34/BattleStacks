package card.equipment.warriordeck;

import card.equipment.Equipment;

public class HoldMyAle extends Equipment{
	
	public HoldMyAle() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Cask of Ancient Ale");
		this.setDesc("Here, hold my ale.");
		this.setStr(3);
		this.setDex(-1);
		this.setCon(3);
		this.setIntell(-2);
		
		return this;
	}
}