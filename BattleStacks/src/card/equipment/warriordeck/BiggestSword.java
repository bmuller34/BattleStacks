package card.equipment.warriordeck;

import card.equipment.Equipment;

public class BiggestSword extends Equipment{
	
	public BiggestSword() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("The Largest Greatsword");
		this.setDesc("It's time to stop.");
		this.setStr(5);
		this.setDex(-2);
		this.setCon(-1);
		this.setIntell(-2);
		
		return this;
	}
}