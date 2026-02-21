package com.driftshale.item;

import com.driftshale.DriftshaleMod;
import com.driftshale.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DRIFTSHALE_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(DriftshaleMod.MOD_ID, "driftshale"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.DRIFTSHALE))
                    .displayName(Text.translatable("itemGroup.driftshale.driftshale"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DRIFTSHALE);
                        entries.add(ModBlocks.DRIFTSHALE_STAIRS);
                        entries.add(ModBlocks.DRIFTSHALE_SLAB);
                        entries.add(ModBlocks.COBBLED_DRIFTSHALE);
                        entries.add(ModBlocks.COBBLED_DRIFTSHALE_STAIRS);
                        entries.add(ModBlocks.COBBLED_DRIFTSHALE_SLAB);
                        entries.add(ModBlocks.POLISHED_DRIFTSHALE);
                        entries.add(ModBlocks.POLISHED_DRIFTSHALE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DRIFTSHALE_SLAB);
                        entries.add(ModBlocks.DRIFTSHALE_BRICKS);
                        entries.add(ModBlocks.DRIFTSHALE_BRICKS_STAIRS);
                        entries.add(ModBlocks.DRIFTSHALE_BRICKS_SLAB);
                        entries.add(ModBlocks.DRIFTSHALE_TILES);
                        entries.add(ModBlocks.DRIFTSHALE_TILES_STAIRS);
                        entries.add(ModBlocks.DRIFTSHALE_TILES_SLAB);
                        entries.add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS);
                        entries.add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_DRIFTSHALE_TILES);
                        entries.add(ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS);
                        entries.add(ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB);
                        entries.add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE);
                        entries.add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS);
                        entries.add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB);
                        entries.add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS);
                        entries.add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS);
                        entries.add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB);
                        entries.add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES);
                        entries.add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS);
                        entries.add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB);
                        entries.add(ModBlocks.DRIFTSHALE_PILLAR);
                        entries.add(ModBlocks.BIRD_POOP);
                        entries.add(ModBlocks.RED_ALGAE);
                    })
                    .build()
    );

    public static void initialize() {
        DriftshaleMod.LOGGER.info("Registering item groups for " + DriftshaleMod.MOD_ID);
    }
}
