package com.buton.money.item;

import com.buton.money.MoneyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item Euro5 = registerItem("five_euros",
            new Item(new FabricItemSettings().group(ModItemGroup.Banknotes)));
    public static final Item Euro10 = registerItem("ten_euros",
            new Item(new FabricItemSettings().group(ModItemGroup.Banknotes)));
    public static final Item Euro20 = registerItem("twenty_euros",
            new Item(new FabricItemSettings().group(ModItemGroup.Banknotes)));
    public static final Item Dollar1 = registerItem("one_dollar",
            new Item(new FabricItemSettings().group(ModItemGroup.Banknotes)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoneyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoneyMod.LOGGER.debug("Registering Mod Items for " + MoneyMod.MOD_ID);
    }
}