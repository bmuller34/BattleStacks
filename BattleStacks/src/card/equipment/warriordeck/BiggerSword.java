package card.equipment.warriordeck;

import card.equipment.Equipment;

public class BiggerSword extends Equipment{
	
	public BiggerSword() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Even Larger Greatsword");
		this.setDesc("Frankly this is starting to get a bit ridiculous.");
		this.setStr(4);
		this.setDex(-2);
		this.setCon(2);
		this.setIntell(-1);
		
		return this;
	}
}