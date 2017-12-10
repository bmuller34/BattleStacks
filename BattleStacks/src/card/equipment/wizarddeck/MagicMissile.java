package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class MagicMissile extends Equipment{
	
	public MagicMissile() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Magic Missile");
		this.setDesc("I cast Magic Missile at the darkness.");
		this.setStr(-1);
		this.setDex(3);
		this.setCon(0);
		this.setIntell(4);
		
		return this;
	}
}
