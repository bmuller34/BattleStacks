package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, BrokenSword.
 *
 */
public class BrokenSword extends Equipment{

	public BrokenSword() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Broken Sword");
		this.setDesc("A recently broken sword. "
				+ "The smith should've taken up "
				+ "rowing.");
		this.setStr(-2);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(99);
		
		return this;
	}

}
