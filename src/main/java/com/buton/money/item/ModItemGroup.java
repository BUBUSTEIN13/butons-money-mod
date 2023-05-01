package com.buton.money.item;


import com.buton.money.MoneyMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Banknotes = FabricItemGroupBuilder.build(
            new Identifier(MoneyMod.MOD_ID, "five_euros"), () -> new ItemStack(ModItems.Euro5));
}