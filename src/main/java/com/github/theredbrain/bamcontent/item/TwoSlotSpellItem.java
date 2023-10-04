package com.github.theredbrain.bamcontent.item;

import com.github.theredbrain.bamcore.api.util.BetterAdventureModeCoreEntityAttributes;
import com.github.theredbrain.bamcore.util.AttributeModifierUUIDs;
import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.spell_engine.api.item.trinket.SpellBookItem;

import java.util.UUID;

public class TwoSlotSpellItem extends SpellBookItem {
    public TwoSlotSpellItem(Identifier poolId, Settings settings) {
        super(poolId, settings);
    }
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> map = super.getModifiers(stack, slot, entity, uuid);

        switch (slot.inventory().getSlotType().getGroup()) {
            case "spell_slot_1":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_1),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_2":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_2),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_3":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_3),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_4":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_4),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_5":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_5),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_6":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_6),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_7":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_7),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
            case "spell_slot_8":
                map.put(BetterAdventureModeCoreEntityAttributes.ACTIVE_SPELL_SLOT_AMOUNT,
                        new EntityAttributeModifier(UUID.fromString(AttributeModifierUUIDs.SPELL_SLOT_8),
                                "active_spell_slot_amount", -1.0, EntityAttributeModifier.Operation.ADDITION));
                break;
        }
        return map;
    }

}
