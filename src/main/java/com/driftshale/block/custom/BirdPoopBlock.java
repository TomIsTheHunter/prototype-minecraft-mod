package com.driftshale.block.custom;

import net.minecraft.block.MultifaceBlock;
import net.minecraft.block.MultifaceSpreader;

public class BirdPoopBlock extends MultifaceBlock {
    private final MultifaceSpreader multifaceSpreader = new MultifaceSpreader(this);

    public BirdPoopBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MultifaceSpreader getMultifaceSpreader() {
        return this.multifaceSpreader;
    }
}
