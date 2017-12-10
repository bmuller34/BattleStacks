package card.equipment.roguedeck;

import card.equipment.Equipment;

public class MaskOfTheShadow extends Equipment{
	
	public MaskOfTheShadow() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Concealing Mask of the Shadow");
		this.setDesc("A black, leather piece of cloth "
				+ "with two holes cut for eyes. "
				+ "Somehow this makes you unrecognizable to others.");
		this.setStr(0);
		this.setDex(4);
		this.setCon(1);
		this.setIntell(99);
		
		return this;
	}
}
