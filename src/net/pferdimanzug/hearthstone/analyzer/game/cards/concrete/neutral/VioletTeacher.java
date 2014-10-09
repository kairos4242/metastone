package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.tokens.neutral.VioletApprentice;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.SummonSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.TargetPlayer;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.SpellCastedTrigger;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.SpellTrigger;

public class VioletTeacher extends MinionCard {

	public VioletTeacher() {
		super("Violet Teacher", 3, 5, Rarity.RARE, HeroClass.ANY, 4);
		setDescription("Whenever you cast a spell, summon a 1/1 Violet Apprentice.");
	}

	@Override
	public int getTypeId() {
		return 222;
	}

	@Override
	public Minion summon() {
		Minion violetTeacher = createMinion();
		SpellDesc summonSpell = SummonSpell.create(new VioletApprentice());
		SpellTrigger trigger = new SpellTrigger(new SpellCastedTrigger(TargetPlayer.SELF), summonSpell);
		violetTeacher.setSpellTrigger(trigger);
		return violetTeacher;
	}
}
