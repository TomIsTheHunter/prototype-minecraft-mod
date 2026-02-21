package com.driftshale.datagen;

import com.driftshale.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder) {
        builder.add("itemGroup.driftshale.driftshale", "Driftshale");
        builder.add(ModBlocks.BIRD_POOP, "Bird Poop");
        builder.add(ModBlocks.RED_ALGAE, "Red Algae");
        builder.add(ModBlocks.DRIFTSHALE, "Driftshale");
        builder.add(ModBlocks.DRIFTSHALE_STAIRS, "Driftshale Stairs");
        builder.add(ModBlocks.DRIFTSHALE_SLAB, "Driftshale Slab");
        builder.add(ModBlocks.COBBLED_DRIFTSHALE, "Cobbled Driftshale");
        builder.add(ModBlocks.COBBLED_DRIFTSHALE_STAIRS, "Cobbled Driftshale Stairs");
        builder.add(ModBlocks.COBBLED_DRIFTSHALE_SLAB, "Cobbled Driftshale Slab");
        builder.add(ModBlocks.POLISHED_DRIFTSHALE, "Polished Driftshale");
        builder.add(ModBlocks.POLISHED_DRIFTSHALE_STAIRS, "Polished Driftshale Stairs");
        builder.add(ModBlocks.POLISHED_DRIFTSHALE_SLAB, "Polished Driftshale Slab");
        builder.add(ModBlocks.DRIFTSHALE_BRICKS, "Driftshale Bricks");
        builder.add(ModBlocks.DRIFTSHALE_BRICKS_STAIRS, "Driftshale Bricks Stairs");
        builder.add(ModBlocks.DRIFTSHALE_BRICKS_SLAB, "Driftshale Bricks Slab");
        builder.add(ModBlocks.DRIFTSHALE_TILES, "Driftshale Tiles");
        builder.add(ModBlocks.DRIFTSHALE_TILES_STAIRS, "Driftshale Tiles Stairs");
        builder.add(ModBlocks.DRIFTSHALE_TILES_SLAB, "Driftshale Tiles Slab");
        builder.add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS, "Cracked Driftshale Bricks");
        builder.add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS, "Cracked Driftshale Bricks Stairs");
        builder.add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB, "Cracked Driftshale Bricks Slab");
        builder.add(ModBlocks.CRACKED_DRIFTSHALE_TILES, "Cracked Driftshale Tiles");
        builder.add(ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS, "Cracked Driftshale Tiles Stairs");
        builder.add(ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB, "Cracked Driftshale Tiles Slab");
        builder.add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE, "Red Algae Cobbled Driftshale");
        builder.add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS, "Red Algae Cobbled Driftshale Stairs");
        builder.add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB, "Red Algae Cobbled Driftshale Slab");
        builder.add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS, "Red Algae Driftshale Bricks");
        builder.add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS, "Red Algae Driftshale Bricks Stairs");
        builder.add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB, "Red Algae Driftshale Bricks Slab");
        builder.add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES, "Red Algae Driftshale Tiles");
        builder.add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS, "Red Algae Driftshale Tiles Stairs");
        builder.add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB, "Red Algae Driftshale Tiles Slab");
        builder.add(ModBlocks.DRIFTSHALE_PILLAR, "Driftshale Pillar");
    }
}
