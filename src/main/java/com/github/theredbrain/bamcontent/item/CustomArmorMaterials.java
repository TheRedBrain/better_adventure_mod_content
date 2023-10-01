package com.github.theredbrain.bamcontent.item;
//
//import net.minecraft.item.ArmorItem;
//import net.minecraft.item.ArmorMaterial;
//import net.minecraft.item.Items;
//import net.minecraft.recipe.Ingredient;
//import net.minecraft.sound.SoundEvent;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.util.StringIdentifiable;
//import net.minecraft.util.Util;
//
//import java.util.EnumMap;
//
//public enum CustomArmorMaterials implements StringIdentifiable, ArmorMaterial {
//    LEATHER("leather", 5, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 1);
//        map.put(ArmorItem.Type.LEGGINGS, 2);
//        map.put(ArmorItem.Type.CHESTPLATE, 3);
//        map.put(ArmorItem.Type.HELMET, 1);
//    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.LEATHER)),
//    CHAINMAIL("chainmail", 15, Util.make(new EnumMap<ArmorItem.Type, V>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 1);
//        map.put(ArmorItem.Type.LEGGINGS, 4);
//        map.put(ArmorItem.Type.CHESTPLATE, 5);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
//    IRON("iron", 15, Util.make(new EnumMap<ArmorItem.Type, V>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 2);
//        map.put(ArmorItem.Type.LEGGINGS, 5);
//        map.put(ArmorItem.Type.CHESTPLATE, 6);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
//    GOLD("gold", 7, Util.make(new EnumMap<ArmorItem.Type, V>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 1);
//        map.put(ArmorItem.Type.LEGGINGS, 3);
//        map.put(ArmorItem.Type.CHESTPLATE, 5);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
//    DIAMOND("diamond", 33, Util.make(new EnumMap<ArmorItem.Type, V>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 3);
//        map.put(ArmorItem.Type.LEGGINGS, 6);
//        map.put(ArmorItem.Type.CHESTPLATE, 8);
//        map.put(ArmorItem.Type.HELMET, 3);
//    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f, () -> Ingredient.ofItems(Items.DIAMOND)),
//    TURTLE("turtle", 25, Util.make(new EnumMap<ArmorItem.Type, V>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 2);
//        map.put(ArmorItem.Type.LEGGINGS, 5);
//        map.put(ArmorItem.Type.CHESTPLATE, 6);
//        map.put(ArmorItem.Type.HELMET, 2);
//    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.SCUTE)),
//    NETHERITE("netherite", 37, Util.make(new EnumMap<ArmorItem.Type, V>(ArmorItem.Type.class), map -> {
//        map.put(ArmorItem.Type.BOOTS, 3);
//        map.put(ArmorItem.Type.LEGGINGS, 6);
//        map.put(ArmorItem.Type.CHESTPLATE, 8);
//        map.put(ArmorItem.Type.HELMET, 3);
//    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));
//
//    @Override
//    public int getDurability(ArmorItem.Type type) {
//        return 0;
//    }
//
//    @Override
//    public int getProtection(ArmorItem.Type type) {
//        return 0;
//    }
//
//    @Override
//    public int getEnchantability() {
//        return 0;
//    }
//
//    @Override
//    public SoundEvent getEquipSound() {
//        return null;
//    }
//
//    @Override
//    public Ingredient getRepairIngredient() {
//        return null;
//    }
//
//    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    public float getToughness() {
//        return 0;
//    }
//
//    @Override
//    public float getKnockbackResistance() {
//        return 0;
//    }
//
//    @Override
//    public String asString() {
//        return null;
//    }
//}
