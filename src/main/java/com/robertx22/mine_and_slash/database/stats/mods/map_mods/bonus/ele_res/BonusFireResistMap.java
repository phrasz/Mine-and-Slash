package com.robertx22.mine_and_slash.database.stats.mods.map_mods.bonus.ele_res;

import com.robertx22.mine_and_slash.database.stats.Stat;
import com.robertx22.mine_and_slash.database.stats.mods.map_mods.bases.BonusEleResistBase;
import com.robertx22.mine_and_slash.database.stats.types.generated.ElementalResist;
import com.robertx22.mine_and_slash.uncommon.enumclasses.Elements;

public class BonusFireResistMap extends BonusEleResistBase {

    @Override
    public String GUID() {
        return "BonusFireResistMap";
    }

    @Override
    public Stat GetBaseStat() {
        return new ElementalResist(Elements.Fire);
    }

}
