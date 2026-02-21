package com.driftshale.datagen;

import com.driftshale.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModBlockStateModelProvider extends FabricModelProvider {
    public ModBlockStateModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        // --- Nature blocks ---
        // Bird Poop: multiface block (like glow lichen)
        gen.registerMultifaceBlock(ModBlocks.BIRD_POOP);
        // Red Algae: cross plant (same model for all waterlogged states)
        gen.registerTintableCross(ModBlocks.RED_ALGAE, BlockStateModelGenerator.TintType.NOT_TINTED);

        // --- Base Driftshale ---
        gen.registerCubeAllModelTexturePool(ModBlocks.DRIFTSHALE)
                .stairs(ModBlocks.DRIFTSHALE_STAIRS)
                .slab(ModBlocks.DRIFTSHALE_SLAB);

        // --- Cobbled Driftshale ---
        gen.registerCubeAllModelTexturePool(ModBlocks.COBBLED_DRIFTSHALE)
                .stairs(ModBlocks.COBBLED_DRIFTSHALE_STAIRS)
                .slab(ModBlocks.COBBLED_DRIFTSHALE_SLAB);

        // --- Polished Driftshale ---
        gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRIFTSHALE)
                .stairs(ModBlocks.POLISHED_DRIFTSHALE_STAIRS)
                .slab(ModBlocks.POLISHED_DRIFTSHALE_SLAB);

        // --- Driftshale Bricks ---
        gen.registerCubeAllModelTexturePool(ModBlocks.DRIFTSHALE_BRICKS)
                .stairs(ModBlocks.DRIFTSHALE_BRICKS_STAIRS)
                .slab(ModBlocks.DRIFTSHALE_BRICKS_SLAB);

        // --- Driftshale Tiles ---
        gen.registerCubeAllModelTexturePool(ModBlocks.DRIFTSHALE_TILES)
                .stairs(ModBlocks.DRIFTSHALE_TILES_STAIRS)
                .slab(ModBlocks.DRIFTSHALE_TILES_SLAB);

        // --- Cracked Driftshale Bricks ---
        gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_DRIFTSHALE_BRICKS)
                .stairs(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS)
                .slab(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB);

        // --- Cracked Driftshale Tiles ---
        gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_DRIFTSHALE_TILES)
                .stairs(ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS)
                .slab(ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB);

        // --- Red Algae Cobbled Driftshale ---
        gen.registerCubeAllModelTexturePool(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE)
                .stairs(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS)
                .slab(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB);

        // --- Red Algae Driftshale Bricks ---
        gen.registerCubeAllModelTexturePool(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS)
                .stairs(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS)
                .slab(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB);

        // --- Red Algae Driftshale Tiles ---
        gen.registerCubeAllModelTexturePool(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES)
                .stairs(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS)
                .slab(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB);

        // --- Driftshale Pillar (axis-rotatable, separate top and side textures) ---
        gen.registerAxisRotated(ModBlocks.DRIFTSHALE_PILLAR, TexturedModel.END_FOR_TOP_COLUMNS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        // Bird poop and red algae use generated item models (flat sprite)
        gen.register(ModBlocks.BIRD_POOP.asItem(), Models.GENERATED);
        gen.register(ModBlocks.RED_ALGAE.asItem(), Models.GENERATED);
    }
}
