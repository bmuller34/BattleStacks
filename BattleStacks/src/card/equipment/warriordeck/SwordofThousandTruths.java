package card.equipment.warriordeck;

import card.equipment.Equipment;

public class SwordofThousandTruths extends Equipment{
	
	public SwordofThousandTruths() {}
	
	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Sword of a Thousand Truths");
		this.setDesc("They say this sword whispers secrets to its user. It hasn't said anything to me though.");
		this.setStr(3);
		this.setDex(-2);
		this.setCon(99);
		this.setIntell(2);
		
		return this;
	}
}
