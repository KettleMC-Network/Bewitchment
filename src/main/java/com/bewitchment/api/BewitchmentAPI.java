package com.bewitchment.api;

import com.bewitchment.api.capability.IInfusion;
import com.bewitchment.api.capability.transformations.ITransformation;
import com.bewitchment.api.divination.IFortune;
import com.bewitchment.api.hotbar.IHotbarAction;
import com.bewitchment.api.incantation.IIncantation;
import com.bewitchment.api.ritual.EnumGlyphType;
import com.bewitchment.api.ritual.IRitual;
import com.bewitchment.api.spell.ISpell;

import net.minecraft.entity.player.EntityPlayer;

// TODO Javadocs
public abstract class BewitchmentAPI {

	private static BewitchmentAPI INSTANCE;

	public static void setupAPI(BewitchmentAPI api) {
		if (INSTANCE == null) {
			INSTANCE = api;
		} else {
			throw new IllegalStateException("Bewitchment API already initialized");
		}
	}

	public static BewitchmentAPI getAPI() {
		if (INSTANCE != null) {
			return INSTANCE;
		}
		throw new IllegalStateException("Bewitchment API not ready yet");
	}

	public abstract void registerHotbarAction(IHotbarAction action);

	public abstract void registerFortune(IFortune fortune);

	public abstract void registerIncantation(String name, IIncantation incantation);

	public abstract void registerSpell(ISpell spell);

	public abstract void registerInfusion(IInfusion infusion);

	public abstract IInfusion getPlayerInfusion(EntityPlayer player);

	public abstract void setPlayerInfusion(EntityPlayer player, IInfusion infusion);

	public abstract void setTypeAndLevel(EntityPlayer player, ITransformation type, int level, boolean isClient);

	/**
	 * @param player The player whose blood reserve is being modified
	 * @param amount The amount of blood to add (negative values will decrease the total)
	 * @return <i>When adding</i> blood this will return true if the value changed and false otherwise: this is <b>true</b> if there was
	 * even a little bit of space in the pool, but the blood added was greater than the amount that could be inserted,
	 * and <b>false</b> if the pool was maxed.<br>
	 * <i>When removing</i> blood this will return true if ALL the blood requested was drained.
	 * If the amount drained is greater than the amount available this will return false, and no blood will be drained from the pool
	 * @throws UnsupportedOperationException if the player is not a vampire
	 */
	public abstract boolean addVampireBlood(EntityPlayer player, int amount);

	public abstract void registerCircleRitual(IRitual ritual);

	public abstract int getCirclesIntegerForRitual(EnumGlyphType small, EnumGlyphType medium, EnumGlyphType large);
}
