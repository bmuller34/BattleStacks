package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Spear.
 *
 */
public class Spear extends Equipment{

	public Spear() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("An Unfortunately Unbalanced Spear");
		this.setDesc("A spear that leaves the weilder a little "
				+ "off-balance. Hits hard though!");
		this.setStr(2);
		this.setDex(-1);
		this.setCon(0);
		this.setIntell(-1);
		
		return this;
	}

}
