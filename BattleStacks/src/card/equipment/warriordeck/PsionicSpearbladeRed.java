package card.equipment.warriordeck;

import card.equipment.Equipment;

public class PsionicSpearbladeRed extends Equipment{
	
	public PsionicSpearbladeRed() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Psionic Spearblade (Red)");
		this.setDesc("Because Lightsaber is copyrighted...");
		this.setStr(3);
		this.setDex(3);
		this.setCon(1);
		this.setIntell(0);
		
		return this;
	}
}