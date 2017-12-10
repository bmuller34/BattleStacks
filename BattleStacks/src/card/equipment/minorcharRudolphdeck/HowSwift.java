package card.equipment.minorcharRudolphdeck;

import card.equipment.Equipment;

public class HowSwift extends Equipment
{
public HowSwift() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("How Swift, my lord!");
		this.setDesc("You are faster than the spread of disease today, my lord!");
		this.setStr(2);
		this.setDex(4);
		this.setCon(1);
		this.setIntell(99);
		
		return this;
	}
}

