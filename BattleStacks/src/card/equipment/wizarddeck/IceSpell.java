package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class IceSpell extends Equipment{
	
	public IceSpell() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Frost Spell");
		this.setDesc("Give them the cold shoulder.");
		this.setStr(0);
		this.setDex(-2);
		this.setCon(-1);
		this.setIntell(3);
		
		return this;
	}
}
