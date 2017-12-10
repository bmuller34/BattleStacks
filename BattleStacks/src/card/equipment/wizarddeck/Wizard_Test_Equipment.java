package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class Wizard_Test_Equipment extends Equipment{
	
	public Wizard_Test_Equipment() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Grand Wizard Bathrobe");
		this.setDesc("Bathrobe of the Grand Wizard. "
				+ "Smells of lavender.");
		this.setStr(99);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(4);
		
		return this;
	}
}
