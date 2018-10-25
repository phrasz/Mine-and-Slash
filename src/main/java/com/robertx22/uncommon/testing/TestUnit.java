package com.robertx22.uncommon.testing;

import java.util.List;

import com.robertx22.saveclasses.Unit;
import com.robertx22.saveclasses.gearitem.GearItemData;
import com.robertx22.saveclasses.gearitem.StatModData;
import com.robertx22.stats.Stat;

public class TestUnit extends Unit {
	public int GetStatFromTestGears(List<GearItemData> gears, Stat thestat) {

		this.ClearStats();

		for (GearItemData gear : gears) {
			List<StatModData> datas = gear.GetAllStats(gear);
			for (StatModData data : datas) {
				Stat stat = Stats.get(data.GetBaseMod().GetBaseStat().Name());
				if (stat == null) {
					System.out.println("Error! can't load a stat called: " + data.GetBaseMod().GetBaseStat().Name());
				} else {
					stat.Add(data, gear);

				}
			}
		}

		this.CalcStats();

		return (int) Stats.get(thestat.Name()).Value;

	}

}