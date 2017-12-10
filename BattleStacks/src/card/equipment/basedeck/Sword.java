package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Sword.
 *
 */
public class Sword extends Equipment{

	public Sword() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("A Trusty Sword");
		this.setDesc("Whose trusty sword is it? Look, let's not worry about it. "
				+ "It's trusty! You can trust it!");
		this.setStr(1);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(0);
		
		return this;
	}

}
