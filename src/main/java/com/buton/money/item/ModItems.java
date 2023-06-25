package com.buton.money.item;

import com.buton.money.MoneyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Euro5 = registerItem("five_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro10 = registerItem("ten_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro20 = registerItem("twenty_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro50 = registerItem("fifty_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro100 = registerItem("hundred_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro200 = registerItem("two_hundred_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro500 = registerItem("five_hundred_euros",
            new Item(new FabricItemSettings()));
    public static final Item Dollar1 = registerItem("one_dollar",
            new Item(new FabricItemSettings()));
    public static final Item Dollar2 = registerItem("two_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar5 = registerItem("five_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar10 = registerItem("ten_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar20 = registerItem("twenty_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar50 = registerItem("fifty_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar100 = registerItem("hundred_dollars",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoneyMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroups(){
        addToItemGroup(ModItemGroup.Banknotes, Euro5);
        addToItemGroup(ModItemGroup.Banknotes, Euro10);
        addToItemGroup(ModItemGroup.Banknotes, Euro20);
        addToItemGroup(ModItemGroup.Banknotes, Euro50);
        addToItemGroup(ModItemGroup.Banknotes, Euro100);
        addToItemGroup(ModItemGroup.Banknotes, Euro200);
        addToItemGroup(ModItemGroup.Banknotes, Euro500);

        addToItemGroup(ModItemGroup.Banknotes, Dollar1);
        addToItemGroup(ModItemGroup.Banknotes, Dollar2);
        addToItemGroup(ModItemGroup.Banknotes, Dollar5);
        addToItemGroup(ModItemGroup.Banknotes, Dollar10);
        addToItemGroup(ModItemGroup.Banknotes, Dollar20);
        addToItemGroup(ModItemGroup.Banknotes, Dollar50);
        addToItemGroup(ModItemGroup.Banknotes, Dollar100);
    }
    public static void addToItemGroup(ItemGroup group, Item item) {
        if (group != null){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    } else {
        MoneyMod.LOGGER.warn("Null Group!");
        }
    }
    public static void registerModItems() {

        MoneyMod.LOGGER.debug("Registering Mod Items for " + MoneyMod.MOD_ID);
        addItemsToItemGroups();
    }
}