package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Shield.
 *
 */
public class Shield extends Equipment{

	public Shield() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Wooden Shield");
		this.setDesc("A simple chunk of wood "
				+ "fashioned into a shield. "
				+ "Quite useless.");
		this.setStr(99);
		this.setDex(0);
		this.setCon(1);
		this.setIntell(99);
		
		return this;
	}

}
