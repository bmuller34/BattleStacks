# BattleStacks
Competitive card game where players choose their character decks, modify their abilities with cards, then battle each other!

This game was written in Java and currently runnable within a Java IDE via Console output.

------------------------------------------------------------RULES------------------------------------------------------------

---------------ABSTRACT---------------
BattleStacks is a card game where players choose a character to play as with two additional supporting units. Each selected character has its own deck that gets added to player's deck and shuffled. Once their characters are selected, the game begins the Build Phase of the game.

During the Build Phase, players play cards in their hand by placing a card on top of either their character or their opponent's character in the field. Each card has its own modifiers that will be applied to the character it is placed on top of. These modifiers can be good or bad depending on the card. Each player plays two cards before the next player goes.

After five rounds, the Battle Phase begins. At this point, character abilities are finalized and players use the abilities based on how their character grew during the Build Phase. Characters will have a set of attacks they may perform during the Battle Phase. These attacks include a standard attack with their default weapon, or a special ability unique to the character using it.

Player characters fight each other until one of the characters Hit Points reaches zero. At this point, the surviving character wins!

---------------Characters---------------

----Warrior----
Primary Stat: Strength
Special Ability: Heavy Strike
Atk Type: Physical
Def Type: Physical
Description: Heavy Strike is a powerful attack with the primary weapon that takes two turns to use. On the first turn, the ability is "charged". On the second turn, the ability needs to be used again to "activate" and trigger the effect.

----Knight----
Primary Stat: Constitution
Special Ability: Defend
Atk Type: None
Def Type: Physical + Magical
Description: Defend increases the user's defenses for a turn, greatly reducing or nullifying incoming damage.

----Rogue----
Primary Stat: Dexterity
Special Ability: Stick 'em With The Pointy End
Atk Type: Physical
Def Type: Physical
Description: Uses a special dagger to strike the vitals of your opponent. Has low damage but boasts a very high critical chance.

----Wizard----
Primary Stat: Intelligence
Special Ability: Force of Nature
Atk Type: Magical
Def Type: Magical
Description: Unleashes a deluge of elemental wrath to the victim.

---------------Supports---------------

----The Fighter----
Primary Stat: Strength
Description: A supporting deck focusing mainly on bolstering Strength. Comes with an arsenal of weaponry.

----The Thief----
Primary Stat: Dexterity
Description: A supporting deck focusing mainly on bolstering Dexterity and minimizing abilities.

----Rudolph The Brown-Nosed----
Primary Stat: None
Description: A jester who lives only to boost your ego.

----Steve, from Accounting----
Primary Stat: Intelligence
Description: A CPA from a local Accounting Firm. He takes cares of the boring stuff.




--------------------------------------------------UPDATES AND MISC COMMENTS--------------------------------------------------
@ 8:19AM, 12/10/2017: Uploaded BattleStacks to Github. Core mechanics implemented with plans to expand on characters, decks, and mechanics to allow for more abilities per character.
