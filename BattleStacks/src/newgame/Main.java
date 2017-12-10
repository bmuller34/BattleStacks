package newgame;

import java.util.Scanner;

import card.characters.Knight;
import card.characters.MinorCharFighter;
import card.characters.MinorCharRudolph;
import card.characters.MinorCharSteven;
import card.characters.MinorCharThief;
import card.characters.Rogue;
import card.characters.Warrior;
import card.characters.Wizard;
import card.equipment.Equipment;
import card.equipment.basedeck.BaseDeck;
import card.equipment.knightdeck.KnightDeck;
import card.equipment.roguedeck.RogueDeck;
import card.equipment.warriordeck.WarriorDeck;
import card.equipment.wizarddeck.WizardDeck;
import deck.Deck;
import deck.Player;
import deck.Stack;

public class Main {

	public static void main(String[] args) {
		Player red = new Player();
		red.setTeamColor("Red");
		Player blue = new Player();
		blue.setTeamColor("Blue");

		welcome();
		viewCards();
		System.out.print("Player Red,");
		red = createPlayer();
		System.out.print("Player Blue,");
		blue = createPlayer();

		new Battle().start(red, blue);
	}

	public static void welcome() {
		System.out.println("Welcome to Battle Stacks!");
		System.out.println("\nYou must prepare your fighter to go up against your opponent in combat.");
		System.out.println("\nFirst choose your main champion, then choose two allies who will provide you with new pieces of equipment.");
		System.out.println("\nEquip your champion with strong cards, and use weak cards on your enemy. You can play two cards per turn.");
		System.out.println("\nTry to equip cards that synergize, as some cards use the stats of cards below them.\n");
	}
	
	public static Player validateMain(String s) {
		if (s.equals("1")) {
			Warrior warrior = new Warrior();
			Player war = new Player(warrior.initialize());
			war = pickSupport(war);
			return war;
		}
		else if (s.equals("2")) {
			Rogue rogue = new Rogue();
			Player rog = new Player(rogue.initialize());
			rog = pickSupport(rog);
			return rog;
		}
		else if (s.equals("3")) {
			Knight knight = new Knight();
			Player kni = new Player(knight.initialize());
			kni = pickSupport(kni);
			return kni;
		}
		else if (s.equals("4")) {
			Wizard wizard = new Wizard();
			Player wiz = new Player(wizard.initialize());
			wiz = pickSupport(wiz);
			return wiz;
		}
		else return null;
	}
	
	public static String checkMain(String s) {
		if (s.equals("1")) {
			return s;
		}
		else if (s.equals("2")) {
			return s;
		}
		else if (s.equals("3")) {
			return s;
		}
		else if (s.equals("4")) {
			return s;
		}
		else return null;
	}

	public static Player createPlayer() {
		System.out.println(" please enter the number of the Hero you wish to play as from the available options:"
				+ "\n\n1) Warrior"
				+ "\n2) Rogue"
				+ "\n3) Knight"
				+ "\n4) Wizard");

		Scanner kb = new Scanner(System.in);
		String entry = kb.nextLine();
		
		while (checkMain(entry) == null) {
			System.out.println("Sorry, try again!");
			entry = kb.nextLine();
		}
		return validateMain(entry);
	}

	public static Player pickSupport(Player p) {
		String[] arr = {"The Fighter", "Rudolph, The Brown-Nosed", "Steve, from Accounting", "The Thief"};
		System.out.println("Please enter the number of the first Support you wish to use from the available options:"
				+ "\n\n1) The Fighter"
				+ "\n2) Rudolph, The Brown-Nosed"
				+ "\n3) Steve, from Accounting"
				+ "\n4) The Thief");

		Scanner kb = new Scanner(System.in);
		String entry1 = kb.nextLine();

		while ((Integer.parseInt(entry1) - 1) < 0 || (Integer.parseInt(entry1) - 1) > 3) {
			System.out.println("Sorry, try again!");
			entry1 = kb.nextLine();
		}
		//if valid, ask for second
		if (validateSup(arr[Integer.parseInt(entry1) - 1], p) != null) {
			arr[Integer.parseInt(entry1) - 1] = null;
			int j = 0;
			String[] newArr = new String[3];
			System.out.println("Please enter the second Support you wish to use:\n");
			for (int i = 0; i < arr.length; i++ ) {
				if (arr[i] == null)
					continue;
				newArr[j] = arr[i];
				System.out.println(j + 1 + ") " + newArr[j]);
				j++;
			}
			String entry2 = kb.nextLine();
			
			while ((Integer.parseInt(entry2) - 1) < 0 || (Integer.parseInt(entry2) - 1) > 2) {
				System.out.println("Sorry, try again!");
				entry1 = kb.nextLine();
			}

			//validate second, add both to Stack, return result
			if (validateSup(newArr[Integer.parseInt(entry2) - 1], p) != null) {
				return p;
			} else return null;
		}
		else return null;
	}

