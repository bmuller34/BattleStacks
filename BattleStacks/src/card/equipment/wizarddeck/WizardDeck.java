package card.equipment.wizarddeck;

import card.equipment.Equipment;
import deck.Stack;

/**
 * 
 * @author Brian Muller & Matthew Foster
 * 
 * This method creates a Deck of Cards for the Wizard Character.
 * 
 * These cards are specific for this Character and an addCharacterDeck
 * is needed to be implemented.
 * 
 * The method will return a Stack of Equipment Cards containing the Cards
 * relevant to the Wizard.
 *
 */
public class WizardDeck {
	private Burninator burn = new Burninator();
	private CursedDie cd = new CursedDie();
	private IceSpell is = new IceSpell();
	private MagicMissile mm = new MagicMissile();
	private MuscleWizard mw = new MuscleWizard();
	private Phylactery ph = new Phylactery();
	private WizardRobe wr = new WizardRobe();
	private WizardWand ww = new WizardWand();

	public WizardDeck() {}

	public Stack<Equipment> addCharacterDeck() {
		Stack<Equipment> wizardDeck = new Stack<Equipment>();
		wizardDeck.push(burn.initialize());
		wizardDeck.push(cd.initialize());
		wizardDeck.push(is.initialize());
		wizardDeck.push(mm.initialize());
		wizardDeck.push(mw.initialize());
		wizardDeck.push(ph.initialize());
		wizardDeck.push(wr.initialize());
		wizardDeck.push(ww.initialize());
		
		return wizardDeck;
	}
}
