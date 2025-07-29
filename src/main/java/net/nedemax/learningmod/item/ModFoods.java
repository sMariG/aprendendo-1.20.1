package net.nedemax.learningmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ROTTEN_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(4)
            .saturationMod(3).effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 2), 0.7f).build();
}
