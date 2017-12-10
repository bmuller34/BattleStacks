package card.equipment.roguedeck;

import card.equipment.Equipment;

public class TwinDaggers extends Equipment{

	public TwinDaggers() {}

	public Equipment initialize() {
		this.setGeneralUse(false);

		this.setName("Dual-Weilding Daggers");
		this.setDesc("Two daggers, held backwards--not exactly practical but it looks cool.");
		this.setStr(2);
		this.setDex(2);
		this.setCon(99);
		this.setIntell(-2);

		return this;
	}
}