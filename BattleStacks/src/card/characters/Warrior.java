package card.characters;
/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Character, The Warrior.
 * 
 * Here, the starting values are initialized and outputted.
 * 
 * Additionally, the two specific abilities are determined.
 *
 * TO-DO List:
 *
 * 1) Add 8 Character-specific cards and methods to load them into a Deck.
 * 
 */
public class Warrior extends Character{

	public Warrior() {}

	// initializes Character's starting attributes
	public Warrior initialize() {

		// set Character Class
		this.setCharClass("Warrior");

		// set initial stats
		this.setName("Fightman Fistbump, the Warrior");
		this.setDesc("He likes to swing things... just don't ask him how often.");
		this.setStr(5);
		this.setDex(2);
		this.setCon(4);
		this.setIntell(1);

		// set crit chance & class weights
		this.setCrit(20);
		this.setHPWeight(2);
		this.setPDefWeight(2);
		this.setMDefWeight(1);

		// calculate derived stats and output info about Character
		this.calculateStats();

		return this;
	}
}
