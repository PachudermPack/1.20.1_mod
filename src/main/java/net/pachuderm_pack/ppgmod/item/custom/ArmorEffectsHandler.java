package net.pachuderm_pack.ppgmod.item.custom;

import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;

@Mod.EventBusSubscriber(modid = "ppgmod")
public class ArmorEffectsHandler {

    @SubscribeEvent
    public static void onEquipmentChange(LivingEquipmentChangeEvent event) {
        LivingEntity entity = event.getEntity();

        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (isWearingFullSetOfYourArmor(player)) {
                addEffectForFullSet(player);
            } else {
                removeEffectIfNotWearingFullSet(player);
            }
        }
    }

    private static boolean isWearingFullSetOfYourArmor(Player player) {
        int yourArmorCount = 0;
        for (ItemStack itemStack : player.getArmorSlots()) {
            if (itemStack.getItem() instanceof ModArmorItem) {
                yourArmorCount++;
            }
        }
        return yourArmorCount >= 4;
    }

    private static void addEffectForFullSet(Player player) {
        player.addEffect(new MobEffectInstance(MobEffects.JUMP, -1, 2,
                false, false, true));
        player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, -1, 4,
                false, false, true));
    }

    private static void removeEffectIfNotWearingFullSet(Player player) {
        if (!isWearingFullSetOfYourArmor(player)) {
            player.removeEffect(MobEffects.JUMP);
            player.removeEffect(MobEffects.HEALTH_BOOST);
        }
    }
}