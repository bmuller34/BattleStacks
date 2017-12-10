package card.equipment.wizarddeck;

import card.equipment.Equipment;

public class Burninator extends Equipment{
	
	public Burninator() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Spell of the Burninator");
		this.setDesc("Not safe for anyone, including the caster.");
		this.setStr(-2);
		this.setDex(99);
		this.setCon(-2);
		this.setIntell(5);
		
		return this;
	}
}
