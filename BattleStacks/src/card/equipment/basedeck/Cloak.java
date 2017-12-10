package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Cloak.
 *
 */
public class Cloak extends Equipment{

	public Cloak() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Hooded Cloak");
		this.setDesc("A cloak complete with a hood! "
				+ "Useful for hiding your beautiful face.");
		this.setStr(99);
		this.setDex(1);
		this.setCon(0);
		this.setIntell(99);
		
		return this;
	}

}
