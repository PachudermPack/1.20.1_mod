package net.pachuderm_pack.ppgmod.item.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
//import net.minecraft.world.effect.MobEffects;
//import net.pachuderm_pack.ppgmod.item.ModArmorMaterials;

import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>()).build();
 //                   .put(ModArmorMaterials.PPG, new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 2, false, false, true)).build();


    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.ppgmod.fullarmoreffect.tooltip"));
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

    @Override
    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        if (!level.isClientSide) {
            if (hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player){
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry: MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }
    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect){
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if (hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect){
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);


        return !helmet.isEmpty() && !breastplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }
    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem)) {
                return false;

            }
        }
        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material
                && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}