package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Armor.
 *
 */
public class Armor extends Equipment{

	public Armor() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Reliable Leather Armor");
		this.setDesc("Good ol' reliable armor. Has"
				+ " seen better days but it gets the job"
				+ " done.");
		this.setStr(99);
		this.setDex(-1);
		this.setCon(2);
		this.setIntell(-1);
		
		return this;
	}

}
