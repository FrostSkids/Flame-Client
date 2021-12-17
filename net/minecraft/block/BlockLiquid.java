// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.biome.BiomeColorHelper;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.BlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyInteger;

public abstract class BlockLiquid extends Block
{
    public static final /* synthetic */ PropertyInteger LEVEL;
    private static final /* synthetic */ int[] lIIllIlIIIllIl;
    private static final /* synthetic */ String[] lIIllIlIIIIllI;
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIlIlIllIIllIlllIIl, final Random lllllllllllllIIlIlIllIIllIlllIII, final int lllllllllllllIIlIlIllIIllIllIlll) {
        return null;
    }
    
    private static boolean llIllIIIIllIlII(final int lllllllllllllIIlIlIllIIIlIIIIlII) {
        return lllllllllllllIIlIlIllIIIlIIIIlII < 0;
    }
    
    private static boolean llIllIIIIllIIlI(final int lllllllllllllIIlIlIllIIIlIIIlIII) {
        return lllllllllllllIIlIlIllIIIlIIIlIII == 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIlIllIIIllIlllll) {
        return lllllllllllllIIlIlIllIIIllIlllll.getValue((IProperty<Integer>)BlockLiquid.LEVEL);
    }
    
    @Override
    public boolean isBlockSolid(final IBlockAccess lllllllllllllIIlIlIllIIlllllIlII, final BlockPos lllllllllllllIIlIlIllIIlllllIIlI, final EnumFacing lllllllllllllIIlIlIllIIllllIlIIl) {
        final Material lllllllllllllIIlIlIllIIlllllIIII = lllllllllllllIIlIlIllIIlllllIlII.getBlockState(lllllllllllllIIlIlIllIIlllllIIlI).getBlock().getMaterial();
        int blockSolid;
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIlllllIIII, this.blockMaterial)) {
            blockSolid = BlockLiquid.lIIllIlIIIllIl[0];
            "".length();
            if (null != null) {
                return ((0x4F ^ 0x1E ^ (0x8D ^ 0x8B)) & (0x11 ^ 0xD ^ (0xB ^ 0x40) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIllllIlIIl, EnumFacing.UP)) {
            blockSolid = BlockLiquid.lIIllIlIIIllIl[2];
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0x3E ^ 0x75) & ~(0xD3 ^ 0x98)) != 0x0;
            }
        }
        else if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIlllllIIII, Material.ice)) {
            blockSolid = BlockLiquid.lIIllIlIIIllIl[0];
            "".length();
            if (((80 + 37 - 38 + 65 ^ 31 + 93 + 10 + 57) & (0x77 ^ 0x1E ^ (0xC3 ^ 0x85) ^ -" ".length())) >= (0x47 ^ 0x78 ^ (0x53 ^ 0x68))) {
                return ((0x40 ^ 0x5 ^ (0xCA ^ 0x80)) & (45 + 75 + 38 + 1 ^ 21 + 5 + 99 + 19 ^ -" ".length())) != 0x0;
            }
        }
        else {
            blockSolid = (super.isBlockSolid(lllllllllllllIIlIlIllIIlllllIlII, lllllllllllllIIlIlIllIIlllllIIlI, lllllllllllllIIlIlIllIIllllIlIIl) ? 1 : 0);
        }
        return blockSolid != 0;
    }
    
    protected void triggerMixEffects(final World lllllllllllllIIlIlIllIIIllllIlII, final BlockPos lllllllllllllIIlIlIllIIIllllIIll) {
        final double lllllllllllllIIlIlIllIIIllllIIlI = lllllllllllllIIlIlIllIIIllllIIll.getX();
        final double lllllllllllllIIlIlIllIIIllllIIIl = lllllllllllllIIlIlIllIIIllllIIll.getY();
        final double lllllllllllllIIlIlIllIIIllllIIII = lllllllllllllIIlIlIllIIIllllIIll.getZ();
        lllllllllllllIIlIlIllIIIllllIlII.playSoundEffect(lllllllllllllIIlIlIllIIIllllIIlI + 0.5, lllllllllllllIIlIlIllIIIllllIIIl + 0.5, lllllllllllllIIlIlIllIIIllllIIII + 0.5, BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[16]], 0.5f, 2.6f + (lllllllllllllIIlIlIllIIIllllIlII.rand.nextFloat() - lllllllllllllIIlIlIllIIIllllIlII.rand.nextFloat()) * 0.8f);
        int lllllllllllllIIlIlIllIIIlllIllll = BlockLiquid.lIIllIlIIIllIl[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIllIIIIllIIII(lllllllllllllIIlIlIllIIIlllIllll, BlockLiquid.lIIllIlIIIllIl[4])) {
            lllllllllllllIIlIlIllIIIllllIlII.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIlIlIllIIIllllIIlI + Math.random(), lllllllllllllIIlIlIllIIIllllIIIl + 1.2, lllllllllllllIIlIlIllIIIllllIIII + Math.random(), 0.0, 0.0, 0.0, new int[BlockLiquid.lIIllIlIIIllIl[0]]);
            ++lllllllllllllIIlIlIllIIIlllIllll;
        }
    }
    
    public static float getLiquidHeightPercent(int lllllllllllllIIlIlIllIlIIIllIlIl) {
        if (llIllIIIIllIIII(lllllllllllllIIlIlIllIlIIIllIlIl, BlockLiquid.lIIllIlIIIllIl[4])) {
            lllllllllllllIIlIlIllIlIIIllIlIl = BlockLiquid.lIIllIlIIIllIl[0];
        }
        return (lllllllllllllIIlIlIllIlIIIllIlIl + BlockLiquid.lIIllIlIIIllIl[2]) / 9.0f;
    }
    
    protected int getEffectiveFlowDecay(final IBlockAccess lllllllllllllIIlIlIllIlIIIIlIllI, final BlockPos lllllllllllllIIlIlIllIlIIIIlIlII) {
        final int lllllllllllllIIlIlIllIlIIIIllIII = this.getLevel(lllllllllllllIIlIlIllIlIIIIlIllI, lllllllllllllIIlIlIllIlIIIIlIlII);
        int n;
        if (llIllIIIIllIIII(lllllllllllllIIlIlIllIlIIIIllIII, BlockLiquid.lIIllIlIIIllIl[4])) {
            n = BlockLiquid.lIIllIlIIIllIl[0];
            "".length();
            if (((0x2D ^ 0x57 ^ (0x47 ^ 0x65)) & (26 + 57 - 30 + 162 ^ 51 + 32 - 67 + 127 ^ -" ".length())) == "   ".length()) {
                return (0x4C ^ 0x0 ^ (0x63 ^ 0x1E)) & (0xDC ^ 0xAC ^ (0x6C ^ 0x2D) ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIlIlIllIlIIIIllIII;
        }
        return n;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIlIllIIIlllIIIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockLiquid.LEVEL, lllllllllllllIIlIlIllIIIlllIIIll);
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIlIlIllIIlllIllllI, final BlockPos lllllllllllllIIlIlIllIIlllIlllIl, final EnumFacing lllllllllllllIIlIlIllIIlllIllIII) {
        int shouldSideBeRendered;
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIlllIllllI.getBlockState(lllllllllllllIIlIlIllIIlllIlllIl).getBlock().getMaterial(), this.blockMaterial)) {
            shouldSideBeRendered = BlockLiquid.lIIllIlIIIllIl[0];
            "".length();
            if (null != null) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIlllIllIII, EnumFacing.UP)) {
            shouldSideBeRendered = BlockLiquid.lIIllIlIIIllIl[2];
            "".length();
            if ((0x9 ^ 0xD) == -" ".length()) {
                return ((0x77 ^ 0x3C) & ~(0x1E ^ 0x55)) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = (super.shouldSideBeRendered(lllllllllllllIIlIlIllIIlllIllllI, lllllllllllllIIlIlIllIIlllIlllIl, lllllllllllllIIlIlIllIIlllIllIII) ? 1 : 0);
        }
        return shouldSideBeRendered != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockLiquid.lIIllIlIIIllIl[0] != 0;
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIIlIlIllIIlIlIlIllI, final BlockPos lllllllllllllIIlIlIllIIlIlIlIlIl, final IBlockState lllllllllllllIIlIlIllIIlIlIlIlII, final Random lllllllllllllIIlIlIllIIlIlIlIIll) {
        final double lllllllllllllIIlIlIllIIlIlIlIIlI = lllllllllllllIIlIlIllIIlIlIlIlIl.getX();
        final double lllllllllllllIIlIlIllIIlIlIlIIIl = lllllllllllllIIlIlIllIIlIlIlIlIl.getY();
        final double lllllllllllllIIlIlIllIIlIlIlIIII = lllllllllllllIIlIlIllIIlIlIlIlIl.getZ();
        if (llIllIIIIlIllll(this.blockMaterial, Material.water)) {
            final int lllllllllllllIIlIlIllIIlIlIIllll = lllllllllllllIIlIlIllIIlIlIlIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL);
            if (llIllIIIIllIllI(lllllllllllllIIlIlIllIIlIlIIllll) && llIllIIIIllIlll(lllllllllllllIIlIlIllIIlIlIIllll, BlockLiquid.lIIllIlIIIllIl[4])) {
                if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIlIIll.nextInt(BlockLiquid.lIIllIlIIIllIl[11]))) {
                    lllllllllllllIIlIlIllIIlIlIlIllI.playSound(lllllllllllllIIlIlIllIIlIlIlIIlI + 0.5, lllllllllllllIIlIlIllIIlIlIlIIIl + 0.5, lllllllllllllIIlIlIllIIlIlIlIIII + 0.5, BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[2]], lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat() * 0.25f + 0.75f, lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat() * 1.0f + 0.5f, (boolean)(BlockLiquid.lIIllIlIIIllIl[0] != 0));
                    "".length();
                    if ((0xC9 ^ 0xB1 ^ (0x65 ^ 0x19)) < ((0xF2 ^ 0xA1 ^ (0xE0 ^ 0xB6)) & (0x10 ^ 0x56 ^ (0x11 ^ 0x52) ^ -" ".length()))) {
                        return;
                    }
                }
            }
            else if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIlIIll.nextInt(BlockLiquid.lIIllIlIIIllIl[7]))) {
                lllllllllllllIIlIlIllIIlIlIlIllI.spawnParticle(EnumParticleTypes.SUSPENDED, lllllllllllllIIlIlIllIIlIlIlIIlI + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat(), lllllllllllllIIlIlIllIIlIlIlIIIl + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat(), lllllllllllllIIlIlIllIIlIlIlIIII + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat(), 0.0, 0.0, 0.0, new int[BlockLiquid.lIIllIlIIIllIl[0]]);
            }
        }
        if (llIllIIIIlIllll(this.blockMaterial, Material.lava) && llIllIIIIlIllll(lllllllllllllIIlIlIllIIlIlIlIllI.getBlockState(lllllllllllllIIlIlIllIIlIlIlIlIl.up()).getBlock().getMaterial(), Material.air) && llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIlIllI.getBlockState(lllllllllllllIIlIlIllIIlIlIlIlIl.up()).getBlock().isOpaqueCube() ? 1 : 0)) {
            if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIlIIll.nextInt(BlockLiquid.lIIllIlIIIllIl[12]))) {
                final double lllllllllllllIIlIlIllIIlIlIIlllI = lllllllllllllIIlIlIllIIlIlIlIIlI + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat();
                final double lllllllllllllIIlIlIllIIlIlIIllIl = lllllllllllllIIlIlIllIIlIlIlIIIl + this.maxY;
                final double lllllllllllllIIlIlIllIIlIlIIllII = lllllllllllllIIlIlIllIIlIlIlIIII + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat();
                lllllllllllllIIlIlIllIIlIlIlIllI.spawnParticle(EnumParticleTypes.LAVA, lllllllllllllIIlIlIllIIlIlIIlllI, lllllllllllllIIlIlIllIIlIlIIllIl, lllllllllllllIIlIlIllIIlIlIIllII, 0.0, 0.0, 0.0, new int[BlockLiquid.lIIllIlIIIllIl[0]]);
                lllllllllllllIIlIlIllIIlIlIlIllI.playSound(lllllllllllllIIlIlIllIIlIlIIlllI, lllllllllllllIIlIlIllIIlIlIIllIl, lllllllllllllIIlIlIllIIlIlIIllII, BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[13]], 0.2f + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat() * 0.2f, 0.9f + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat() * 0.15f, (boolean)(BlockLiquid.lIIllIlIIIllIl[0] != 0));
            }
            if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIlIIll.nextInt(BlockLiquid.lIIllIlIIIllIl[14]))) {
                lllllllllllllIIlIlIllIIlIlIlIllI.playSound(lllllllllllllIIlIlIllIIlIlIlIIlI, lllllllllllllIIlIlIllIIlIlIlIIIl, lllllllllllllIIlIlIllIIlIlIlIIII, BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[15]], 0.2f + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat() * 0.2f, 0.9f + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat() * 0.15f, (boolean)(BlockLiquid.lIIllIlIIIllIl[0] != 0));
            }
        }
        if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIlIIll.nextInt(BlockLiquid.lIIllIlIIIllIl[7])) && llIllIIIIllIIIl(World.doesBlockHaveSolidTopSurface(lllllllllllllIIlIlIllIIlIlIlIllI, lllllllllllllIIlIlIllIIlIlIlIlIl.down()) ? 1 : 0)) {
            final Material lllllllllllllIIlIlIllIIlIlIIlIll = lllllllllllllIIlIlIllIIlIlIlIllI.getBlockState(lllllllllllllIIlIlIllIIlIlIlIlIl.down(BlockLiquid.lIIllIlIIIllIl[13])).getBlock().getMaterial();
            if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIIlIll.blocksMovement() ? 1 : 0) && llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIlIIlIll.isLiquid() ? 1 : 0)) {
                final double lllllllllllllIIlIlIllIIlIlIIlIlI = lllllllllllllIIlIlIllIIlIlIlIIlI + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat();
                final double lllllllllllllIIlIlIllIIlIlIIlIIl = lllllllllllllIIlIlIllIIlIlIlIIIl - 1.05;
                final double lllllllllllllIIlIlIllIIlIlIIlIII = lllllllllllllIIlIlIllIIlIlIlIIII + lllllllllllllIIlIlIllIIlIlIlIIll.nextFloat();
                if (llIllIIIIlIllll(this.blockMaterial, Material.water)) {
                    lllllllllllllIIlIlIllIIlIlIlIllI.spawnParticle(EnumParticleTypes.DRIP_WATER, lllllllllllllIIlIlIllIIlIlIIlIlI, lllllllllllllIIlIlIllIIlIlIIlIIl, lllllllllllllIIlIlIllIIlIlIIlIII, 0.0, 0.0, 0.0, new int[BlockLiquid.lIIllIlIIIllIl[0]]);
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIlIllIIlIlIlIllI.spawnParticle(EnumParticleTypes.DRIP_LAVA, lllllllllllllIIlIlIllIIlIlIIlIlI, lllllllllllllIIlIlIllIIlIlIIlIIl, lllllllllllllIIlIlIllIIlIlIIlIII, 0.0, 0.0, 0.0, new int[BlockLiquid.lIIllIlIIIllIl[0]]);
                }
            }
        }
    }
    
    public boolean func_176364_g(final IBlockAccess lllllllllllllIIlIlIllIIlllIIlllI, final BlockPos lllllllllllllIIlIlIllIIlllIIIlIl) {
        int lllllllllllllIIlIlIllIIlllIIllII = BlockLiquid.lIIllIlIIIllIl[5];
        "".length();
        if (((0x35 ^ 0x6) & ~(0xF4 ^ 0xC7)) != 0x0) {
            return ((0x47 ^ 0x68) & ~(0x61 ^ 0x4E)) != 0x0;
        }
        while (!llIllIIIIllIIll(lllllllllllllIIlIlIllIIlllIIllII, BlockLiquid.lIIllIlIIIllIl[2])) {
            int lllllllllllllIIlIlIllIIlllIIlIll = BlockLiquid.lIIllIlIIIllIl[5];
            "".length();
            if (null != null) {
                return ((0xE5 ^ 0xC4) & ~(0x99 ^ 0xB8)) != 0x0;
            }
            while (!llIllIIIIllIIll(lllllllllllllIIlIlIllIIlllIIlIll, BlockLiquid.lIIllIlIIIllIl[2])) {
                final IBlockState lllllllllllllIIlIlIllIIlllIIlIlI = lllllllllllllIIlIlIllIIlllIIlllI.getBlockState(lllllllllllllIIlIlIllIIlllIIIlIl.add(lllllllllllllIIlIlIllIIlllIIllII, BlockLiquid.lIIllIlIIIllIl[0], lllllllllllllIIlIlIllIIlllIIlIll));
                final Block lllllllllllllIIlIlIllIIlllIIlIIl = lllllllllllllIIlIlIllIIlllIIlIlI.getBlock();
                final Material lllllllllllllIIlIlIllIIlllIIlIII = lllllllllllllIIlIlIllIIlllIIlIIl.getMaterial();
                if (llIllIIIIlIlllI(lllllllllllllIIlIlIllIIlllIIlIII, this.blockMaterial) && llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlllIIlIIl.isFullBlock() ? 1 : 0)) {
                    return BlockLiquid.lIIllIlIIIllIl[2] != 0;
                }
                ++lllllllllllllIIlIlIllIIlllIIlIll;
            }
            ++lllllllllllllIIlIlIllIIlllIIllII;
        }
        return BlockLiquid.lIIllIlIIIllIl[0] != 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIlIlIllIIllIlllllI, final BlockPos lllllllllllllIIlIlIllIIllIllllIl, final IBlockState lllllllllllllIIlIlIllIIllIllllII) {
        return null;
    }
    
    public static double getFlowDirection(final IBlockAccess lllllllllllllIIlIlIllIIlIIllIIIl, final BlockPos lllllllllllllIIlIlIllIIlIIllIlII, final Material lllllllllllllIIlIlIllIIlIIlIllll) {
        final Vec3 lllllllllllllIIlIlIllIIlIIllIIlI = getFlowingBlock(lllllllllllllIIlIlIllIIlIIlIllll).getFlowVector(lllllllllllllIIlIlIllIIlIIllIIIl, lllllllllllllIIlIlIllIIlIIllIlII);
        double n;
        if (llIllIIIIllIIlI(llIllIIIIlllIII(lllllllllllllIIlIlIllIIlIIllIIlI.xCoord, 0.0)) && llIllIIIIllIIlI(llIllIIIIlllIII(lllllllllllllIIlIlIllIIlIIllIIlI.zCoord, 0.0))) {
            n = -1000.0;
            "".length();
            if (((141 + 22 + 50 + 16 ^ 28 + 168 - 122 + 98) & (0x7C ^ 0x21 ^ (0x81 ^ 0x95) ^ -" ".length())) != 0x0) {
                return 0.0;
            }
        }
        else {
            n = MathHelper.func_181159_b(lllllllllllllIIlIlIllIIlIIllIIlI.zCoord, lllllllllllllIIlIlIllIIlIIllIIlI.xCoord) - 1.5707963267948966;
        }
        return n;
    }
    
    private static String llIllIIIIlIIIIl(String lllllllllllllIIlIlIllIIIlIlllIIl, final String lllllllllllllIIlIlIllIIIlIllllIl) {
        lllllllllllllIIlIlIllIIIlIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIllIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIllIIIlIllllII = new StringBuilder();
        final char[] lllllllllllllIIlIlIllIIIlIlllIll = lllllllllllllIIlIlIllIIIlIllllIl.toCharArray();
        int lllllllllllllIIlIlIllIIIlIlllIlI = BlockLiquid.lIIllIlIIIllIl[0];
        final double lllllllllllllIIlIlIllIIIlIllIlII = (Object)lllllllllllllIIlIlIllIIIlIlllIIl.toCharArray();
        final char lllllllllllllIIlIlIllIIIlIllIIll = (char)lllllllllllllIIlIlIllIIIlIllIlII.length;
        byte lllllllllllllIIlIlIllIIIlIllIIlI = (byte)BlockLiquid.lIIllIlIIIllIl[0];
        while (llIllIIIIllIlll(lllllllllllllIIlIlIllIIIlIllIIlI, lllllllllllllIIlIlIllIIIlIllIIll)) {
            final char lllllllllllllIIlIlIllIIIlIllllll = lllllllllllllIIlIlIllIIIlIllIlII[lllllllllllllIIlIlIllIIIlIllIIlI];
            lllllllllllllIIlIlIllIIIlIllllII.append((char)(lllllllllllllIIlIlIllIIIlIllllll ^ lllllllllllllIIlIlIllIIIlIlllIll[lllllllllllllIIlIlIllIIIlIlllIlI % lllllllllllllIIlIlIllIIIlIlllIll.length]));
            "".length();
            ++lllllllllllllIIlIlIllIIIlIlllIlI;
            ++lllllllllllllIIlIlIllIIIlIllIIlI;
            "".length();
            if (((0x4A ^ 0x1E) & ~(0x12 ^ 0x46)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIllIIIlIllllII);
    }
    
    @Override
    public boolean isPassable(final IBlockAccess lllllllllllllIIlIlIllIlIIlIIIlll, final BlockPos lllllllllllllIIlIlIllIlIIlIIIllI) {
        if (llIllIIIIlIlllI(this.blockMaterial, Material.lava)) {
            return BlockLiquid.lIIllIlIIIllIl[2] != 0;
        }
        return BlockLiquid.lIIllIlIIIllIl[0] != 0;
    }
    
    private static boolean llIllIIIIlIllll(final Object lllllllllllllIIlIlIllIIIlIIIllIl, final Object lllllllllllllIIlIlIllIIIlIIIllII) {
        return lllllllllllllIIlIlIllIIIlIIIllIl == lllllllllllllIIlIlIllIIIlIIIllII;
    }
    
    @Override
    public int tickRate(final World lllllllllllllIIlIlIllIIllIIIIIlI) {
        int n;
        if (llIllIIIIlIllll(this.blockMaterial, Material.water)) {
            n = BlockLiquid.lIIllIlIIIllIl[6];
            "".length();
            if (-"   ".length() >= 0) {
                return (88 + 7 + 21 + 112 ^ 13 + 90 - 65 + 128) & (0x9C ^ 0xC4 ^ (0x10 ^ 0xA) ^ -" ".length());
            }
        }
        else if (llIllIIIIlIllll(this.blockMaterial, Material.lava)) {
            if (llIllIIIIllIIIl(lllllllllllllIIlIlIllIIllIIIIIlI.provider.getHasNoSky() ? 1 : 0)) {
                n = BlockLiquid.lIIllIlIIIllIl[7];
                "".length();
                if ((0x86 ^ 0x83) <= 0) {
                    return (0x5D ^ 0x12) & ~(0x65 ^ 0x2A);
                }
            }
            else {
                n = BlockLiquid.lIIllIlIIIllIl[8];
                "".length();
                if (-" ".length() >= (0xC4 ^ 0xA7 ^ (0x6F ^ 0x8))) {
                    return (124 + 113 - 149 + 51 ^ 102 + 112 - 157 + 113) & (110 + 120 - 159 + 66 ^ 106 + 42 - 104 + 124 ^ -" ".length());
                }
            }
        }
        else {
            n = BlockLiquid.lIIllIlIIIllIl[0];
        }
        return n;
    }
    
    protected Vec3 getFlowVector(final IBlockAccess lllllllllllllIIlIlIllIIllIlIlIIl, final BlockPos lllllllllllllIIlIlIllIIllIIlllII) {
        Vec3 lllllllllllllIIlIlIllIIllIlIIlll = new Vec3(0.0, 0.0, 0.0);
        final int lllllllllllllIIlIlIllIIllIlIIllI = this.getEffectiveFlowDecay(lllllllllllllIIlIlIllIIllIlIlIIl, lllllllllllllIIlIlIllIIllIIlllII);
        long lllllllllllllIIlIlIllIIllIIllIII = (long)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (-(0x91 ^ 0x95) >= 0) {
            return null;
        }
        while (!llIllIIIIllIIlI(((Iterator)lllllllllllllIIlIlIllIIllIIllIII).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIIlIlIllIIllIlIIlIl = ((Iterator<EnumFacing>)lllllllllllllIIlIlIllIIllIIllIII).next();
            final BlockPos lllllllllllllIIlIlIllIIllIlIIlII = lllllllllllllIIlIlIllIIllIIlllII.offset(lllllllllllllIIlIlIllIIllIlIIlIl);
            int lllllllllllllIIlIlIllIIllIlIIIll = this.getEffectiveFlowDecay(lllllllllllllIIlIlIllIIllIlIlIIl, lllllllllllllIIlIlIllIIllIlIIlII);
            if (llIllIIIIllIlII(lllllllllllllIIlIlIllIIllIlIIIll)) {
                if (!llIllIIIIllIIlI(lllllllllllllIIlIlIllIIllIlIlIIl.getBlockState(lllllllllllllIIlIlIllIIllIlIIlII).getBlock().getMaterial().blocksMovement() ? 1 : 0)) {
                    continue;
                }
                lllllllllllllIIlIlIllIIllIlIIIll = this.getEffectiveFlowDecay(lllllllllllllIIlIlIllIIllIlIlIIl, lllllllllllllIIlIlIllIIllIlIIlII.down());
                if (!llIllIIIIllIlIl(lllllllllllllIIlIlIllIIllIlIIIll)) {
                    continue;
                }
                final int lllllllllllllIIlIlIllIIllIlIIIlI = lllllllllllllIIlIlIllIIllIlIIIll - (lllllllllllllIIlIlIllIIllIlIIllI - BlockLiquid.lIIllIlIIIllIl[4]);
                lllllllllllllIIlIlIllIIllIlIIlll = lllllllllllllIIlIlIllIIllIlIIlll.addVector((lllllllllllllIIlIlIllIIllIlIIlII.getX() - lllllllllllllIIlIlIllIIllIIlllII.getX()) * lllllllllllllIIlIlIllIIllIlIIIlI, (lllllllllllllIIlIlIllIIllIlIIlII.getY() - lllllllllllllIIlIlIllIIllIIlllII.getY()) * lllllllllllllIIlIlIllIIllIlIIIlI, (lllllllllllllIIlIlIllIIllIlIIlII.getZ() - lllllllllllllIIlIlIllIIllIIlllII.getZ()) * lllllllllllllIIlIlIllIIllIlIIIlI);
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
                continue;
            }
            else {
                if (!llIllIIIIllIlIl(lllllllllllllIIlIlIllIIllIlIIIll)) {
                    continue;
                }
                final int lllllllllllllIIlIlIllIIllIlIIIIl = lllllllllllllIIlIlIllIIllIlIIIll - lllllllllllllIIlIlIllIIllIlIIllI;
                lllllllllllllIIlIlIllIIllIlIIlll = lllllllllllllIIlIlIllIIllIlIIlll.addVector((lllllllllllllIIlIlIllIIllIlIIlII.getX() - lllllllllllllIIlIlIllIIllIIlllII.getX()) * lllllllllllllIIlIlIllIIllIlIIIIl, (lllllllllllllIIlIlIllIIllIlIIlII.getY() - lllllllllllllIIlIlIllIIllIIlllII.getY()) * lllllllllllllIIlIlIllIIllIlIIIIl, (lllllllllllllIIlIlIllIIllIlIIlII.getZ() - lllllllllllllIIlIlIllIIllIIlllII.getZ()) * lllllllllllllIIlIlIllIIllIlIIIIl);
            }
        }
        if (llIllIIIIllIIII(lllllllllllllIIlIlIllIIllIlIlIIl.getBlockState(lllllllllllllIIlIlIllIIllIIlllII).getValue((IProperty<Integer>)BlockLiquid.LEVEL), BlockLiquid.lIIllIlIIIllIl[4])) {
            lllllllllllllIIlIlIllIIllIIllIII = (long)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if ((0x14 ^ 0x33 ^ (0xB ^ 0x29)) <= 0) {
                return null;
            }
            while (!llIllIIIIllIIlI(((Iterator)lllllllllllllIIlIlIllIIllIIllIII).hasNext() ? 1 : 0)) {
                final EnumFacing lllllllllllllIIlIlIllIIllIlIIIII = ((Iterator<EnumFacing>)lllllllllllllIIlIlIllIIllIIllIII).next();
                final BlockPos lllllllllllllIIlIlIllIIllIIlllll = lllllllllllllIIlIlIllIIllIIlllII.offset(lllllllllllllIIlIlIllIIllIlIIIII);
                if (!llIllIIIIllIIlI(this.isBlockSolid(lllllllllllllIIlIlIllIIllIlIlIIl, lllllllllllllIIlIlIllIIllIIlllll, lllllllllllllIIlIlIllIIllIlIIIII) ? 1 : 0) || llIllIIIIllIIIl(this.isBlockSolid(lllllllllllllIIlIlIllIIllIlIlIIl, lllllllllllllIIlIlIllIIllIIlllll.up(), lllllllllllllIIlIlIllIIllIlIIIII) ? 1 : 0)) {
                    lllllllllllllIIlIlIllIIllIlIIlll = lllllllllllllIIlIlIllIIllIlIIlll.normalize().addVector(0.0, -6.0, 0.0);
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return null;
                    }
                    break;
                }
            }
        }
        return lllllllllllllIIlIlIllIIllIlIIlll.normalize();
    }
    
    private static void llIllIIIIlIIlIl() {
        (lIIllIlIIIIllI = new String[BlockLiquid.lIIllIlIIIllIl[18]])[BlockLiquid.lIIllIlIIIllIl[0]] = llIllIIIIlIIIII("vTWzJ3YSj28=", "aXMpr");
        BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[2]] = llIllIIIIlIIIIl("LS46ORolaTwtByQ1", "AGKLs");
        BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[13]] = llIllIIIIlIIIlI("8N6GVotschn9iPMFMkmbsg==", "xHcwv");
        BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[15]] = llIllIIIIlIIIII("r27t4lC1JABujSh8ao3Xog==", "bNfYS");
        BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[16]] = llIllIIIIlIIIIl("AAMNNBgfTAU5DQg=", "rbcPw");
        BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[6]] = llIllIIIIlIIIIl("HTkzFTQ9M2UZOSAyNx05OA==", "TWEtX");
        BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[17]] = llIllIIIIlIIIII("wLVdU/ULOIUFi4M2CiBjQvDTXcQA4H3S", "lGcVh");
    }
    
    private static int llIllIIIIlllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockLiquid.lIIllIlIIIllIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockLiquid.lIIllIlIIIllIl[0]] = BlockLiquid.LEVEL;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    public static BlockStaticLiquid getStaticBlock(final Material lllllllllllllIIlIlIllIIIllIlIlll) {
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIIllIlIlll, Material.water)) {
            return Blocks.water;
        }
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIIllIlIlll, Material.lava)) {
            return Blocks.lava;
        }
        throw new IllegalArgumentException(BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[17]]);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockLiquid.lIIllIlIIIllIl[0] != 0;
    }
    
    private static String llIllIIIIlIIIII(final String lllllllllllllIIlIlIllIIIlIlIIlll, final String lllllllllllllIIlIlIllIIIlIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIIIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIllIIIlIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIllIIIlIlIlIll.init(BlockLiquid.lIIllIlIIIllIl[13], lllllllllllllIIlIlIllIIIlIlIllII);
            return new String(lllllllllllllIIlIlIllIIIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIIIlIlIlIlI) {
            lllllllllllllIIlIlIllIIIlIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIIIIllIIIl(final int lllllllllllllIIlIlIllIIIlIIIlIlI) {
        return lllllllllllllIIlIlIllIIIlIIIlIlI != 0;
    }
    
    private static String llIllIIIIlIIIlI(final String lllllllllllllIIlIlIllIIIllIIlllI, final String lllllllllllllIIlIlIllIIIllIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIIIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIIIllIIllIl.getBytes(StandardCharsets.UTF_8)), BlockLiquid.lIIllIlIIIllIl[4]), "DES");
            final Cipher lllllllllllllIIlIlIllIIIllIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIllIIIllIlIIII.init(BlockLiquid.lIIllIlIIIllIl[13], lllllllllllllIIlIlIllIIIllIlIIIl);
            return new String(lllllllllllllIIlIlIllIIIllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIIIllIIllll) {
            lllllllllllllIIlIlIllIIIllIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIIlIlIllIlIIIllllll, final BlockPos lllllllllllllIIlIlIllIlIIIlllllI, final int lllllllllllllIIlIlIllIlIIIllllII) {
        int waterColorAtPos;
        if (llIllIIIIlIllll(this.blockMaterial, Material.water)) {
            waterColorAtPos = BiomeColorHelper.getWaterColorAtPos(lllllllllllllIIlIlIllIlIIIllllll, lllllllllllllIIlIlIllIlIIIlllllI);
            "".length();
            if (((0x42 ^ 0x74) & ~(0x90 ^ 0xA6)) != ((0x6F ^ 0x36) & ~(0x7F ^ 0x26))) {
                return (0xFA ^ 0xB6) & ~(0x55 ^ 0x19);
            }
        }
        else {
            waterColorAtPos = BlockLiquid.lIIllIlIIIllIl[3];
        }
        return waterColorAtPos;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIlIlIllIIlIIlIIlII, final BlockPos lllllllllllllIIlIlIllIIlIIlIIIll, final IBlockState lllllllllllllIIlIlIllIIlIIlIIllI) {
        this.checkForMixing(lllllllllllllIIlIlIllIIlIIlIIlII, lllllllllllllIIlIlIllIIlIIlIIIll, lllllllllllllIIlIlIllIIlIIlIIllI);
        "".length();
    }
    
    protected BlockLiquid(final Material lllllllllllllIIlIlIllIlIIlIIlIlI) {
        super(lllllllllllllIIlIlIllIlIIlIIlIlI);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockLiquid.LEVEL, BlockLiquid.lIIllIlIIIllIl[0]));
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.setTickRandomly((boolean)(BlockLiquid.lIIllIlIIIllIl[2] != 0));
        "".length();
    }
    
    public static BlockDynamicLiquid getFlowingBlock(final Material lllllllllllllIIlIlIllIIIllIllIlI) {
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIIllIllIlI, Material.water)) {
            return Blocks.flowing_water;
        }
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIIIllIllIlI, Material.lava)) {
            return Blocks.flowing_lava;
        }
        throw new IllegalArgumentException(BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[6]]);
    }
    
    private static boolean llIllIIIIllIIII(final int lllllllllllllIIlIlIllIIIlIlIIIIl, final int lllllllllllllIIlIlIllIIIlIlIIIII) {
        return lllllllllllllIIlIlIllIIIlIlIIIIl >= lllllllllllllIIlIlIllIIIlIlIIIII;
    }
    
    public boolean checkForMixing(final World lllllllllllllIIlIlIllIIlIIIIIIll, final BlockPos lllllllllllllIIlIlIllIIlIIIIlIIl, final IBlockState lllllllllllllIIlIlIllIIlIIIIIIIl) {
        if (llIllIIIIlIllll(this.blockMaterial, Material.lava)) {
            boolean lllllllllllllIIlIlIllIIlIIIIIlll = BlockLiquid.lIIllIlIIIllIl[0] != 0;
            final double lllllllllllllIIlIlIllIIIllllllII;
            final float lllllllllllllIIlIlIllIIIllllllIl = ((EnumFacing[])(Object)(lllllllllllllIIlIlIllIIIllllllII = (double)(Object)EnumFacing.values())).length;
            String lllllllllllllIIlIlIllIIIlllllllI = (String)BlockLiquid.lIIllIlIIIllIl[0];
            "".length();
            if ("   ".length() == 0) {
                return ((0x78 ^ 0x27) & ~(0xFC ^ 0xA3)) != 0x0;
            }
            while (!llIllIIIIllIIII((int)lllllllllllllIIlIlIllIIIlllllllI, (int)lllllllllllllIIlIlIllIIIllllllIl)) {
                final EnumFacing lllllllllllllIIlIlIllIIlIIIIIllI = lllllllllllllIIlIlIllIIIllllllII[lllllllllllllIIlIlIllIIIlllllllI];
                if (llIllIIIIlIlllI(lllllllllllllIIlIlIllIIlIIIIIllI, EnumFacing.DOWN) && llIllIIIIlIllll(lllllllllllllIIlIlIllIIlIIIIIIll.getBlockState(lllllllllllllIIlIlIllIIlIIIIlIIl.offset(lllllllllllllIIlIlIllIIlIIIIIllI)).getBlock().getMaterial(), Material.water)) {
                    lllllllllllllIIlIlIllIIlIIIIIlll = (BlockLiquid.lIIllIlIIIllIl[2] != 0);
                    "".length();
                    if (((0x1D ^ 0x47 ^ (0xCF ^ 0xA8)) & (0xC ^ 0x19 ^ (0xEB ^ 0xC3) ^ -" ".length())) > (109 + 95 - 173 + 154 ^ 79 + 16 - 79 + 173)) {
                        return ((35 + 125 - 53 + 100 ^ 124 + 66 - 117 + 75) & (210 + 28 - 159 + 135 ^ 105 + 41 - 13 + 8 ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIlIlIllIIIlllllllI;
                }
            }
            if (llIllIIIIllIIIl(lllllllllllllIIlIlIllIIlIIIIIlll ? 1 : 0)) {
                final Integer lllllllllllllIIlIlIllIIlIIIIIlIl = lllllllllllllIIlIlIllIIlIIIIIIIl.getValue((IProperty<Integer>)BlockLiquid.LEVEL);
                if (llIllIIIIllIIlI(lllllllllllllIIlIlIllIIlIIIIIlIl)) {
                    lllllllllllllIIlIlIllIIlIIIIIIll.setBlockState(lllllllllllllIIlIlIllIIlIIIIlIIl, Blocks.obsidian.getDefaultState());
                    "".length();
                    this.triggerMixEffects(lllllllllllllIIlIlIllIIlIIIIIIll, lllllllllllllIIlIlIllIIlIIIIlIIl);
                    return BlockLiquid.lIIllIlIIIllIl[2] != 0;
                }
                if (llIllIIIIlllIIl(lllllllllllllIIlIlIllIIlIIIIIlIl, BlockLiquid.lIIllIlIIIllIl[16])) {
                    lllllllllllllIIlIlIllIIlIIIIIIll.setBlockState(lllllllllllllIIlIlIllIIlIIIIlIIl, Blocks.cobblestone.getDefaultState());
                    "".length();
                    this.triggerMixEffects(lllllllllllllIIlIlIllIIlIIIIIIll, lllllllllllllIIlIlIllIIlIIIIlIIl);
                    return BlockLiquid.lIIllIlIIIllIl[2] != 0;
                }
            }
        }
        return BlockLiquid.lIIllIlIIIllIl[0] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        EnumWorldBlockLayer enumWorldBlockLayer;
        if (llIllIIIIlIllll(this.blockMaterial, Material.water)) {
            enumWorldBlockLayer = EnumWorldBlockLayer.TRANSLUCENT;
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            enumWorldBlockLayer = EnumWorldBlockLayer.SOLID;
        }
        return enumWorldBlockLayer;
    }
    
    @Override
    public boolean canCollideCheck(final IBlockState lllllllllllllIIlIlIllIlIIIIIIlII, final boolean lllllllllllllIIlIlIllIlIIIIIIIlI) {
        if (llIllIIIIllIIIl(lllllllllllllIIlIlIllIlIIIIIIIlI ? 1 : 0) && llIllIIIIllIIlI(lllllllllllllIIlIlIllIlIIIIIIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
            return BlockLiquid.lIIllIlIIIllIl[2] != 0;
        }
        return BlockLiquid.lIIllIlIIIllIl[0] != 0;
    }
    
    @Override
    public Vec3 modifyAcceleration(final World lllllllllllllIIlIlIllIIllIIIllll, final BlockPos lllllllllllllIIlIlIllIIllIIIlIIl, final Entity lllllllllllllIIlIlIllIIllIIIllIl, final Vec3 lllllllllllllIIlIlIllIIllIIIllII) {
        return lllllllllllllIIlIlIllIIllIIIllII.add(this.getFlowVector(lllllllllllllIIlIlIllIIllIIIllll, lllllllllllllIIlIlIllIIllIIIlIIl));
    }
    
    @Override
    public int getMixedBrightnessForBlock(final IBlockAccess lllllllllllllIIlIlIllIIlIllllIII, final BlockPos lllllllllllllIIlIlIllIIlIllIllll) {
        final int lllllllllllllIIlIlIllIIlIlllIllI = lllllllllllllIIlIlIllIIlIllllIII.getCombinedLight(lllllllllllllIIlIlIllIIlIllIllll, BlockLiquid.lIIllIlIIIllIl[0]);
        final int lllllllllllllIIlIlIllIIlIlllIlIl = lllllllllllllIIlIlIllIIlIllllIII.getCombinedLight(lllllllllllllIIlIlIllIIlIllIllll.up(), BlockLiquid.lIIllIlIIIllIl[0]);
        final int lllllllllllllIIlIlIllIIlIlllIlII = lllllllllllllIIlIlIllIIlIlllIllI & BlockLiquid.lIIllIlIIIllIl[9];
        final int lllllllllllllIIlIlIllIIlIlllIIll = lllllllllllllIIlIlIllIIlIlllIlIl & BlockLiquid.lIIllIlIIIllIl[9];
        final int lllllllllllllIIlIlIllIIlIlllIIlI = lllllllllllllIIlIlIllIIlIlllIllI >> BlockLiquid.lIIllIlIIIllIl[10] & BlockLiquid.lIIllIlIIIllIl[9];
        final int lllllllllllllIIlIlIllIIlIlllIIIl = lllllllllllllIIlIlIllIIlIlllIlIl >> BlockLiquid.lIIllIlIIIllIl[10] & BlockLiquid.lIIllIlIIIllIl[9];
        int n;
        if (llIllIIIIllIIll(lllllllllllllIIlIlIllIIlIlllIlII, lllllllllllllIIlIlIllIIlIlllIIll)) {
            n = lllllllllllllIIlIlIllIIlIlllIlII;
            "".length();
            if ("  ".length() < " ".length()) {
                return (0xB8 ^ 0xBC ^ (0x22 ^ 0xE)) & (0x1D ^ 0x27 ^ (0x48 ^ 0x5A) ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIlIlIllIIlIlllIIll;
        }
        int n2;
        if (llIllIIIIllIIll(lllllllllllllIIlIlIllIIlIlllIIlI, lllllllllllllIIlIlIllIIlIlllIIIl)) {
            n2 = lllllllllllllIIlIlIllIIlIlllIIlI;
            "".length();
            if (-"   ".length() > 0) {
                return (0x3C ^ 0x27 ^ (0xAC ^ 0x80)) & (0xA6 ^ 0x94 ^ (0x2 ^ 0x7) ^ -" ".length());
            }
        }
        else {
            n2 = lllllllllllllIIlIlIllIIlIlllIIIl;
        }
        return n | n2 << BlockLiquid.lIIllIlIIIllIl[10];
    }
    
    private static boolean llIllIIIIlIlllI(final Object lllllllllllllIIlIlIllIIIlIIlIIIl, final Object lllllllllllllIIlIlIllIIIlIIlIIII) {
        return lllllllllllllIIlIlIllIIIlIIlIIIl != lllllllllllllIIlIlIllIIIlIIlIIII;
    }
    
    private static boolean llIllIIIIllIllI(final int lllllllllllllIIlIlIllIIIlIIIIIlI) {
        return lllllllllllllIIlIlIllIIIlIIIIIlI > 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIlIlIllIIlIIIlIlll, final BlockPos lllllllllllllIIlIlIllIIlIIIlIllI, final IBlockState lllllllllllllIIlIlIllIIlIIIllIlI, final Block lllllllllllllIIlIlIllIIlIIIllIIl) {
        this.checkForMixing(lllllllllllllIIlIlIllIIlIIIlIlll, lllllllllllllIIlIlIllIIlIIIlIllI, lllllllllllllIIlIlIllIIlIIIllIlI);
        "".length();
    }
    
    private static boolean llIllIIIIllIlIl(final int lllllllllllllIIlIlIllIIIlIIIIllI) {
        return lllllllllllllIIlIlIllIIIlIIIIllI >= 0;
    }
    
    private static boolean llIllIIIIllIlll(final int lllllllllllllIIlIlIllIIIlIIlllIl, final int lllllllllllllIIlIlIllIIIlIIlllII) {
        return lllllllllllllIIlIlIllIIIlIIlllIl < lllllllllllllIIlIlIllIIIlIIlllII;
    }
    
    @Override
    public int getRenderType() {
        return BlockLiquid.lIIllIlIIIllIl[2];
    }
    
    protected int getLevel(final IBlockAccess lllllllllllllIIlIlIllIlIIIlIllll, final BlockPos lllllllllllllIIlIlIllIlIIIlIlllI) {
        int intValue;
        if (llIllIIIIlIllll(lllllllllllllIIlIlIllIlIIIlIllll.getBlockState(lllllllllllllIIlIlIllIlIIIlIlllI).getBlock().getMaterial(), this.blockMaterial)) {
            intValue = lllllllllllllIIlIlIllIlIIIlIllll.getBlockState(lllllllllllllIIlIlIllIlIIIlIlllI).getValue((IProperty<Integer>)BlockLiquid.LEVEL);
            "".length();
            if (null != null) {
                return (0x29 ^ 0x4E ^ (0xE0 ^ 0xAD)) & (0x3C ^ 0x2C ^ (0x81 ^ 0xBB) ^ -" ".length());
            }
        }
        else {
            intValue = BlockLiquid.lIIllIlIIIllIl[5];
        }
        return intValue;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIlIlIllIIllIllIlIl) {
        return BlockLiquid.lIIllIlIIIllIl[0];
    }
    
    private static boolean llIllIIIIlllIIl(final int lllllllllllllIIlIlIllIIIlIIllIIl, final int lllllllllllllIIlIlIllIIIlIIllIII) {
        return lllllllllllllIIlIlIllIIIlIIllIIl <= lllllllllllllIIlIlIllIIIlIIllIII;
    }
    
    private static boolean llIllIIIIllIIll(final int lllllllllllllIIlIlIllIIIlIIlIlIl, final int lllllllllllllIIlIlIllIIIlIIlIlII) {
        return lllllllllllllIIlIlIllIIIlIIlIlIl > lllllllllllllIIlIlIllIIIlIIlIlII;
    }
    
    private static void llIllIIIIlIllIl() {
        (lIIllIlIIIllIl = new int[19])[0] = ((0xCF ^ 0x92 ^ (0x54 ^ 0x4D)) & (192 + 80 - 232 + 164 ^ 101 + 90 - 183 + 128 ^ -" ".length()));
        BlockLiquid.lIIllIlIIIllIl[1] = (23 + 9 + 32 + 95 ^ 114 + 125 - 95 + 0);
        BlockLiquid.lIIllIlIIIllIl[2] = " ".length();
        BlockLiquid.lIIllIlIIIllIl[3] = (-1 & 0xFFFFFF);
        BlockLiquid.lIIllIlIIIllIl[4] = (0x20 ^ 0x12 ^ (0x28 ^ 0x12));
        BlockLiquid.lIIllIlIIIllIl[5] = -" ".length();
        BlockLiquid.lIIllIlIIIllIl[6] = (38 + 102 + 15 + 10 ^ 60 + 25 + 74 + 1);
        BlockLiquid.lIIllIlIIIllIl[7] = (0x83 ^ 0x89);
        BlockLiquid.lIIllIlIIIllIl[8] = (0xA4 ^ 0xBA);
        BlockLiquid.lIIllIlIIIllIl[9] = 215 + 83 - 242 + 199;
        BlockLiquid.lIIllIlIIIllIl[10] = (0x2F ^ 0x3F);
        BlockLiquid.lIIllIlIIIllIl[11] = (0x6F ^ 0x5 ^ (0x2D ^ 0x7));
        BlockLiquid.lIIllIlIIIllIl[12] = (0xE5 ^ 0x81);
        BlockLiquid.lIIllIlIIIllIl[13] = "  ".length();
        BlockLiquid.lIIllIlIIIllIl[14] = (0x2A ^ 0x2C) + (0xA3 ^ 0xB4) - -(55 + 25 + 54 + 6) + (0x8 ^ 0x17);
        BlockLiquid.lIIllIlIIIllIl[15] = "   ".length();
        BlockLiquid.lIIllIlIIIllIl[16] = (0x16 ^ 0x12);
        BlockLiquid.lIIllIlIIIllIl[17] = (0x4 ^ 0x8 ^ (0x1 ^ 0xB));
        BlockLiquid.lIIllIlIIIllIl[18] = (0x76 ^ 0x4F ^ (0xAD ^ 0x93));
    }
    
    static {
        llIllIIIIlIllIl();
        llIllIIIIlIIlIl();
        LEVEL = PropertyInteger.create(BlockLiquid.lIIllIlIIIIllI[BlockLiquid.lIIllIlIIIllIl[0]], BlockLiquid.lIIllIlIIIllIl[0], BlockLiquid.lIIllIlIIIllIl[1]);
    }
}
