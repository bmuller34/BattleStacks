package card.equipment.minorcharRudolphdeck;

import card.equipment.Equipment;

public class HowTough extends Equipment
{
public HowTough() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("How tough, my lord!");
		this.setDesc("");
		this.setStr(99);
		this.setDex(-1);
		this.setCon(4);
		this.setIntell(-1);
		
		return this;
	}
}

