package com.robertx22.mine_and_slash.database.stats.types.traits.major_arcana;

import com.robertx22.mine_and_slash.database.stats.StatMod;
import com.robertx22.mine_and_slash.database.stats.mods.flat.corestats.IntelligenceFlat;
import com.robertx22.mine_and_slash.database.stats.mods.flat.corestats.StrengthFlat;
import com.robertx22.mine_and_slash.database.stats.mods.generated.ElementalSpellToAttackDMGFlat;
import com.robertx22.mine_and_slash.uncommon.enumclasses.Elements;

import java.util.Arrays;
import java.util.List;

public class Chariot extends BaseMajorArcana {

    public static final String GUID = "Chariot";

    @Override
    public String GUID() {
        return GUID;
    }

    @Override
    public List<StatMod> getStats() {
        return Arrays.asList(new IntelligenceFlat(), new StrengthFlat(), new ElementalSpellToAttackDMGFlat(Elements.Water));
    }

    @Override
    public String locNameForLangFile() {
        return "Chariot";
    }

}
