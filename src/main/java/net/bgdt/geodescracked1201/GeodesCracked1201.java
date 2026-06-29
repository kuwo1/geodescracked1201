package net.bgdt.geodescracked1201;

import net.bgdt.geodescracked1201.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeodesCracked1201 implements ModInitializer {
	public static final String MOD_ID = "geodescracked1201";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
