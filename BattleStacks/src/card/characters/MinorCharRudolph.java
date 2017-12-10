package card.characters;

public class MinorCharRudolph extends Character 
{
	public MinorCharRudolph() {}

	// initializes Character's starting attributes
	public MinorCharRudolph initialize() {
		
		// set Character Class
		this.setCharClass("Rudolph the Brown-Nosed Jester");
		
		// set initial stats
		this.setName("Rudolph the Brown-Nosed Jester");
		this.setDesc("What an excellent decision you made to choose me, milord!");
		this.setStr(2);
		this.setDex(1);
		this.setCon(5);
		this.setIntell(1);

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
