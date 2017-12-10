package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class WizardRobe extends Equipment{
	
	public WizardRobe() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Archwizard Bathrobe");
		this.setDesc("Bathrobe of the Grand Wizard. "
				+ "Smells of lavender.");
		this.setStr(99);
		this.setDex(99);
		this.setCon(-1);
		this.setIntell(4);
		
		return this;
	}
}
