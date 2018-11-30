package com.robertx22.customitems.gearitems.bases;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public abstract class BaseWeaponItem extends ItemTool implements IGearItem {

    static ItemSword.ToolMaterial Mat = EnumHelper.addToolMaterial("swordmat", 0, 900, 1F, 1F, 10);

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet();

    public abstract String Name();

    public BaseWeaponItem() {
	super(Mat, EFFECTIVE_ON);
	this.setMaxStackSize(1);
	this.setMaxDamage(BaseArmorItem.MAX_GEAR_DURABILITY);

    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
	stack.damageItem(1, attacker);
	return true;
    }

}
