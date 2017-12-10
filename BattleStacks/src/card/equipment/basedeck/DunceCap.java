package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, DunceCap.
 *
 */
public class DunceCap extends Equipment{

	public DunceCap() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Dunce Cap of Dag'aroth");
		this.setDesc("The days of getting "
				+ "scolded by your teachers "
				+ "are coming back to haunt you!");
		this.setStr(99);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(-2);
		
		return this;
	}

}
