package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter;

import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.tokens.hunter.Hyena;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Race;
import net.pferdimanzug.hearthstone.analyzer.game.spells.SummonSpell;

public class SavannahHighmane extends MinionCard {

	public SavannahHighmane() {
		super("Savannah Highmane", 6, 5, Rarity.RARE, HeroClass.HUNTER, 6);
		setDescription("Deathrattle: Summon two 2/2 Hyenas.");
		setRace(Race.BEAST);
	}

	@Override
	public int getTypeId() {
		return 42;
	}
	
	@Override
	public Minion summon() {
		Minion savannahHighmane = createMinion();
		savannahHighmane.addDeathrattle(SummonSpell.create(new Hyena(), new Hyena()));
		return savannahHighmane;
	}
}
