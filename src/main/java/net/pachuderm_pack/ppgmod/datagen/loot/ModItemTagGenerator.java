package net.pachuderm_pack.ppgmod.datagen.loot;

import net.pachuderm_pack.ppgmod.PPGmod;
import net.pachuderm_pack.ppgmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, PPGmod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PPG_HELMET.get(),
                        ModItems.PPG_CHESTPLATE.get(),
                        ModItems.PPG_LEGGINGS.get(),
                        ModItems.PPG_BOOTS.get());


        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.METAL1_MUSIC_DISC.get(),
                        ModItems.METAL2_MUSIC_DISC.get(),
                        ModItems.METAL3_MUSIC_DISC.get(),
                        ModItems.METAL4_MUSIC_DISC.get(),
                        ModItems.METAL5_MUSIC_DISC.get(),
                        ModItems.JOPA_MUSIC_DISC.get(),
                        ModItems.BARBARIKI_MUSIC_DISC.get(),
                        ModItems.RAP_GOD_MUSIC_DISC.get(),
                        ModItems.SPIRIT_MUSIC_DISC.get(),
                        ModItems.WORM_MUSIC_DISC.get(),
                        ModItems.GIMN_MUSIC_DISC.get());
    }
}