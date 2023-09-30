package com.github.theredbrain.bamcontent.registry;

import com.github.theredbrain.bamcontent.BetterAdventureModeContent;
import com.github.theredbrain.bamcontent.block.InteractiveAdventureFullToAirBlock;
import com.github.theredbrain.bamcontent.block.InteractiveAdventureLogBlock;
import com.github.theredbrain.bamcontent.block.InteractiveAdventurePlantBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import org.jetbrains.annotations.Nullable;

public class BlockRegistry {

    // interactive barrier blocks
    public static final Block INTERACTIVE_STONE_BLOCK = registerBlock("interactive_stone_block", new InteractiveAdventureFullToAirBlock(Tags.INTERACTIVE_STONE_BLOCK_TOOLS, true, 1/*TODO play test*/, FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).ticksRandomly().sounds(BlockSoundGroup.STONE)), ItemGroupRegistry.BAM_BLOCK);

    // interactive log blocks
    public static final Block INTERACTIVE_OAK_LOG = registerBlock("interactive_oak_log", new InteractiveAdventureLogBlock(Tags.INTERACTIVE_OAK_LOG_TOOLS, true, 1/*TODO play test*/, FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).burnable().ticksRandomly().sounds(BlockSoundGroup.WOOD)), ItemGroupRegistry.BAM_BLOCK);

    // interactive plant blocks
    public static final Block INTERACTIVE_BERRY_BUSH_BLOCK = registerBlock("interactive_berry_bush", new InteractiveAdventurePlantBlock(1, null, false, 1/*TODO play test*/, FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).notSolid().pistonBehavior(PistonBehavior.DESTROY).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ItemGroupRegistry.BAM_BLOCK);
    public static final Block INTERACTIVE_RED_MUSHROOM_BLOCK = registerBlock("interactive_red_mushroom", new InteractiveAdventurePlantBlock(0, null, false, 1/*TODO play test*/, FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).notSolid().pistonBehavior(PistonBehavior.DESTROY).ticksRandomly().noCollision().sounds(BlockSoundGroup.CROP)), ItemGroupRegistry.BAM_BLOCK);
    public static final Block INTERACTIVE_BROWN_MUSHROOM_BLOCK = registerBlock("interactive_brown_mushroom", new InteractiveAdventurePlantBlock(0, null, false, 1/*TODO play test*/, FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).notSolid().pistonBehavior(PistonBehavior.DESTROY).ticksRandomly().noCollision().sounds(BlockSoundGroup.CROP)), ItemGroupRegistry.BAM_BLOCK);

    // interactive food blocks
//    public static final Block INTERACTIVE_CHICKEN_MEAL_BLOCK = registerBlock("interactive_chicken_meal", new InteractiveAdventureFoodBlock(new StatusEffectInstance(StatusEffectsRegistry.CHICKEN_MEAL_FOOD_EFFECT, 600, 0, false, false, true), 1,/*TODO play test*/ FabricBlockSettings.create().mapColor(MapColor.CLEAR).pistonBehavior(PistonBehavior.DESTROY).ticksRandomly().sounds(BlockSoundGroup.WOOL)), ItemGroupRegistry.BAM_BLOCK);

    private static Block registerBlock(String name, Block block, @Nullable RegistryKey<ItemGroup> itemGroup) {

        Registry.register(Registries.ITEM, BetterAdventureModeContent.identifier(name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(block));
        return Registry.register(Registries.BLOCK, BetterAdventureModeContent.identifier(name), block);
    }

    public static void init() {}
}
