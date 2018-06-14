package com.vokabelmaschine.resources.init;

import com.vokabelmaschine.buildtweaks.BuildTweaks;
import com.vokabelmaschine.resources.blocks.BlockMachineFrameBasic;
import com.vokabelmaschine.resources.blocks.BlockMachineFrameHardened;
import com.vokabelmaschine.resources.blocks.BlockMachineFrameReinforced;
import com.vokabelmaschine.resources.blocks.BlockMachineFrameResonant;
import com.vokabelmaschine.util.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public static BlockMachineFrameBasic blockMachineFrameBasic;
    public static BlockMachineFrameHardened blockMachineFrameHardened;
    public static BlockMachineFrameReinforced blockMachineFrameReinforced;
    public static BlockMachineFrameResonant blockMachineFrameResonant;

    public static void init() {

        ResourceLocation locationBasic = new ResourceLocation(BuildTweaks.MODID, Names.BLOCK_MACHINE_FRAME_BASIC);
        blockMachineFrameBasic = new BlockMachineFrameBasic();
        blockMachineFrameBasic.setRegistryName(locationBasic);
        GameRegistry.register(blockMachineFrameBasic);
        GameRegistry.register(new ItemBlock(blockMachineFrameBasic), locationBasic);

        ResourceLocation locationHardened = new ResourceLocation(BuildTweaks.MODID, Names.BLOCK_MACHINE_FRAME_HARDENED);
        blockMachineFrameHardened = new BlockMachineFrameHardened();
        blockMachineFrameHardened.setRegistryName(locationHardened);
        GameRegistry.register(blockMachineFrameHardened);
        GameRegistry.register(new ItemBlock(blockMachineFrameHardened), locationHardened);

        ResourceLocation locationReinforced = new ResourceLocation(BuildTweaks.MODID, Names.BLOCK_MACHINE_FRAME_REINFORCED);
        blockMachineFrameReinforced = new BlockMachineFrameReinforced();
        blockMachineFrameReinforced.setRegistryName(locationReinforced);
        GameRegistry.register(blockMachineFrameReinforced);
        GameRegistry.register(new ItemBlock(blockMachineFrameReinforced), locationReinforced);

        ResourceLocation locationResonant = new ResourceLocation(BuildTweaks.MODID, Names.BLOCK_MACHINE_FRAME_RESONANT);
        blockMachineFrameResonant = new BlockMachineFrameResonant();
        blockMachineFrameResonant.setRegistryName(locationResonant);
        GameRegistry.register(blockMachineFrameResonant);
        GameRegistry.register(new ItemBlock(blockMachineFrameResonant), locationResonant);

    }

    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher) {

        Item itemBasic = Item.getItemFromBlock(blockMachineFrameBasic);
        ModelResourceLocation modelBasic = new ModelResourceLocation(BuildTweaks.RESOURCEPREFIX + Names.BLOCK_MACHINE_FRAME_BASIC, "inventory");
        ModelLoader.registerItemVariants(itemBasic, modelBasic);
        mesher.register(itemBasic, 0, modelBasic);

        Item itemHardened = Item.getItemFromBlock(blockMachineFrameHardened);
        ModelResourceLocation modelHardened = new ModelResourceLocation(BuildTweaks.RESOURCEPREFIX + Names.BLOCK_MACHINE_FRAME_HARDENED, "inventory");
        ModelLoader.registerItemVariants(itemHardened, modelHardened);
        mesher.register(itemHardened, 0, modelHardened);

        Item itemReinforced = Item.getItemFromBlock(blockMachineFrameReinforced);
        ModelResourceLocation modelReinforced = new ModelResourceLocation(BuildTweaks.RESOURCEPREFIX + Names.BLOCK_MACHINE_FRAME_REINFORCED, "inventory");
        ModelLoader.registerItemVariants(itemReinforced, modelReinforced);
        mesher.register(itemReinforced, 0, modelReinforced);

        Item itemResonant = Item.getItemFromBlock(blockMachineFrameResonant);
        ModelResourceLocation modelResonant = new ModelResourceLocation(BuildTweaks.RESOURCEPREFIX + Names.BLOCK_MACHINE_FRAME_RESONANT, "inventory");
        ModelLoader.registerItemVariants(itemResonant, modelResonant);
        mesher.register(itemResonant, 0, modelResonant);


    }
}
