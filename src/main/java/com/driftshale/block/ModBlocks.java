package com.driftshale.block;

import com.driftshale.DriftshaleMod;
import com.driftshale.block.custom.BirdPoopBlock;
import com.driftshale.block.custom.RedAlgaeBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // --- Nature blocks ---
    public static final Block BIRD_POOP = registerBlock("bird_poop",
            new BirdPoopBlock(AbstractBlock.Settings.create()
                    .noCollision()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block RED_ALGAE = registerBlock("red_algae",
            new RedAlgaeBlock(AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS)
                    .nonOpaque()
                    .replaceable()));

    // --- Base Driftshale ---
    public static final Block DRIFTSHALE = registerBlock("driftshale", baseStoneBlock());
    public static final Block DRIFTSHALE_STAIRS = registerBlock("driftshale_stairs",
            new StairsBlock(DRIFTSHALE.getDefaultState(), baseStoneSettings()));
    public static final Block DRIFTSHALE_SLAB = registerBlock("driftshale_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Cobbled Driftshale ---
    public static final Block COBBLED_DRIFTSHALE = registerBlock("cobbled_driftshale", baseStoneBlock());
    public static final Block COBBLED_DRIFTSHALE_STAIRS = registerBlock("cobbled_driftshale_stairs",
            new StairsBlock(COBBLED_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
    public static final Block COBBLED_DRIFTSHALE_SLAB = registerBlock("cobbled_driftshale_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Polished Driftshale ---
    public static final Block POLISHED_DRIFTSHALE = registerBlock("polished_driftshale", baseStoneBlock());
    public static final Block POLISHED_DRIFTSHALE_STAIRS = registerBlock("polished_driftshale_stairs",
            new StairsBlock(POLISHED_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
    public static final Block POLISHED_DRIFTSHALE_SLAB = registerBlock("polished_driftshale_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Driftshale Bricks ---
    public static final Block DRIFTSHALE_BRICKS = registerBlock("driftshale_bricks", baseStoneBlock());
    public static final Block DRIFTSHALE_BRICKS_STAIRS = registerBlock("driftshale_bricks_stairs",
            new StairsBlock(DRIFTSHALE_BRICKS.getDefaultState(), baseStoneSettings()));
    public static final Block DRIFTSHALE_BRICKS_SLAB = registerBlock("driftshale_bricks_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Driftshale Tiles ---
    public static final Block DRIFTSHALE_TILES = registerBlock("driftshale_tiles", baseStoneBlock());
    public static final Block DRIFTSHALE_TILES_STAIRS = registerBlock("driftshale_tiles_stairs",
            new StairsBlock(DRIFTSHALE_TILES.getDefaultState(), baseStoneSettings()));
    public static final Block DRIFTSHALE_TILES_SLAB = registerBlock("driftshale_tiles_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Cracked Driftshale Bricks ---
    public static final Block CRACKED_DRIFTSHALE_BRICKS = registerBlock("cracked_driftshale_bricks", baseStoneBlock());
    public static final Block CRACKED_DRIFTSHALE_BRICKS_STAIRS = registerBlock("cracked_driftshale_bricks_stairs",
            new StairsBlock(CRACKED_DRIFTSHALE_BRICKS.getDefaultState(), baseStoneSettings()));
    public static final Block CRACKED_DRIFTSHALE_BRICKS_SLAB = registerBlock("cracked_driftshale_bricks_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Cracked Driftshale Tiles ---
    public static final Block CRACKED_DRIFTSHALE_TILES = registerBlock("cracked_driftshale_tiles", baseStoneBlock());
    public static final Block CRACKED_DRIFTSHALE_TILES_STAIRS = registerBlock("cracked_driftshale_tiles_stairs",
            new StairsBlock(CRACKED_DRIFTSHALE_TILES.getDefaultState(), baseStoneSettings()));
    public static final Block CRACKED_DRIFTSHALE_TILES_SLAB = registerBlock("cracked_driftshale_tiles_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Red Algae Cobbled Driftshale ---
    public static final Block RED_ALGAE_COBBLED_DRIFTSHALE = registerBlock("red_algae_cobbled_driftshale", baseStoneBlock());
    public static final Block RED_ALGAE_COBBLED_DRIFTSHALE_STAIRS = registerBlock("red_algae_cobbled_driftshale_stairs",
            new StairsBlock(RED_ALGAE_COBBLED_DRIFTSHALE.getDefaultState(), baseStoneSettings()));
    public static final Block RED_ALGAE_COBBLED_DRIFTSHALE_SLAB = registerBlock("red_algae_cobbled_driftshale_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Red Algae Driftshale Bricks ---
    public static final Block RED_ALGAE_DRIFTSHALE_BRICKS = registerBlock("red_algae_driftshale_bricks", baseStoneBlock());
    public static final Block RED_ALGAE_DRIFTSHALE_BRICKS_STAIRS = registerBlock("red_algae_driftshale_bricks_stairs",
            new StairsBlock(RED_ALGAE_DRIFTSHALE_BRICKS.getDefaultState(), baseStoneSettings()));
    public static final Block RED_ALGAE_DRIFTSHALE_BRICKS_SLAB = registerBlock("red_algae_driftshale_bricks_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Red Algae Driftshale Tiles ---
    public static final Block RED_ALGAE_DRIFTSHALE_TILES = registerBlock("red_algae_driftshale_tiles", baseStoneBlock());
    public static final Block RED_ALGAE_DRIFTSHALE_TILES_STAIRS = registerBlock("red_algae_driftshale_tiles_stairs",
            new StairsBlock(RED_ALGAE_DRIFTSHALE_TILES.getDefaultState(), baseStoneSettings()));
    public static final Block RED_ALGAE_DRIFTSHALE_TILES_SLAB = registerBlock("red_algae_driftshale_tiles_slab",
            new SlabBlock(baseStoneSettings()));

    // --- Driftshale Pillar ---
    public static final Block DRIFTSHALE_PILLAR = registerBlock("driftshale_pillar",
            new PillarBlock(baseStoneSettings()));

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
    }
}
