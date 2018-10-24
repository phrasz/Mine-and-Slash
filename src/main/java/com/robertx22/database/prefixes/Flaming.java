package com.robertx22.database.prefixes;

import java.util.Arrays;
import java.util.List;

import com.robertx22.database.stats.mods.percent.elemental.FireDamagePercent;
import com.robertx22.gearitem.Prefix;
import com.robertx22.stats.StatMod;

public class Flaming extends Prefix {

	public Flaming() {
	}

	@Override
	public String Name() {
		return "Flaming";
	}

	@Override
	public List<StatMod> StatMods() {

		return Arrays.asList(new FireDamagePercent());
	}

}
