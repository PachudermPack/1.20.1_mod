package net.pachuderm_pack.ppgmod.util;

import net.pachuderm_pack.ppgmod.PPGmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PPG_TOOL = tag("needs_ppg_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PPGmod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PPGmod.MOD_ID, name));
        }
    }
}
