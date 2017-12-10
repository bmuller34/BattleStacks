package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;

public class Caltrops extends Equipment
{
public Caltrops () {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Pile of Scattered Legos");
		this.setDesc("Don't step on them.");
		this.setStr(0);
		this.setDex(-1);
		this.setCon(-1);
		this.setIntell(99);
		
		return this;
	}
}
