package card.characters;

public class MinorCharSteven extends Character {
		public MinorCharSteven() {}

		// initializes Character's starting attributes
		public MinorCharSteven initialize() {
			
			// set Character Class
			this.setCharClass("Steve from Accounting");
			
			// set initial stats
			this.setName("Steve from Accounting");
			this.setDesc("A strange traveller from a foreign land laden with advanced technology. He claims he is a Nacireman.");
			this.setStr(1);
			this.setDex(2);
			this.setCon(2);
			this.setIntell(5);

			// set crit chance & class weights
			this.setCrit(20);
			this.setHPWeight(2);
			this.setPDefWeight(1);
			this.setMDefWeight(3);

			// calculate derived stats and output info about Character
			this.calculateStats();
			
			return this;
		}
}
