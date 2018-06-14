package com.vokabelmaschine.buildtweaks;

import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import cofh.thermalexpansion.util.managers.machine.TransposerManager;
import com.vokabelmaschine.resources.init.ModBlocks;
import com.vokabelmaschine.resources.init.ModItems;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    public void init(FMLInitializationEvent event) {
        TransposerManager.addFillRecipe(3000, GameRegistry.makeItemStack("minecraft:glowstone_dust", 0, 1, null), GameRegistry.makeItemStack("thermalfoundation:material", 894, 1, null), new FluidStack(FluidRegistry.getFluid("glowstone"), 2000), false);
        TransposerManager.addFillRecipe(3000, GameRegistry.makeItemStack("minecraft:sand", 0, 1, null), GameRegistry.makeItemStack("minecraft:soul_sand", 0, 1, null), new FluidStack(FluidRegistry.getFluid("hydrogen"), 200), false);
        TransposerManager.addFillRecipe(2000, GameRegistry.makeItemStack("minecraft:planks", 0, 1, null), GameRegistry.makeItemStack("immersiveengineering:treatedWood", 0, 1, null), new FluidStack(FluidRegistry.getFluid("creosote"), 125), false);
        TransposerManager.addFillRecipe(5000, GameRegistry.makeItemStack("minecraft:wheat_seeds", 0, 1, null), GameRegistry.makeItemStack("actuallyadditions:itemCanolaSeed", 0, 1, null), new FluidStack(FluidRegistry.getFluid("crude_oil"), 250), false);

        PulverizerManager.addRecipe(1500, GameRegistry.makeItemStack("minecraft:soul_sand", 0, 1, null), GameRegistry.makeItemStack("minecraft:quartz", 0, 2, null), GameRegistry.makeItemStack("minecraft:ghast_tear", 0, 1, null), 2);
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
