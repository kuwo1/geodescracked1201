package net.bgdt.geodescracked1201.item;

import net.bgdt.geodescracked1201.GeodesCracked1201;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import org.intellij.lang.annotations.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(GeodesCracked1201.MOD_ID, name), item)
    }

    public static void registerModItems() {
        GeodesCracked1201.LOGGER.info("Registering Mod Items for" + GeodesCracked1201.MOD_ID);
    }
}
