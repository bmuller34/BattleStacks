package card.equipment.minorcharStevedeck;

import card.equipment.Equipment;

public class DrinkingWater extends Equipment
{
public DrinkingWater() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Clean Drinking Water");
		this.setDesc("It's amazing what you can accomplish with potable water.");
		this.setStr(99);
		this.setDex(2);
		this.setCon(3);
		this.setIntell(4);
		
		return this;
	}
}