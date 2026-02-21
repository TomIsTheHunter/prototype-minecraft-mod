package com.driftshale.datagen;

import com.driftshale.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DRIFTSHALE, ModBlocks.DRIFTSHALE_STAIRS, ModBlocks.DRIFTSHALE_SLAB)
                .add(ModBlocks.COBBLED_DRIFTSHALE, ModBlocks.COBBLED_DRIFTSHALE_STAIRS, ModBlocks.COBBLED_DRIFTSHALE_SLAB)
                .add(ModBlocks.POLISHED_DRIFTSHALE, ModBlocks.POLISHED_DRIFTSHALE_STAIRS, ModBlocks.POLISHED_DRIFTSHALE_SLAB)
                .add(ModBlocks.DRIFTSHALE_BRICKS, ModBlocks.DRIFTSHALE_BRICKS_STAIRS, ModBlocks.DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.DRIFTSHALE_TILES, ModBlocks.DRIFTSHALE_TILES_STAIRS, ModBlocks.DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS, ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS, ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.CRACKED_DRIFTSHALE_TILES, ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS, ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE, ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS, ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS, ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS, ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES, ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS, ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.DRIFTSHALE_PILLAR);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DRIFTSHALE, ModBlocks.DRIFTSHALE_STAIRS, ModBlocks.DRIFTSHALE_SLAB)
                .add(ModBlocks.COBBLED_DRIFTSHALE, ModBlocks.COBBLED_DRIFTSHALE_STAIRS, ModBlocks.COBBLED_DRIFTSHALE_SLAB)
                .add(ModBlocks.POLISHED_DRIFTSHALE, ModBlocks.POLISHED_DRIFTSHALE_STAIRS, ModBlocks.POLISHED_DRIFTSHALE_SLAB)
                .add(ModBlocks.DRIFTSHALE_BRICKS, ModBlocks.DRIFTSHALE_BRICKS_STAIRS, ModBlocks.DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.DRIFTSHALE_TILES, ModBlocks.DRIFTSHALE_TILES_STAIRS, ModBlocks.DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS, ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS, ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.CRACKED_DRIFTSHALE_TILES, ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS, ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE, ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS, ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS, ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS, ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES, ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS, ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.DRIFTSHALE_PILLAR);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.DRIFTSHALE_SLAB)
                .add(ModBlocks.COBBLED_DRIFTSHALE_SLAB)
                .add(ModBlocks.POLISHED_DRIFTSHALE_SLAB)
                .add(ModBlocks.DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB)
                .add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.DRIFTSHALE_STAIRS)
                .add(ModBlocks.COBBLED_DRIFTSHALE_STAIRS)
                .add(ModBlocks.POLISHED_DRIFTSHALE_STAIRS)
                .add(ModBlocks.DRIFTSHALE_BRICKS_STAIRS)
                .add(ModBlocks.DRIFTSHALE_TILES_STAIRS)
                .add(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS)
                .add(ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS)
                .add(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS)
                .add(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS);
    }
}
