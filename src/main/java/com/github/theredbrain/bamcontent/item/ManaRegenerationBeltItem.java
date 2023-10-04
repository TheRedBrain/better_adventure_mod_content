package com.github.theredbrain.bamcontent.item;

import com.github.theredbrain.bamcore.api.util.BetterAdventureModeCoreStatusEffects;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

public class ManaRegenerationBeltItem extends TrinketItem {
    public ManaRegenerationBeltItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isDamageable() {
        return this.getMaxDamage() > 1;
    }

    /**
     * Called when an entity equips a trinket
     *
     * @param stack The stack being equipped
     * @param slot The slot the stack is equipped to
     * @param entity The entity that equipped the stack
     */
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(BetterAdventureModeCoreStatusEffects.MANA_REGENERATION_EFFECT, -1, 0, false, false, true));
    }

    /**
     * Called when an entity equips a trinket
     *
     * @param stack The stack being unequipped
     * @param slot The slot the stack was unequipped from
     * @param entity The entity that unequipped the stack
     */
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(BetterAdventureModeCoreStatusEffects.MANA_REGENERATION_EFFECT);
    }
}
