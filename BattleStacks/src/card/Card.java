package card;
/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 *
 * This class file acts as a Parent for all others cards. Each file that can be a "Card"
 * extend from this class and implement methods specific for that class.
 * 
 * i.e.: Characters will be Cards but have unique "derived" values that are implemented
 * for Characters.
 *
 * TO-DO: 
 * 
 * 1) Finalize formulas for derived stats
 * 2) Determine which variables belong in the parent/children
 * 3) Finish Card_Sword profile and output default values
 */
public class Card {
	
	// constructor for Card
	public Card() {}
	
	/****************Defines Flavortext****************/
	private String name;
	private String desc;

	/****************Defines Base Stats****************/
	private int str;
	private int dex;
	private int con;
	private int intell;
	
	/****************Getters and Setters for Flavortext****************/
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/****************Getters and Setters for Base Stats****************/
	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntell() {
		return intell;
	}

	public void setIntell(int intell) {
		this.intell = intell;
	}
	
	public void getInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Description: " + this.getDesc());
		System.out.println("Strength: " + this.getStr());
		System.out.println("Dexterity: " + this.getDex());
		System.out.println("Constitution: " + this.getCon());
		System.out.println("Intelligence: " + this.getIntell());
	}
}