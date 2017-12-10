package deck;

import card.characters.Character;
import card.equipment.Equipment;

/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * This class represents the Player's Hand that will pop
 * the first five cards off of the Deck and allow the player
 * to use them during a battle.
 * 
 * Things to do:
 * 
 * 1) Constructor with Character as parameters.
 * 2) FieldStack needs to be able to do the following:
 * 		- Add to itself
 * 		- Calculate new values characterd on placed Card
 * 
 */
public class FieldStack {
	private int size;
	private Character character = new Character();
	private Stack<Equipment> stack = new Stack<Equipment>();
	
	public FieldStack() {}
	
	public FieldStack(Character ch) {
		this.character = ch;
	}
	
	public void push(Equipment e) {
		stack.push(e);
		setModifiers(e);
		this.size++;
	}
	
	public void pop() {
		stack.pop();
		size--;
	}
	
	private void setModifiers(Equipment e) {
		if (e.getStr() != 99)
			character.setStrMod(e.getStr());
		if (e.getDex() != 99)
			character.setDexMod(e.getDex());
		if (e.getIntell() != 99)
			character.setIntMod(e.getIntell());
		if (e.getCon() != 99)
			character.setConMod(e.getCon());
		character.calculateStats();
	}
	
	public Character getCharacter() {
		return this.character;
	}
	
	public void getInfo() {
		System.out.println("Name: " + character.getName());
		System.out.println("Class: " + character.getCharClass());
		System.out.println("Description: " + character.getDesc());
		System.out.println("Strength: " + character.getStr());
		System.out.println("Dexterity: " + character.getDex());
		System.out.println("Constitution: " + character.getCon());
		System.out.println("Intelligence: " + character.getIntell());
		System.out.println("Strength Mod: " + character.getStrMod());
		System.out.println("Dexterity Mod: " + character.getDexMod());
		System.out.println("Constitution Mod: " + character.getConMod());
		System.out.println("Intelligence Mod: " + character.getIntMod());
		System.out.println("Hit Points: " + character.getHP());
		System.out.println("Initiative: " + character.getInit());
		System.out.println("Physical Attack: " + character.getPAttack());
		System.out.println("Magical Attack: " + character.getMAttack());
		System.out.println("Physical Defense: " + character.getPDef());
		System.out.println("Magical Defense: " + character.getMDef());
		System.out.println("Critical Chance: " + character.getCrit());
		System.out.println("HP Weight: " + character.getHPWeight());
		System.out.println("P.Def Weight: " + character.getPDefWeight());
		System.out.println("M.Def Weight: " + character.getMDefWeight());
	}
	
	public void getBuildInfo() {
		System.out.println("Name: " + character.getName());
		System.out.println("Strength + Mod: " + character.getStr() + " + " + character.getStrMod() + " = " + (character.getStr() + character.getStrMod()));
		System.out.println("Dexterity + Mod: " + character.getDex() + " + " + character.getDexMod() + " = " + (character.getDex() + character.getDexMod()));
		System.out.println("Constitution + Mod: " + character.getCon() + " + " + character.getConMod() + " = " + (character.getCon() + character.getConMod()));
		System.out.println("Intelligence + Mod: " + character.getIntell() + " + " + character.getIntMod() + " = " + (character.getIntell() + character.getIntMod()));
	}
}
