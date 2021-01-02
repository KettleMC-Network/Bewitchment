package com.bewitchment.common.block.plants;

import com.bewitchment.common.block.plants.util.BlockBushSpreading;
import com.bewitchment.registry.ModObjects;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockEmbergrass extends BlockBushSpreading {
	private static final AxisAlignedBB AABB = new AxisAlignedBB(0.1D, 0.0D, 0.1D, 0.9D, 0.9D, 0.9D);

	public BlockEmbergrass() {
		super("embergrass");
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState p_getBoundingBox_1_, IBlockAccess p_getBoundingBox_2_, BlockPos p_getBoundingBox_3_) {
		return AABB;
	}

	@Override
	public boolean canSustainBush(IBlockState state) {
		return super.canSustainBush(state) || state.getMaterial() == Material.GRASS || state.getMaterial() == Material.GROUND;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
		if (rand.nextBoolean())
			world.spawnParticle(EnumParticleTypes.FLAME, pos.getX() + rand.nextDouble(), pos.getY() + rand.nextDouble(), pos.getZ() + rand.nextDouble(), 0, 0, 0);
	}

	@Override
	public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (!world.isRemote && entity instanceof EntityLivingBase && this == ModObjects.embergrass) entity.setFire(10);
	}
}