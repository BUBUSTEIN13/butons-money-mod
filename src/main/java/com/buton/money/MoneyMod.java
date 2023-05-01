package com.buton.money;

import net.fabricmc.api.ModInitializer;
import com.buton.money.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



// Very important comment
public class MoneyMod implements ModInitializer {
    public static final String MOD_ID = "butonmoneymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();

    }
}