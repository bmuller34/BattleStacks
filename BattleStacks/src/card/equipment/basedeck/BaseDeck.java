package card.equipment.basedeck;

import card.equipment.Equipment;
import deck.Stack;

public class BaseDeck {
	private Armor armor = new Armor();
	private BrokenSword bs = new BrokenSword();
	private BubonicPlague bp = new BubonicPlague();
	private Cloak cloak = new Cloak();
	private CursedStilts cs = new CursedStilts();
	private Dagger dagger = new Dagger();
	private DunceCap dc = new DunceCap();
	private Shield shield = new Shield();
	private Spear spear = new Spear();
	private Spellbook sb = new Spellbook();
	private Sword sword = new Sword();
	private WizardStaff ws = new WizardStaff();
	
	public BaseDeck() {}
	
	public Stack<Equipment> addBaseDeck() {
		Stack<Equipment> baseDeck = new Stack<Equipment>();
		baseDeck.push(armor.initialize());
		baseDeck.push(bs.initialize());
		baseDeck.push(bp.initialize());
		baseDeck.push(cloak.initialize());
		baseDeck.push(cs.initialize());
		baseDeck.push(dagger.initialize());
		baseDeck.push(dc.initialize());
		baseDeck.push(shield.initialize());
		baseDeck.push(spear.initialize());
		baseDeck.push(sb.initialize());
		baseDeck.push(sword.initialize());
		baseDeck.push(ws.initialize());

		return baseDeck;
	}
}
