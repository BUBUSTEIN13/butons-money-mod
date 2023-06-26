package com.buton.money.item;


import com.buton.money.MoneyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup Banknotes = Registry.register(Registries.ITEM_GROUP, new Identifier(MoneyMod.MOD_ID, "five_euros"),
            FabricItemGroup.builder().displayName(Text.translatable("Buton's Money Mod")).icon(() -> new ItemStack(ModItems.Euro5)).entries((displayContext, entries) -> {
                entries.add(ModItems.Euro5);
                entries.add(ModItems.Euro10);
                entries.add(ModItems.Euro20);
                entries.add(ModItems.Euro50);
                entries.add(ModItems.Euro100);
                entries.add(ModItems.Euro200);
                entries.add(ModItems.Euro500);

                entries.add(ModItems.Dollar1);
                entries.add(ModItems.Dollar2);
                entries.add(ModItems.Dollar5);
                entries.add(ModItems.Dollar10);
                entries.add(ModItems.Dollar20);
                entries.add(ModItems.Dollar50);
                entries.add(ModItems.Dollar100);

            }).build());

    public static void registerItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

        });
    }
}