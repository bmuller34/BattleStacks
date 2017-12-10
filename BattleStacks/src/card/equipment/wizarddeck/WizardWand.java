package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class WizardWand extends Equipment{
	
	public WizardWand() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Wand of the Wizard");
		this.setDesc("Totally not a sparkler toy.");
		this.setStr(0);
		this.setDex(0);
		this.setCon(1);
		this.setIntell(4);
		
		return this;
	}
}