package net.pachuderm_pack.ppgmod.item;

import net.pachuderm_pack.ppgmod.PPGmod;
import net.pachuderm_pack.ppgmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier PPG = TierSortingRegistry.registerTier(
            new ForgeTier(5, 100000, 10f, 4f, 25,
                    ModTags.Blocks.NEEDS_PPG_TOOL, () -> Ingredient.of(ModItems.WORM.get())),
            new ResourceLocation(PPGmod.MOD_ID, "worm"), List.of(Tiers.NETHERITE), List.of());

}
