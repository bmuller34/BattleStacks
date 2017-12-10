package card.equipment.minorcharStevedeck;

import card.equipment.Equipment;

public class Calculator extends Equipment
{
public Calculator() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("TI-84 Silver Edition Calculator");
		this.setDesc("It even does derivatives.");
		this.setStr(1);
		this.setDex(99);
		this.setCon(0);
		this.setIntell(5);
		
		return this;
	}
}
