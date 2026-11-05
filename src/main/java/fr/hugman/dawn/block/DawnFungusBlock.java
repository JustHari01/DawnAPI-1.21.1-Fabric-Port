package fr.hugman.dawn.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FungusBlock;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.function.Predicate;

public class DawnFungusBlock extends FungusBlock {
	private final RegistryKey<ConfiguredFeature<?, ?>> featureKey;
	private final Predicate<BlockState> canPlantOn;
	private final Predicate<BlockState> canGrowOn;

	public DawnFungusBlock(RegistryKey<ConfiguredFeature<?, ?>> featureKey, TagKey<Block> canPlantOn, TagKey<Block> canGrowOn, Settings settings) {
		this(featureKey, s -> s.isIn(canPlantOn), s -> s.isIn(canGrowOn), settings);
	}

	public DawnFungusBlock(RegistryKey<ConfiguredFeature<?, ?>> featureKey, Predicate<BlockState> canPlantOn, Predicate<BlockState> canGrowOn, Settings settings) {
		super(featureKey, Blocks.CRIMSON_FUNGUS, settings);
		this.featureKey = featureKey;
		this.canPlantOn = canPlantOn;
		this.canGrowOn = canGrowOn;
	}

	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return this.canPlantOn.test(floor);
	}

	public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
		return this.canGrowOn.test(world.getBlockState(pos.down()));
	}

	@Override
	public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
		return isFertilizable(world, pos, state) && random.nextFloat() < 0.4F;
	}

	@Override
	public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
		ConfiguredFeature<?, ?> feature = world.getRegistryManager().get(RegistryKeys.CONFIGURED_FEATURE).get(this.featureKey);
		if(feature != null) feature.generate(world, world.getChunkManager().getChunkGenerator(), random, pos);
	}
}
