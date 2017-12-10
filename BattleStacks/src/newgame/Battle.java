package newgame;

import java.util.Scanner;

import deck.FieldStack;
import deck.Player;

public class Battle {

	public Battle() {}

	public void start(Player red, Player blue) {
		int round = 0;
		red.setTeamColor("Red");
		blue.setTeamColor("Blue");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n**************************");
		System.out.println("It's time to build!");
		System.out.println("**************************");
		Player winner = null;

		/***************BUILD PHASE***************/

		//start by shuffling each players' deck
		red.shuffleDeck();
		blue.shuffleDeck();

		// five rounds where Players player their hand to build/weaken characters

		while (round != 5) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("**************************");
			System.out.println("Round " + (round + 1) + "/5");
			round++;
			this.drawCards(red);
			this.drawCards(blue);
			System.out.println("**************************"
					+ "\n\nPlayer Red, it's your turn!\n\nCharacter Info:\n");
			red.main.getBuildInfo();
			System.out.println("\nOpponent Info:\n");
			blue.main.getBuildInfo();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			build(red, blue);
			System.out.println("\nCharacter Info:\n");
			red.main.getBuildInfo();
			System.out.println("\nOpponent Info:\n");
			blue.main.getBuildInfo();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			build(red, blue);
			System.out.println("\nCharacter Info:\n");
			red.main.getBuildInfo();
			System.out.println("\nOpponent Info:\n");
			blue.main.getBuildInfo();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
					+ "*********************************************************"
					+ "\nPlayer Blue, it's your turn!\n\nCharacter Info:\n");
			blue.main.getBuildInfo();
			System.out.println("\nOpponent Info:\n");
			red.main.getBuildInfo();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			build(blue, red);
			System.out.println("\nCharacter Info:\n");
			blue.main.getBuildInfo();
			System.out.println("\nOpponent Info:\n");
			red.main.getBuildInfo();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			build(blue, red);
			System.out.println("\nCharacter Info:\n");
			blue.main.getBuildInfo();
			System.out.println("\nOpponent Info:\n");
			red.main.getBuildInfo();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/***************BATTLE PHASE***************/
		// indefinite rounds until one character dies :D
		turnOrder(red, blue);

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("It's time to duel!");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (red.getOrder() == 1 && blue.getOrder() == 2) {
			System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			System.out.println("Player Red goes first!");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(red.main.getCharacter().getHP() > 0 && blue.main.getCharacter().getHP() > 0) {
				winner = battle(red, blue);
				if (winner == null) {
					winner = battle(blue, red);
				}
			}
		}
		else {
			System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			System.out.println("Player Blue goes first!");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(red.main.getCharacter().getHP() > 0 && blue.main.getCharacter().getHP() > 0) {
				winner = battle(blue, red);
				if (winner == null) {
					winner = battle(red, blue);
				}
			}
		}

