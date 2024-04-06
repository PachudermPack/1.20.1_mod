package net.pachuderm_pack.ppgmod.datagen.loot;

import net.pachuderm_pack.ppgmod.PPGmod;
import net.pachuderm_pack.ppgmod.block.custom.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PPGmod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PPGLOGO_BLOCK.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PPGLOGO_BLOCK.get());

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
        //        .add(ModBlocks..get());

        //this.tag(BlockTags.NEEDS_STONE_TOOL)
        //        .add(ModBlocks..get());

        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
        //        .add(ModBlocks..get());


    }
}