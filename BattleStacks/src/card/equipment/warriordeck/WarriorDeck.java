package card.equipment.warriordeck;

import card.equipment.Equipment;
import deck.Stack;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Warrior Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Warrior.
 *
 */
public class WarriorDeck {
	private BigSword bs1 = new BigSword();
	private BiggerSword bs2 = new BiggerSword();
	private BiggestSword bs3 = new BiggestSword();
	private BlackSwordsmanArmor bsa = new BlackSwordsmanArmor();
	private BoardAndNail ban = new BoardAndNail();
	private HoldMyAle hma = new HoldMyAle();
	private PsionicSpearbladeRed psr = new PsionicSpearbladeRed();
	private PsionicSpearbladeBlue psb = new PsionicSpearbladeBlue();

	public WarriorDeck() {}

	public Stack<Equipment> addCharacterDeck() {
		Stack<Equipment> warriorDeck = new Stack<Equipment>();
		warriorDeck.push(bs1.initialize());
		warriorDeck.push(bs2.initialize());
		warriorDeck.push(bs3.initialize());
		warriorDeck.push(bsa.initialize());
		warriorDeck.push(ban.initialize());
		warriorDeck.push(hma.initialize());
		warriorDeck.push(psr.initialize());
		warriorDeck.push(psb.initialize());
		
		return warriorDeck;
	}
}
