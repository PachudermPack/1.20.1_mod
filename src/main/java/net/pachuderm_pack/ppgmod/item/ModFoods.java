package net.pachuderm_pack.ppgmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COOKED_WORM = new FoodProperties.Builder().nutrition(10).fast()
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, -1, 1, false,false,false), 1f).build();

    public static final FoodProperties WORM = new FoodProperties.Builder().nutrition(0).fast()
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 70, 255, false,false,true), 1f).build();


}

