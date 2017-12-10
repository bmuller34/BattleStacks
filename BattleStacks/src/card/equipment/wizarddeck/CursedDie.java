package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class CursedDie extends Equipment{
	
	public CursedDie() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Cursed Die");
		this.setDesc("Ill magick makes it easy to cheat with this cursed d6.");
		this.setStr(0);
		this.setDex(3);
		this.setCon(0);
		this.setIntell(99);
		
		return this;
	}
}