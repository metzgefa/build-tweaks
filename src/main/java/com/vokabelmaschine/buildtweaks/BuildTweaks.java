package com.vokabelmaschine.buildtweaks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BuildTweaks.MODID, name = BuildTweaks.MODNAME, version = BuildTweaks.VERSION, dependencies = BuildTweaks.DEPENDENCIES)
public class BuildTweaks
{
    public static final String MODID = "buildtweaks";
    public static final String MODNAME = "Build Tweaks";
    public static final String VERSION = "1.1.1";
    public static final String DEPENDENCIES = "";
    public static final String RESOURCEPREFIX = MODID + ":";

    @Mod.Instance(MODID)
    public static BuildTweaks instance;

    @SidedProxy(clientSide = "com.vokabelmaschine.buildtweaks.ClientProxy", serverSide = "com.vokabelmaschine.buildtweaks.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}