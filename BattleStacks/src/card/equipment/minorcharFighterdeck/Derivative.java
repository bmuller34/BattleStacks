package card.equipment.minorcharFighterdeck;

import card.equipment.Equipment;

public class Derivative extends Equipment {
	public Derivative() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Derivative of Grog");
		this.setDesc("Grog live long to study.");
		this.setStr(99);
		this.setDex(-1);
		this.setCon(4);
		this.setIntell(3);
		
		return this;
	}
}