package card.equipment.roguedeck;

import card.equipment.Equipment;
import deck.Stack;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Rogue Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Rogue.
 *
 */
public class RogueDeck {
	private BootsOfSwiftness bos = new BootsOfSwiftness();
	private BowOfFortune bof = new BowOfFortune();
	private CardboardBox cb = new CardboardBox();
	private CheapShot cs = new CheapShot();
	private MaskOfTheShadow mots = new MaskOfTheShadow();
	private MithrilArmor ma = new MithrilArmor();
	private PoulticeOfIntellect poi = new PoulticeOfIntellect();
	private TwinDaggers td = new TwinDaggers();
	
	public RogueDeck() {}

	public Stack<Equipment> addCharacterDeck() {
		Stack<Equipment> rogueDeck = new Stack<Equipment>();
		rogueDeck.push(bos.initialize());
		rogueDeck.push(bof.initialize());
		rogueDeck.push(cb.initialize());
		rogueDeck.push(cs.initialize());
		rogueDeck.push(mots.initialize());
		rogueDeck.push(ma.initialize());
		rogueDeck.push(poi.initialize());
		rogueDeck.push(td.initialize());
		
		return rogueDeck;
	}
}
