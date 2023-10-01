package com.github.theredbrain.bamcontent.registry;

import com.github.theredbrain.bamcontent.BetterAdventureModeContent;
import com.github.theredbrain.bamcontent.item.*;
import com.github.theredbrain.bamcore.api.item.AdventureFoodConsumable;
import com.github.theredbrain.bamcore.api.item.ArmorTrinketItem;
import com.github.theredbrain.bamcore.api.item.CustomArmorItem;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.spell_engine.api.item.trinket.SpellBookItem;
import net.spell_engine.api.item.weapon.StaffItem;
import net.spell_engine.api.spell.SpellContainer;
import net.spell_engine.internals.SpellRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemRegistry {

    // armor
    // TODO

    public static final Item LEATHER_HELMET = registerItem("leather_helmet", new CustomArmorItem(0.5, ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(60)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item LEATHER_CHESTPLATE = registerItem("leather_chestplate", new CustomArmorItem(1, ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(60)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item LEATHER_LEGGINGS = registerItem("leather_leggings", new CustomArmorItem(1, ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(60)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item LEATHER_BOOTS = registerItem("leather_boots", new CustomArmorItem(0.5, ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(60)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item LEATHER_GLOVES = registerItem("leather_gloves", new ArmorTrinketItem(1, 0, 0.5, new FabricItemSettings().maxDamage(60)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item LEATHER_SHOULDERS = registerItem("leather_shoulders", new ArmorTrinketItem(1, 0, 0.5, new FabricItemSettings().maxDamage(60)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item CHAINMAIL_HELMET = registerItem("chainmail_helmet", new CustomArmorItem(1, ArmorMaterials.CHAIN, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(70)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item CHAINMAIL_CHESTPLATE = registerItem("chainmail_chestplate", new CustomArmorItem(2, ArmorMaterials.CHAIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(70)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item CHAINMAIL_LEGGINGS = registerItem("chainmail_leggings", new CustomArmorItem(2, ArmorMaterials.CHAIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(70)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item CHAINMAIL_BOOTS = registerItem("chainmail_boots", new CustomArmorItem(1, ArmorMaterials.CHAIN, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(70)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item CHAINMAIL_GLOVES = registerItem("chainmail_gloves", new ArmorTrinketItem(1, 0, 1, new FabricItemSettings().maxDamage(70)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item CHAINMAIL_SHOULDERS = registerItem("chainmail_shoulders", new ArmorTrinketItem(1, 0, 1, new FabricItemSettings().maxDamage(70)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item IRON_HELMET = registerItem("iron_helmet", new CustomArmorItem(2, ArmorMaterials.IRON, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(90)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item IRON_CHESTPLATE = registerItem("iron_chestplate", new CustomArmorItem(4, ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(90)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item IRON_LEGGINGS = registerItem("iron_leggings", new CustomArmorItem(4, ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(90)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item IRON_BOOTS = registerItem("iron_boots", new CustomArmorItem(2, ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(90)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item IRON_GLOVES = registerItem("iron_gloves", new ArmorTrinketItem(2, 0, 2, new FabricItemSettings().maxDamage(90)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item IRON_SHOULDERS = registerItem("iron_shoulders", new ArmorTrinketItem(2, 0, 2, new FabricItemSettings().maxDamage(90)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item DIAMOND_HELMET = registerItem("diamond_helmet", new CustomArmorItem(1.5, ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(40)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item DIAMOND_CHESTPLATE = registerItem("diamond_chestplate", new CustomArmorItem(3, ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(40)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item DIAMOND_LEGGINGS = registerItem("diamond_leggings", new CustomArmorItem(3, ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(40)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item DIAMOND_BOOTS = registerItem("diamond_boots", new CustomArmorItem(1.5, ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(40)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item DIAMOND_GLOVES = registerItem("diamond_gloves", new ArmorTrinketItem(3, 0.025, 1.5, new FabricItemSettings().maxDamage(40)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item DIAMOND_SHOULDERS = registerItem("diamond_shoulders", new ArmorTrinketItem(3, 0.025, 1.5, new FabricItemSettings().maxDamage(40)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item GOLDEN_HELMET = registerItem("golden_helmet", new CustomArmorItem(2.5, ArmorMaterials.GOLD, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item GOLDEN_CHESTPLATE = registerItem("golden_chestplate", new CustomArmorItem(5, ArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item GOLDEN_LEGGINGS = registerItem("golden_leggings", new CustomArmorItem(5, ArmorMaterials.GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item GOLDEN_BOOTS = registerItem("golden_boots", new CustomArmorItem(2.5, ArmorMaterials.GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item GOLDEN_GLOVES = registerItem("golden_gloves", new ArmorTrinketItem(1, 0, 2.5, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item GOLDEN_SHOULDERS = registerItem("golden_shoulders", new ArmorTrinketItem(1, 0, 2.5, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item NETHERITE_HELMET = registerItem("netherite_helmet", new CustomArmorItem(3, ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(120)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item NETHERITE_CHESTPLATE = registerItem("netherite_chestplate", new CustomArmorItem(6, ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxDamage(120)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item NETHERITE_LEGGINGS = registerItem("netherite_leggings", new CustomArmorItem(6, ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxDamage(120)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item NETHERITE_BOOTS = registerItem("netherite_boots", new CustomArmorItem(3, ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().maxDamage(120)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item NETHERITE_GLOVES = registerItem("netherite_gloves", new ArmorTrinketItem(4, 0.05, 3, new FabricItemSettings().maxDamage(120)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item NETHERITE_SHOULDERS = registerItem("netherite_shoulders", new ArmorTrinketItem(5, 0.05, 3, new FabricItemSettings().maxDamage(120)), ItemGroupRegistry.BAM_EQUIPMENT);

    // --- accessories ---
    // belts
    public static final Item TEST_BELT = registerItem("test_belt", new TrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    // necklaces
    public static final Item TEST_NECKLACE = registerItem("test_necklace", new TrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    // rings
    public static final Item TEST_RING = registerItem("test_ring", new TrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    // spell books
    public static final Item FIREBALL_SPELL_BOOK = registerSpellContainerItem("fireball_spell_book", new TwoSlotSpellItem(BetterAdventureModeContent.identifier("fireball"), new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT, List.of("rpgmod:fireball"));
    public static final Item FROST_NOVA_SPELL_BOOK = registerSpellContainerItem("frost_nova_spell_book", new SpellBookItem(BetterAdventureModeContent.identifier("frost_nova"), new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT, List.of("rpgmod:frost_nova"));

    // spell scrolls
    public static final Item FIREBALL_SPELL_SCROLL = registerItem("fireball_spell_scroll", new Item(new FabricItemSettings().maxCount(16)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item TEST_WAND = registerFilteredSpellProxyItem("test_wand", new StaffItem(ToolMaterials.WOOD, new FabricItemSettings().maxDamage(50)), ItemGroupRegistry.BAM_EQUIPMENT, List.of(), "rpgmod:test_wand_pool");

    public static final Item TWO_SPELL_SLOT_RING_ITEM = registerItem("two_spell_slot_ring", new TwoSpellSlotRingItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item TWO_HEALTH_REGENERATION_RING_ITEM = registerItem("two_health_regeneration_ring", new TwoHealthRegenerationRingItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    // food
    public static final Item BERRY_FOOD = registerItem("berry_food", new AdventureFoodConsumable(new FabricItemSettings().maxCount(16).food(AdventureFoodComponents.BERRY_FOOD)), ItemGroupRegistry.BAM_FOOD);
    public static final Item BROWN_MUSHROOM_FOOD = registerItem("brown_mushroom_food", new AdventureFoodConsumable(new FabricItemSettings().maxCount(16).food(AdventureFoodComponents.BROWN_MUSHROOM_FOOD)), ItemGroupRegistry.BAM_FOOD);
    public static final Item RED_MUSHROOM_FOOD = registerItem("red_mushroom_food", new AdventureFoodConsumable(new FabricItemSettings().maxCount(16).food(AdventureFoodComponents.RED_MUSHROOM_FOOD)), ItemGroupRegistry.BAM_FOOD);

    // weapons
    public static final Item ZWEIHANDER = registerItem("zweihander", new SwordItem(ToolMaterials.IRON, 7, -3.5F, new Item.Settings()), ItemGroupRegistry.BAM_EQUIPMENT);

    private static Item registerItem(String name, Item item, @Nullable RegistryKey<ItemGroup> itemGroup) {

        if (itemGroup != null) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
                content.add(item);
            });
        }
        return Registry.register(Registries.ITEM, BetterAdventureModeContent.identifier(name), item);
    }

    private static Item registerSpellContainerItem(String name, Item item, @Nullable RegistryKey<ItemGroup> itemGroup, List<String> spells) {

        SpellContainer container = new SpellContainer(false, null, 0, spells);
        SpellRegistry.book_containers.put(BetterAdventureModeContent.identifier(name), container);

        if (itemGroup != null) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
                content.add(item);
            });
        }
        return Registry.register(Registries.ITEM, BetterAdventureModeContent.identifier(name), item);
    }

    private static Item registerFilteredSpellProxyItem(String name, Item item, @Nullable RegistryKey<ItemGroup> itemGroup, List<String> spells, String proxyPool) {

        SpellContainer container = new SpellContainer(true, null, 0, spells);
//        ((DuckSpellContainerMixin) container).setProxyPool(proxyPool); // TODO build static api method in bamcore to set a proxy pool
        SpellRegistry.book_containers.put(BetterAdventureModeContent.identifier(name), container);

        if (itemGroup != null) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
                content.add(item);
            });
        }
        return Registry.register(Registries.ITEM, BetterAdventureModeContent.identifier(name), item);
    }

    public static void init() {
    }
}
