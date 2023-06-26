package com.buton.money.item;

import com.buton.money.MoneyMod;
import net.fabricmc.fabric.api.client.itemgroup.v1.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

public class ModItemGroup {
    public static ItemGroup Banknotes = FabricItemGroupBuilder.create(
                    new Identifier(MoneyMod.MOD_ID, "five_euros"))
            .icon(() -> new ItemStack(ModItems.Euro5))
            .appendItems(stacks -> {
                stacks.add(ModItems.Euro5);
                stacks.add(ModItems.Euro10);
                stacks.add(ModItems.Euro20);
                stacks.add(ModItems.Euro50);
                stacks.add(ModItems.Euro100);
                stacks.add(ModItems.Euro200);
                stacks.add(ModItems.Euro500);
                stacks.add(ModItems.Dollar1);
                stacks.add(ModItems.Dollar2);
                stacks.add(ModItems.Dollar5);
                stacks.add(ModItems.Dollar10);
                stacks.add(ModItems.Dollar20);
                stacks.add(ModItems.Dollar50);
                stacks.add(ModItems.Dollar100);
            })
            .build();

    public static void registerItemGroup() {
        ItemGroup.GROUPS.get(0).addItems(Banknotes);
    }
}