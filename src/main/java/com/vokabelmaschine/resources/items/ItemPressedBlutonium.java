package com.vokabelmaschine.resources.items;

import com.vokabelmaschine.buildtweaks.BuildTweaks;
import com.vokabelmaschine.util.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPressedBlutonium extends Item {

    public String getUnlocalizedName(ItemStack stack) {
        return "item." + BuildTweaks.RESOURCEPREFIX + Names.ITEM_PRESSED_BLUTONIUM;
    }
}