		if (winner != null)
			System.out.println("\nCongratulations! " + winner.getTeamColor() + " wins!");
	}

	public void drawCards(Player p) {
		p.drawCards();
	}

	public void build(Player pActive, Player pInactive) {
		String card;
		String character;
		String validate;
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("-*-*-*-*-*-*Select a card to play*-*-*-*-*-*-");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

		pActive.showHandWithNumbers();

		// wait for Card selection
		Scanner kb = new Scanner(System.in);
		card = kb.nextLine();

		// validates selection (must be integer)
		while (checkCardSelection(card) != true) {
			System.out.println("Sorry, try again!");
			card = kb.nextLine();
		}
		if (checkCardSelection(card)) {
			if (pActive.getCardInHandByIndex(Integer.parseInt(card) - 1) != null) {
				System.out.println("Use " + pActive.getCardInHandByIndex(Integer.parseInt(card) - 1).getName() + " on which character?");
				System.out.println("\nSelected Card)\n" + pActive.getCardInHandByIndex(Integer.parseInt(card) - 1));
				System.out.println("\n1)");
				pActive.main.getBuildInfo();
				System.out.println("\n2)");
				pInactive.main.getBuildInfo();
				character = kb.nextLine();

				int selectedCard = Integer.parseInt(card) - 1;
				int targetCheck = checkTargetSelection(character);

				while (targetCheck < 1 || targetCheck > 2) {
					System.out.println("Sorry, try again!");
					character = kb.nextLine();
					targetCheck = checkTargetSelection(character);
				}
				// if targeting self
				if (targetCheck == 1) {
					System.out.println("Using " + pActive.getCardInHandByIndex(selectedCard).getName() + " on " + pActive.useFieldStackByInt(targetCheck).getCharacter().getName() + "...");
					
					executeMove(selectedCard, pActive, pActive.useFieldStackByInt(targetCheck));
				}
				// if targeting opponent
				else if (targetCheck == 2) {
					System.out.println("Using " + pActive.getCardInHandByIndex(selectedCard).getName() + " on " + pInactive.useFieldStackByInt(targetCheck - 1).getCharacter().getName() + "...");
					
					executeMove(selectedCard, pActive, pInactive.useFieldStackByInt(targetCheck - 1));
				} else {
					System.out.println("Sorry, that wasn't a valid input. Try again.");
					build(pActive, pInactive);
				}
			} else {
				System.out.println("Sorry, there's no card there! Wait three seconds to try again!\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				build(pActive, pInactive);
			}
		}
	}

	public boolean checkCardSelection(String sel) {
		if ((Integer.parseInt(sel) >= 1 && Integer.parseInt(sel) <= 5))
			return true;
		return false;
	}

	public int checkTargetSelection(String sel) {
		if (Integer.parseInt(sel) == 1)
			return (Integer.parseInt(sel));
		if (Integer.parseInt(sel) == 2)
			return (Integer.parseInt(sel));
		return -1;
	}

	public int checkValidation(String v) {
		if (v.equalsIgnoreCase("yes") || v.equalsIgnoreCase("y"))
			return 1;
		else if (v.equalsIgnoreCase("no") || v.equalsIgnoreCase("n"))
			return 0;
		return -1;
	}

	public void executeMove(int equipPos, Player targetPlayer, FieldStack targetStack) {
		targetPlayer.playCard(equipPos, targetStack);
	}

	public Player battle(Player first, Player second) {
		Scanner kb = new Scanner(System.in);
		String input;
		String s;

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Player " + first.getTeamColor() + " it's your turn!");
		System.out.println("Player Name: " +  first.main.getCharacter().getName());
		System.out.println("Player HP: " +  first.main.getCharacter().getHP());
		System.out.println();
		System.out.println("Opponent Name: " +  second.main.getCharacter().getName());
		System.out.println("Opponent HP: " +  second.main.getCharacter().getHP());
		System.out.println("\nSelect your attack:");
		first.main.getCharacter().listAbilities();

		input = kb.nextLine();
		while (validateAttack(input) == null) {
			System.out.println("Sorry, try again!");
			input = kb.nextLine();
		}
		if ((s = validateAttack(input)) == "Standard Attack") {
			System.out.println(first.main.getCharacter().getName() + " uses a " 
					+ s.toLowerCase() + "!");
			doBattle(first, second, first.main.getCharacter().getPAttack(), 0);

		} else if ((s = validateAttack(input)) == "Special") {
			System.out.println(first.main.getCharacter().getName() + " uses " 
					+ s + "!");
			doBattle(first, second, first.main.getCharacter().useAbility1(), 1);
		}

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (first.main.getCharacter().getHP() <= 0)
			return second;
		else if (second.main.getCharacter().getHP() <= 0)
			return first;
		else return null;


	}

	public void turnOrder(Player red, Player blue) {
		if ((red.main.getCharacter().getInit() - blue.main.getCharacter().getInit()) >= 0) {
			red.setOrder(1);
			blue.setOrder(2);
		} else {
			blue.setOrder(1);
			red.setOrder(2);
		}
	}

	public String validateAttack(String s) {
		if (s.equals("1"))
			return "Standard Attack";
		else if (s.equals("2"))
			return "Special";
		else return null;
	}

	public void doBattle(Player source, Player target, int ability, int type) {
		// determine critical hit roll
		boolean isCrit = false;
		double crit = Math.floor(Math.random() * ((20 - 1) + 1) + 1);
		int dmg;

		if (crit >= source.main.getCharacter().getCrit())
			isCrit = true;

		// Rogue-specific Special Ability crit decider. Yes, he gets two rolls (including the one above).
		if (source.main.getCharacter().getCharClass().equals("Rogue") && (type == 1) && (crit >= source.main.getCharacter().getCrit() - 4))
			isCrit = true;

		/**********************************Standard Attack**********************************/

		// if Standard Attack
		if (type == 0) {
			// rolls for crit
			if ((isCrit) && ((dmg = (ability - target.main.getCharacter().getPDef()) * 3) > 0)) {
				System.out.println("A CRITICAL HIT!");
				target.main.getCharacter().setHP(target.main.getCharacter().getHP() - (dmg * 3));
				System.out.println(source.main.getCharacter().getName() + " deals " + dmg * 3 + " dmg to " 
						+ target.main.getCharacter().getName());
			} else if ((dmg = (ability - target.main.getCharacter().getPDef())) > 0) {
				System.out.println(source.main.getCharacter().getName() + " attacks!");
				target.main.getCharacter().setHP(target.main.getCharacter().getHP() - (dmg));
				System.out.println(source.main.getCharacter().getName() + " deals " + dmg + " dmg to " 
						+ target.main.getCharacter().getName());
			} else System.out.println("NO DAMAGE!");
			if (source.main.getCharacter().getSpecialTurns() == 1) {
				source.main.getCharacter().setSpecialTurns(0);
				System.out.println(source.main.getCharacter().getName() + " strikes!");
				if ((dmg = ability - target.main.getCharacter().getPDef()) > 0) {
					target.main.getCharacter().setHP(target.main.getCharacter().getHP() - dmg);
				} else System.out.println("NO DAMAGE!");
			}
		}

		/*********************************Special Abilities*********************************/

		// if Wizard is using Magic
		if (source.main.getCharacter().getCharClass().equals("Wizard") && type == 1) {
			// if crit and dmg is greater than defense, deal damage
			if ((isCrit) && ((dmg = (ability - target.main.getCharacter().getMDef())) > 0)) {
				System.out.println("A CRITICAL HIT!");
				target.main.getCharacter().setHP(target.main.getCharacter().getHP() - (dmg * 2));
				System.out.println(source.main.getCharacter().getName() + " deals " + dmg * 2 + " dmg to " 
						+ target.main.getCharacter().getName());
			} else if ((dmg = ability - target.main.getCharacter().getMDef()) > 0) {
				System.out.println(source.main.getCharacter().getName() + " attacks with a force of nature!");
				target.main.getCharacter().setHP(target.main.getCharacter().getHP() - dmg);
				System.out.println(source.main.getCharacter().getName() + " deals " + dmg + " dmg to " 
						+ target.main.getCharacter().getName());
			} else System.out.println("NO DAMAGE!");
		}

		// if Knight is using Defend
		if (source.main.getCharacter().getCharClass().equals("Knight") && type == 1) {
			if(isCrit) {
				System.out.println("CRITICAL GUARD! KNIGHT'S DEFENSE HAS RISEN SHARPLY!");
				source.main.getCharacter().setTemp1(source.main.getCharacter().getPDef());
				source.main.getCharacter().setTemp2(source.main.getCharacter().getMDef());
				source.main.getCharacter().setPDef(50);
				source.main.getCharacter().setMDef(50);
			} else {
				System.out.println(source.main.getCharacter().getName() + " readies their "
						+ "shield! Incoming damage is reduced!");
				source.main.getCharacter().setTemp1(source.main.getCharacter().getPDef());
				source.main.getCharacter().setTemp2(source.main.getCharacter().getMDef());
				source.main.getCharacter().setPDef(source.main.getCharacter().getPDef() + 10);
				source.main.getCharacter().setMDef(source.main.getCharacter().getMDef() + 5);
			}
		}

		// if Warrior is using Heavy Strike
		if (source.main.getCharacter().getCharClass().equals("Warrior") && type == 1) {
			// if Heavy Strike is played (Turn 1 of 2)
			if (source.main.getCharacter().getSpecialTurns() == 0) {
				// sets turn counter
				source.main.getCharacter().setSpecialTurns(1);
				if ((isCrit) && ((dmg = (ability - target.main.getCharacter().getPDef())) > 0)) {
					System.out.println(source.main.getCharacter().getName().toUpperCase() + 
							" HAS GONE BERSERK! SPECIAL IS USED IMMEDIATELY.");
					target.main.getCharacter().setHP(target.main.getCharacter().getHP() - (dmg * 2));
					System.out.println(source.main.getCharacter().getName() + " deals " + dmg * 2
							+ " dmg to " + target.main.getCharacter().getName());
				} else {
					System.out.println(source.main.getCharacter().getName() + 
							" readies their weapon. They will strike next round!");
				}
			} else if (source.main.getCharacter().getSpecialTurns() == 1) {
				source.main.getCharacter().setSpecialTurns(0);
				System.out.println(source.main.getCharacter().getName() + " strikes!");
				if ((dmg = ability - target.main.getCharacter().getPDef()) > 0) {
					target.main.getCharacter().setHP(target.main.getCharacter().getHP() - dmg);
					System.out.println(source.main.getCharacter().getName() + " deals " + dmg
							+ " dmg to " + target.main.getCharacter().getName());
				} else System.out.println("NO DAMAGE!");
				source.main.getCharacter().setSpecialTurns(0);
			}
		}

		// if Rogue uses Stick 'em with the Pointy End
		if (source.main.getCharacter().getCharClass().equals("Rogue") && type == 1) {
			// rolls for enhanced crit
			if ((isCrit) && ((dmg = (ability - target.main.getCharacter().getPDef()) * 3) > 0)) {
				System.out.println("VITALS STRUCK! A CRITICAL BLOW!.");
				target.main.getCharacter().setHP(target.main.getCharacter().getHP() - (dmg * 3));
				System.out.println(source.main.getCharacter().getName() + " deals " + dmg * 3
						+ " dmg to " + target.main.getCharacter().getName());
			} else if ((dmg = (ability - target.main.getCharacter().getPDef())) > 0) {
				System.out.println(source.main.getCharacter().getName() + " makes a swift strike!");
				target.main.getCharacter().setHP(target.main.getCharacter().getHP() - (dmg));
				System.out.println(source.main.getCharacter().getName() + " deals " + dmg
						+ " dmg to " + target.main.getCharacter().getName());
			} else System.out.println("NO DAMAGE!");
			if (source.main.getCharacter().getSpecialTurns() == 1) {
				source.main.getCharacter().setSpecialTurns(0);
				System.out.println(source.main.getCharacter().getName() + " strikes!");
				if ((dmg = ability - target.main.getCharacter().getPDef()) > 0) {
					target.main.getCharacter().setHP(target.main.getCharacter().getHP() - dmg);
				} 
			}
		}
	}
}
