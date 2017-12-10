package card.equipment.minorcharStevedeck;

import card.equipment.Equipment;

public class Fitness extends Equipment
{
public Fitness() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Zumba Fitness Program");
		this.setDesc("Man's gotta stay in shape.");
		this.setStr(99);
		this.setDex(4);
		this.setCon(3);
		this.setIntell(3);
		
		return this;
	}
}
