package card.equipment.minorcharRudolphdeck;

import card.equipment.Equipment;

public class HowSmart extends Equipment
{
public HowSmart() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("How Smart, My Lord!");
		this.setDesc("");
		this.setStr(0);
		this.setDex(0);
		this.setCon(0);
		this.setIntell(5);
		
		return this;
	}
}

