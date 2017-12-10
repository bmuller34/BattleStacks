package card.equipment;

import card.equipment.basedeck.Armor;
import card.equipment.basedeck.BrokenSword;
import card.equipment.basedeck.BubonicPlague;
import card.equipment.basedeck.Cloak;
import card.equipment.basedeck.CursedStilts;
import card.equipment.basedeck.Dagger;
import card.equipment.basedeck.DunceCap;
import card.equipment.basedeck.Shield;
import card.equipment.basedeck.Spear;
import card.equipment.basedeck.Spellbook;
import card.equipment.basedeck.Sword;
import card.equipment.basedeck.WizardStaff;

public class Test_BasicCards {

	public static void main(String[] args) {
		Sword Sword = new Sword();
		
		Sword.initialize();
		Sword.getInfo();
		
		System.out.println();
		
		Spear Spear = new Spear();
		
		Spear.initialize();
		Spear.getInfo();

		System.out.println();
		
		Cloak Cloak = new Cloak();
		
		Cloak.initialize();
		Cloak.getInfo();

		System.out.println();
		
		Dagger Dagger = new Dagger();
		
		Dagger.initialize();
		Dagger.getInfo();

		System.out.println();
		
		Spellbook Spellbook = new Spellbook();
		
		Spellbook.initialize();
		Spellbook.getInfo();

		System.out.println();
		
		WizardStaff WizardStaff = new WizardStaff();
		
		WizardStaff.initialize();
		WizardStaff.getInfo();

		System.out.println();
		
		Shield Shield = new Shield();
		
		Shield.initialize();
		Shield.getInfo();

		System.out.println();
		
		Armor Armor = new Armor();
		
		Armor.initialize();
		Armor.getInfo();

		System.out.println();
		
		BrokenSword BrokenSword = new BrokenSword();
		
		BrokenSword.initialize();
		BrokenSword.getInfo();

		System.out.println();
		
		CursedStilts CursedStilts = new CursedStilts();
		CursedStilts.initialize();
		CursedStilts.getInfo();

		System.out.println();
		
		DunceCap DunceCap = new DunceCap();
		
		DunceCap.initialize();
		DunceCap.getInfo();

		System.out.println();
		
		BubonicPlague BubonicPlague = new BubonicPlague();
		
		BubonicPlague.initialize();
		BubonicPlague.getInfo();
	}

}
