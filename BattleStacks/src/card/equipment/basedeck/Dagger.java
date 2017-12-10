package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Dagger.
 *
 */
public class Dagger extends Equipment{

	public Dagger() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Dagger");
		this.setDesc("A Dagger that has the name"
				+ " 'Mrs. Stabby' lovingly engraved"
				+ " into the hilt.");
		this.setStr(1);
		this.setDex(2);
		this.setCon(0);
		this.setIntell(99);
		
		return this;
	}

}
