package card.equipment.knightdeck;

import card.equipment.Equipment;
import deck.Stack;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Knight Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Knight.
 *
 */
public class KnightDeck {
	private BountifulSunlight bs = new BountifulSunlight();
	private ChainmailOfTheGods kte = new ChainmailOfTheGods();
	private CovenantOfTheDarkmoon cdm = new CovenantOfTheDarkmoon();
	private HolyScaleMailOfTheWhale hsmw = new HolyScaleMailOfTheWhale();
	private Lightbrand lb = new Lightbrand();
	private MoonlightBreaker mb = new MoonlightBreaker();
	private SunlightSpear ss = new SunlightSpear();
	private WrathOfTheGods wotg = new WrathOfTheGods();
	
	public KnightDeck() {}
	
	public Stack<Equipment> addCharacterDeck() {
		Stack<Equipment> knightDeck = new Stack<Equipment>();
		knightDeck.push(bs.initialize());
		knightDeck.push(kte.initialize());
		knightDeck.push(cdm.initialize());
		knightDeck.push(hsmw.initialize());
		knightDeck.push(lb.initialize());
		knightDeck.push(mb.initialize());
		knightDeck.push(ss.initialize());
		knightDeck.push(wotg.initialize());
		
		return knightDeck;
	}
}
