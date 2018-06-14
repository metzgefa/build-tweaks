package com.vokabelmaschine.resources.blocks;

import com.vokabelmaschine.buildtweaks.BuildTweaks;
import com.vokabelmaschine.util.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMachineFrameBasic extends Block {

    public BlockMachineFrameBasic() {
        super(Material.ROCK);
        this.setHardness(8);
    }

    public String getUnlocalizedName() {
        return "tile." + BuildTweaks.RESOURCEPREFIX + Names.BLOCK_MACHINE_FRAME_BASIC;
    }
}
