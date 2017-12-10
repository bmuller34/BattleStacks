package card.equipment.warriordeck;

import card.equipment.Equipment;

public class BoardAndNail extends Equipment{
	
	public BoardAndNail() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("A 2x4 with a Nail in it");
		this.setDesc("Simple but effective. Might contain tetnus.");
		this.setStr(2);
		this.setDex(99);
		this.setCon(99);
		this.setIntell(0);
		
		return this;
	}
}