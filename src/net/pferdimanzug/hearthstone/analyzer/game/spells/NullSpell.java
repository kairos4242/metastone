package net.pferdimanzug.hearthstone.analyzer.game.spells;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Actor;

public class NullSpell extends Spell {

	@Override
	protected void onCast(GameContext context, Player player, Actor target) {
		// do nothing at all
	}

}