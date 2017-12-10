package card.characters;
/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Character, The Wizard.
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
public class Wizard extends Character{

	public Wizard() {}

	// initializes Character's starting attributes
	public Wizard initialize() {

		// set Character Class
		this.setCharClass("Wizard");
		
		// set initial stats
		this.setName("Gundorf the Wizard, the Wizard");
		this.setDesc("PEW PEW PEW.");
		this.setStr(1);
		this.setDex(3);
		this.setCon(3);
		this.setIntell(5);

		// set crit chance & class weights
		this.setCrit(20);
		this.setHPWeight(2);
		this.setPDefWeight(2);
		this.setMDefWeight(2);

		// calculate derived stats and output info about Character
		this.calculateStats();

		return this;
	}
}
