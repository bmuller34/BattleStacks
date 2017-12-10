package card.equipment.warriordeck;

import card.equipment.Equipment;

public class BlackSwordsmanArmor extends Equipment{
	
	public BlackSwordsmanArmor() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Blackswordsman Armor");
		this.setDesc("You say this is armor but this is just another sword.");
		this.setStr(1);
		this.setDex(-1);
		this.setCon(4);
		this.setIntell(0);
		
		return this;
	}
}