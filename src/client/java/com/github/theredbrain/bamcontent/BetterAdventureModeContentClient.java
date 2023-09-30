package com.github.theredbrain.bamcontent;

import net.fabricmc.api.ClientModInitializer;
import net.spell_engine.api.render.CustomModels;

import java.util.List;

public class BetterAdventureModeContentClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		registerTransparency();
		registerSpellModels();
		registerEntityRenderer();
	}

	private void registerTransparency() {
//		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.INTERACTIVE_BERRY_BUSH_BLOCK, RenderLayer.getCutout());
//		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.INTERACTIVE_RED_MUSHROOM_BLOCK, RenderLayer.getCutout());
//		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.INTERACTIVE_BROWN_MUSHROOM_BLOCK, RenderLayer.getCutout());
	}

	private void registerSpellModels() {
		CustomModels.registerModelIds(List.of(
				BetterAdventureModeContent.identifier("projectile/test_spell_projectile")
		));
	}

	private void registerEntityRenderer() {
//        EntityRendererRegistry.register(EntityRegistry.CENTAUR_MOUNT, CentaurMountEntityRenderer::new);
	}
}