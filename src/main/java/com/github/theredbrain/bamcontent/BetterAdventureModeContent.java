package com.github.theredbrain.bamcontent;

import com.github.theredbrain.bamcontent.registry.BlockRegistry;
import com.github.theredbrain.bamcontent.registry.ItemGroupRegistry;
import com.github.theredbrain.bamcontent.registry.ItemRegistry;
import com.github.theredbrain.bamcontent.registry.StatusEffectsRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterAdventureModeContent implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "bamcontent";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("So many shinies!");
		BlockRegistry.init();
		ItemRegistry.init();
		ItemGroupRegistry.init();
		StatusEffectsRegistry.registerEffects();
	}

	public static Identifier identifier(String path) {
		return new Identifier(MOD_ID, path);
	}
}