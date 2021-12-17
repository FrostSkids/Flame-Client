// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.material.MapColor;
import net.minecraft.entity.EntityLivingBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.world.Explosion;
import java.util.Random;
import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockState;
import net.minecraft.creativetab.CreativeTabs;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Arrays;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;

public class BlockStairs extends Block
{
    private final /* synthetic */ IBlockState modelState;
    public static final /* synthetic */ PropertyEnum<EnumHalf> HALF;
    private static final /* synthetic */ int[][] field_150150_a;
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ int[] lllllIIlIlIll;
    public static final /* synthetic */ PropertyEnum<EnumShape> SHAPE;
    private /* synthetic */ boolean hasRaytraced;
    private static final /* synthetic */ String[] lllllIIlIlIIl;
    private final /* synthetic */ Block modelBlock;
    private /* synthetic */ int rayTracePass;
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return this.modelBlock.getBlockLayer();
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIlIlllllIlllIIlll, final BlockPos lllllllllllllIlIlIlllllIlllIIllI) {
        if (lIlIllIllIllllI(this.hasRaytraced ? 1 : 0)) {
            this.setBlockBounds(0.5f * (this.rayTracePass % BlockStairs.lllllIIlIlIll[2]), 0.5f * (this.rayTracePass / BlockStairs.lllllIIlIlIll[4] % BlockStairs.lllllIIlIlIll[2]), 0.5f * (this.rayTracePass / BlockStairs.lllllIIlIlIll[2] % BlockStairs.lllllIIlIlIll[2]), 0.5f + 0.5f * (this.rayTracePass % BlockStairs.lllllIIlIlIll[2]), 0.5f + 0.5f * (this.rayTracePass / BlockStairs.lllllIIlIlIll[4] % BlockStairs.lllllIIlIlIll[2]), 0.5f + 0.5f * (this.rayTracePass / BlockStairs.lllllIIlIlIll[2] % BlockStairs.lllllIIlIlIll[2]));
            "".length();
            if (-(0x4C ^ 0x22 ^ (0xD ^ 0x67)) >= 0) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    private static int lIlIllIlllIIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIlIllllIlIlllllIl, final BlockPos lllllllllllllIlIlIllllIlIlllllII, final IBlockState lllllllllllllIlIlIllllIlIllllIll) {
        this.onNeighborBlockChange(lllllllllllllIlIlIllllIlIlllllIl, lllllllllllllIlIlIllllIlIlllllII, this.modelState, Blocks.air);
        this.modelBlock.onBlockAdded(lllllllllllllIlIlIllllIlIlllllIl, lllllllllllllIlIlIllllIlIlllllII, this.modelState);
    }
    
    private static int lIlIllIlllIIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIllIlllIIllI(final int lllllllllllllIlIlIllllIIIlllllll) {
        return lllllllllllllIlIlIllllIIIlllllll < 0;
    }
    
    public static boolean isBlockStairs(final Block lllllllllllllIlIlIlllllIllIlIlll) {
        return lllllllllllllIlIlIlllllIllIlIlll instanceof BlockStairs;
    }
    
    public boolean func_176306_h(final IBlockAccess lllllllllllllIlIlIlllllIIllIlIll, final BlockPos lllllllllllllIlIlIlllllIIlIlIIII) {
        final IBlockState lllllllllllllIlIlIlllllIIllIlIIl = lllllllllllllIlIlIlllllIIllIlIll.getBlockState(lllllllllllllIlIlIlllllIIlIlIIII);
        final EnumFacing lllllllllllllIlIlIlllllIIllIlIII = lllllllllllllIlIlIlllllIIllIlIIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
        final EnumHalf lllllllllllllIlIlIlllllIIllIIlll = lllllllllllllIlIlIlllllIIllIlIIl.getValue(BlockStairs.HALF);
        int n;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIIlll, EnumHalf.TOP)) {
            n = BlockStairs.lllllIIlIlIll[1];
            "".length();
            if ((0x10 ^ 0x1A ^ (0x4A ^ 0x44)) < "   ".length()) {
                return ((56 + 128 - 108 + 110 ^ 162 + 47 - 139 + 100) & (0xE ^ 0x16 ^ (0x85 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockStairs.lllllIIlIlIll[0];
        }
        final boolean lllllllllllllIlIlIlllllIIllIIllI = n != 0;
        float lllllllllllllIlIlIlllllIIllIIlIl = 0.5f;
        float lllllllllllllIlIlIlllllIIllIIlII = 1.0f;
        if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIIllIIllI ? 1 : 0)) {
            lllllllllllllIlIlIlllllIIllIIlIl = 0.0f;
            lllllllllllllIlIlIlllllIIllIIlII = 0.5f;
        }
        float lllllllllllllIlIlIlllllIIllIIIll = 0.0f;
        float lllllllllllllIlIlIlllllIIllIIIlI = 1.0f;
        float lllllllllllllIlIlIlllllIIllIIIIl = 0.0f;
        float lllllllllllllIlIlIlllllIIllIIIII = 0.5f;
        boolean lllllllllllllIlIlIlllllIIlIlllll = BlockStairs.lllllIIlIlIll[1] != 0;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIlIII, EnumFacing.EAST)) {
            lllllllllllllIlIlIlllllIIllIIIll = 0.5f;
            lllllllllllllIlIlIlllllIIllIIIII = 1.0f;
            final IBlockState lllllllllllllIlIlIlllllIIlIllllI = lllllllllllllIlIlIlllllIIllIlIll.getBlockState(lllllllllllllIlIlIlllllIIlIlIIII.east());
            final Block lllllllllllllIlIlIlllllIIlIlllIl = lllllllllllllIlIlIlllllIIlIllllI.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIlIlllIl) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIIlll, lllllllllllllIlIlIlllllIIlIllllI.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIIlIlllII = lllllllllllllIlIlIlllllIIlIllllI.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIlllII, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.south(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIII = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((0x75 ^ 0x52) & ~(0xB7 ^ 0x90)) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIlllII, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.north(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIIl = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if (("   ".length() & ("   ".length() ^ -" ".length())) >= (81 + 59 - 72 + 82 ^ 102 + 66 - 92 + 70)) {
                        return ((0x5D ^ 0xF ^ (0x99 ^ 0xC0)) & (125 + 1 - 23 + 27 ^ 5 + 90 - 76 + 118 ^ -" ".length())) != 0x0;
                    }
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIlIII, EnumFacing.WEST)) {
            lllllllllllllIlIlIlllllIIllIIIlI = 0.5f;
            lllllllllllllIlIlIlllllIIllIIIII = 1.0f;
            final IBlockState lllllllllllllIlIlIlllllIIlIllIll = lllllllllllllIlIlIlllllIIllIlIll.getBlockState(lllllllllllllIlIlIlllllIIlIlIIII.west());
            final Block lllllllllllllIlIlIlllllIIlIllIlI = lllllllllllllIlIlIlllllIIlIllIll.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIlIllIlI) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIIlll, lllllllllllllIlIlIlllllIIlIllIll.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIIlIllIIl = lllllllllllllIlIlIlllllIIlIllIll.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIllIIl, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.south(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIII = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if ((0xAD ^ 0xA9) < " ".length()) {
                        return ((0x5B ^ 0x55) & ~(0x5D ^ 0x53)) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIllIIl, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.north(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIIl = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if (((54 + 30 - 67 + 194 ^ 61 + 143 - 80 + 27) & (74 + 135 - 48 + 64 ^ 75 + 58 - 82 + 114 ^ -" ".length())) != ((199 + 83 - 165 + 105 ^ 96 + 127 - 118 + 36) & (0xD ^ 0x47 ^ (0x80 ^ 0x99) ^ -" ".length()))) {
                        return ((0xBC ^ 0xA7 ^ (0xC1 ^ 0x92)) & (0x32 ^ 0x5B ^ (0x1 ^ 0x20) ^ -" ".length())) != 0x0;
                    }
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIlIII, EnumFacing.SOUTH)) {
            lllllllllllllIlIlIlllllIIllIIIIl = 0.5f;
            lllllllllllllIlIlIlllllIIllIIIII = 1.0f;
            final IBlockState lllllllllllllIlIlIlllllIIlIllIII = lllllllllllllIlIlIlllllIIllIlIll.getBlockState(lllllllllllllIlIlIlllllIIlIlIIII.south());
            final Block lllllllllllllIlIlIlllllIIlIlIlll = lllllllllllllIlIlIlllllIIlIllIII.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIlIlIlll) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIIlll, lllllllllllllIlIlIlllllIIlIllIII.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIIlIlIllI = lllllllllllllIlIlIlllllIIlIllIII.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIlIllI, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.east(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIlI = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if (((0xDF ^ 0x8B) & ~(0x40 ^ 0x14)) != 0x0) {
                        return ((0xE1 ^ 0xB1) & ~(0xD4 ^ 0x84)) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIlIllI, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.west(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIll = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return ((0x45 ^ 0x63 ^ (0x6B ^ 0x46)) & (0xE6 ^ 0x82 ^ (0x37 ^ 0x58) ^ -" ".length())) != 0x0;
                    }
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIlIII, EnumFacing.NORTH)) {
            final IBlockState lllllllllllllIlIlIlllllIIlIlIlIl = lllllllllllllIlIlIlllllIIllIlIll.getBlockState(lllllllllllllIlIlIlllllIIlIlIIII.north());
            final Block lllllllllllllIlIlIlllllIIlIlIlII = lllllllllllllIlIlIlllllIIlIlIlIl.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIlIlIlII) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIllIIlll, lllllllllllllIlIlIlllllIIlIlIlIl.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIIlIlIIll = lllllllllllllIlIlIlllllIIlIlIlIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIlIIll, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.east(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIlI = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((0x5 ^ 0x28) & ~(0x60 ^ 0x4D)) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIlIlIIll, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIllIlIll, lllllllllllllIlIlIlllllIIlIlIIII.west(), lllllllllllllIlIlIlllllIIllIlIIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIllIIIll = 0.5f;
                    lllllllllllllIlIlIlllllIIlIlllll = (BlockStairs.lllllIIlIlIll[0] != 0);
                }
            }
        }
        this.setBlockBounds(lllllllllllllIlIlIlllllIIllIIIll, lllllllllllllIlIlIlllllIIllIIlIl, lllllllllllllIlIlIlllllIIllIIIIl, lllllllllllllIlIlIlllllIIllIIIlI, lllllllllllllIlIlIlllllIIllIIlII, lllllllllllllIlIlIlllllIIllIIIII);
        return lllllllllllllIlIlIlllllIIlIlllll;
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIlIlIllllIlllllIlII, final BlockPos lllllllllllllIlIlIllllIllllllIll, final IBlockState lllllllllllllIlIlIllllIlllllIIlI, final AxisAlignedBB lllllllllllllIlIlIllllIllllllIIl, final List<AxisAlignedBB> lllllllllllllIlIlIllllIllllllIII, final Entity lllllllllllllIlIlIllllIlllllIlll) {
        this.setBaseCollisionBounds(lllllllllllllIlIlIllllIlllllIlII, lllllllllllllIlIlIllllIllllllIll);
        super.addCollisionBoxesToList(lllllllllllllIlIlIllllIlllllIlII, lllllllllllllIlIlIllllIllllllIll, lllllllllllllIlIlIllllIlllllIIlI, lllllllllllllIlIlIllllIllllllIIl, lllllllllllllIlIlIllllIllllllIII, lllllllllllllIlIlIllllIlllllIlll);
        final boolean lllllllllllllIlIlIllllIlllllIllI = this.func_176306_h(lllllllllllllIlIlIllllIlllllIlII, lllllllllllllIlIlIllllIllllllIll);
        super.addCollisionBoxesToList(lllllllllllllIlIlIllllIlllllIlII, lllllllllllllIlIlIllllIllllllIll, lllllllllllllIlIlIllllIlllllIIlI, lllllllllllllIlIlIllllIllllllIIl, lllllllllllllIlIlIllllIllllllIII, lllllllllllllIlIlIllllIlllllIlll);
        if (lIlIllIllIllllI(lllllllllllllIlIlIllllIlllllIllI ? 1 : 0) && lIlIllIllIllllI(this.func_176304_i(lllllllllllllIlIlIllllIlllllIlII, lllllllllllllIlIlIllllIllllllIll) ? 1 : 0)) {
            super.addCollisionBoxesToList(lllllllllllllIlIlIllllIlllllIlII, lllllllllllllIlIlIllllIllllllIll, lllllllllllllIlIlIllllIlllllIIlI, lllllllllllllIlIlIllllIllllllIIl, lllllllllllllIlIlIllllIllllllIII, lllllllllllllIlIlIllllIlllllIlll);
        }
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public boolean isCollidable() {
        return this.modelBlock.isCollidable();
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIlIllllIlIlIIllIl, final BlockPos lllllllllllllIlIlIllllIlIlIIllII, final IBlockState lllllllllllllIlIlIllllIlIlIIlIll, final EntityPlayer lllllllllllllIlIlIllllIlIlIIIIlI, final EnumFacing lllllllllllllIlIlIllllIlIlIIlIIl, final float lllllllllllllIlIlIllllIlIlIIlIII, final float lllllllllllllIlIlIllllIlIlIIIlll, final float lllllllllllllIlIlIllllIlIlIIIllI) {
        return this.modelBlock.onBlockActivated(lllllllllllllIlIlIllllIlIlIIllIl, lllllllllllllIlIlIllllIlIlIIllII, this.modelState, lllllllllllllIlIlIllllIlIlIIIIlI, EnumFacing.DOWN, 0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockStairs.lllllIIlIlIll[0] != 0;
    }
    
    @Override
    public MovingObjectPosition collisionRayTrace(final World lllllllllllllIlIlIllllIIllllIIII, final BlockPos lllllllllllllIlIlIllllIIllllllll, final Vec3 lllllllllllllIlIlIllllIIlllIlllI, final Vec3 lllllllllllllIlIlIllllIIllllllIl) {
        final MovingObjectPosition[] lllllllllllllIlIlIllllIIllllllII = new MovingObjectPosition[BlockStairs.lllllIIlIlIll[3]];
        final IBlockState lllllllllllllIlIlIllllIIlllllIll = lllllllllllllIlIlIllllIIllllIIII.getBlockState(lllllllllllllIlIlIllllIIllllllll);
        final int lllllllllllllIlIlIllllIIlllllIlI = lllllllllllllIlIlIllllIIlllllIll.getValue((IProperty<EnumFacing>)BlockStairs.FACING).getHorizontalIndex();
        int n;
        if (lIlIllIllIlllll(lllllllllllllIlIlIllllIIlllllIll.getValue(BlockStairs.HALF), EnumHalf.TOP)) {
            n = BlockStairs.lllllIIlIlIll[1];
            "".length();
            if ((0x89 ^ 0x8D) != (0x3E ^ 0x3A)) {
                return null;
            }
        }
        else {
            n = BlockStairs.lllllIIlIlIll[0];
        }
        final boolean lllllllllllllIlIlIllllIIlllllIIl = n != 0;
        final int[][] field_150150_a = BlockStairs.field_150150_a;
        final int n2 = lllllllllllllIlIlIllllIIlllllIlI;
        int n3;
        if (lIlIllIllIllllI(lllllllllllllIlIlIllllIIlllllIIl ? 1 : 0)) {
            n3 = BlockStairs.lllllIIlIlIll[4];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            n3 = BlockStairs.lllllIIlIlIll[0];
        }
        final int[] lllllllllllllIlIlIllllIIlllllIII = field_150150_a[n2 + n3];
        this.hasRaytraced = (BlockStairs.lllllIIlIlIll[1] != 0);
        int lllllllllllllIlIlIllllIIllllIlll = BlockStairs.lllllIIlIlIll[0];
        "".length();
        if (-"   ".length() > 0) {
            return null;
        }
        while (!lIlIllIlllIIlll(lllllllllllllIlIlIllllIIllllIlll, BlockStairs.lllllIIlIlIll[3])) {
            this.rayTracePass = lllllllllllllIlIlIllllIIllllIlll;
            if (lIlIllIlllIIllI(Arrays.binarySearch(lllllllllllllIlIlIllllIIlllllIII, lllllllllllllIlIlIllllIIllllIlll))) {
                lllllllllllllIlIlIllllIIllllllII[lllllllllllllIlIlIllllIIllllIlll] = super.collisionRayTrace(lllllllllllllIlIlIllllIIllllIIII, lllllllllllllIlIlIllllIIllllllll, lllllllllllllIlIlIllllIIlllIlllI, lllllllllllllIlIlIllllIIllllllIl);
            }
            ++lllllllllllllIlIlIllllIIllllIlll;
        }
        final Exception lllllllllllllIlIlIllllIIlllIIlII;
        final double lllllllllllllIlIlIllllIIlllIIlIl = ((int[])(Object)(lllllllllllllIlIlIllllIIlllIIlII = (Exception)(Object)lllllllllllllIlIlIllllIIlllllIII)).length;
        int lllllllllllllIlIlIllllIIlIIllIIl = BlockStairs.lllllIIlIlIll[0];
        "".length();
        if ((0x9E ^ 0xC2 ^ (0x70 ^ 0x28)) <= "   ".length()) {
            return null;
        }
        while (!lIlIllIlllIIlll(lllllllllllllIlIlIllllIIlIIllIIl, (int)lllllllllllllIlIlIllllIIlllIIlIl)) {
            final int lllllllllllllIlIlIllllIIllllIllI = lllllllllllllIlIlIllllIIlllIIlII[lllllllllllllIlIlIllllIIlIIllIIl];
            lllllllllllllIlIlIllllIIllllllII[lllllllllllllIlIlIllllIIllllIllI] = null;
            ++lllllllllllllIlIlIllllIIlIIllIIl;
        }
        MovingObjectPosition lllllllllllllIlIlIllllIIllllIlIl = null;
        double lllllllllllllIlIlIllllIIllllIlII = 0.0;
        final String lllllllllllllIlIlIllllIIlllIIIIl;
        final char lllllllllllllIlIlIllllIIlllIIIlI = (char)((MovingObjectPosition[])(Object)(lllllllllllllIlIlIllllIIlllIIIIl = (String)(Object)lllllllllllllIlIlIllllIIllllllII)).length;
        String lllllllllllllIlIlIllllIIlllIIIll = (String)BlockStairs.lllllIIlIlIll[0];
        "".length();
        if (((0x51 ^ 0x73) & ~(0x16 ^ 0x34)) != 0x0) {
            return null;
        }
        while (!lIlIllIlllIIlll((int)lllllllllllllIlIlIllllIIlllIIIll, lllllllllllllIlIlIllllIIlllIIIlI)) {
            final MovingObjectPosition lllllllllllllIlIlIllllIIllllIIll = lllllllllllllIlIlIllllIIlllIIIIl[lllllllllllllIlIlIllllIIlllIIIll];
            if (lIlIllIlllIlIII(lllllllllllllIlIlIllllIIllllIIll)) {
                final double lllllllllllllIlIlIllllIIllllIIlI = lllllllllllllIlIlIllllIIllllIIll.hitVec.squareDistanceTo(lllllllllllllIlIlIllllIIllllllIl);
                if (lIlIllIlllIlIIl(lIlIllIlllIIlIl(lllllllllllllIlIlIllllIIllllIIlI, lllllllllllllIlIlIllllIIllllIlII))) {
                    lllllllllllllIlIlIllllIIllllIlIl = lllllllllllllIlIlIllllIIllllIIll;
                    lllllllllllllIlIlIllllIIllllIlII = lllllllllllllIlIlIllllIIllllIIlI;
                }
            }
            ++lllllllllllllIlIlIllllIIlllIIIll;
        }
        return lllllllllllllIlIlIllllIIllllIlIl;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(final World lllllllllllllIlIlIllllIlllIIlIIl, final BlockPos lllllllllllllIlIlIllllIlllIIllII, final IBlockState lllllllllllllIlIlIllllIlllIIlIll) {
        this.modelBlock.onBlockDestroyedByPlayer(lllllllllllllIlIlIllllIlllIIlIIl, lllllllllllllIlIlIllllIlllIIllII, lllllllllllllIlIlIllllIlllIIlIll);
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIlIllllIllIlIllll) {
        return this.modelBlock.tickRate(lllllllllllllIlIlIllllIllIlIllll);
    }
    
    private static String lIlIllIllIlIllI(String lllllllllllllIlIlIllllIIlIlIIlII, final String lllllllllllllIlIlIllllIIlIlIlIII) {
        lllllllllllllIlIlIllllIIlIlIIlII = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIllllIIlIlIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllllIIlIlIIlll = new StringBuilder();
        final char[] lllllllllllllIlIlIllllIIlIlIIllI = lllllllllllllIlIlIllllIIlIlIlIII.toCharArray();
        int lllllllllllllIlIlIllllIIlIlIIlIl = BlockStairs.lllllIIlIlIll[0];
        final int lllllllllllllIlIlIllllIIlIIlllll = (Object)((String)lllllllllllllIlIlIllllIIlIlIIlII).toCharArray();
        final double lllllllllllllIlIlIllllIIlIIllllI = lllllllllllllIlIlIllllIIlIIlllll.length;
        boolean lllllllllllllIlIlIllllIIlIIlllIl = BlockStairs.lllllIIlIlIll[0] != 0;
        while (lIlIllIlllIlIlI(lllllllllllllIlIlIllllIIlIIlllIl ? 1 : 0, (int)lllllllllllllIlIlIllllIIlIIllllI)) {
            final char lllllllllllllIlIlIllllIIlIlIlIlI = lllllllllllllIlIlIllllIIlIIlllll[lllllllllllllIlIlIllllIIlIIlllIl];
            lllllllllllllIlIlIllllIIlIlIIlll.append((char)(lllllllllllllIlIlIllllIIlIlIlIlI ^ lllllllllllllIlIlIllllIIlIlIIllI[lllllllllllllIlIlIllllIIlIlIIlIl % lllllllllllllIlIlIllllIIlIlIIllI.length]));
            "".length();
            ++lllllllllllllIlIlIllllIIlIlIIlIl;
            ++lllllllllllllIlIlIllllIIlIIlllIl;
            "".length();
            if ((0xC1 ^ 0x91 ^ (0x4C ^ 0x19)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllllIIlIlIIlll);
    }
    
    protected BlockStairs(final IBlockState lllllllllllllIlIlIlllllIlllIlIlI) {
        super(lllllllllllllIlIlIlllllIlllIlIlI.getBlock().blockMaterial);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF, EnumHalf.BOTTOM).withProperty(BlockStairs.SHAPE, EnumShape.STRAIGHT));
        this.modelBlock = lllllllllllllIlIlIlllllIlllIlIlI.getBlock();
        this.modelState = lllllllllllllIlIlIlllllIlllIlIlI;
        this.setHardness(this.modelBlock.blockHardness);
        "".length();
        this.setResistance(this.modelBlock.blockResistance / 3.0f);
        "".length();
        this.setStepSound(this.modelBlock.stepSound);
        "".length();
        this.setLightOpacity(BlockStairs.lllllIIlIlIll[9]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIlIllIlllIIlll(final int lllllllllllllIlIlIllllIIlIIllIIl, final int lllllllllllllIlIlIllllIIlIIllIII) {
        return lllllllllllllIlIlIllllIIlIIllIIl >= lllllllllllllIlIlIllllIIlIIllIII;
    }
    
    public int func_176307_f(final IBlockAccess lllllllllllllIlIlIlllllIlIllllIl, final BlockPos lllllllllllllIlIlIlllllIlIllllII) {
        final IBlockState lllllllllllllIlIlIlllllIlIlllIll = lllllllllllllIlIlIlllllIlIllllIl.getBlockState(lllllllllllllIlIlIlllllIlIllllII);
        final EnumFacing lllllllllllllIlIlIlllllIlIlllIlI = lllllllllllllIlIlIlllllIlIlllIll.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
        final EnumHalf lllllllllllllIlIlIlllllIlIlllIIl = lllllllllllllIlIlIlllllIlIlllIll.getValue(BlockStairs.HALF);
        int n;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIIl, EnumHalf.TOP)) {
            n = BlockStairs.lllllIIlIlIll[1];
            "".length();
            if (((0x68 ^ 0x23) & ~(0x4A ^ 0x1)) != 0x0) {
                return (0x43 ^ 0x15) & ~(0x42 ^ 0x14);
            }
        }
        else {
            n = BlockStairs.lllllIIlIlIll[0];
        }
        final boolean lllllllllllllIlIlIlllllIlIlllIII = n != 0;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIlI, EnumFacing.EAST)) {
            final IBlockState lllllllllllllIlIlIlllllIlIllIlll = lllllllllllllIlIlIlllllIlIllllIl.getBlockState(lllllllllllllIlIlIlllllIlIllllII.east());
            final Block lllllllllllllIlIlIlllllIlIllIllI = lllllllllllllIlIlIlllllIlIllIlll.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIllIllI) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIIl, lllllllllllllIlIlIlllllIlIllIlll.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIllIlIl = lllllllllllllIlIlIlllllIlIllIlll.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIllIlIl, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.south(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n2;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n2 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return (0x34 ^ 0x30 ^ (0x7B ^ 0x6B)) & (148 + 119 - 223 + 164 ^ 82 + 2 - 38 + 150 ^ -" ".length());
                        }
                    }
                    else {
                        n2 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n2;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIllIlIl, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.north(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n3;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n3 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if (-(0xBF ^ 0xBB) >= 0) {
                            return (0x83 ^ 0x9F) & ~(0x9C ^ 0x80);
                        }
                    }
                    else {
                        n3 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n3;
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIlI, EnumFacing.WEST)) {
            final IBlockState lllllllllllllIlIlIlllllIlIllIlII = lllllllllllllIlIlIlllllIlIllllIl.getBlockState(lllllllllllllIlIlIlllllIlIllllII.west());
            final Block lllllllllllllIlIlIlllllIlIllIIll = lllllllllllllIlIlIlllllIlIllIlII.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIllIIll) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIIl, lllllllllllllIlIlIlllllIlIllIlII.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIllIIlI = lllllllllllllIlIlIlllllIlIllIlII.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIllIIlI, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.south(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n4;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n4 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if (((0x8E ^ 0x90) & ~(0x4B ^ 0x55)) != 0x0) {
                            return (0x9D ^ 0x85) & ~(0x73 ^ 0x6B);
                        }
                    }
                    else {
                        n4 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n4;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIllIIlI, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.north(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n5;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n5 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if (" ".length() == 0) {
                            return (0x37 ^ 0x17 ^ (0x70 ^ 0x12)) & (157 + 170 - 230 + 100 ^ 41 + 101 - 28 + 21 ^ -" ".length());
                        }
                    }
                    else {
                        n5 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n5;
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIlI, EnumFacing.SOUTH)) {
            final IBlockState lllllllllllllIlIlIlllllIlIllIIIl = lllllllllllllIlIlIlllllIlIllllIl.getBlockState(lllllllllllllIlIlIlllllIlIllllII.south());
            final Block lllllllllllllIlIlIlllllIlIllIIII = lllllllllllllIlIlIlllllIlIllIIIl.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIllIIII) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIIl, lllllllllllllIlIlIlllllIlIllIIIl.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIlIllll = lllllllllllllIlIlIlllllIlIllIIIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlIllll, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.east(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n6;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n6 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return (47 + 69 - 86 + 101 ^ 94 + 52 - 81 + 74) & (0xD ^ 0x3A ^ (0x6F ^ 0x50) ^ -" ".length());
                        }
                    }
                    else {
                        n6 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n6;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlIllll, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.west(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n7;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n7 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if (((0xDA ^ 0x99) & ~(0xCA ^ 0x89)) != ((0xA5 ^ 0xB1) & ~(0x19 ^ 0xD))) {
                            return (0xB8 ^ 0xAA) & ~(0x61 ^ 0x73);
                        }
                    }
                    else {
                        n7 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n7;
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIlI, EnumFacing.NORTH)) {
            final IBlockState lllllllllllllIlIlIlllllIlIlIlllI = lllllllllllllIlIlIlllllIlIllllIl.getBlockState(lllllllllllllIlIlIlllllIlIllllII.north());
            final Block lllllllllllllIlIlIlllllIlIlIllIl = lllllllllllllIlIlIlllllIlIlIlllI.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIlIllIl) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlllIIl, lllllllllllllIlIlIlllllIlIlIlllI.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIlIllII = lllllllllllllIlIlIlllllIlIlIlllI.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlIllII, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.east(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n8;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n8 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if ((0xBA ^ 0xC6 ^ (0xC8 ^ 0xB0)) < 0) {
                            return (46 + 119 - 59 + 98 ^ 7 + 2 + 4 + 131) & (0xBA ^ 0xC6 ^ (0x8A ^ 0xAA) ^ -" ".length());
                        }
                    }
                    else {
                        n8 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n8;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIlIllII, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIllllIl, lllllllllllllIlIlIlllllIlIllllII.west(), lllllllllllllIlIlIlllllIlIlllIll) ? 1 : 0)) {
                    int n9;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIlllIII ? 1 : 0)) {
                        n9 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if ("   ".length() < 0) {
                            return (0x1F ^ 0x7D) & ~(0x6B ^ 0x9);
                        }
                    }
                    else {
                        n9 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n9;
                }
            }
        }
        return BlockStairs.lllllIIlIlIll[0];
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIlIlIllllIllIlIIlll, final BlockPos lllllllllllllIlIlIllllIllIlIlIIl) {
        return this.modelBlock.getSelectedBoundingBox(lllllllllllllIlIlIllllIllIlIIlll, lllllllllllllIlIlIllllIllIlIlIIl);
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIlIllllIlIllIlIII, final BlockPos lllllllllllllIlIlIllllIlIllIIlll, final Entity lllllllllllllIlIlIllllIlIllIIIlI) {
        this.modelBlock.onEntityCollidedWithBlock(lllllllllllllIlIlIllllIlIllIlIII, lllllllllllllIlIlIllllIlIllIIlll, lllllllllllllIlIlIllllIlIllIIIlI);
    }
    
    @Override
    public Vec3 modifyAcceleration(final World lllllllllllllIlIlIllllIllIIllIlI, final BlockPos lllllllllllllIlIlIllllIllIIllIIl, final Entity lllllllllllllIlIlIllllIllIIllIII, final Vec3 lllllllllllllIlIlIllllIllIIlllII) {
        return this.modelBlock.modifyAcceleration(lllllllllllllIlIlIllllIllIIllIlI, lllllllllllllIlIlIllllIllIIllIIl, lllllllllllllIlIlIllllIllIIllIII, lllllllllllllIlIlIllllIllIIlllII);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStairs.lllllIIlIlIll[8]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.HALF;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStairs.lllllIIlIlIll[2]] = BlockStairs.SHAPE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlIllllIIllIlIIIl) {
        int lllllllllllllIlIlIllllIIllIlIIlI = BlockStairs.lllllIIlIlIll[0];
        if (lIlIllIllIlllll(lllllllllllllIlIlIllllIIllIlIIIl.getValue(BlockStairs.HALF), EnumHalf.TOP)) {
            lllllllllllllIlIlIllllIIllIlIIlI |= BlockStairs.lllllIIlIlIll[4];
        }
        lllllllllllllIlIlIllllIIllIlIIlI |= BlockStairs.lllllIIlIlIll[5] - lllllllllllllIlIlIllllIIllIlIIIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING).getIndex();
        return lllllllllllllIlIlIllllIIllIlIIlI;
    }
    
    static {
        lIlIllIllIlllIl();
        lIlIllIllIlIlll();
        FACING = PropertyDirection.create(BlockStairs.lllllIIlIlIIl[BlockStairs.lllllIIlIlIll[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        HALF = PropertyEnum.create(BlockStairs.lllllIIlIlIIl[BlockStairs.lllllIIlIlIll[1]], EnumHalf.class);
        SHAPE = PropertyEnum.create(BlockStairs.lllllIIlIlIIl[BlockStairs.lllllIIlIlIll[2]], EnumShape.class);
        final int[][] field_150150_a2 = new int[BlockStairs.lllllIIlIlIll[3]][];
        final int n = BlockStairs.lllllIIlIlIll[0];
        final int[] array = new int[BlockStairs.lllllIIlIlIll[2]];
        array[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.lllllIIlIlIll[4];
        array[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[5];
        field_150150_a2[n] = array;
        final int n2 = BlockStairs.lllllIIlIlIll[1];
        final int[] array2 = new int[BlockStairs.lllllIIlIlIll[2]];
        array2[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.lllllIIlIlIll[5];
        array2[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[6];
        field_150150_a2[n2] = array2;
        final int n3 = BlockStairs.lllllIIlIlIll[2];
        final int[] array3 = new int[BlockStairs.lllllIIlIlIll[2]];
        array3[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.lllllIIlIlIll[7];
        array3[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[6];
        field_150150_a2[n3] = array3;
        final int n4 = BlockStairs.lllllIIlIlIll[8];
        final int[] array4 = new int[BlockStairs.lllllIIlIlIll[2]];
        array4[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.lllllIIlIlIll[4];
        array4[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[7];
        field_150150_a2[n4] = array4;
        final int n5 = BlockStairs.lllllIIlIlIll[4];
        final int[] array5 = new int[BlockStairs.lllllIIlIlIll[2]];
        array5[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[1];
        field_150150_a2[n5] = array5;
        final int n6 = BlockStairs.lllllIIlIlIll[5];
        final int[] array6 = new int[BlockStairs.lllllIIlIlIll[2]];
        array6[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.lllllIIlIlIll[1];
        array6[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[8];
        field_150150_a2[n6] = array6;
        final int n7 = BlockStairs.lllllIIlIlIll[7];
        final int[] array7 = new int[BlockStairs.lllllIIlIlIll[2]];
        array7[BlockStairs.lllllIIlIlIll[0]] = BlockStairs.lllllIIlIlIll[2];
        array7[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[8];
        field_150150_a2[n7] = array7;
        final int n8 = BlockStairs.lllllIIlIlIll[6];
        final int[] array8 = new int[BlockStairs.lllllIIlIlIll[2]];
        array8[BlockStairs.lllllIIlIlIll[1]] = BlockStairs.lllllIIlIlIll[2];
        field_150150_a2[n8] = array8;
        field_150150_a = field_150150_a2;
    }
    
    private static boolean lIlIllIlllIlIlI(final int lllllllllllllIlIlIllllIIlIIlIlIl, final int lllllllllllllIlIlIllllIIlIIlIlII) {
        return lllllllllllllIlIlIllllIIlIIlIlIl < lllllllllllllIlIlIllllIIlIIlIlII;
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIlIlIllllIllllIIIlI, final BlockPos lllllllllllllIlIlIllllIllllIIIIl, final IBlockState lllllllllllllIlIlIllllIllllIIIII, final Random lllllllllllllIlIlIllllIllllIIlII) {
        this.modelBlock.randomDisplayTick(lllllllllllllIlIlIllllIllllIIIlI, lllllllllllllIlIlIllllIllllIIIIl, lllllllllllllIlIlIllllIllllIIIII, lllllllllllllIlIlIllllIllllIIlII);
    }
    
    private static boolean lIlIllIlllIIlII(final int lllllllllllllIlIlIllllIIIllllIlI) {
        return lllllllllllllIlIlIllllIIIllllIlI <= 0;
    }
    
    private static boolean lIlIllIllIllllI(final int lllllllllllllIlIlIllllIIlIIIIlIl) {
        return lllllllllllllIlIlIllllIIlIIIIlIl != 0;
    }
    
    public void setBaseCollisionBounds(final IBlockAccess lllllllllllllIlIlIlllllIllIllllI, final BlockPos lllllllllllllIlIlIlllllIllIlllIl) {
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIllIllllI.getBlockState(lllllllllllllIlIlIlllllIllIlllIl).getValue(BlockStairs.HALF), EnumHalf.TOP)) {
            this.setBlockBounds(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }
    
    private static boolean lIlIllIlllIIIll(final Object lllllllllllllIlIlIllllIIlIIlIIIl, final Object lllllllllllllIlIlIllllIIlIIlIIII) {
        return lllllllllllllIlIlIllllIIlIIlIIIl != lllllllllllllIlIlIllllIIlIIlIIII;
    }
    
    private static boolean lIlIllIllIlllll(final Object lllllllllllllIlIlIllllIIlIIIllII, final Object lllllllllllllIlIlIllllIIlIIIlIll) {
        return lllllllllllllIlIlIllllIIlIIIllII == lllllllllllllIlIlIllllIIlIIIlIll;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockStairs.lllllIIlIlIll[0] != 0;
    }
    
    @Override
    public boolean canCollideCheck(final IBlockState lllllllllllllIlIlIllllIllIIIllII, final boolean lllllllllllllIlIlIllllIllIIIlllI) {
        return this.modelBlock.canCollideCheck(lllllllllllllIlIlIllllIllIIIllII, lllllllllllllIlIlIllllIllIIIlllI);
    }
    
    @Override
    public IBlockState getActualState(IBlockState lllllllllllllIlIlIllllIIllIIIllI, final IBlockAccess lllllllllllllIlIlIllllIIllIIlIIl, final BlockPos lllllllllllllIlIlIllllIIllIIlIII) {
        if (lIlIllIllIllllI(this.func_176306_h(lllllllllllllIlIlIllllIIllIIlIIl, lllllllllllllIlIlIllllIIllIIlIII) ? 1 : 0)) {
            switch (this.func_176305_g(lllllllllllllIlIlIllllIIllIIlIIl, lllllllllllllIlIlIllllIIllIIlIII)) {
                case 0: {
                    lllllllllllllIlIlIllllIIllIIIllI = ((IBlockState)lllllllllllllIlIlIllllIIllIIIllI).withProperty(BlockStairs.SHAPE, EnumShape.STRAIGHT);
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return null;
                    }
                    return (IBlockState)lllllllllllllIlIlIllllIIllIIIllI;
                }
                case 1: {
                    lllllllllllllIlIlIllllIIllIIIllI = ((IBlockState)lllllllllllllIlIlIllllIIllIIIllI).withProperty(BlockStairs.SHAPE, EnumShape.INNER_RIGHT);
                    "".length();
                    if ((0xAD ^ 0xA9) <= "   ".length()) {
                        return null;
                    }
                    return (IBlockState)lllllllllllllIlIlIllllIIllIIIllI;
                }
                case 2: {
                    lllllllllllllIlIlIllllIIllIIIllI = ((IBlockState)lllllllllllllIlIlIllllIIllIIIllI).withProperty(BlockStairs.SHAPE, EnumShape.INNER_LEFT);
                    break;
                }
            }
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            switch (this.func_176307_f(lllllllllllllIlIlIllllIIllIIlIIl, lllllllllllllIlIlIllllIIllIIlIII)) {
                case 0: {
                    lllllllllllllIlIlIllllIIllIIIllI = ((IBlockState)lllllllllllllIlIlIllllIIllIIIllI).withProperty(BlockStairs.SHAPE, EnumShape.STRAIGHT);
                    "".length();
                    if (("  ".length() & ("  ".length() ^ -" ".length())) < 0) {
                        return null;
                    }
                    break;
                }
                case 1: {
                    lllllllllllllIlIlIllllIIllIIIllI = ((IBlockState)lllllllllllllIlIlIllllIIllIIIllI).withProperty(BlockStairs.SHAPE, EnumShape.OUTER_RIGHT);
                    "".length();
                    if ((170 + 6 - 79 + 86 ^ 99 + 87 - 92 + 85) > (0x7D ^ 0x2C ^ (0x50 ^ 0x5))) {
                        return null;
                    }
                    break;
                }
                case 2: {
                    lllllllllllllIlIlIllllIIllIIIllI = ((IBlockState)lllllllllllllIlIlIllllIIllIIIllI).withProperty(BlockStairs.SHAPE, EnumShape.OUTER_LEFT);
                    break;
                }
            }
        }
        return (IBlockState)lllllllllllllIlIlIllllIIllIIIllI;
    }
    
    private static boolean lIlIllIlllIlIIl(final int lllllllllllllIlIlIllllIIIlllIllI) {
        return lllllllllllllIlIlIllllIIIlllIllI > 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlIllllIIllIllIll) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyEnum<EnumHalf> half = BlockStairs.HALF;
        EnumHalf enumHalf;
        if (lIlIllIlllIlIIl(lllllllllllllIlIlIllllIIllIllIll & BlockStairs.lllllIIlIlIll[4])) {
            enumHalf = EnumHalf.TOP;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            enumHalf = EnumHalf.BOTTOM;
        }
        IBlockState lllllllllllllIlIlIllllIIllIllIlI = defaultState.withProperty((IProperty<Comparable>)half, enumHalf);
        lllllllllllllIlIlIllllIIllIllIlI = lllllllllllllIlIlIllllIIllIllIlI.withProperty((IProperty<Comparable>)BlockStairs.FACING, EnumFacing.getFront(BlockStairs.lllllIIlIlIll[5] - (lllllllllllllIlIlIllllIIllIllIll & BlockStairs.lllllIIlIlIll[8])));
        return lllllllllllllIlIlIllllIIllIllIlI;
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIlIllllIlIlIlIllI, final BlockPos lllllllllllllIlIlIllllIlIlIlIlIl, final IBlockState lllllllllllllIlIlIllllIlIlIllIIl, final Random lllllllllllllIlIlIllllIlIlIllIII) {
        this.modelBlock.updateTick(lllllllllllllIlIlIllllIlIlIlIllI, lllllllllllllIlIlIllllIlIlIlIlIl, lllllllllllllIlIlIllllIlIlIllIIl, lllllllllllllIlIlIllllIlIlIllIII);
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIlIllllIllIIIIllI, final BlockPos lllllllllllllIlIlIllllIllIIIIlIl) {
        return this.modelBlock.canPlaceBlockAt(lllllllllllllIlIlIllllIllIIIIllI, lllllllllllllIlIlIllllIllIIIIlIl);
    }
    
    public int func_176305_g(final IBlockAccess lllllllllllllIlIlIlllllIlIIIIllI, final BlockPos lllllllllllllIlIlIlllllIlIIlIlll) {
        final IBlockState lllllllllllllIlIlIlllllIlIIlIllI = lllllllllllllIlIlIlllllIlIIIIllI.getBlockState(lllllllllllllIlIlIlllllIlIIlIlll);
        final EnumFacing lllllllllllllIlIlIlllllIlIIlIlIl = lllllllllllllIlIlIlllllIlIIlIllI.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
        final EnumHalf lllllllllllllIlIlIlllllIlIIlIlII = lllllllllllllIlIlIlllllIlIIlIllI.getValue(BlockStairs.HALF);
        int n;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlII, EnumHalf.TOP)) {
            n = BlockStairs.lllllIIlIlIll[1];
            "".length();
            if ("  ".length() == -" ".length()) {
                return (0xFD ^ 0x80 ^ (0x83 ^ 0xBB)) & (126 + 21 - 10 + 68 ^ 132 + 59 - 93 + 38 ^ -" ".length());
            }
        }
        else {
            n = BlockStairs.lllllIIlIlIll[0];
        }
        final boolean lllllllllllllIlIlIlllllIlIIlIIll = n != 0;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlIl, EnumFacing.EAST)) {
            final IBlockState lllllllllllllIlIlIlllllIlIIlIIlI = lllllllllllllIlIlIlllllIlIIIIllI.getBlockState(lllllllllllllIlIlIlllllIlIIlIlll.west());
            final Block lllllllllllllIlIlIlllllIlIIlIIIl = lllllllllllllIlIlIlllllIlIIlIIlI.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIIlIIIl) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlII, lllllllllllllIlIlIlllllIlIIlIIlI.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIIlIIII = lllllllllllllIlIlIlllllIlIIlIIlI.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIIII, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.north(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n2;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n2 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if ((0x95 ^ 0x91) <= ((0xD3 ^ 0xC3) & ~(0x90 ^ 0x80))) {
                            return (0x87 ^ 0xB4) & ~(0x34 ^ 0x7);
                        }
                    }
                    else {
                        n2 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n2;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIIII, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.south(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n3;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n3 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if ((0x35 ^ 0x31) <= (" ".length() & ~" ".length())) {
                            return (0xDD ^ 0x95) & ~(0xCD ^ 0x85);
                        }
                    }
                    else {
                        n3 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n3;
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlIl, EnumFacing.WEST)) {
            final IBlockState lllllllllllllIlIlIlllllIlIIIllll = lllllllllllllIlIlIlllllIlIIIIllI.getBlockState(lllllllllllllIlIlIlllllIlIIlIlll.east());
            final Block lllllllllllllIlIlIlllllIlIIIlllI = lllllllllllllIlIlIlllllIlIIIllll.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIIIlllI) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlII, lllllllllllllIlIlIlllllIlIIIllll.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIIIllIl = lllllllllllllIlIlIlllllIlIIIllll.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIIllIl, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.north(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n4;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n4 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if ("  ".length() < 0) {
                            return (0xB7 ^ 0xAF) & ~(0x56 ^ 0x4E) & ~((0xF0 ^ 0xA1) & ~(0xDF ^ 0x8E));
                        }
                    }
                    else {
                        n4 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n4;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIIllIl, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.south(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n5;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n5 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if (((0x4A ^ 0x2 ^ (0xF2 ^ 0x95)) & (12 + 137 - 145 + 172 ^ 41 + 84 + 22 + 12 ^ -" ".length())) != 0x0) {
                            return "   ".length() & ("   ".length() ^ -" ".length());
                        }
                    }
                    else {
                        n5 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n5;
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlIl, EnumFacing.SOUTH)) {
            final IBlockState lllllllllllllIlIlIlllllIlIIIllII = lllllllllllllIlIlIlllllIlIIIIllI.getBlockState(lllllllllllllIlIlIlllllIlIIlIlll.north());
            final Block lllllllllllllIlIlIlllllIlIIIlIll = lllllllllllllIlIlIlllllIlIIIllII.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIIIlIll) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlII, lllllllllllllIlIlIlllllIlIIIllII.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIIIlIlI = lllllllllllllIlIlIlllllIlIIIllII.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIIlIlI, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.west(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n6;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n6 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if ("  ".length() <= 0) {
                            return (0xFB ^ 0xB9) & ~(0xE3 ^ 0xA1);
                        }
                    }
                    else {
                        n6 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n6;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIIlIlI, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.east(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n7;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n7 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if ((0x6F ^ 0x75 ^ (0x6B ^ 0x75)) > (0x5F ^ 0x2C ^ (0xFD ^ 0x8A))) {
                            return (139 + 39 - 75 + 87 ^ 1 + 156 - 151 + 165) & (0x3 ^ 0x14 ^ "  ".length() ^ -" ".length());
                        }
                    }
                    else {
                        n7 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n7;
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlIl, EnumFacing.NORTH)) {
            final IBlockState lllllllllllllIlIlIlllllIlIIIlIIl = lllllllllllllIlIlIlllllIlIIIIllI.getBlockState(lllllllllllllIlIlIlllllIlIIlIlll.south());
            final Block lllllllllllllIlIlIlllllIlIIIlIII = lllllllllllllIlIlIlllllIlIIIlIIl.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIlIIIlIII) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIlIlII, lllllllllllllIlIlIlllllIlIIIlIIl.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIlIIIIlll = lllllllllllllIlIlIlllllIlIIIlIIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIIIlll, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.west(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n8;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n8 = BlockStairs.lllllIIlIlIll[1];
                        "".length();
                        if (((0xD6 ^ 0x9D ^ (0xCD ^ 0xC3)) & (48 + 167 - 33 + 25 ^ 4 + 98 - 101 + 137 ^ -" ".length())) != 0x0) {
                            return (93 + 165 - 61 + 49 ^ 66 + 113 - 22 + 23) & (0xBD ^ 0x8E ^ (0x8 ^ 0x79) ^ -" ".length());
                        }
                    }
                    else {
                        n8 = BlockStairs.lllllIIlIlIll[2];
                    }
                    return n8;
                }
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIlIIIIlll, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIlIIIIllI, lllllllllllllIlIlIlllllIlIIlIlll.east(), lllllllllllllIlIlIlllllIlIIlIllI) ? 1 : 0)) {
                    int n9;
                    if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIlIIlIIll ? 1 : 0)) {
                        n9 = BlockStairs.lllllIIlIlIll[2];
                        "".length();
                        if (null != null) {
                            return (0x1B ^ 0x22 ^ (0x4 ^ 0x2E)) & (156 + 42 - 178 + 148 ^ 156 + 94 - 187 + 124 ^ -" ".length());
                        }
                    }
                    else {
                        n9 = BlockStairs.lllllIIlIlIll[1];
                    }
                    return n9;
                }
            }
        }
        return BlockStairs.lllllIIlIlIll[0];
    }
    
    @Override
    public void onBlockDestroyedByExplosion(final World lllllllllllllIlIlIllllIlIIllllII, final BlockPos lllllllllllllIlIlIllllIlIIllIlll, final Explosion lllllllllllllIlIlIllllIlIIlllIlI) {
        this.modelBlock.onBlockDestroyedByExplosion(lllllllllllllIlIlIllllIlIIllllII, lllllllllllllIlIlIllllIlIIllIlll, lllllllllllllIlIlIllllIlIIlllIlI);
    }
    
    @Override
    public void onBlockClicked(final World lllllllllllllIlIlIllllIlllIllIIl, final BlockPos lllllllllllllIlIlIllllIlllIllIII, final EntityPlayer lllllllllllllIlIlIllllIlllIlIIll) {
        this.modelBlock.onBlockClicked(lllllllllllllIlIlIllllIlllIllIIl, lllllllllllllIlIlIllllIlllIllIII, lllllllllllllIlIlIllllIlllIlIIll);
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIlIllllIlIlllIIll, final BlockPos lllllllllllllIlIlIllllIlIllIlllI, final IBlockState lllllllllllllIlIlIllllIlIlllIIIl) {
        this.modelBlock.breakBlock(lllllllllllllIlIlIllllIlIlllIIll, lllllllllllllIlIlIllllIlIllIlllI, this.modelState);
    }
    
    private static String lIlIllIllIlIlIl(final String lllllllllllllIlIlIllllIIlIllIlll, final String lllllllllllllIlIlIllllIIlIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllllIIlIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllllIIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllllIIlIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllllIIlIlllIll.init(BlockStairs.lllllIIlIlIll[2], lllllllllllllIlIlIllllIIlIllllII);
            return new String(lllllllllllllIlIlIllllIIlIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllllIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllllIIlIlllIlI) {
            lllllllllllllIlIlIllllIIlIlllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMixedBrightnessForBlock(final IBlockAccess lllllllllllllIlIlIllllIllIllllll, final BlockPos lllllllllllllIlIlIllllIlllIIIIIl) {
        return this.modelBlock.getMixedBrightnessForBlock(lllllllllllllIlIlIllllIllIllllll, lllllllllllllIlIlIllllIlllIIIIIl);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIlIllllIlIIIlllII, final BlockPos lllllllllllllIlIlIllllIlIIIllIll, final EnumFacing lllllllllllllIlIlIllllIlIIIllIlI, final float lllllllllllllIlIlIllllIlIIlIIIll, final float lllllllllllllIlIlIllllIlIIIllIII, final float lllllllllllllIlIlIllllIlIIlIIIIl, final int lllllllllllllIlIlIllllIlIIlIIIII, final EntityLivingBase lllllllllllllIlIlIllllIlIIIlllll) {
        IBlockState lllllllllllllIlIlIllllIlIIIllllI = super.onBlockPlaced(lllllllllllllIlIlIllllIlIIIlllII, lllllllllllllIlIlIllllIlIIIllIll, lllllllllllllIlIlIllllIlIIIllIlI, lllllllllllllIlIlIllllIlIIlIIIll, lllllllllllllIlIlIllllIlIIIllIII, lllllllllllllIlIlIllllIlIIlIIIIl, lllllllllllllIlIlIllllIlIIlIIIII, lllllllllllllIlIlIllllIlIIIlllll);
        lllllllllllllIlIlIllllIlIIIllllI = lllllllllllllIlIlIllllIlIIIllllI.withProperty((IProperty<Comparable>)BlockStairs.FACING, lllllllllllllIlIlIllllIlIIIlllll.getHorizontalFacing()).withProperty(BlockStairs.SHAPE, EnumShape.STRAIGHT);
        IBlockState blockState;
        if (lIlIllIlllIIIll(lllllllllllllIlIlIllllIlIIIllIlI, EnumFacing.DOWN) && (!lIlIllIlllIIIll(lllllllllllllIlIlIllllIlIIIllIlI, EnumFacing.UP) || lIlIllIlllIIlII(lIlIllIlllIIIlI(lllllllllllllIlIlIllllIlIIIllIII, 0.5)))) {
            blockState = lllllllllllllIlIlIllllIlIIIllllI.withProperty(BlockStairs.HALF, EnumHalf.BOTTOM);
            "".length();
            if (((0x34 ^ 0x3B ^ (0x50 ^ 0x64)) & (25 + 12 - 22 + 127 ^ 29 + 23 - 15 + 144 ^ -" ".length())) != ((0xB9 ^ 0x87 ^ (0x3C ^ 0x4)) & (0xE2 ^ 0xC6 ^ (0xA7 ^ 0x85) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            blockState = lllllllllllllIlIlIllllIlIIIllllI.withProperty(BlockStairs.HALF, EnumHalf.TOP);
        }
        return blockState;
    }
    
    public static boolean isSameStair(final IBlockAccess lllllllllllllIlIlIlllllIllIlIIIl, final BlockPos lllllllllllllIlIlIlllllIllIIlIll, final IBlockState lllllllllllllIlIlIlllllIllIIlIlI) {
        final IBlockState lllllllllllllIlIlIlllllIllIIlllI = lllllllllllllIlIlIlllllIllIlIIIl.getBlockState(lllllllllllllIlIlIlllllIllIIlIll);
        final Block lllllllllllllIlIlIlllllIllIIllIl = lllllllllllllIlIlIlllllIllIIlllI.getBlock();
        if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIllIIllIl) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIllIIlllI.getValue(BlockStairs.HALF), lllllllllllllIlIlIlllllIllIIlIlI.getValue(BlockStairs.HALF)) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIllIIlllI.getValue((IProperty<Object>)BlockStairs.FACING), lllllllllllllIlIlIlllllIllIIlIlI.getValue((IProperty<Object>)BlockStairs.FACING))) {
            return BlockStairs.lllllIIlIlIll[1] != 0;
        }
        return BlockStairs.lllllIIlIlIll[0] != 0;
    }
    
    public boolean func_176304_i(final IBlockAccess lllllllllllllIlIlIlllllIIIIlIlIl, final BlockPos lllllllllllllIlIlIlllllIIIlIlllI) {
        final IBlockState lllllllllllllIlIlIlllllIIIlIllIl = lllllllllllllIlIlIlllllIIIIlIlIl.getBlockState(lllllllllllllIlIlIlllllIIIlIlllI);
        final EnumFacing lllllllllllllIlIlIlllllIIIlIllII = lllllllllllllIlIlIlllllIIIlIllIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
        final EnumHalf lllllllllllllIlIlIlllllIIIlIlIll = lllllllllllllIlIlIlllllIIIlIllIl.getValue(BlockStairs.HALF);
        int n;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIlIll, EnumHalf.TOP)) {
            n = BlockStairs.lllllIIlIlIll[1];
            "".length();
            if (" ".length() == 0) {
                return ((0x5D ^ 0x3D ^ (0x1 ^ 0x3D)) & (33 + 0 + 79 + 141 ^ 115 + 77 - 137 + 106 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockStairs.lllllIIlIlIll[0];
        }
        final boolean lllllllllllllIlIlIlllllIIIlIlIlI = n != 0;
        float lllllllllllllIlIlIlllllIIIlIlIIl = 0.5f;
        float lllllllllllllIlIlIlllllIIIlIlIII = 1.0f;
        if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIIIlIlIlI ? 1 : 0)) {
            lllllllllllllIlIlIlllllIIIlIlIIl = 0.0f;
            lllllllllllllIlIlIlllllIIIlIlIII = 0.5f;
        }
        float lllllllllllllIlIlIlllllIIIlIIlll = 0.0f;
        float lllllllllllllIlIlIlllllIIIlIIllI = 0.5f;
        float lllllllllllllIlIlIlllllIIIlIIlIl = 0.5f;
        float lllllllllllllIlIlIlllllIIIlIIlII = 1.0f;
        boolean lllllllllllllIlIlIlllllIIIlIIIll = BlockStairs.lllllIIlIlIll[0] != 0;
        if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIllII, EnumFacing.EAST)) {
            final IBlockState lllllllllllllIlIlIlllllIIIlIIIlI = lllllllllllllIlIlIlllllIIIIlIlIl.getBlockState(lllllllllllllIlIlIlllllIIIlIlllI.west());
            final Block lllllllllllllIlIlIlllllIIIlIIIIl = lllllllllllllIlIlIlllllIIIlIIIlI.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIIlIIIIl) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIlIll, lllllllllllllIlIlIlllllIIIlIIIlI.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIIIlIIIII = lllllllllllllIlIlIlllllIIIlIIIlI.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIIIII, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.north(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIlIl = 0.0f;
                    lllllllllllllIlIlIlllllIIIlIIlII = 0.5f;
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if ((0x5A ^ 0x5F) <= 0) {
                        return ((0x60 ^ 0x73) & ~(0x87 ^ 0x94)) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIIIII, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.south(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIlIl = 0.5f;
                    lllllllllllllIlIlIlllllIIIlIIlII = 1.0f;
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if ((0x7E ^ 0x7A) != (0x76 ^ 0x72)) {
                        return ((0x9B ^ 0x9E) & ~(0x45 ^ 0x40)) != 0x0;
                    }
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIllII, EnumFacing.WEST)) {
            final IBlockState lllllllllllllIlIlIlllllIIIIlllll = lllllllllllllIlIlIlllllIIIIlIlIl.getBlockState(lllllllllllllIlIlIlllllIIIlIlllI.east());
            final Block lllllllllllllIlIlIlllllIIIIllllI = lllllllllllllIlIlIlllllIIIIlllll.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIIIllllI) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIlIll, lllllllllllllIlIlIlllllIIIIlllll.getValue(BlockStairs.HALF))) {
                lllllllllllllIlIlIlllllIIIlIIlll = 0.5f;
                lllllllllllllIlIlIlllllIIIlIIllI = 1.0f;
                final EnumFacing lllllllllllllIlIlIlllllIIIIlllIl = lllllllllllllIlIlIlllllIIIIlllll.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIIlllIl, EnumFacing.NORTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.north(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIlIl = 0.0f;
                    lllllllllllllIlIlIlllllIIIlIIlII = 0.5f;
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((0xA8 ^ 0x85) & ~(0x64 ^ 0x49)) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIIlllIl, EnumFacing.SOUTH) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.south(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIlIl = 0.5f;
                    lllllllllllllIlIlIlllllIIIlIIlII = 1.0f;
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if (((0x1F ^ 0x76 ^ (0x50 ^ 0x5)) & (139 + 131 - 130 + 28 ^ 115 + 38 - 85 + 80 ^ -" ".length())) > 0) {
                        return ((0x4F ^ 0x3E ^ (0x29 ^ 0x15)) & (0x41 ^ 0x78 ^ (0xD7 ^ 0xA3) ^ -" ".length())) != 0x0;
                    }
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIllII, EnumFacing.SOUTH)) {
            final IBlockState lllllllllllllIlIlIlllllIIIIlllII = lllllllllllllIlIlIlllllIIIIlIlIl.getBlockState(lllllllllllllIlIlIlllllIIIlIlllI.north());
            final Block lllllllllllllIlIlIlllllIIIIllIll = lllllllllllllIlIlIlllllIIIIlllII.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIIIllIll) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIlIll, lllllllllllllIlIlIlllllIIIIlllII.getValue(BlockStairs.HALF))) {
                lllllllllllllIlIlIlllllIIIlIIlIl = 0.0f;
                lllllllllllllIlIlIlllllIIIlIIlII = 0.5f;
                final EnumFacing lllllllllllllIlIlIlllllIIIIllIlI = lllllllllllllIlIlIlllllIIIIlllII.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIIllIlI, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.west(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if (((0x9E ^ 0x86 ^ (0x3C ^ 0x7D)) & (11 + 75 + 108 + 21 ^ 20 + 132 - 102 + 92 ^ -" ".length())) > 0) {
                        return ((0x72 ^ 0x3E ^ (0xA3 ^ 0xBD)) & (174 + 3 - 169 + 217 ^ 1 + 74 + 104 + 0 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIIllIlI, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.east(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIlll = 0.5f;
                    lllllllllllllIlIlIlllllIIIlIIllI = 1.0f;
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if (null != null) {
                        return ((120 + 6 - 49 + 69 ^ 151 + 69 - 197 + 157) & (0xFF ^ 0xAC ^ (0x33 ^ 0x46) ^ -" ".length())) != 0x0;
                    }
                }
            }
        }
        else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIllII, EnumFacing.NORTH)) {
            final IBlockState lllllllllllllIlIlIlllllIIIIllIIl = lllllllllllllIlIlIlllllIIIIlIlIl.getBlockState(lllllllllllllIlIlIlllllIIIlIlllI.south());
            final Block lllllllllllllIlIlIlllllIIIIllIII = lllllllllllllIlIlIlllllIIIIllIIl.getBlock();
            if (lIlIllIllIllllI(isBlockStairs(lllllllllllllIlIlIlllllIIIIllIII) ? 1 : 0) && lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIlIlIll, lllllllllllllIlIlIlllllIIIIllIIl.getValue(BlockStairs.HALF))) {
                final EnumFacing lllllllllllllIlIlIlllllIIIIlIlll = lllllllllllllIlIlIlllllIIIIllIIl.getValue((IProperty<EnumFacing>)BlockStairs.FACING);
                if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIIlIlll, EnumFacing.WEST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.west(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                    "".length();
                    if (" ".length() <= 0) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIlIllIllIlllll(lllllllllllllIlIlIlllllIIIIlIlll, EnumFacing.EAST) && lIlIllIlllIIIII(isSameStair(lllllllllllllIlIlIlllllIIIIlIlIl, lllllllllllllIlIlIlllllIIIlIlllI.east(), lllllllllllllIlIlIlllllIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIlIlIlllllIIIlIIlll = 0.5f;
                    lllllllllllllIlIlIlllllIIIlIIllI = 1.0f;
                    lllllllllllllIlIlIlllllIIIlIIIll = (BlockStairs.lllllIIlIlIll[1] != 0);
                }
            }
        }
        if (lIlIllIllIllllI(lllllllllllllIlIlIlllllIIIlIIIll ? 1 : 0)) {
            this.setBlockBounds(lllllllllllllIlIlIlllllIIIlIIlll, lllllllllllllIlIlIlllllIIIlIlIIl, lllllllllllllIlIlIlllllIIIlIIlIl, lllllllllllllIlIlIlllllIIIlIIllI, lllllllllllllIlIlIlllllIIIlIlIII, lllllllllllllIlIlIlllllIIIlIIlII);
        }
        return lllllllllllllIlIlIlllllIIIlIIIll;
    }
    
    private static void lIlIllIllIlIlll() {
        (lllllIIlIlIIl = new String[BlockStairs.lllllIIlIlIll[8]])[BlockStairs.lllllIIlIlIll[0]] = lIlIllIllIlIlIl("t9MDHf39GSs=", "HljHU");
        BlockStairs.lllllIIlIlIIl[BlockStairs.lllllIIlIlIll[1]] = lIlIllIllIlIlIl("In2Hg1Y44Rk=", "CKQqJ");
        BlockStairs.lllllIIlIlIIl[BlockStairs.lllllIIlIlIll[2]] = lIlIllIllIlIllI("OAsvEz0=", "KcNcX");
    }
    
    @Override
    public float getExplosionResistance(final Entity lllllllllllllIlIlIllllIllIlllIlI) {
        return this.modelBlock.getExplosionResistance(lllllllllllllIlIlIllllIllIlllIlI);
    }
    
    private static void lIlIllIllIlllIl() {
        (lllllIIlIlIll = new int[10])[0] = ((0x19 ^ 0x35 ^ (0x2 ^ 0x3D)) & (102 + 29 - 129 + 186 ^ 41 + 46 - 66 + 154 ^ -" ".length()));
        BlockStairs.lllllIIlIlIll[1] = " ".length();
        BlockStairs.lllllIIlIlIll[2] = "  ".length();
        BlockStairs.lllllIIlIlIll[3] = (0x6D ^ 0x65);
        BlockStairs.lllllIIlIlIll[4] = (0x59 ^ 0x5D);
        BlockStairs.lllllIIlIlIll[5] = (0x8B ^ 0x8E);
        BlockStairs.lllllIIlIlIll[6] = (0x76 ^ 0x71);
        BlockStairs.lllllIIlIlIll[7] = (0x62 ^ 0x66 ^ "  ".length());
        BlockStairs.lllllIIlIlIll[8] = "   ".length();
        BlockStairs.lllllIIlIlIll[9] = 10 + 3 + 119 + 14 + (101 + 87 - 178 + 151) - (22 + 129 - 111 + 202) + (163 + 59 - 199 + 167);
    }
    
    private static boolean lIlIllIlllIlIII(final Object lllllllllllllIlIlIllllIIlIIIlIII) {
        return lllllllllllllIlIlIllllIIlIIIlIII != null;
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIlIlIllllIlIIllIIll) {
        return this.modelBlock.getMapColor(this.modelState);
    }
    
    private static boolean lIlIllIlllIIIII(final int lllllllllllllIlIlIllllIIlIIIIIll) {
        return lllllllllllllIlIlIllllIIlIIIIIll == 0;
    }
    
    public enum EnumHalf implements IStringSerializable
    {
        private static final /* synthetic */ String[] lIIlllIIlIIlll;
        private static final /* synthetic */ int[] lIIlllIIlIlIlI;
        
        BOTTOM(EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[2]], EnumHalf.lIIlllIIlIlIlI[1], EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[3]]), 
        TOP(EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[0]], EnumHalf.lIIlllIIlIlIlI[0], EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[1]]);
        
        private final /* synthetic */ String name;
        
        private static void llIllIlIllllIlI() {
            (lIIlllIIlIlIlI = new int[6])[0] = ((0x6F ^ 0x3C) & ~(0x3B ^ 0x68));
            EnumHalf.lIIlllIIlIlIlI[1] = " ".length();
            EnumHalf.lIIlllIIlIlIlI[2] = "  ".length();
            EnumHalf.lIIlllIIlIlIlI[3] = "   ".length();
            EnumHalf.lIIlllIIlIlIlI[4] = (0x1F ^ 0x1 ^ (0x58 ^ 0x42));
            EnumHalf.lIIlllIIlIlIlI[5] = (127 + 184 - 272 + 166 ^ 69 + 183 - 223 + 168);
        }
        
        private static String llIllIlIlllIlIl(final String lllllllllllllIIlIlIIIIlllllIlIIl, final String lllllllllllllIIlIlIIIIlllllIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIIIIlllllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIIlllllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIIIIlllllIlIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIIIIlllllIlIll.init(EnumHalf.lIIlllIIlIlIlI[2], lllllllllllllIIlIlIIIIlllllIllII);
                return new String(lllllllllllllIIlIlIIIIlllllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIIlllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIIIIlllllIlIlI) {
                lllllllllllllIIlIlIIIIlllllIlIlI.printStackTrace();
                return null;
            }
        }
        
        static {
            llIllIlIllllIlI();
            llIllIlIllllIII();
            final EnumHalf[] enum$VALUES = new EnumHalf[EnumHalf.lIIlllIIlIlIlI[2]];
            enum$VALUES[EnumHalf.lIIlllIIlIlIlI[0]] = EnumHalf.TOP;
            enum$VALUES[EnumHalf.lIIlllIIlIlIlI[1]] = EnumHalf.BOTTOM;
            ENUM$VALUES = enum$VALUES;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static void llIllIlIllllIII() {
            (lIIlllIIlIIlll = new String[EnumHalf.lIIlllIIlIlIlI[4]])[EnumHalf.lIIlllIIlIlIlI[0]] = llIllIlIlllIIll("hxwKLmrmM3w=", "JVdXm");
            EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[1]] = llIllIlIlllIlIl("oj8PQ/ksncY=", "reOQH");
            EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[2]] = llIllIlIlllIlIl("fKFmnQ09PbM=", "qHpzd");
            EnumHalf.lIIlllIIlIIlll[EnumHalf.lIIlllIIlIlIlI[3]] = llIllIlIlllIIll("5eCyvihT7Ys=", "KKhYL");
        }
        
        private EnumHalf(final String lllllllllllllIIlIlIIIlIIIIIIIIIl, final int lllllllllllllIIlIlIIIlIIIIIIIIII, final String lllllllllllllIIlIlIIIIllllllllll) {
            this.name = lllllllllllllIIlIlIIIIllllllllll;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static String llIllIlIlllIIll(final String lllllllllllllIIlIlIIIIllllIlllII, final String lllllllllllllIIlIlIIIIllllIllIll) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIIIIllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIIllllIllIll.getBytes(StandardCharsets.UTF_8)), EnumHalf.lIIlllIIlIlIlI[5]), "DES");
                final Cipher lllllllllllllIIlIlIIIIllllIllllI = Cipher.getInstance("DES");
                lllllllllllllIIlIlIIIIllllIllllI.init(EnumHalf.lIIlllIIlIlIlI[2], lllllllllllllIIlIlIIIIllllIlllll);
                return new String(lllllllllllllIIlIlIIIIllllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIIllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIIIIllllIlllIl) {
                lllllllllllllIIlIlIIIIllllIlllIl.printStackTrace();
                return null;
            }
        }
    }
    
    public enum EnumShape implements IStringSerializable
    {
        INNER_RIGHT(EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[4]], EnumShape.lIIIllIllIlllI[2], EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[5]]), 
        OUTER_LEFT(EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[6]], EnumShape.lIIIllIllIlllI[3], EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[7]]);
        
        private static final /* synthetic */ int[] lIIIllIllIlllI;
        private final /* synthetic */ String name;
        
        INNER_LEFT(EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[2]], EnumShape.lIIIllIllIlllI[1], EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[3]]);
        
        private static final /* synthetic */ String[] lIIIllIllIllII;
        
        STRAIGHT(EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[0]], EnumShape.lIIIllIllIlllI[0], EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[1]]), 
        OUTER_RIGHT(EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[8]], EnumShape.lIIIllIllIlllI[4], EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[9]]);
        
        private EnumShape(final String lllllllllllllIIllllllIlIllllIlll, final int lllllllllllllIIllllllIlIllllIllI, final String lllllllllllllIIllllllIlIlllllIIl) {
            this.name = lllllllllllllIIllllllIlIlllllIIl;
        }
        
        private static String llIIIlIlIlIlllI(String lllllllllllllIIllllllIlIlIllllIl, final String lllllllllllllIIllllllIlIllIIIIIl) {
            lllllllllllllIIllllllIlIlIllllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllllIlIlIllllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllllllIlIllIIIIII = new StringBuilder();
            final char[] lllllllllllllIIllllllIlIlIllllll = lllllllllllllIIllllllIlIllIIIIIl.toCharArray();
            int lllllllllllllIIllllllIlIlIlllllI = EnumShape.lIIIllIllIlllI[0];
            final double lllllllllllllIIllllllIlIlIlllIII = (Object)((String)lllllllllllllIIllllllIlIlIllllIl).toCharArray();
            final boolean lllllllllllllIIllllllIlIlIllIlll = lllllllllllllIIllllllIlIlIlllIII.length != 0;
            byte lllllllllllllIIllllllIlIlIllIllI = (byte)EnumShape.lIIIllIllIlllI[0];
            while (llIIIlIlIllIIIl(lllllllllllllIIllllllIlIlIllIllI, lllllllllllllIIllllllIlIlIllIlll ? 1 : 0)) {
                final char lllllllllllllIIllllllIlIllIIIIll = lllllllllllllIIllllllIlIlIlllIII[lllllllllllllIIllllllIlIlIllIllI];
                lllllllllllllIIllllllIlIllIIIIII.append((char)(lllllllllllllIIllllllIlIllIIIIll ^ lllllllllllllIIllllllIlIlIllllll[lllllllllllllIIllllllIlIlIlllllI % lllllllllllllIIllllllIlIlIllllll.length]));
                "".length();
                ++lllllllllllllIIllllllIlIlIlllllI;
                ++lllllllllllllIIllllllIlIlIllIllI;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllllllIlIllIIIIII);
        }
        
        private static void llIIIlIlIlIllll() {
            (lIIIllIllIllII = new String[EnumShape.lIIIllIllIlllI[10]])[EnumShape.lIIIllIllIlllI[0]] = llIIIlIlIlIIIll("DoGNEzGBnr1hA5z3LkoppA==", "ZGdeb");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[1]] = llIIIlIlIlIIIll("M0vjw9b6PvXUqLZnJ1eeoA==", "RNxLR");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[2]] = llIIIlIlIlIIlII("26k6sYwSKxRKBzaWEI7LSg==", "PQEuA");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[3]] = llIIIlIlIlIIIll("FQi2FlVChaYN3wC86fN0cg==", "mfwFy");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[4]] = llIIIlIlIlIlllI("Kw8nLz89EyAtJTY=", "bAijm");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[5]] = llIIIlIlIlIIlII("0XPYxDObAHDrdyt9qbLltw==", "ypJoQ");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[6]] = llIIIlIlIlIIIll("vDPuaDQcIcbjZNVr8EwQhw==", "Krewf");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[7]] = llIIIlIlIlIIIll("HMAZJ5j6GrnTiYYsxu/OEA==", "SmbtM");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[8]] = llIIIlIlIlIIlII("khDGuvJgWbrp69zjrAq8Dw==", "ZOIjt");
            EnumShape.lIIIllIllIllII[EnumShape.lIIIllIllIlllI[9]] = llIIIlIlIlIlllI("ADghCAMwPzwKGRs=", "oMUmq");
        }
        
        private static boolean llIIIlIlIllIIIl(final int lllllllllllllIIllllllIlIlIllIIlI, final int lllllllllllllIIllllllIlIlIllIIIl) {
            return lllllllllllllIIllllllIlIlIllIIlI < lllllllllllllIIllllllIlIlIllIIIl;
        }
        
        static {
            llIIIlIlIllIIII();
            llIIIlIlIlIllll();
            final EnumShape[] enum$VALUES = new EnumShape[EnumShape.lIIIllIllIlllI[5]];
            enum$VALUES[EnumShape.lIIIllIllIlllI[0]] = EnumShape.STRAIGHT;
            enum$VALUES[EnumShape.lIIIllIllIlllI[1]] = EnumShape.INNER_LEFT;
            enum$VALUES[EnumShape.lIIIllIllIlllI[2]] = EnumShape.INNER_RIGHT;
            enum$VALUES[EnumShape.lIIIllIllIlllI[3]] = EnumShape.OUTER_LEFT;
            enum$VALUES[EnumShape.lIIIllIllIlllI[4]] = EnumShape.OUTER_RIGHT;
            ENUM$VALUES = enum$VALUES;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String llIIIlIlIlIIIll(final String lllllllllllllIIllllllIlIllIlIIlI, final String lllllllllllllIIllllllIlIllIIllll) {
            try {
                final SecretKeySpec lllllllllllllIIllllllIlIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIlIllIIllll.getBytes(StandardCharsets.UTF_8)), EnumShape.lIIIllIllIlllI[8]), "DES");
                final Cipher lllllllllllllIIllllllIlIllIlIlII = Cipher.getInstance("DES");
                lllllllllllllIIllllllIlIllIlIlII.init(EnumShape.lIIIllIllIlllI[2], lllllllllllllIIllllllIlIllIlIlIl);
                return new String(lllllllllllllIIllllllIlIllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIlIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllllllIlIllIlIIll) {
                lllllllllllllIIllllllIlIllIlIIll.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIlIlIllIIII() {
            (lIIIllIllIlllI = new int[11])[0] = ((0x89 ^ 0xB5 ^ (0xE0 ^ 0x84)) & (0x76 ^ 0x61 ^ (0x25 ^ 0x6A) ^ -" ".length()));
            EnumShape.lIIIllIllIlllI[1] = " ".length();
            EnumShape.lIIIllIllIlllI[2] = "  ".length();
            EnumShape.lIIIllIllIlllI[3] = "   ".length();
            EnumShape.lIIIllIllIlllI[4] = (0xBB ^ 0xBF);
            EnumShape.lIIIllIllIlllI[5] = (0x15 ^ 0x10);
            EnumShape.lIIIllIllIlllI[6] = (0x39 ^ 0x3F);
            EnumShape.lIIIllIllIlllI[7] = (0x94 ^ 0x93);
            EnumShape.lIIIllIllIlllI[8] = (0x40 ^ 0x1B ^ (0x35 ^ 0x66));
            EnumShape.lIIIllIllIlllI[9] = (0x23 ^ 0x2A);
            EnumShape.lIIIllIllIlllI[10] = (0x76 ^ 0x7C);
        }
        
        private static String llIIIlIlIlIIlII(final String lllllllllllllIIllllllIlIllIlllIl, final String lllllllllllllIIllllllIlIllIlllII) {
            try {
                final SecretKeySpec lllllllllllllIIllllllIlIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIlIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllllllIlIlllIIIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIllllllIlIlllIIIIl.init(EnumShape.lIIIllIllIlllI[2], lllllllllllllIIllllllIlIlllIIIlI);
                return new String(lllllllllllllIIllllllIlIlllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIlIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllllllIlIlllIIIII) {
                lllllllllllllIIllllllIlIlllIIIII.printStackTrace();
                return null;
            }
        }
    }
}
