package net.pachuderm_pack.ppgmod.item.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.pachuderm_pack.ppgmod.item.ModToolTiers;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WormSwordItem extends SwordItem {
    public WormSwordItem(Tier toolTiers, int attackDamage, float attackSpeed, Properties properties) {
        super(toolTiers, 20, -1, properties);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.ppgmod.worm_sword.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);


    }

    @Override
    public @Nullable CompoundTag getShareTag(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        if (tag != null) {
            tag.putBoolean("Unbreakable", true);
        }

        return tag;
    }
}
