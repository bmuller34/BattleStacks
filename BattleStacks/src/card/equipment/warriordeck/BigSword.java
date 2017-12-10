package card.equipment.warriordeck;

import card.equipment.Equipment;

public class BigSword extends Equipment{
	
	public BigSword() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Large Greatsword");
		this.setDesc("It's big and it's a sword.");
		this.setStr(3);
		this.setDex(-1);
		this.setCon(99);
		this.setIntell(0);
		
		return this;
	}
}