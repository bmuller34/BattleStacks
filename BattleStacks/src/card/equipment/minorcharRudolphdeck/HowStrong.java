package card.equipment.minorcharRudolphdeck;

import card.equipment.Equipment;

public class HowStrong extends Equipment
{
public HowStrong() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("How Strong, My Lord");
		this.setDesc("Your muscles look quite muscular today, my lord!");
		this.setStr(5);
		this.setDex(-1);
		this.setCon(99);
		this.setIntell(-1);
		
		return this;
	}
}
