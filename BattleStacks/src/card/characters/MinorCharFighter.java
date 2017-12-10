package card.characters;

public class MinorCharFighter extends Character
{
	public MinorCharFighter() {}

	// initializes Character's starting attributes
	public MinorCharFighter initialize() {
		
		// set Character Class
		this.setCharClass("Backup Fighter");
		
		// set initial stats
		this.setName("Grog the Strong");
		this.setDesc("Grog smash. Grog find derivative.");
		this.setStr(5);
		this.setDex(1);
		this.setCon(5);
		this.setIntell(3);

		// set crit chance & class weights
		this.setCrit(20);
		this.setHPWeight(3);
		this.setPDefWeight(2);
		this.setMDefWeight(1);

		// calculate derived stats and output info about Character
		this.calculateStats();
		
		return this;
	}
}