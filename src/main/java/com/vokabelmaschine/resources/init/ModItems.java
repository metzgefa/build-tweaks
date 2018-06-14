package com.vokabelmaschine.resources.init;

import com.vokabelmaschine.buildtweaks.BuildTweaks;
import com.vokabelmaschine.resources.items.ItemPressedBlutonium;
import com.vokabelmaschine.util.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public static ItemPressedBlutonium itemPressedBlutonium;

    public static void init() {
        itemPressedBlutonium = new ItemPressedBlutonium();
        itemPressedBlutonium.setRegistryName(new ResourceLocation(BuildTweaks.MODID, Names.ITEM_PRESSED_BLUTONIUM));
        GameRegistry.register(itemPressedBlutonium);
    }

    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher) {
        ModelResourceLocation model = new ModelResourceLocation(BuildTweaks.RESOURCEPREFIX + Names.ITEM_PRESSED_BLUTONIUM, "inventory");
        ModelLoader.registerItemVariants(itemPressedBlutonium, model);
        mesher.register(itemPressedBlutonium, 0, model);
    }
}
