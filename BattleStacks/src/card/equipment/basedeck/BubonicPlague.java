package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, BubonicPlague.
 *
 */
public class BubonicPlague extends Equipment{

	public BubonicPlague() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("The Bubonic Plague");
		this.setDesc("Maybe taking that cheap "
				+ "boat ride wasn't such a good "
				+ "idea after all...");
		this.setStr(99);
		this.setDex(99);
		this.setCon(-2);
		this.setIntell(99);
		
		return this;
	}

}
