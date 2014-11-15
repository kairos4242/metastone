package net.pferdimanzug.hearthstone.analyzer.game.spells;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellArg;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;

public class AddSpellPowerSpell extends Spell {

	public static SpellDesc create(int spellPower) {
		SpellDesc desc = new SpellDesc(AddSpellPowerSpell.class);
		desc.set(SpellArg.POWER, spellPower);
		return desc;
	}

	@Override
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity target) {
		int power = desc.getInt(SpellArg.POWER);
		target.modifyTag(GameTag.SPELL_POWER, power);
	}

}