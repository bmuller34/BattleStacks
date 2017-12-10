package card.characters;

import calculations.Calculations;
import card.Card;

/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * NOTES:
 * -Characters that have special abilities should have those abilities defined
 * 	in the class file for that specific file to avoid overlap.
 * 
 * 
 * Weighted Values below must be defined within a specific Hero's class
 * 
 * 1) Hit Points
 * 2) P.Def
 * 3) M.Def
 */
public class Character extends Card{

	public Character() {}

	/****************Defines Character Class****************/
	private String charClass;

	/****************Defines Derived Stats****************/
	private int hp = 70;
	private int init = 10;
	private int pAttack; // used to determine standard attack damage?
	private int mAttack; // used to determine standard magic attack?
	private int pDef;
	private int mDef;
	private int crit = 20;

	/****************Values for Modifiers****************/
	private int strMod;
	private int dexMod;
	private int intMod;
	private int conMod;
	private int miscMod;

	/****************Weighted Values for Derived Stats****************/
	private int hpWeight;
	private int pDefWeight;
	private int mDefWeight;
	
	/****************Special Class Variables****************/
	private int specialTurns;
	private int temp1;
	private int temp2;

	/****************Getters and Setters for Derived Stats****************/
	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public int getHP() {
		return hp;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}

	public int getInit() {
		return init;
	}

	public void setInit(int init) {
		this.init = init;
	}

	public int getPAttack() {
		return pAttack;
	}

	public void setPAttack(int pAttack) {
		this.pAttack = pAttack;
	}

	public int getMAttack() {
		return mAttack;
	}

	public void setMAttack(int mAttack) {
		this.mAttack = mAttack;
	}

	public int getPDef() {
		return pDef;
	}

	public void setPDef(int pDef) {
		this.pDef = pDef;
	}

	public int getMDef() {
		return mDef;
	}

	public void setMDef(int mDef) {
		this.mDef = mDef;
	}

	public int getCrit() {
		return crit;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}

	/****************Getters and Setters for Modifiers****************/
	public int getStrMod() {
		return strMod;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}

	public int getDexMod() {
		return dexMod;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}

	public int getIntMod() {
		return intMod;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}

	public int getConMod() {
		return conMod;
	}

	public void setConMod(int conMod) {
		this.conMod = conMod;
	}

	public int getMiscMod() {
		return miscMod;
	}

	public void setMiscMod(int newMod) {
		this.miscMod = newMod;
	}

	public void resetMod() {
		this.miscMod = 0;
	}

	/****************Getters and Setters for Derived Values****************/
	public int getHPWeight() {
		return hpWeight;
	}

	public void setHPWeight(int hpWeight) {
		this.hpWeight = hpWeight;
	}

	public int getPDefWeight() {
		return pDefWeight;
	}

	public void setPDefWeight(int pDefWeight) {
		this.pDefWeight = pDefWeight;
	}

	public int getMDefWeight() {
		return mDefWeight;
	}

	public void setMDefWeight(int mDefWeight) {
		this.mDefWeight = mDefWeight;
	}
	
	/****************Getters and Setters for Special Class Variables****************/
	public int getSpecialTurns() {
		return specialTurns;
	}

	public void setSpecialTurns(int specialTurns) {
		this.specialTurns = specialTurns;
	}
	
	public int getTemp1() {
		return temp1;
	}

	public void setTemp1(int temp1) {
		this.temp1 = temp1;
	}
	
	public int getTemp2() {
		return temp2;
	}

	public void setTemp2(int temp2) {
		this.temp2 = temp2;
	}

	// calculates and assigns all stats for a Character
	public void calculateStats() {
		Calculations c = new Calculations();
		this.setHP(c.calcHitPoints(this));
		this.setInit(c.calcInitiatve(this));
		this.setPAttack(c.calcStandardPAttack(this));
		this.setMAttack(c.calcStandardMAttack(this));
		this.setPDef(c.calcPDef(this));
		this.setMDef(c.calcMDef(this));
		this.setCrit(c.calcCrit(this));
	}

	// calculates stats and outputs all information about Character
	public void getInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Class: " + this.getCharClass());
		System.out.println("Description: " + this.getDesc());
		System.out.println("Strength: " + this.getStr());
		System.out.println("Dexterity: " + this.getDex());
		System.out.println("Constitution: " + this.getCon());
		System.out.println("Intelligence: " + this.getIntell());
		System.out.println("Hit Points: " + this.getHP());
		System.out.println("Initiative: " + this.getInit());
		System.out.println("Physical Attack: " + this.getPAttack());
		System.out.println("Magical Attack: " + this.getMAttack());
		System.out.println("Physical Defense: " + this.getPDef());
		System.out.println("Magical Defense: " + this.getMDef());
		System.out.println("Critical Chance: " + this.getCrit());
		System.out.println("HP Weight: " + this.getHPWeight());
		System.out.println("P.Def Weight: " + this.getPDefWeight());
		System.out.println("M.Def Weight: " + this.getMDefWeight());
	}

	private int ability1() {
		if (charClass == "Knight") {
			int dmg = (0 + (4 * (this.getCon() + this.getConMod())) + this.getMiscMod());
			return dmg;
		} else if (charClass == "Warrior") {
			int dmg = (15 + (4 * (this.getStr() + this.getStrMod())) + this.getMiscMod());
			return dmg;
		} else if (charClass == "Rogue") {
			int dmg = (8 + (4 * (this.getStr() + this.getStrMod())) + this.getMiscMod());
			double crit = Math.floor(Math.random() * ((20 - 1) + 1) + 1);
			if (crit >= (this.getCrit() - 4)) {
				dmg *= 3;
			}
			return dmg;
		} else if (charClass == "Wizard") {
			int dmg = (8 + (2 * (this.getIntell() + this.getIntMod())) + this.getMiscMod());
			return dmg;
		} return 99;
	}

	public int useAbility1() {
		return ability1();
	}
	
	private int ability1NoCrit() {
		int dmg = (8 + (4 * (this.getStr() + this.getStrMod())) + this.getMiscMod());
		return dmg;
	}

	public void listAbilities() {
		System.out.println("1) Standard Attack: " + this.getPAttack() + " attack power"
				+ "\nDescription: A standard attack with your primary weapon.");
		if (charClass == "Warrior") {
			System.out.println("2) Special: " + this.useAbility1() + " attack power"
					+ "\nDescription: A powerful attack, takes two turns.\n");
		} else if (charClass == "Knight") {
			System.out.println("2) Special: " + this.useAbility1() + " defense power"
					+ "\nDescription: Raises your shield, reduces incoming damage until next turn.\n");
		} else if (charClass == "Rogue") {
			System.out.println("2) Special: " + this.ability1NoCrit() + "x3(if crit) attack power"
					+ "\nDescription: Sticks 'em with the pointy end in a spot you're pretty sure\n"
					+ " you remember hearing was important. Increases chance of Critical Strike.\n");
		} else if (charClass == "Wizard") {
			System.out.println("2) Special: " + this.useAbility1() 
			+ "\nDescription: Evokes primal forces that assault your opponent.\n");
		}
	}
}