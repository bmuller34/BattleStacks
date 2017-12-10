package card.characters;
/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Character, The Knight.
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
public class Knight extends Character{

	public Knight() {}

	// initializes Character's starting attributes
	public Knight initialize() {
		
		// set Character Class
		this.setCharClass("Knight");
		
		// set initial stats
		this.setName("Sir Twenty of House Goodmen, the Knight");
		this.setDesc("The bigger they are, they harder they fall. Deus vult.");
		this.setStr(3);
		this.setDex(1);
		this.setCon(5);
		this.setIntell(3);

		// set crit chance & class weights
		this.setCrit(20);
		this.setHPWeight(3);
		this.setPDefWeight(3);
		this.setMDefWeight(3);

		// calculate derived stats and output info about Character
		this.calculateStats();
		
		return this;
	}
}