	//validate against listed string options
	public static String validateSup(String s, Player p) {
		if (s.equals("The Fighter")) {
			p.initializeSupport(new MinorCharFighter().initialize());
			return s;
		} else if (s.equals("Rudolph, The Brown-Nosed")) {
			p.initializeSupport(new MinorCharRudolph().initialize());
			return s;
		} else if (s.equals("Steve, from Accounting")) {
			p.initializeSupport(new MinorCharSteven().initialize());
			return s;
		} else if (s.equals("The Thief")) {
			p.initializeSupport(new MinorCharThief().initialize());
			return s;
		} else return null;
	}

	public static void viewCards() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to view all cards and their effects? (y/n)");
		
		if (kb.nextLine().equals("y")) {
			Player show = new Player();
			BaseDeck bs = new BaseDeck();
			WarriorDeck wd = new WarriorDeck();
			KnightDeck kd = new KnightDeck();
			RogueDeck rd = new RogueDeck();
			WizardDeck wizd = new WizardDeck();
			Deck<Equipment> sups = new Deck<Equipment>();
			Stack<Equipment> box = new Stack<Equipment>();

			bs.addBaseDeck();
			wd.addCharacterDeck();
			kd.addCharacterDeck();
			rd.addCharacterDeck();
			wizd.addCharacterDeck();

			// explain numbers
			System.out.println("\n__________Legend__________"
					+ "\n\nName: Name of the card"
					+ "\nDescription: Brief description of the card" 
					+ "\nStrength: Influences Physical Atk/Def"
					+ "\nDexterity: Influences Initiative (Who goes first)"
					+ "\nConstitution: Influence HP/Physical Def/Magical Def"
					+ "\nIntelligence: Determines Magical Atk/Def"
					+ "\n\n-Values refer to modifiers, which are "
					+ "\nadded to a Character's base value."
					+ "\n\n-A value of 99 means the value is 'transparent', "
					+ "\nmeaning that the value of the card beneath it "
					+ "\non the stack takes effect.");

			try {
				Thread.sleep(23000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\nOutputting all cards...");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// show base deck
			box = bs.addBaseDeck();
			System.out.println("\n");
			System.out.println("**********************************************************************");
			System.out.println("Deck: Base Deck (12 Cards, Included with all Main Decks)");
			System.out.println("Type: Common");
			while (box.getSize() != 0) {
				System.out.println("**********************************************************************");
				System.out.println(box.peek());
				box.pop();
			}

			// show main characters
			// show Warrior
			box = wd.addCharacterDeck();
			System.out.println("\n");
			System.out.println("**********************************************************************");
			System.out.println("Deck: Warrior (8 Cards)");
			System.out.println("Type: Main");
			while (box.getSize() != 0) {
				System.out.println("**********************************************************************");
				System.out.println(box.peek());
				box.pop();
			}

			// show Knight
			box = kd.addCharacterDeck();
			System.out.println("\n");
			System.out.println("**********************************************************************");
			System.out.println("Deck: Knight (8 Cards)");
			System.out.println("Type: Main");
			while (box.getSize() != 0) {
				System.out.println("**********************************************************************");
				System.out.println(box.peek());
				box.pop();
			}

			// show Rogue
			box = rd.addCharacterDeck();
			System.out.println("\n");
			System.out.println("**********************************************************************");
			System.out.println("Deck: Rogue (8 Cards)");
			System.out.println("Type: Main");
			while (box.getSize() != 0) {
				System.out.println("**********************************************************************");
				System.out.println(box.peek());
				box.pop();
			}

			// show Wizard
			box = wizd.addCharacterDeck();
			System.out.println("\n");
			System.out.println("**********************************************************************");
			System.out.println("Deck: Wizard (8 Cards)");
			System.out.println("Type: Main");
			while (box.getSize() != 0) {
				System.out.println("**********************************************************************");
				System.out.println(box.peek());
				box.pop();
			}

			// show supports
			show.initializeSupport(new MinorCharFighter().initialize());
			System.out.println("\n");
			System.out.println("**********************************************************************");
			System.out.println("Deck: Fighter (5 Cards)");
			System.out.println("Type: Support");
			show.showDeck();
			System.out.println("\n");
			show.initializeSupport(new MinorCharRudolph().initialize());
			System.out.println("**********************************************************************");
			System.out.println("Deck: Rudolph, the Brown-Nosed Jester (5 Cards)");
			System.out.println("Type: Support");
			show.showDeck();
			System.out.println("\n");
			show.initializeSupport(new MinorCharSteven().initialize());
			System.out.println("**********************************************************************");
			System.out.println("Deck: Steve, from Accounting (5 Cards)");
			System.out.println("Type: Support");
			show.showDeck();
			System.out.println("\n");
			show.initializeSupport(new MinorCharThief().initialize());
			System.out.println("**********************************************************************");
			System.out.println("Deck: The Thief (5 Cards)");
			System.out.println("Type: Support");
			show.showDeck();
			System.out.println("**********************************************************************\n");
		} else System.out.println("Moving along then!\n");
	}
}