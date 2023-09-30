package com.github.theredbrain.bamcontent.registry;

import com.github.theredbrain.bamcontent.BetterAdventureModeContent;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class Tags {
    public static final TagKey<Item> INTERACTIVE_STONE_BLOCK_TOOLS = TagKey.of(RegistryKeys.ITEM, BetterAdventureModeContent.identifier("tools/interactive_stone_block_tools"));
    public static final TagKey<Item> INTERACTIVE_OAK_LOG_TOOLS = TagKey.of(RegistryKeys.ITEM, BetterAdventureModeContent.identifier("tools/interactive_oak_log_tools"));
}
