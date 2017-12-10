package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, CursedStilts.
 *
 */
public class CursedStilts extends Equipment{

	public CursedStilts() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Cursed Stilts");
		this.setDesc("Somehow, a pair of cursed,"
				+ " wobbly stilts adhered themselves "
				+ "to your legs!");
		this.setStr(99);
		this.setDex(-2);
		this.setCon(99);
		this.setIntell(99);
		
		return this;
	}

}
