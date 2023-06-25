package com.buton.money.item;


import com.buton.money.MoneyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup Banknotes;

        public static void registerItemGroup() {
            Banknotes = FabricItemGroup.builder(new Identifier(MoneyMod.MOD_ID, "five_euros"))
                    .displayName(Text.literal("Buton's Money Mod"))
                    .icon(() -> new ItemStack(ModItems.Euro5)).build();
        }
}