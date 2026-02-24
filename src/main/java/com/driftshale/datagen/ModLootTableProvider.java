package com.driftshale.datagen;

import com.driftshale.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BIRD_POOP);
        addDrop(ModBlocks.RED_ALGAE);
        addDrop(ModBlocks.DRIFTSHALE);
        addDrop(ModBlocks.DRIFTSHALE_STAIRS);
        addDrop(ModBlocks.DRIFTSHALE_SLAB);
        addDrop(ModBlocks.COBBLED_DRIFTSHALE);
        addDrop(ModBlocks.COBBLED_DRIFTSHALE_STAIRS);
        addDrop(ModBlocks.COBBLED_DRIFTSHALE_SLAB);
        addDrop(ModBlocks.POLISHED_DRIFTSHALE);
        addDrop(ModBlocks.POLISHED_DRIFTSHALE_STAIRS);
        addDrop(ModBlocks.POLISHED_DRIFTSHALE_SLAB);
        addDrop(ModBlocks.DRIFTSHALE_BRICKS);
        addDrop(ModBlocks.DRIFTSHALE_BRICKS_STAIRS);
        addDrop(ModBlocks.DRIFTSHALE_BRICKS_SLAB);
        addDrop(ModBlocks.DRIFTSHALE_TILES);
        addDrop(ModBlocks.DRIFTSHALE_TILES_STAIRS);
        addDrop(ModBlocks.DRIFTSHALE_TILES_SLAB);
        addDrop(ModBlocks.CRACKED_DRIFTSHALE_BRICKS);
        addDrop(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB);
        addDrop(ModBlocks.CRACKED_DRIFTSHALE_TILES);
        addDrop(ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS);
        addDrop(ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_STAIRS);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_SLAB);
        addDrop(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE);
        addDrop(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS);
        addDrop(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS);
        addDrop(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB);
        addDrop(ModBlocks.DRIFTSHALE_PILLAR);
    }
}
