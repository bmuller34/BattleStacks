package card.equipment.warriordeck;

import card.equipment.Equipment;

public class PsionicSpearbladeBlue extends Equipment{
	
	public PsionicSpearbladeBlue() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Psionic Spearblade (Blue)");
		this.setDesc("Because Lightsaber is copyrighted...");
		this.setStr(1);
		this.setDex(3);
		this.setCon(3);
		this.setIntell(0);
		
		return this;
	}
}