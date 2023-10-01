package com.github.theredbrain.bamcontent.registry;

import com.github.theredbrain.bamcontent.BetterAdventureModeContent;
import com.github.theredbrain.bamcontent.effect.BerryFoodEffect;
import com.github.theredbrain.bamcontent.effect.BrownMushroomFoodEffect;
import com.github.theredbrain.bamcontent.effect.ChickenMealFoodEffect;
import com.github.theredbrain.bamcontent.effect.RedMushroomFoodEffect;
import com.github.theredbrain.bamcontent.util.AttributeModifierUUIDs;
import com.github.theredbrain.bamcore.api.util.BetterAdventureModeEntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class StatusEffectsRegistry {

    // food effects
    public static final StatusEffect BERRY_FOOD_EFFECT = new BerryFoodEffect()
            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, AttributeModifierUUIDs.BERRY_FOOD_EFFECT, 20.0F, EntityAttributeModifier.Operation.ADDITION)
//            .addAttributeModifier(BetterAdventureModeEntityAttributes.BAM_HEALTH_REGENERATION, AttributeModifierUUIDs.BERRY_FOOD_EFFECT, 1.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.MAX_STAMINA, AttributeModifierUUIDs.BERRY_FOOD_EFFECT, 25.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.STAMINA_REGENERATION, AttributeModifierUUIDs.BERRY_FOOD_EFFECT, 1.0F, EntityAttributeModifier.Operation.ADDITION);

    public static final StatusEffect BROWN_MUSHROOM_FOOD_EFFECT = new BrownMushroomFoodEffect()
            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, AttributeModifierUUIDs.BROWN_MUSHROOM_FOOD_EFFECT, 10.0F, EntityAttributeModifier.Operation.ADDITION)
//            .addAttributeModifier(BetterAdventureModeEntityAttributes.BAM_HEALTH_REGENERATION, AttributeModifierUUIDs.BROWN_MUSHROOM_FOOD_EFFECT, 1.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.MAX_STAMINA, AttributeModifierUUIDs.BROWN_MUSHROOM_FOOD_EFFECT, 30.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.STAMINA_REGENERATION, AttributeModifierUUIDs.BROWN_MUSHROOM_FOOD_EFFECT, 1.0F, EntityAttributeModifier.Operation.ADDITION);

    public static final StatusEffect CHICKEN_MEAL_FOOD_EFFECT = new ChickenMealFoodEffect()
            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, AttributeModifierUUIDs.CHICKEN_MEAL_FOOD_EFFECT, 60.0F, EntityAttributeModifier.Operation.ADDITION)
//            .addAttributeModifier(BetterAdventureModeEntityAttributes.BAM_HEALTH_REGENERATION, AttributeModifierUUIDs.CHICKEN_MEAL_FOOD_EFFECT, 3.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.MAX_STAMINA, AttributeModifierUUIDs.CHICKEN_MEAL_FOOD_EFFECT, 50.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.STAMINA_REGENERATION, AttributeModifierUUIDs.CHICKEN_MEAL_FOOD_EFFECT, 3.0F, EntityAttributeModifier.Operation.ADDITION);

    public static final StatusEffect RED_MUSHROOM_FOOD_EFFECT = new RedMushroomFoodEffect()
            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, AttributeModifierUUIDs.RED_MUSHROOM_FOOD_EFFECT, 40.0F, EntityAttributeModifier.Operation.ADDITION)
//            .addAttributeModifier(BetterAdventureModeEntityAttributes.BAM_HEALTH_REGENERATION, AttributeModifierUUIDs.RED_MUSHROOM_FOOD_EFFECT, 2.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.MAX_STAMINA, AttributeModifierUUIDs.RED_MUSHROOM_FOOD_EFFECT, 35.0F, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(BetterAdventureModeEntityAttributes.STAMINA_REGENERATION, AttributeModifierUUIDs.RED_MUSHROOM_FOOD_EFFECT, 2.0F, EntityAttributeModifier.Operation.ADDITION);

    public static void registerEffects() {

        // food effects
        Registry.register(Registries.STATUS_EFFECT, BetterAdventureModeContent.identifier("berry_food_effect"), BERRY_FOOD_EFFECT);
        Registry.register(Registries.STATUS_EFFECT, BetterAdventureModeContent.identifier("brown_mushroom_food_effect"), BROWN_MUSHROOM_FOOD_EFFECT);
        Registry.register(Registries.STATUS_EFFECT, BetterAdventureModeContent.identifier("chicken_meal_food_effect"), CHICKEN_MEAL_FOOD_EFFECT);
        Registry.register(Registries.STATUS_EFFECT, BetterAdventureModeContent.identifier("red_mushroom_food_effect"), RED_MUSHROOM_FOOD_EFFECT);
    }
}
