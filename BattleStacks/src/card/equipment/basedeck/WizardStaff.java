package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, WizardStaff.
 *
 */
public class WizardStaff extends Equipment{

	public WizardStaff() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Wizard Staff");
		this.setDesc("Staff rumored to belong "
				+ "to the once powerful "
				+ "Wizard, Sortimer");
		this.setStr(-1);
		this.setDex(1);
		this.setCon(0);
		this.setIntell(2);
		
		return this;
	}

}
