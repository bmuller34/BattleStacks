package card.equipment;
/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains a Test Equipment, Sword.
 *
 */
public class Test_Equipment_Sword {

	public static void main (String[] args) {
		Equipment Sword = new Equipment();
		Sword.getInfo();
		
		Sword.setGeneralUse(true);
		
		Sword.setName("A Trusty Sword");
		Sword.setDesc("Whose trusty sword is it? Look, let's not worry about it. "
				+ "It's trusty! You can trust it!");
		Sword.setStr(4);
		Sword.setDex(4);
		Sword.setCon(4);
		Sword.setIntell(4);
		
		System.out.println();
		System.out.println();
		
		Sword.getInfo();
	}
}