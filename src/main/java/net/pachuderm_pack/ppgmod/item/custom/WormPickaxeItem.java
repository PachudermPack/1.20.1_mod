package net.pachuderm_pack.ppgmod.item.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WormPickaxeItem extends PickaxeItem {
    public WormPickaxeItem(Tier toolTiers, int attackDamage, float attackSpeed, Properties properties) {
        super(toolTiers, 1, -3, properties);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.ppgmod.worm_pickaxe.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);


    }

    @Override
    public @Nullable CompoundTag getShareTag(ItemStack stack) {
        CompoundTag tag = super.getShareTag(stack);
        if (tag != null) {
            tag.putBoolean("Unbreakable", true);
        }

        return tag;
    }
}
