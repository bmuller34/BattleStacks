package calculations;
import card.characters.Character;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This class contains calculations for various derived stats for the Character.
 * 
 * This class might only be used when playing Equipment cards. Afterwards,
 * during actual battles, different calculations may be used. Maybe.
 *
 */
public class Calculations {

	public Calculations() {}

	/***************Generic Calculations***************/
	public int calcHitPoints(Character c) {
		int hp = (70 + (5 * c.getHPWeight()) + (5 * (c.getCon() + c.getConMod() + c.getMiscMod())));
		return hp;
	}

	public int calcInitiatve(Character c) {
		int init = (10 + (c.getDex() + c.getDexMod()) + c.getMiscMod());
		return init;
	}

	public int calcStandardPAttack(Character c) {
		int pAtk = (0 + (4 * (c.getStr() + c.getStrMod())) + c.getMiscMod());
		return pAtk;
	}

	public int calcStandardMAttack(Character c) {
		int mAtk = (0 + (2 * (c.getIntell() + c.getIntMod())) + c.getMiscMod());
		return mAtk;
	}

	public int calcPDef(Character c) {
		int pDef = ((3 * c.getPDefWeight()) + (c.getCon() + c.getConMod()) + (c.getStr() + c.getStrMod()));
		return pDef;
	}

	public int calcMDef(Character c) {
		int mDef = ((c.getMDefWeight()) + (c.getCon() + c.getConMod()) + (c.getIntell() + c.getIntMod()));
		return mDef;
	}

	public int calcCrit(Character c) {
		return c.getCrit();
	}
}