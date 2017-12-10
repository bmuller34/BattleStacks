package card.equipment.minorcharRudolphdeck;

import card.equipment.Equipment;

public class HowFair extends Equipment
{
public HowFair() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("How Fair, My Lord!");
		this.setDesc("Mirror mirror on the wall, you are the fairest of them all.");
		this.setStr(3);
		this.setDex(3);
		this.setCon(3);
		this.setIntell(3);
		
		return this;
	}
}
