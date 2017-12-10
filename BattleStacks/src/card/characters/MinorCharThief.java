package card.characters;

public class MinorCharThief extends Character
{
	public MinorCharThief() {}

	// initializes Character's starting attributes
	public MinorCharThief initialize() {
		
		// set Character Class
		this.setCharClass("Buddy Thief");
		
		// set initial stats
		this.setName("Pik the Child Thief");
		this.setDesc("An artful dodger.");
		this.setStr(2);
		this.setDex(5);
		this.setCon(1);
		this.setIntell(3);

		// set crit chance & class weights
		this.setCrit(20);
		this.setHPWeight(1);
		this.setPDefWeight(2);
		this.setMDefWeight(3);

		// calculate derived stats and output info about Character
		this.calculateStats();
		
		return this;
	}
}