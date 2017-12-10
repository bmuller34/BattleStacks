package card.equipment.minorcharStevedeck;

import card.equipment.Equipment;

public class HondaCivic extends Equipment
{
public HondaCivic() {}
	
	public Equipment initialize() {
		this.setGeneralUse(true);

		this.setName("Honda Civic");
		this.setDesc("A reliable car for a reliable man.");
		this.setStr(4);
		this.setDex(0);
		this.setCon(4);
		this.setIntell(99);
		
		return this;
	}
}

