package card.equipment.roguedeck;

import card.equipment.Equipment;

public class MithrilArmor extends Equipment{
	
	public MithrilArmor() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Mithril Armor.");
		this.setDesc("Picked up off the corpse of a halfing. You called dibs, after all.");
		this.setStr(99);
		this.setDex(1);
		this.setCon(4);
		this.setIntell(99);

		return this;
	}
}