package card.characters;
/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Character, The Rogue.
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
public class Rogue extends Character{

	public Rogue() {}

	// initializes Character's starting attributes
	public Rogue initialize() {

		// set Character Class
		this.setCharClass("Rogue");

		// set initial stats
		this.setName("Roguish Roguey, the Rogue");
		this.setDesc("Puckish Rogue by day, Ruckish Pogue by night.");
		this.setStr(2);
		this.setDex(5);
		this.setCon(2);
		this.setIntell(3);

		// set crit chance & class weights
		this.setCrit(19);
		this.setHPWeight(1);
		this.setPDefWeight(2);
		this.setMDefWeight(1);

		// calculate derived stats and output info about Character
		this.calculateStats();

		return this;
	}
}
