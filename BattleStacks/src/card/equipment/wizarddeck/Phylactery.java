package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class Phylactery extends Equipment{
	
	public Phylactery() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Ancient Phylactery");
		this.setDesc("Used by liches.");
		this.setStr(0);
		this.setDex(-1);
		this.setCon(4);
		this.setIntell(99);
		
		return this;
	}
}
