package com.driftshale;

import com.driftshale.block.ModBlocks;
import com.driftshale.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriftshaleMod implements ModInitializer {
    public static final String MOD_ID = "driftshale";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItemGroups.initialize();
    }
}
