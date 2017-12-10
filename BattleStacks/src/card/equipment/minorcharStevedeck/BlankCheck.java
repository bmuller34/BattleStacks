package card.equipment.minorcharStevedeck;

import card.equipment.Equipment;

public class BlankCheck extends Equipment
{
public BlankCheck() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Blank Checkbook");
		this.setDesc("A strange book from the kingdom of Wells Fargo.");
		this.setStr(99);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(3);
		
		return this;
	}
}
