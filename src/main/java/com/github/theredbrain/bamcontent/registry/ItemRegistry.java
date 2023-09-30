package com.github.theredbrain.bamcontent.registry;

import com.github.theredbrain.bamcontent.BetterAdventureModeContent;
import com.github.theredbrain.bamcontent.item.*;
import com.github.theredbrain.bamcore.api.item.AdventureFoodConsumable;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
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
    public static final Item LEATHER_GLOVES = registerItem("leather_gloves", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item LEATHER_SHOULDERS = registerItem("leather_shoulders", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item CHAINMAIL_GLOVES = registerItem("chainmail_gloves", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item CHAINMAIL_SHOULDERS = registerItem("chainmail_shoulders", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item IRON_GLOVES = registerItem("iron_gloves", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item IRON_SHOULDERS = registerItem("iron_shoulders", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item DIAMOND_GLOVES = registerItem("diamond_gloves", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item DIAMOND_SHOULDERS = registerItem("diamond_shoulders", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item GOLDEN_GLOVES = registerItem("golden_gloves", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item GOLDEN_SHOULDERS = registerItem("golden_shoulders", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

    public static final Item NETHERITE_GLOVES = registerItem("netherite_gloves", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);
    public static final Item NETHERITE_SHOULDERS = registerItem("netherite_shoulders", new ArmorTrinketItem(new FabricItemSettings().maxCount(1)), ItemGroupRegistry.BAM_EQUIPMENT);

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
