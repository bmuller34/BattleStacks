package card.characters;
/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Character, Norm The Human.
 * 
 * Here, Norm's starting values are initialized and outputted.
 * 
 * Additionally, his two specific abilities are determined.
 * 
 * Note that this contains a main method to help with debugging
 * how created Characters output. The actual class will not contain
 * a main as it is not a point of entry for the program, only a reference.
 * 
 */
public class Test_Character_Norm {

	public static void main(String[] args) {
		Character Norm = new Character();

		// output info about Norm--should be default values (70 hp, 10 initiative, rest are 0 or null)
		Norm.getInfo();
		System.out.println();
		System.out.println();

		// set initial stats
		Norm.setName("Norm the Human");
		Norm.setDesc("Nothing special about this person whatsoever.");
		Norm.setStr(3);
		Norm.setDex(3);
		Norm.setCon(3);
		Norm.setIntell(3);

		// set crit chance & class weights
		Norm.setCrit(20);
		Norm.setHPWeight(2);
		Norm.setPDefWeight(2);
		Norm.setMDefWeight(2);

		// output info about Norm
		Norm.calculateStats();
		Norm.getInfo();
		System.out.println("Ability One Damage: " + ability1());
		System.out.println("Ability Two Damage: " + ability2());
	}

	// define Norm's two specific abilities
	private static int ability1() {
		return 25;
	}
	
	private static int ability2() {
		return 15;
	}
}