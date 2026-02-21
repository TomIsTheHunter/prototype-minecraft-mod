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
        // Nature blocks
        gen.registerMultifaceBlock(ModBlocks.BIRD_POOP);
        gen.registerTintableCrossBlockState(ModBlocks.RED_ALGAE, BlockStateModelGenerator.TintType.NOT_TINTED);

        // Base Driftshale
        gen.registerSimpleCubeAll(ModBlocks.DRIFTSHALE);
        gen.registerStairs(ModBlocks.DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.DRIFTSHALE));
        gen.registerSlab(ModBlocks.DRIFTSHALE_SLAB, ModBlocks.DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.DRIFTSHALE));

        // Cobbled Driftshale
        gen.registerSimpleCubeAll(ModBlocks.COBBLED_DRIFTSHALE);
        gen.registerStairs(ModBlocks.COBBLED_DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.COBBLED_DRIFTSHALE));
        gen.registerSlab(ModBlocks.COBBLED_DRIFTSHALE_SLAB, ModBlocks.COBBLED_DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.COBBLED_DRIFTSHALE));

        // Polished Driftshale
        gen.registerSimpleCubeAll(ModBlocks.POLISHED_DRIFTSHALE);
        gen.registerStairs(ModBlocks.POLISHED_DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.POLISHED_DRIFTSHALE));
        gen.registerSlab(ModBlocks.POLISHED_DRIFTSHALE_SLAB, ModBlocks.POLISHED_DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.POLISHED_DRIFTSHALE));

        // Driftshale Bricks
        gen.registerSimpleCubeAll(ModBlocks.DRIFTSHALE_BRICKS);
        gen.registerStairs(ModBlocks.DRIFTSHALE_BRICKS_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.DRIFTSHALE_BRICKS));
        gen.registerSlab(ModBlocks.DRIFTSHALE_BRICKS_SLAB, ModBlocks.DRIFTSHALE_BRICKS_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.DRIFTSHALE_BRICKS));

        // Driftshale Tiles
        gen.registerSimpleCubeAll(ModBlocks.DRIFTSHALE_TILES);
        gen.registerStairs(ModBlocks.DRIFTSHALE_TILES_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.DRIFTSHALE_TILES));
        gen.registerSlab(ModBlocks.DRIFTSHALE_TILES_SLAB, ModBlocks.DRIFTSHALE_TILES_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.DRIFTSHALE_TILES));

        // Cracked Driftshale Bricks
        gen.registerSimpleCubeAll(ModBlocks.CRACKED_DRIFTSHALE_BRICKS);
        gen.registerStairs(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.CRACKED_DRIFTSHALE_BRICKS));
        gen.registerSlab(ModBlocks.CRACKED_DRIFTSHALE_BRICKS_SLAB, ModBlocks.CRACKED_DRIFTSHALE_BRICKS_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.CRACKED_DRIFTSHALE_BRICKS));

        // Cracked Driftshale Tiles
        gen.registerSimpleCubeAll(ModBlocks.CRACKED_DRIFTSHALE_TILES);
        gen.registerStairs(ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.CRACKED_DRIFTSHALE_TILES));
        gen.registerSlab(ModBlocks.CRACKED_DRIFTSHALE_TILES_SLAB, ModBlocks.CRACKED_DRIFTSHALE_TILES_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.CRACKED_DRIFTSHALE_TILES));

        // Red Algae Cobbled Driftshale
        gen.registerSimpleCubeAll(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE);
        gen.registerStairs(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE));
        gen.registerSlab(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_SLAB, ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.RED_ALGAE_COBBLED_DRIFTSHALE));

        // Red Algae Driftshale Bricks
        gen.registerSimpleCubeAll(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS);
        gen.registerStairs(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS));
        gen.registerSlab(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_SLAB, ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.RED_ALGAE_DRIFTSHALE_BRICKS));

        // Red Algae Driftshale Tiles
        gen.registerSimpleCubeAll(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES);
        gen.registerStairs(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES));
        gen.registerSlab(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_SLAB, ModBlocks.RED_ALGAE_DRIFTSHALE_TILES_STAIRS, TexturedModel.CUBE_ALL.get(ModBlocks.RED_ALGAE_DRIFTSHALE_TILES));

        // Driftshale Pillar
        gen.registerLog(ModBlocks.DRIFTSHALE_PILLAR).log(ModBlocks.DRIFTSHALE_PILLAR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        gen.register(ModBlocks.BIRD_POOP.asItem(), Models.GENERATED);
        gen.register(ModBlocks.RED_ALGAE.asItem(), Models.GENERATED);
    }
}
