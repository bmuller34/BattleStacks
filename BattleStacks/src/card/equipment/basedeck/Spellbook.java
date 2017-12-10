package card.equipment.basedeck;

import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Spellbook.
 *
 */
public class Spellbook extends Equipment{

	public Spellbook() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Spellbook");
		this.setDesc("A Magic tome containing "
				+ "passages of basic spells. "
				+ "On further inspection, it "
				+ "appears to read 'Spellcasting"
				+ " For Dunces'.");
		this.setStr(0);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(1);
		
		return this;
	}

}
