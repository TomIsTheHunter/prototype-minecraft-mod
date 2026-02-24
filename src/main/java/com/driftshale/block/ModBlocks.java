package com.driftshale.block;

import com.driftshale.DriftshaleMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // --- Nature blocks ---
    public static Block BIRD_POOP;
    public static Block RED_ALGAE;

    // --- Base Driftshale ---
    public static Block DRIFTSHALE;
    public static Block DRIFTSHALE_STAIRS;
    public static Block DRIFTSHALE_SLAB;

    // --- Cobbled Driftshale ---
    public static Block COBBLED_DRIFTSHALE;
    public static Block COBBLED_DRIFTSHALE_STAIRS;
    public static Block COBBLED_DRIFTSHALE_SLAB;

    // --- Polished Driftshale ---
    public static Block POLISHED_DRIFTSHALE;
    public static Block POLISHED_DRIFTSHALE_STAIRS;
    public static Block POLISHED_DRIFTSHALE_SLAB;

    // --- Driftshale Bricks ---
    public static Block DRIFTSHALE_BRICKS;
    public static Block DRIFTSHALE_BRICKS_STAIRS;
    public static Block DRIFTSHALE_BRICKS_SLAB;

    // --- Driftshale Tiles ---
    public static Block DRIFTSHALE_TILES;
    public static Block DRIFTSHALE_TILES_STAIRS;
    public static Block DRIFTSHALE_TILES_SLAB;

    // --- Cracked Driftshale Bricks ---
    public static Block CRACKED_DRIFTSHALE_BRICKS;
    public static Block CRACKED_DRIFTSHALE_BRICKS_STAIRS;
    public static Block CRACKED_DRIFTSHALE_BRICKS_SLAB;

    // --- Cracked Driftshale Tiles ---
    public static Block CRACKED_DRIFTSHALE_TILES;
    public static Block CRACKED_DRIFTSHALE_TILES_STAIRS;
    public static Block CRACKED_DRIFTSHALE_TILES_SLAB;

    // --- Red Algae Driftshale ---
    public static Block RED_ALGAE_DRIFTSHALE;
    public static Block RED_ALGAE_DRIFTSHALE_STAIRS;
    public static Block RED_ALGAE_DRIFTSHALE_SLAB;

    // --- Red Algae Cobbled Driftshale ---
    public static Block RED_ALGAE_COBBLED_DRIFTSHALE;
    public static Block RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS;
    public static Block RED_ALGAE_COBBLED_DRIFTSHALE_SLAB;

    // --- Red Algae Driftshale Bricks ---
    public static Block RED_ALGAE_DRIFTSHALE_BRICKS;
    public static Block RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS;
    public static Block RED_ALGAE_DRIFTSHALE_BRICKS_SLAB;

    // --- Red Algae Driftshale Tiles ---
    public static Block RED_ALGAE_DRIFTSHALE_TILES;
    public static Block RED_ALGAE_DRIFTSHALE_TILES_STAIRS;
    public static Block RED_ALGAE_DRIFTSHALE_TILES_SLAB;

    // --- Driftshale Pillar ---
    public static Block DRIFTSHALE_PILLAR;

    private static AbstractBlock.Settings baseStoneSettings() {
        return AbstractBlock.Settings.create()
                .strength(1.5f, 6.0f)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .mapColor(MapColor.STONE_GRAY);
    }

    private static Block baseStoneBlock() {
        return new Block(baseStoneSettings());
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DriftshaleMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DriftshaleMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        DriftshaleMod.LOGGER.info("Registering blocks for " + DriftshaleMod.MOD_ID);

        try {
            // Register nature blocks
            BIRD_POOP = registerBlock("bird_poop",
                    new Block(AbstractBlock.Settings.create()
                            .noCollision()
                            .strength(0.2f)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()));

            RED_ALGAE = registerBlock("red_algae",
                    new Block(AbstractBlock.Settings.create()
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.WET_GRASS)
                            .nonOpaque()
                            .replaceable()));

            // Register base stone blocks
            DRIFTSHALE = registerBlock("driftshale", baseStoneBlock());
            COBBLED_DRIFTSHALE = registerBlock("cobbled_driftshale", baseStoneBlock());
            POLISHED_DRIFTSHALE = registerBlock("polished_driftshale", baseStoneBlock());
            DRIFTSHALE_BRICKS = registerBlock("driftshale_bricks", baseStoneBlock());
            DRIFTSHALE_TILES = registerBlock("driftshale_tiles", baseStoneBlock());
            CRACKED_DRIFTSHALE_BRICKS = registerBlock("cracked_driftshale_bricks", baseStoneBlock());
            CRACKED_DRIFTSHALE_TILES = registerBlock("cracked_driftshale_tiles", baseStoneBlock());
            RED_ALGAE_DRIFTSHALE = registerBlock("red_algae_driftshale", baseStoneBlock());
            RED_ALGAE_COBBLED_DRIFTSHALE = registerBlock("red_algae_cobbled_driftshale", baseStoneBlock());
            RED_ALGAE_DRIFTSHALE_BRICKS = registerBlock("red_algae_driftshale_bricks", baseStoneBlock());
            RED_ALGAE_DRIFTSHALE_TILES = registerBlock("red_algae_driftshale_tiles", baseStoneBlock());
            DRIFTSHALE_PILLAR = registerBlock("driftshale_pillar", new PillarBlock(baseStoneSettings()));

            // Register stairs and slabs (now that base blocks exist and are registered)
            DRIFTSHALE_STAIRS = registerBlock("driftshale_stairs",
                    new StairsBlock(DRIFTSHALE.getDefaultState(), baseStoneSettings()));
            DRIFTSHALE_SLAB = registerBlock("driftshale_slab",
                    new SlabBlock(baseStoneSettings()));

            COBBLED_DRIFTSHALE_STAIRS = registerBlock("cobbled_driftshale_stairs",
                    new StairsBlock(COBBLED_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
            COBBLED_DRIFTSHALE_SLAB = registerBlock("cobbled_driftshale_slab",
                    new SlabBlock(baseStoneSettings()));

            POLISHED_DRIFTSHALE_STAIRS = registerBlock("polished_driftshale_stairs",
                    new StairsBlock(POLISHED_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
            POLISHED_DRIFTSHALE_SLAB = registerBlock("polished_driftshale_slab",
                    new SlabBlock(baseStoneSettings()));

            DRIFTSHALE_BRICKS_STAIRS = registerBlock("driftshale_bricks_stairs",
                    new StairsBlock(DRIFTSHALE_BRICKS.getDefaultState(), baseStoneSettings()));
            DRIFTSHALE_BRICKS_SLAB = registerBlock("driftshale_bricks_slab",
                    new SlabBlock(baseStoneSettings()));

            DRIFTSHALE_TILES_STAIRS = registerBlock("driftshale_tiles_stairs",
                    new StairsBlock(DRIFTSHALE_TILES.getDefaultState(), baseStoneSettings()));
            DRIFTSHALE_TILES_SLAB = registerBlock("driftshale_tiles_slab",
                    new SlabBlock(baseStoneSettings()));

            CRACKED_DRIFTSHALE_BRICKS_STAIRS = registerBlock("cracked_driftshale_bricks_stairs",
                    new StairsBlock(CRACKED_DRIFTSHALE_BRICKS.getDefaultState(), baseStoneSettings()));
            CRACKED_DRIFTSHALE_BRICKS_SLAB = registerBlock("cracked_driftshale_bricks_slab",
                    new SlabBlock(baseStoneSettings()));

            CRACKED_DRIFTSHALE_TILES_STAIRS = registerBlock("cracked_driftshale_tiles_stairs",
                    new StairsBlock(CRACKED_DRIFTSHALE_TILES.getDefaultState(), baseStoneSettings()));
            CRACKED_DRIFTSHALE_TILES_SLAB = registerBlock("cracked_driftshale_tiles_slab",
                    new SlabBlock(baseStoneSettings()));

            RED_ALGAE_DRIFTSHALE_STAIRS = registerBlock("red_algae_driftshale_stairs",
                    new StairsBlock(RED_ALGAE_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
            RED_ALGAE_DRIFTSHALE_SLAB = registerBlock("red_algae_driftshale_slab",
                    new SlabBlock(baseStoneSettings()));

            RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS = registerBlock("red_algae_cobbled_driftshale_stairs",
                    new StairsBlock(RED_ALGAE_COBBLED_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
            RED_ALGAE_COBBLED_DRIFTSHALE_SLAB = registerBlock("red_algae_cobbled_driftshale_slab",
                    new SlabBlock(baseStoneSettings()));

            RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS = registerBlock("red_algae_driftshale_bricks_stairs",
                    new StairsBlock(RED_ALGAE_DRIFTSHALE_BRICKS.getDefaultState(), baseStoneSettings()));
            RED_ALGAE_DRIFTSHALE_BRICKS_SLAB = registerBlock("red_algae_driftshale_bricks_slab",
                    new SlabBlock(baseStoneSettings()));

            RED_ALGAE_DRIFTSHALE_TILES_STAIRS = registerBlock("red_algae_driftshale_tiles_stairs",
                    new StairsBlock(RED_ALGAE_DRIFTSHALE_TILES.getDefaultState(), baseStoneSettings()));
            RED_ALGAE_DRIFTSHALE_TILES_SLAB = registerBlock("red_algae_driftshale_tiles_slab",
                    new SlabBlock(baseStoneSettings()));
        } catch (Exception e) {
            DriftshaleMod.LOGGER.error("Failed to register blocks!", e);
            throw new RuntimeException("Failed to initialize driftshale blocks", e);
        }
    }
}
