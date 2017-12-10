package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class MuscleWizard extends Equipment{
	
	public MuscleWizard() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Potion of the Muscle Wizard");
		this.setDesc("I cast fist.");
		this.setStr(2);
		this.setDex(0);
		this.setCon(2);
		this.setIntell(99);
		
		return this;
	}
}