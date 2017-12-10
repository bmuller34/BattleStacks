package card.equipment.minorcharThiefdeck;

import card.equipment.Equipment;

public class WhatAnAss extends Equipment{
	
	public WhatAnAss() {}

	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("What An Ass...");
		this.setDesc("Unleashes a crippling barrage of Yo Momma jokes.");
		this.setStr(-2);
		this.setDex(-2);
		this.setCon(-2);
		this.setIntell(-2);

		return this;
	}
}
