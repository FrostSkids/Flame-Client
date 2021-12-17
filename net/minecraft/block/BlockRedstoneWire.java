// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MathHelper;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.BlockState;
import com.google.common.collect.Sets;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumParticleTypes;
import java.util.Random;
import net.minecraft.util.EnumWorldBlockLayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import java.util.EnumSet;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import java.util.Set;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.properties.PropertyEnum;

public class BlockRedstoneWire extends Block
{
    private static final /* synthetic */ String[] lllIlIIlIIlIlI;
    public static final /* synthetic */ PropertyEnum<EnumAttachPosition> EAST;
    private /* synthetic */ boolean canProvidePower;
    public static final /* synthetic */ PropertyInteger POWER;
    public static final /* synthetic */ PropertyEnum<EnumAttachPosition> NORTH;
    public static final /* synthetic */ PropertyEnum<EnumAttachPosition> SOUTH;
    private static final /* synthetic */ int[] lllIlIIlIIlIll;
    private final /* synthetic */ Set<BlockPos> blocksNeedingUpdate;
    public static final /* synthetic */ PropertyEnum<EnumAttachPosition> WEST;
    
    private static boolean lIlIIIlIIIIlllII(final int llllllllllllIlIllIlllllIlllIllIl) {
        return llllllllllllIlIllIlllllIlllIllIl < 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockRedstoneWire.lllIlIIlIIlIll[0] != 0;
    }
    
    private static boolean lIlIIIlIIIIlIlII(final int llllllllllllIlIllIllllllIIIIlllI, final int llllllllllllIlIllIllllllIIIIllIl) {
        return llllllllllllIlIllIllllllIIIIlllI == llllllllllllIlIllIllllllIIIIllIl;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIllIllllllIlIIllII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneWire.POWER, llllllllllllIlIllIllllllIlIIllII);
    }
    
    @Override
    public int getWeakPower(final IBlockAccess llllllllllllIlIllIllllllllIlIIlI, final BlockPos llllllllllllIlIllIllllllllIlIIIl, final IBlockState llllllllllllIlIllIllllllllIIlIII, final EnumFacing llllllllllllIlIllIllllllllIIllll) {
        if (lIlIIIlIIIIIllll(this.canProvidePower ? 1 : 0)) {
            return BlockRedstoneWire.lllIlIIlIIlIll[0];
        }
        final int llllllllllllIlIllIllllllllIIlllI = llllllllllllIlIllIllllllllIIlIII.getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
        if (lIlIIIlIIIIIllll(llllllllllllIlIllIllllllllIIlllI)) {
            return BlockRedstoneWire.lllIlIIlIIlIll[0];
        }
        if (lIlIIIlIIIIllIII(llllllllllllIlIllIllllllllIIllll, EnumFacing.UP)) {
            return llllllllllllIlIllIllllllllIIlllI;
        }
        final EnumSet<EnumFacing> llllllllllllIlIllIllllllllIIllIl = EnumSet.noneOf(EnumFacing.class);
        final byte llllllllllllIlIllIllllllllIIIIll = (byte)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ("   ".length() != "   ".length()) {
            return (0x30 ^ 0x6F) & ~(0x43 ^ 0x1C);
        }
        while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIllIllllllllIIIIll).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIlIllIllllllllIIllII = ((Iterator<EnumFacing>)llllllllllllIlIllIllllllllIIIIll).next();
            if (lIlIIIlIIIIlIIII(this.func_176339_d(llllllllllllIlIllIllllllllIlIIlI, llllllllllllIlIllIllllllllIlIIIl, llllllllllllIlIllIllllllllIIllII) ? 1 : 0)) {
                llllllllllllIlIllIllllllllIIllIl.add(llllllllllllIlIllIllllllllIIllII);
                "".length();
            }
        }
        if (lIlIIIlIIIIlIIII(llllllllllllIlIllIllllllllIIllll.getAxis().isHorizontal() ? 1 : 0) && lIlIIIlIIIIlIIII(llllllllllllIlIllIllllllllIIllIl.isEmpty() ? 1 : 0)) {
            return llllllllllllIlIllIllllllllIIlllI;
        }
        if (lIlIIIlIIIIlIIII(llllllllllllIlIllIllllllllIIllIl.contains(llllllllllllIlIllIllllllllIIllll) ? 1 : 0) && lIlIIIlIIIIIllll(llllllllllllIlIllIllllllllIIllIl.contains(llllllllllllIlIllIllllllllIIllll.rotateYCCW()) ? 1 : 0) && lIlIIIlIIIIIllll(llllllllllllIlIllIllllllllIIllIl.contains(llllllllllllIlIllIllllllllIIllll.rotateY()) ? 1 : 0)) {
            return llllllllllllIlIllIllllllllIIlllI;
        }
        return BlockRedstoneWire.lllIlIIlIIlIll[0];
    }
    
    private static boolean lIlIIIlIIIIllIII(final Object llllllllllllIlIllIlllllIllllIllI, final Object llllllllllllIlIllIlllllIllllIlIl) {
        return llllllllllllIlIllIlllllIllllIllI == llllllllllllIlIllIlllllIllllIlIl;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlIlllIIIIIIlIlIIlII, final BlockPos llllllllllllIlIlllIIIIIIlIlIIIll, final IBlockState llllllllllllIlIlllIIIIIIlIlIIIlI) {
        return null;
    }
    
    static {
        lIlIIIlIIIIIlllI();
        lIlIIIlIIIIIllIl();
        NORTH = PropertyEnum.create(BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[0]], EnumAttachPosition.class);
        EAST = PropertyEnum.create(BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[1]], EnumAttachPosition.class);
        SOUTH = PropertyEnum.create(BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[2]], EnumAttachPosition.class);
        WEST = PropertyEnum.create(BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[3]], EnumAttachPosition.class);
        POWER = PropertyInteger.create(BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[4]], BlockRedstoneWire.lllIlIIlIIlIll[0], BlockRedstoneWire.lllIlIIlIIlIll[5]);
    }
    
    private IBlockState calculateCurrentChanges(final World llllllllllllIlIlllIIIIIIIlIllIII, final BlockPos llllllllllllIlIlllIIIIIIIllIIlIl, final BlockPos llllllllllllIlIlllIIIIIIIllIIlII, IBlockState llllllllllllIlIlllIIIIIIIlIlIlIl) {
        final IBlockState llllllllllllIlIlllIIIIIIIllIIIlI = (IBlockState)llllllllllllIlIlllIIIIIIIlIlIlIl;
        final int llllllllllllIlIlllIIIIIIIllIIIIl = ((IBlockState)llllllllllllIlIlllIIIIIIIlIlIlIl).getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
        int llllllllllllIlIlllIIIIIIIllIIIII = BlockRedstoneWire.lllIlIIlIIlIll[0];
        llllllllllllIlIlllIIIIIIIllIIIII = this.getMaxCurrentStrength(llllllllllllIlIlllIIIIIIIlIllIII, llllllllllllIlIlllIIIIIIIllIIlII, llllllllllllIlIlllIIIIIIIllIIIII);
        this.canProvidePower = (BlockRedstoneWire.lllIlIIlIIlIll[0] != 0);
        final int llllllllllllIlIlllIIIIIIIlIlllll = llllllllllllIlIlllIIIIIIIlIllIII.isBlockIndirectlyGettingPowered(llllllllllllIlIlllIIIIIIIllIIlIl);
        this.canProvidePower = (BlockRedstoneWire.lllIlIIlIIlIll[1] != 0);
        if (lIlIIIlIIIIlIIlI(llllllllllllIlIlllIIIIIIIlIlllll) && lIlIIIlIIIIlIIll(llllllllllllIlIlllIIIIIIIlIlllll, llllllllllllIlIlllIIIIIIIllIIIII - BlockRedstoneWire.lllIlIIlIIlIll[1])) {
            llllllllllllIlIlllIIIIIIIllIIIII = llllllllllllIlIlllIIIIIIIlIlllll;
        }
        int llllllllllllIlIlllIIIIIIIlIllllI = BlockRedstoneWire.lllIlIIlIIlIll[0];
        int llllllllllllIlIlllIIIIIIIlIIlllI = (int)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIlIIlllI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIlIlllIIIIIIIlIlllIl = ((Iterator<EnumFacing>)llllllllllllIlIlllIIIIIIIlIIlllI).next();
            final BlockPos llllllllllllIlIlllIIIIIIIlIlllII = llllllllllllIlIlllIIIIIIIllIIlIl.offset(llllllllllllIlIlllIIIIIIIlIlllIl);
            int n;
            if (lIlIIIlIIIIlIlII(llllllllllllIlIlllIIIIIIIlIlllII.getX(), llllllllllllIlIlllIIIIIIIllIIlII.getX()) && lIlIIIlIIIIlIlII(llllllllllllIlIlllIIIIIIIlIlllII.getZ(), llllllllllllIlIlllIIIIIIIllIIlII.getZ())) {
                n = BlockRedstoneWire.lllIlIIlIIlIll[0];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            else {
                n = BlockRedstoneWire.lllIlIIlIIlIll[1];
            }
            final boolean llllllllllllIlIlllIIIIIIIlIllIll = n != 0;
            if (lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIIlIllIll ? 1 : 0)) {
                llllllllllllIlIlllIIIIIIIlIllllI = this.getMaxCurrentStrength(llllllllllllIlIlllIIIIIIIlIllIII, llllllllllllIlIlllIIIIIIIlIlllII, llllllllllllIlIlllIIIIIIIlIllllI);
            }
            if (lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIIlIllIII.getBlockState(llllllllllllIlIlllIIIIIIIlIlllII).getBlock().isNormalCube() ? 1 : 0) && lIlIIIlIIIIIllll(llllllllllllIlIlllIIIIIIIlIllIII.getBlockState(llllllllllllIlIlllIIIIIIIllIIlIl.up()).getBlock().isNormalCube() ? 1 : 0)) {
                if (!lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIIlIllIll ? 1 : 0) || !lIlIIIlIIIIlIlIl(llllllllllllIlIlllIIIIIIIllIIlIl.getY(), llllllllllllIlIlllIIIIIIIllIIlII.getY())) {
                    continue;
                }
                llllllllllllIlIlllIIIIIIIlIllllI = this.getMaxCurrentStrength(llllllllllllIlIlllIIIIIIIlIllIII, llllllllllllIlIlllIIIIIIIlIlllII.up(), llllllllllllIlIlllIIIIIIIlIllllI);
                "".length();
                if (-" ".length() > (66 + 104 - 169 + 167 ^ 133 + 147 - 275 + 167)) {
                    return null;
                }
                continue;
            }
            else {
                if (!lIlIIIlIIIIIllll(llllllllllllIlIlllIIIIIIIlIllIII.getBlockState(llllllllllllIlIlllIIIIIIIlIlllII).getBlock().isNormalCube() ? 1 : 0) || !lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIIlIllIll ? 1 : 0) || !lIlIIIlIIIIlIllI(llllllllllllIlIlllIIIIIIIllIIlIl.getY(), llllllllllllIlIlllIIIIIIIllIIlII.getY())) {
                    continue;
                }
                llllllllllllIlIlllIIIIIIIlIllllI = this.getMaxCurrentStrength(llllllllllllIlIlllIIIIIIIlIllIII, llllllllllllIlIlllIIIIIIIlIlllII.down(), llllllllllllIlIlllIIIIIIIlIllllI);
            }
        }
        if (lIlIIIlIIIIlIIll(llllllllllllIlIlllIIIIIIIlIllllI, llllllllllllIlIlllIIIIIIIllIIIII)) {
            llllllllllllIlIlllIIIIIIIllIIIII = llllllllllllIlIlllIIIIIIIlIllllI - BlockRedstoneWire.lllIlIIlIIlIll[1];
            "".length();
            if (((0x9E ^ 0x92 ^ (0x6D ^ 0x2C)) & (0xE6 ^ 0x9F ^ (0xB4 ^ 0x80) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else if (lIlIIIlIIIIlIIlI(llllllllllllIlIlllIIIIIIIllIIIII)) {
            --llllllllllllIlIlllIIIIIIIllIIIII;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            llllllllllllIlIlllIIIIIIIllIIIII = BlockRedstoneWire.lllIlIIlIIlIll[0];
        }
        if (lIlIIIlIIIIlIIll(llllllllllllIlIlllIIIIIIIlIlllll, llllllllllllIlIlllIIIIIIIllIIIII - BlockRedstoneWire.lllIlIIlIIlIll[1])) {
            llllllllllllIlIlllIIIIIIIllIIIII = llllllllllllIlIlllIIIIIIIlIlllll;
        }
        if (lIlIIIlIIIIlIlll(llllllllllllIlIlllIIIIIIIllIIIIl, llllllllllllIlIlllIIIIIIIllIIIII)) {
            llllllllllllIlIlllIIIIIIIlIlIlIl = ((IBlockState)llllllllllllIlIlllIIIIIIIlIlIlIl).withProperty((IProperty<Comparable>)BlockRedstoneWire.POWER, Integer.valueOf(llllllllllllIlIlllIIIIIIIllIIIII));
            if (lIlIIIlIIIIllIII(llllllllllllIlIlllIIIIIIIlIllIII.getBlockState(llllllllllllIlIlllIIIIIIIllIIlIl), llllllllllllIlIlllIIIIIIIllIIIlI)) {
                llllllllllllIlIlllIIIIIIIlIllIII.setBlockState(llllllllllllIlIlllIIIIIIIllIIlIl, (IBlockState)llllllllllllIlIlllIIIIIIIlIlIlIl, BlockRedstoneWire.lllIlIIlIIlIll[2]);
                "".length();
            }
            this.blocksNeedingUpdate.add(llllllllllllIlIlllIIIIIIIllIIlIl);
            "".length();
            final char llllllllllllIlIlllIIIIIIIlIIllII;
            final String llllllllllllIlIlllIIIIIIIlIIllIl = (String)((EnumFacing[])(Object)(llllllllllllIlIlllIIIIIIIlIIllII = (char)(Object)EnumFacing.values())).length;
            llllllllllllIlIlllIIIIIIIlIIlllI = BlockRedstoneWire.lllIlIIlIIlIll[0];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
            while (!lIlIIIlIIIIlIlIl(llllllllllllIlIlllIIIIIIIlIIlllI, (int)llllllllllllIlIlllIIIIIIIlIIllIl)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIlIllIlI = llllllllllllIlIlllIIIIIIIlIIllII[llllllllllllIlIlllIIIIIIIlIIlllI];
                this.blocksNeedingUpdate.add(llllllllllllIlIlllIIIIIIIllIIlIl.offset(llllllllllllIlIlllIIIIIIIlIllIlI));
                "".length();
                ++llllllllllllIlIlllIIIIIIIlIIlllI;
            }
        }
        return (IBlockState)llllllllllllIlIlllIIIIIIIlIlIlIl;
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIlIlllIIIIIIIIlIlIIl, final BlockPos llllllllllllIlIlllIIIIIIIIlIlIII, final IBlockState llllllllllllIlIlllIIIIIIIIlIIlll) {
        if (lIlIIIlIIIIIllll(llllllllllllIlIlllIIIIIIIIlIlIIl.isRemote ? 1 : 0)) {
            this.updateSurroundingRedstone(llllllllllllIlIlllIIIIIIIIlIlIIl, llllllllllllIlIlllIIIIIIIIlIlIII, llllllllllllIlIlllIIIIIIIIlIIlll);
            "".length();
            Exception llllllllllllIlIlllIIIIIIIIlIIlIl = (Exception)EnumFacing.Plane.VERTICAL.iterator();
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
            while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIIlIIlIl).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIIlIlllI = ((Iterator<EnumFacing>)llllllllllllIlIlllIIIIIIIIlIIlIl).next();
                llllllllllllIlIlllIIIIIIIIlIlIIl.notifyNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIlIlIII.offset(llllllllllllIlIlllIIIIIIIIlIlllI), this);
            }
            llllllllllllIlIlllIIIIIIIIlIIlIl = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if ((0x6B ^ 0x2D ^ (0x15 ^ 0x57)) == " ".length()) {
                return;
            }
            while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIIlIIlIl).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIIlIllIl = ((Iterator<EnumFacing>)llllllllllllIlIlllIIIIIIIIlIIlIl).next();
                this.notifyWireNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIlIlIIl, llllllllllllIlIlllIIIIIIIIlIlIII.offset(llllllllllllIlIlllIIIIIIIIlIllIl));
            }
            llllllllllllIlIlllIIIIIIIIlIIlIl = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIIlIIlIl).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIIlIllII = ((Iterator<EnumFacing>)llllllllllllIlIlllIIIIIIIIlIIlIl).next();
                final BlockPos llllllllllllIlIlllIIIIIIIIlIlIll = llllllllllllIlIlllIIIIIIIIlIlIII.offset(llllllllllllIlIlllIIIIIIIIlIllII);
                if (lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIIIlIlIIl.getBlockState(llllllllllllIlIlllIIIIIIIIlIlIll).getBlock().isNormalCube() ? 1 : 0)) {
                    this.notifyWireNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIlIlIIl, llllllllllllIlIlllIIIIIIIIlIlIll.up());
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                else {
                    this.notifyWireNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIlIlIIl, llllllllllllIlIlllIIIIIIIIlIlIll.down());
                }
            }
        }
    }
    
    @Override
    public IBlockState getActualState(IBlockState llllllllllllIlIlllIIIIIIlIlllIll, final IBlockAccess llllllllllllIlIlllIIIIIIlIlllllI, final BlockPos llllllllllllIlIlllIIIIIIlIlllIIl) {
        llllllllllllIlIlllIIIIIIlIlllIll = (String)((IBlockState)llllllllllllIlIlllIIIIIIlIlllIll).withProperty(BlockRedstoneWire.WEST, this.getAttachPosition(llllllllllllIlIlllIIIIIIlIlllllI, llllllllllllIlIlllIIIIIIlIlllIIl, EnumFacing.WEST));
        llllllllllllIlIlllIIIIIIlIlllIll = (String)((IBlockState)llllllllllllIlIlllIIIIIIlIlllIll).withProperty(BlockRedstoneWire.EAST, this.getAttachPosition(llllllllllllIlIlllIIIIIIlIlllllI, llllllllllllIlIlllIIIIIIlIlllIIl, EnumFacing.EAST));
        llllllllllllIlIlllIIIIIIlIlllIll = (String)((IBlockState)llllllllllllIlIlllIIIIIIlIlllIll).withProperty(BlockRedstoneWire.NORTH, this.getAttachPosition(llllllllllllIlIlllIIIIIIlIlllllI, llllllllllllIlIlllIIIIIIlIlllIIl, EnumFacing.NORTH));
        llllllllllllIlIlllIIIIIIlIlllIll = (String)((IBlockState)llllllllllllIlIlllIIIIIIlIlllIll).withProperty(BlockRedstoneWire.SOUTH, this.getAttachPosition(llllllllllllIlIlllIIIIIIlIlllllI, llllllllllllIlIlllIIIIIIlIlllIIl, EnumFacing.SOUTH));
        return (IBlockState)llllllllllllIlIlllIIIIIIlIlllIll;
    }
    
    private static boolean lIlIIIlIIIIIllll(final int llllllllllllIlIllIlllllIlllIllll) {
        return llllllllllllIlIllIlllllIlllIllll == 0;
    }
    
    private static boolean lIlIIIlIIIIlIllI(final int llllllllllllIlIllIllllllIIIIIIlI, final int llllllllllllIlIllIllllllIIIIIIIl) {
        return llllllllllllIlIllIllllllIIIIIIlI <= llllllllllllIlIllIllllllIIIIIIIl;
    }
    
    private static boolean lIlIIIlIIIIllIlI(final Object llllllllllllIlIllIlllllIllllIIll) {
        return llllllllllllIlIllIlllllIllllIIll != null;
    }
    
    private static void lIlIIIlIIIIIllIl() {
        (lllIlIIlIIlIlI = new String[BlockRedstoneWire.lllIlIIlIIlIll[10]])[BlockRedstoneWire.lllIlIIlIIlIll[0]] = lIlIIIlIIIIIlIlI("i/dNzvDu4+M=", "SeSGp");
        BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[1]] = lIlIIIlIIIIIlIll("BBUJPQ==", "atzIM");
        BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[2]] = lIlIIIlIIIIIllII("2WyPuZp1fe0=", "JNfRS");
        BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[3]] = lIlIIIlIIIIIllII("jfjMqRoIiiQ=", "zbSeT");
        BlockRedstoneWire.lllIlIIlIIlIlI[BlockRedstoneWire.lllIlIIlIIlIll[4]] = lIlIIIlIIIIIlIlI("oXXqcljhv+4=", "QiOsy");
    }
    
    private static boolean lIlIIIlIIIIlIIlI(final int llllllllllllIlIllIlllllIlllIlIll) {
        return llllllllllllIlIllIlllllIlllIlIll > 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIllIllllllIlIIIlll) {
        return llllllllllllIlIllIllllllIlIIIlll.getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
    }
    
    @Override
    public boolean canProvidePower() {
        return this.canProvidePower;
    }
    
    private static boolean lIlIIIlIIIIlllIl(final int llllllllllllIlIllIllllllIIIIIllI, final int llllllllllllIlIllIllllllIIIIIlIl) {
        return llllllllllllIlIllIllllllIIIIIllI < llllllllllllIlIllIllllllIIIIIlIl;
    }
    
    private static boolean lIlIIIlIIIIlIlll(final int llllllllllllIlIllIlllllIlllIlIII, final int llllllllllllIlIllIlllllIlllIIlll) {
        return llllllllllllIlIllIlllllIlllIlIII != llllllllllllIlIllIlllllIlllIIlll;
    }
    
    @Override
    public int getStrongPower(final IBlockAccess llllllllllllIlIllIlllllllllIIlIl, final BlockPos llllllllllllIlIllIlllllllllIIlII, final IBlockState llllllllllllIlIllIllllllllIllllI, final EnumFacing llllllllllllIlIllIlllllllllIIIlI) {
        int weakPower;
        if (lIlIIIlIIIIIllll(this.canProvidePower ? 1 : 0)) {
            weakPower = BlockRedstoneWire.lllIlIIlIIlIll[0];
            "".length();
            if ((127 + 173 - 172 + 66 ^ 110 + 115 - 128 + 101) <= 0) {
                return (148 + 36 - 106 + 166 ^ 20 + 31 + 41 + 56) & (0xA1 ^ 0xAE ^ (0x6C ^ 0x3) ^ -" ".length());
            }
        }
        else {
            weakPower = this.getWeakPower(llllllllllllIlIllIlllllllllIIlIl, llllllllllllIlIllIlllllllllIIlII, llllllllllllIlIllIllllllllIllllI, llllllllllllIlIllIlllllllllIIIlI);
        }
        return weakPower;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockRedstoneWire.lllIlIIlIIlIll[0] != 0;
    }
    
    private void notifyWireNeighborsOfStateChange(final World llllllllllllIlIlllIIIIIIIlIIIIll, final BlockPos llllllllllllIlIlllIIIIIIIlIIIIlI) {
        if (lIlIIIlIIIIllIII(llllllllllllIlIlllIIIIIIIlIIIIll.getBlockState(llllllllllllIlIlllIIIIIIIlIIIIlI).getBlock(), this)) {
            llllllllllllIlIlllIIIIIIIlIIIIll.notifyNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIlIIIIlI, this);
            final Exception llllllllllllIlIlllIIIIIIIIlllIlI;
            final int llllllllllllIlIlllIIIIIIIIlllIll = ((EnumFacing[])(Object)(llllllllllllIlIlllIIIIIIIIlllIlI = (Exception)(Object)EnumFacing.values())).length;
            byte llllllllllllIlIlllIIIIIIIIllllII = (byte)BlockRedstoneWire.lllIlIIlIIlIll[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIlIIIlIIIIlIlIl(llllllllllllIlIlllIIIIIIIIllllII, llllllllllllIlIlllIIIIIIIIlllIll)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIlIIIIIl = llllllllllllIlIlllIIIIIIIIlllIlI[llllllllllllIlIlllIIIIIIIIllllII];
                llllllllllllIlIlllIIIIIIIlIIIIll.notifyNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIlIIIIlI.offset(llllllllllllIlIlllIIIIIIIlIIIIIl), this);
                ++llllllllllllIlIlllIIIIIIIIllllII;
            }
        }
    }
    
    private static String lIlIIIlIIIIIllII(final String llllllllllllIlIllIllllllIIIlIlII, final String llllllllllllIlIllIllllllIIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIllllllIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllllllIIIlIIll.getBytes(StandardCharsets.UTF_8)), BlockRedstoneWire.lllIlIIlIIlIll[9]), "DES");
            final Cipher llllllllllllIlIllIllllllIIIllIII = Cipher.getInstance("DES");
            llllllllllllIlIllIllllllIIIllIII.init(BlockRedstoneWire.lllIlIIlIIlIll[2], llllllllllllIlIllIllllllIIIllIIl);
            return new String(llllllllllllIlIllIllllllIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllllllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllllllIIIlIlll) {
            llllllllllllIlIllIllllllIIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIlIIIIIlllI() {
        (lllIlIIlIIlIll = new int[11])[0] = ((0x13 ^ 0x58) & ~(0x65 ^ 0x2E));
        BlockRedstoneWire.lllIlIIlIIlIll[1] = " ".length();
        BlockRedstoneWire.lllIlIIlIIlIll[2] = "  ".length();
        BlockRedstoneWire.lllIlIIlIIlIll[3] = "   ".length();
        BlockRedstoneWire.lllIlIIlIIlIll[4] = (0x9A ^ 0x88 ^ (0x1E ^ 0x8));
        BlockRedstoneWire.lllIlIIlIIlIll[5] = (0x24 ^ 0x71 ^ (0xE ^ 0x54));
        BlockRedstoneWire.lllIlIIlIIlIll[6] = 49 + 221 - 177 + 162;
        BlockRedstoneWire.lllIlIIlIIlIll[7] = -(-(0xFFFFDF18 & 0x77EF) & (0xFFFFF767 & 0x1005F9F));
        BlockRedstoneWire.lllIlIIlIIlIll[8] = (0x22 ^ 0x35 ^ (0x2F ^ 0x28));
        BlockRedstoneWire.lllIlIIlIIlIll[9] = (93 + 118 - 183 + 154 ^ 100 + 82 - 92 + 100);
        BlockRedstoneWire.lllIlIIlIIlIll[10] = (0xAE ^ 0xAB);
    }
    
    private EnumAttachPosition getAttachPosition(final IBlockAccess llllllllllllIlIlllIIIIIIlIlIlIll, final BlockPos llllllllllllIlIlllIIIIIIlIlIlIlI, final EnumFacing llllllllllllIlIlllIIIIIIlIlIllll) {
        final BlockPos llllllllllllIlIlllIIIIIIlIlIlllI = llllllllllllIlIlllIIIIIIlIlIlIlI.offset(llllllllllllIlIlllIIIIIIlIlIllll);
        final Block llllllllllllIlIlllIIIIIIlIlIllIl = llllllllllllIlIlllIIIIIIlIlIlIll.getBlockState(llllllllllllIlIlllIIIIIIlIlIlIlI.offset(llllllllllllIlIlllIIIIIIlIlIllll)).getBlock();
        if (lIlIIIlIIIIIllll(canConnectTo(llllllllllllIlIlllIIIIIIlIlIlIll.getBlockState(llllllllllllIlIlllIIIIIIlIlIlllI), llllllllllllIlIlllIIIIIIlIlIllll) ? 1 : 0) && (!lIlIIIlIIIIIllll(llllllllllllIlIlllIIIIIIlIlIllIl.isBlockNormalCube() ? 1 : 0) || lIlIIIlIIIIIllll(canConnectUpwardsTo(llllllllllllIlIlllIIIIIIlIlIlIll.getBlockState(llllllllllllIlIlllIIIIIIlIlIlllI.down())) ? 1 : 0))) {
            final Block llllllllllllIlIlllIIIIIIlIlIllII = llllllllllllIlIlllIIIIIIlIlIlIll.getBlockState(llllllllllllIlIlllIIIIIIlIlIlIlI.up()).getBlock();
            EnumAttachPosition enumAttachPosition;
            if (lIlIIIlIIIIIllll(llllllllllllIlIlllIIIIIIlIlIllII.isBlockNormalCube() ? 1 : 0) && lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIlIlIllIl.isBlockNormalCube() ? 1 : 0) && lIlIIIlIIIIlIIII(canConnectUpwardsTo(llllllllllllIlIlllIIIIIIlIlIlIll.getBlockState(llllllllllllIlIlllIIIIIIlIlIlllI.up())) ? 1 : 0)) {
                enumAttachPosition = EnumAttachPosition.UP;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            else {
                enumAttachPosition = EnumAttachPosition.NONE;
            }
            return enumAttachPosition;
        }
        return EnumAttachPosition.SIDE;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public void randomDisplayTick(final World llllllllllllIlIllIllllllIllIlIll, final BlockPos llllllllllllIlIllIllllllIlIllllI, final IBlockState llllllllllllIlIllIllllllIlIlllIl, final Random llllllllllllIlIllIllllllIlIlllII) {
        final int llllllllllllIlIllIllllllIllIIlll = llllllllllllIlIllIllllllIlIlllIl.getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
        if (lIlIIIlIIIIlIIII(llllllllllllIlIllIllllllIllIIlll)) {
            final double llllllllllllIlIllIllllllIllIIllI = llllllllllllIlIllIllllllIlIllllI.getX() + 0.5 + (llllllllllllIlIllIllllllIlIlllII.nextFloat() - 0.5) * 0.2;
            final double llllllllllllIlIllIllllllIllIIlIl = llllllllllllIlIllIllllllIlIllllI.getY() + 0.0625f;
            final double llllllllllllIlIllIllllllIllIIlII = llllllllllllIlIllIllllllIlIllllI.getZ() + 0.5 + (llllllllllllIlIllIllllllIlIlllII.nextFloat() - 0.5) * 0.2;
            final float llllllllllllIlIllIllllllIllIIIll = llllllllllllIlIllIllllllIllIIlll / 15.0f;
            final float llllllllllllIlIllIllllllIllIIIlI = llllllllllllIlIllIllllllIllIIIll * 0.6f + 0.4f;
            final float llllllllllllIlIllIllllllIllIIIIl = Math.max(0.0f, llllllllllllIlIllIllllllIllIIIll * llllllllllllIlIllIllllllIllIIIll * 0.7f - 0.5f);
            final float llllllllllllIlIllIllllllIllIIIII = Math.max(0.0f, llllllllllllIlIllIllllllIllIIIll * llllllllllllIlIllIllllllIllIIIll * 0.6f - 0.7f);
            llllllllllllIlIllIllllllIllIlIll.spawnParticle(EnumParticleTypes.REDSTONE, llllllllllllIlIllIllllllIllIIllI, llllllllllllIlIllIllllllIllIIlIl, llllllllllllIlIllIllllllIllIIlII, llllllllllllIlIllIllllllIllIIIlI, llllllllllllIlIllIllllllIllIIIIl, llllllllllllIlIllIllllllIllIIIII, new int[BlockRedstoneWire.lllIlIIlIIlIll[0]]);
        }
    }
    
    public BlockRedstoneWire() {
        super(Material.circuits);
        this.canProvidePower = (BlockRedstoneWire.lllIlIIlIIlIll[1] != 0);
        this.blocksNeedingUpdate = (Set<BlockPos>)Sets.newHashSet();
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockRedstoneWire.NORTH, EnumAttachPosition.NONE).withProperty(BlockRedstoneWire.EAST, EnumAttachPosition.NONE).withProperty(BlockRedstoneWire.SOUTH, EnumAttachPosition.NONE).withProperty(BlockRedstoneWire.WEST, EnumAttachPosition.NONE).withProperty((IProperty<Comparable>)BlockRedstoneWire.POWER, BlockRedstoneWire.lllIlIIlIIlIll[0]));
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }
    
    @Override
    public void breakBlock(final World llllllllllllIlIlllIIIIIIIIIllIlI, final BlockPos llllllllllllIlIlllIIIIIIIIIlIIIl, final IBlockState llllllllllllIlIlllIIIIIIIIIlIIII) {
        super.breakBlock(llllllllllllIlIlllIIIIIIIIIllIlI, llllllllllllIlIlllIIIIIIIIIlIIIl, llllllllllllIlIlllIIIIIIIIIlIIII);
        if (lIlIIIlIIIIIllll(llllllllllllIlIlllIIIIIIIIIllIlI.isRemote ? 1 : 0)) {
            final int llllllllllllIlIlllIIIIIIIIIIllII;
            final int length = (llllllllllllIlIlllIIIIIIIIIIllII = (int)(Object)EnumFacing.values()).length;
            boolean llllllllllllIlIlllIIIIIIIIIIlllI = BlockRedstoneWire.lllIlIIlIIlIll[0] != 0;
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lIlIIIlIIIIlIlIl(llllllllllllIlIlllIIIIIIIIIIlllI ? 1 : 0, length)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIIIlIlll = llllllllllllIlIlllIIIIIIIIIIllII[llllllllllllIlIlllIIIIIIIIIIlllI];
                llllllllllllIlIlllIIIIIIIIIllIlI.notifyNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIIlIIIl.offset(llllllllllllIlIlllIIIIIIIIIlIlll), this);
                ++llllllllllllIlIlllIIIIIIIIIIlllI;
            }
            this.updateSurroundingRedstone(llllllllllllIlIlllIIIIIIIIIllIlI, llllllllllllIlIlllIIIIIIIIIlIIIl, llllllllllllIlIlllIIIIIIIIIlIIII);
            "".length();
            llllllllllllIlIlllIIIIIIIIIIlllI = (boolean)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIIIIlllI).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIIIlIllI = ((Iterator<EnumFacing>)llllllllllllIlIlllIIIIIIIIIIlllI).next();
                this.notifyWireNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIIllIlI, llllllllllllIlIlllIIIIIIIIIlIIIl.offset(llllllllllllIlIlllIIIIIIIIIlIllI));
            }
            llllllllllllIlIlllIIIIIIIIIIlllI = (boolean)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if (((0x64 ^ 0x2E) & ~(0xDB ^ 0x91)) > ((0xC1 ^ 0x9B) & ~(0x58 ^ 0x2))) {
                return;
            }
            while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIIIIlllI).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIlllIIIIIIIIIlIlIl = ((Iterator<EnumFacing>)llllllllllllIlIlllIIIIIIIIIIlllI).next();
                final BlockPos llllllllllllIlIlllIIIIIIIIIlIlII = llllllllllllIlIlllIIIIIIIIIlIIIl.offset(llllllllllllIlIlllIIIIIIIIIlIlIl);
                if (lIlIIIlIIIIlIIII(llllllllllllIlIlllIIIIIIIIIllIlI.getBlockState(llllllllllllIlIlllIIIIIIIIIlIlII).getBlock().isNormalCube() ? 1 : 0)) {
                    this.notifyWireNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIIllIlI, llllllllllllIlIlllIIIIIIIIIlIlII.up());
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                else {
                    this.notifyWireNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIIIllIlI, llllllllllllIlIlllIIIIIIIIIlIlII.down());
                }
            }
        }
    }
    
    private static String lIlIIIlIIIIIlIlI(final String llllllllllllIlIllIllllllIIlllIIl, final String llllllllllllIlIllIllllllIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIllllllIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllllllIIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllllllIIllllIl.init(BlockRedstoneWire.lllIlIIlIIlIll[2], llllllllllllIlIllIllllllIIlllllI);
            return new String(llllllllllllIlIllIllllllIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllllllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllllllIIllllII) {
            llllllllllllIlIllIllllllIIllllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIlIIIIIlIll(String llllllllllllIlIllIllllllIIlIIllI, final String llllllllllllIlIllIllllllIIlIlIlI) {
        llllllllllllIlIllIllllllIIlIIllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIllllllIIlIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllllllIIlIlIIl = new StringBuilder();
        final char[] llllllllllllIlIllIllllllIIlIlIII = llllllllllllIlIllIllllllIIlIlIlI.toCharArray();
        int llllllllllllIlIllIllllllIIlIIlll = BlockRedstoneWire.lllIlIIlIIlIll[0];
        final long llllllllllllIlIllIllllllIIlIIIIl = (Object)((String)llllllllllllIlIllIllllllIIlIIllI).toCharArray();
        final float llllllllllllIlIllIllllllIIlIIIII = llllllllllllIlIllIllllllIIlIIIIl.length;
        String llllllllllllIlIllIllllllIIIlllll = (String)BlockRedstoneWire.lllIlIIlIIlIll[0];
        while (lIlIIIlIIIIlllIl((int)llllllllllllIlIllIllllllIIIlllll, (int)llllllllllllIlIllIllllllIIlIIIII)) {
            final char llllllllllllIlIllIllllllIIlIllII = llllllllllllIlIllIllllllIIlIIIIl[llllllllllllIlIllIllllllIIIlllll];
            llllllllllllIlIllIllllllIIlIlIIl.append((char)(llllllllllllIlIllIllllllIIlIllII ^ llllllllllllIlIllIllllllIIlIlIII[llllllllllllIlIllIllllllIIlIIlll % llllllllllllIlIllIllllllIIlIlIII.length]));
            "".length();
            ++llllllllllllIlIllIllllllIIlIIlll;
            ++llllllllllllIlIllIllllllIIIlllll;
            "".length();
            if ((0x44 ^ 0x28 ^ (0x47 ^ 0x2E)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllllllIIlIlIIl);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRedstoneWire.lllIlIIlIIlIll[10]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneWire.lllIlIIlIIlIll[0]] = BlockRedstoneWire.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneWire.lllIlIIlIIlIll[1]] = BlockRedstoneWire.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneWire.lllIlIIlIIlIll[2]] = BlockRedstoneWire.SOUTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneWire.lllIlIIlIIlIll[3]] = BlockRedstoneWire.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneWire.lllIlIIlIIlIll[4]] = BlockRedstoneWire.POWER;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private int getMaxCurrentStrength(final World llllllllllllIlIlllIIIIIIIIIIIIII, final BlockPos llllllllllllIlIlllIIIIIIIIIIIlII, final int llllllllllllIlIllIlllllllllllllI) {
        if (lIlIIIlIIIIlIIIl(llllllllllllIlIlllIIIIIIIIIIIIII.getBlockState(llllllllllllIlIlllIIIIIIIIIIIlII).getBlock(), this)) {
            return llllllllllllIlIllIlllllllllllllI;
        }
        final int llllllllllllIlIlllIIIIIIIIIIIIlI = llllllllllllIlIlllIIIIIIIIIIIIII.getBlockState(llllllllllllIlIlllIIIIIIIIIIIlII).getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
        int n;
        if (lIlIIIlIIIIlIIll(llllllllllllIlIlllIIIIIIIIIIIIlI, llllllllllllIlIllIlllllllllllllI)) {
            n = llllllllllllIlIlllIIIIIIIIIIIIlI;
            "".length();
            if (((0x7F ^ 0x6F) & ~(0xD3 ^ 0xC3)) < 0) {
                return (0x59 ^ 0x7A) & ~(0xA0 ^ 0x83);
            }
        }
        else {
            n = llllllllllllIlIllIlllllllllllllI;
        }
        return n;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIlIlllIIIIIIlIIIlIll, final BlockPos llllllllllllIlIlllIIIIIIlIIIllII) {
        if (lIlIIIlIIIIIllll(World.doesBlockHaveSolidTopSurface(llllllllllllIlIlllIIIIIIlIIIlIll, llllllllllllIlIlllIIIIIIlIIIllII.down()) ? 1 : 0) && lIlIIIlIIIIlIIIl(llllllllllllIlIlllIIIIIIlIIIlIll.getBlockState(llllllllllllIlIlllIIIIIIlIIIllII.down()).getBlock(), Blocks.glowstone)) {
            return BlockRedstoneWire.lllIlIIlIIlIll[0] != 0;
        }
        return BlockRedstoneWire.lllIlIIlIIlIll[1] != 0;
    }
    
    protected static boolean canConnectTo(final IBlockState llllllllllllIlIllIlllllllIIllIII, final EnumFacing llllllllllllIlIllIlllllllIIlIlll) {
        final Block llllllllllllIlIllIlllllllIIllIlI = llllllllllllIlIllIlllllllIIllIII.getBlock();
        if (lIlIIIlIIIIllIII(llllllllllllIlIllIlllllllIIllIlI, Blocks.redstone_wire)) {
            return BlockRedstoneWire.lllIlIIlIIlIll[1] != 0;
        }
        if (lIlIIIlIIIIlIIII(Blocks.unpowered_repeater.isAssociated(llllllllllllIlIllIlllllllIIllIlI) ? 1 : 0)) {
            final EnumFacing llllllllllllIlIllIlllllllIIllIIl = llllllllllllIlIllIlllllllIIllIII.getValue((IProperty<EnumFacing>)BlockRedstoneRepeater.FACING);
            if (lIlIIIlIIIIlIIIl(llllllllllllIlIllIlllllllIIllIIl, llllllllllllIlIllIlllllllIIlIlll) && lIlIIIlIIIIlIIIl(llllllllllllIlIllIlllllllIIllIIl.getOpposite(), llllllllllllIlIllIlllllllIIlIlll)) {
                return BlockRedstoneWire.lllIlIIlIIlIll[0] != 0;
            }
            return BlockRedstoneWire.lllIlIIlIIlIll[1] != 0;
        }
        else {
            if (lIlIIIlIIIIlIIII(llllllllllllIlIllIlllllllIIllIlI.canProvidePower() ? 1 : 0) && lIlIIIlIIIIllIlI(llllllllllllIlIllIlllllllIIlIlll)) {
                return BlockRedstoneWire.lllIlIIlIIlIll[1] != 0;
            }
            return BlockRedstoneWire.lllIlIIlIIlIll[0] != 0;
        }
    }
    
    private static boolean lIlIIIlIIIIlIIll(final int llllllllllllIlIllIlllllIlllllllI, final int llllllllllllIlIllIlllllIllllllIl) {
        return llllllllllllIlIllIlllllIlllllllI > llllllllllllIlIllIlllllIllllllIl;
    }
    
    private static int lIlIIIlIIIIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public Item getItem(final World llllllllllllIlIllIllllllIlIlIIlI, final BlockPos llllllllllllIlIllIllllllIlIlIIIl) {
        return Items.redstone;
    }
    
    protected static boolean canConnectUpwardsTo(final IBlockAccess llllllllllllIlIllIlllllllIlIIlll, final BlockPos llllllllllllIlIllIlllllllIlIIlII) {
        return canConnectUpwardsTo(llllllllllllIlIllIlllllllIlIIlll.getBlockState(llllllllllllIlIllIlllllllIlIIlII));
    }
    
    private boolean func_176339_d(final IBlockAccess llllllllllllIlIllIlllllllIlllIIl, final BlockPos llllllllllllIlIllIlllllllIllIIII, final EnumFacing llllllllllllIlIllIlllllllIllIlll) {
        final BlockPos llllllllllllIlIllIlllllllIllIllI = llllllllllllIlIllIlllllllIllIIII.offset(llllllllllllIlIllIlllllllIllIlll);
        final IBlockState llllllllllllIlIllIlllllllIllIlIl = llllllllllllIlIllIlllllllIlllIIl.getBlockState(llllllllllllIlIllIlllllllIllIllI);
        final Block llllllllllllIlIllIlllllllIllIlII = llllllllllllIlIllIlllllllIllIlIl.getBlock();
        final boolean llllllllllllIlIllIlllllllIllIIll = llllllllllllIlIllIlllllllIllIlII.isNormalCube();
        final boolean llllllllllllIlIllIlllllllIllIIlI = llllllllllllIlIllIlllllllIlllIIl.getBlockState(llllllllllllIlIllIlllllllIllIIII.up()).getBlock().isNormalCube();
        int n;
        if (lIlIIIlIIIIIllll(llllllllllllIlIllIlllllllIllIIlI ? 1 : 0) && lIlIIIlIIIIlIIII(llllllllllllIlIllIlllllllIllIIll ? 1 : 0) && lIlIIIlIIIIlIIII(canConnectUpwardsTo(llllllllllllIlIllIlllllllIlllIIl, llllllllllllIlIllIlllllllIllIllI.up()) ? 1 : 0)) {
            n = BlockRedstoneWire.lllIlIIlIIlIll[1];
            "".length();
            if (null != null) {
                return ((0x6 ^ 0x30) & ~(0x6 ^ 0x30)) != 0x0;
            }
        }
        else if (lIlIIIlIIIIlIIII(canConnectTo(llllllllllllIlIllIlllllllIllIlIl, llllllllllllIlIllIlllllllIllIlll) ? 1 : 0)) {
            n = BlockRedstoneWire.lllIlIIlIIlIll[1];
            "".length();
            if (null != null) {
                return ((0xAB ^ 0x8B) & ~(0x22 ^ 0x2)) != 0x0;
            }
        }
        else if (lIlIIIlIIIIllIII(llllllllllllIlIllIlllllllIllIlII, Blocks.powered_repeater) && lIlIIIlIIIIllIII(llllllllllllIlIllIlllllllIllIlIl.getValue((IProperty<Object>)BlockRedstoneDiode.FACING), llllllllllllIlIllIlllllllIllIlll)) {
            n = BlockRedstoneWire.lllIlIIlIIlIll[1];
            "".length();
            if (((210 + 28 - 65 + 60 ^ 12 + 176 - 91 + 92) & (0x22 ^ 0x6A ^ (0x2A ^ 0x36) ^ -" ".length())) < 0) {
                return ((131 + 162 - 100 + 35 ^ 152 + 132 - 124 + 7) & (0x44 ^ 0x49 ^ (0xF2 ^ 0xBC) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIlIIIIIllll(llllllllllllIlIllIlllllllIllIIll ? 1 : 0) && lIlIIIlIIIIlIIII(canConnectUpwardsTo(llllllllllllIlIllIlllllllIlllIIl, llllllllllllIlIllIlllllllIllIllI.down()) ? 1 : 0)) {
            n = BlockRedstoneWire.lllIlIIlIIlIll[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0x26 ^ 0x2A) & ~(0xAF ^ 0xA3)) != 0x0;
            }
        }
        else {
            n = BlockRedstoneWire.lllIlIIlIIlIll[0];
        }
        return n != 0;
    }
    
    private static boolean lIlIIIlIIIIlIIII(final int llllllllllllIlIllIlllllIllllIIIl) {
        return llllllllllllIlIllIlllllIllllIIIl != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIllIlllllllllIlllI, final Random llllllllllllIlIllIlllllllllIllIl, final int llllllllllllIlIllIlllllllllIllII) {
        return Items.redstone;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlIllIllllllllllIlll, final BlockPos llllllllllllIlIllIllllllllllIllI, final IBlockState llllllllllllIlIllIllllllllllIlIl, final Block llllllllllllIlIllIllllllllllIlII) {
        if (lIlIIIlIIIIIllll(llllllllllllIlIllIllllllllllIlll.isRemote ? 1 : 0)) {
            if (lIlIIIlIIIIlIIII(this.canPlaceBlockAt(llllllllllllIlIllIllllllllllIlll, llllllllllllIlIllIllllllllllIllI) ? 1 : 0)) {
                this.updateSurroundingRedstone(llllllllllllIlIllIllllllllllIlll, llllllllllllIlIllIllllllllllIllI, llllllllllllIlIllIllllllllllIlIl);
                "".length();
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                this.dropBlockAsItem(llllllllllllIlIllIllllllllllIlll, llllllllllllIlIllIllllllllllIllI, llllllllllllIlIllIllllllllllIlIl, BlockRedstoneWire.lllIlIIlIIlIll[0]);
                llllllllllllIlIllIllllllllllIlll.setBlockToAir(llllllllllllIlIllIllllllllllIllI);
                "".length();
            }
        }
    }
    
    protected static boolean canConnectUpwardsTo(final IBlockState llllllllllllIlIllIlllllllIlIIIIl) {
        return canConnectTo(llllllllllllIlIllIlllllllIlIIIIl, null);
    }
    
    private static boolean lIlIIIlIIIIlIIIl(final Object llllllllllllIlIllIlllllIlllllIlI, final Object llllllllllllIlIllIlllllIlllllIIl) {
        return llllllllllllIlIllIlllllIlllllIlI != llllllllllllIlIllIlllllIlllllIIl;
    }
    
    private IBlockState updateSurroundingRedstone(final World llllllllllllIlIlllIIIIIIIllllIll, final BlockPos llllllllllllIlIlllIIIIIIIllllIlI, IBlockState llllllllllllIlIlllIIIIIIIllllIIl) {
        llllllllllllIlIlllIIIIIIIllllIIl = (double)this.calculateCurrentChanges(llllllllllllIlIlllIIIIIIIllllIll, llllllllllllIlIlllIIIIIIIllllIlI, llllllllllllIlIlllIIIIIIIllllIlI, (IBlockState)llllllllllllIlIlllIIIIIIIllllIIl);
        final List<BlockPos> llllllllllllIlIlllIIIIIIIllllllI = (List<BlockPos>)Lists.newArrayList((Iterable)this.blocksNeedingUpdate);
        this.blocksNeedingUpdate.clear();
        final long llllllllllllIlIlllIIIIIIIlllIllI = (long)llllllllllllIlIlllIIIIIIIllllllI.iterator();
        "".length();
        if (" ".length() == "   ".length()) {
            return null;
        }
        while (!lIlIIIlIIIIIllll(((Iterator)llllllllllllIlIlllIIIIIIIlllIllI).hasNext() ? 1 : 0)) {
            final BlockPos llllllllllllIlIlllIIIIIIIlllllIl = ((Iterator<BlockPos>)llllllllllllIlIlllIIIIIIIlllIllI).next();
            llllllllllllIlIlllIIIIIIIllllIll.notifyNeighborsOfStateChange(llllllllllllIlIlllIIIIIIIlllllIl, this);
        }
        return (IBlockState)llllllllllllIlIlllIIIIIIIllllIIl;
    }
    
    private int colorMultiplier(final int llllllllllllIlIllIlllllllIIIlIII) {
        final float llllllllllllIlIllIlllllllIIIIlll = llllllllllllIlIllIlllllllIIIlIII / 15.0f;
        float llllllllllllIlIllIlllllllIIIIllI = llllllllllllIlIllIlllllllIIIIlll * 0.6f + 0.4f;
        if (lIlIIIlIIIIIllll(llllllllllllIlIllIlllllllIIIlIII)) {
            llllllllllllIlIllIlllllllIIIIllI = 0.3f;
        }
        float llllllllllllIlIllIlllllllIIIIlIl = llllllllllllIlIllIlllllllIIIIlll * llllllllllllIlIllIlllllllIIIIlll * 0.7f - 0.5f;
        float llllllllllllIlIllIlllllllIIIIlII = llllllllllllIlIllIlllllllIIIIlll * llllllllllllIlIllIlllllllIIIIlll * 0.6f - 0.7f;
        if (lIlIIIlIIIIlllII(lIlIIIlIIIIllIll(llllllllllllIlIllIlllllllIIIIlIl, 0.0f))) {
            llllllllllllIlIllIlllllllIIIIlIl = 0.0f;
        }
        if (lIlIIIlIIIIlllII(lIlIIIlIIIIllIll(llllllllllllIlIllIlllllllIIIIlII, 0.0f))) {
            llllllllllllIlIllIlllllllIIIIlII = 0.0f;
        }
        final int llllllllllllIlIllIlllllllIIIIIll = MathHelper.clamp_int((int)(llllllllllllIlIllIlllllllIIIIllI * 255.0f), BlockRedstoneWire.lllIlIIlIIlIll[0], BlockRedstoneWire.lllIlIIlIIlIll[6]);
        final int llllllllllllIlIllIlllllllIIIIIlI = MathHelper.clamp_int((int)(llllllllllllIlIllIlllllllIIIIlIl * 255.0f), BlockRedstoneWire.lllIlIIlIIlIll[0], BlockRedstoneWire.lllIlIIlIIlIll[6]);
        final int llllllllllllIlIllIlllllllIIIIIIl = MathHelper.clamp_int((int)(llllllllllllIlIllIlllllllIIIIlII * 255.0f), BlockRedstoneWire.lllIlIIlIIlIll[0], BlockRedstoneWire.lllIlIIlIIlIll[6]);
        return BlockRedstoneWire.lllIlIIlIIlIll[7] | llllllllllllIlIllIlllllllIIIIIll << BlockRedstoneWire.lllIlIIlIIlIll[8] | llllllllllllIlIllIlllllllIIIIIlI << BlockRedstoneWire.lllIlIIlIIlIll[9] | llllllllllllIlIllIlllllllIIIIIIl;
    }
    
    private static boolean lIlIIIlIIIIlIlIl(final int llllllllllllIlIllIllllllIIIIlIlI, final int llllllllllllIlIllIllllllIIIIlIIl) {
        return llllllllllllIlIllIllllllIIIIlIlI >= llllllllllllIlIllIllllllIIIIlIIl;
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess llllllllllllIlIlllIIIIIIlIIllIIl, final BlockPos llllllllllllIlIlllIIIIIIlIIlIIll, final int llllllllllllIlIlllIIIIIIlIIlIlll) {
        final IBlockState llllllllllllIlIlllIIIIIIlIIlIllI = llllllllllllIlIlllIIIIIIlIIllIIl.getBlockState(llllllllllllIlIlllIIIIIIlIIlIIll);
        int n;
        if (lIlIIIlIIIIlIIIl(llllllllllllIlIlllIIIIIIlIIlIllI.getBlock(), this)) {
            n = super.colorMultiplier(llllllllllllIlIlllIIIIIIlIIllIIl, llllllllllllIlIlllIIIIIIlIIlIIll, llllllllllllIlIlllIIIIIIlIIlIlll);
            "".length();
            if ("  ".length() < 0) {
                return "  ".length() & ~"  ".length();
            }
        }
        else {
            n = this.colorMultiplier(llllllllllllIlIlllIIIIIIlIIlIllI.getValue((IProperty<Integer>)BlockRedstoneWire.POWER));
        }
        return n;
    }
    
    enum EnumAttachPosition implements IStringSerializable
    {
        private final /* synthetic */ String name;
        private static final /* synthetic */ String[] lIlIIIIIllIllI;
        
        NONE(EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[4]], EnumAttachPosition.lIlIIIIIllIlll[2], EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[5]]);
        
        private static final /* synthetic */ int[] lIlIIIIIllIlll;
        
        UP(EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[0]], EnumAttachPosition.lIlIIIIIllIlll[0], EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[1]]), 
        SIDE(EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[2]], EnumAttachPosition.lIlIIIIIllIlll[1], EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[3]]);
        
        private static String lllIIIIIlllIIIl(final String lllllllllllllIIlIIIIlllIIIlIIlll, final String lllllllllllllIIlIIIIlllIIIlIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIlllIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIIlllIIIlIlIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIIlllIIIlIlIIl.init(EnumAttachPosition.lIlIIIIIllIlll[2], lllllllllllllIIlIIIIlllIIIlIlIlI);
                return new String(lllllllllllllIIlIIIIlllIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIlllIIIlIlIII) {
                lllllllllllllIIlIIIIlllIIIlIlIII.printStackTrace();
                return null;
            }
        }
        
        private EnumAttachPosition(final String lllllllllllllIIlIIIIlllIIIllllll, final int lllllllllllllIIlIIIIlllIIIlllllI, final String lllllllllllllIIlIIIIlllIIIllllIl) {
            this.name = lllllllllllllIIlIIIIlllIIIllllIl;
        }
        
        private static String lllIIIIIlllIIII(String lllllllllllllIIlIIIIlllIIIIlIIlI, final String lllllllllllllIIlIIIIlllIIIIlIIIl) {
            lllllllllllllIIlIIIIlllIIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIIlllIIIIlIlIl = new StringBuilder();
            final char[] lllllllllllllIIlIIIIlllIIIIlIlII = lllllllllllllIIlIIIIlllIIIIlIIIl.toCharArray();
            int lllllllllllllIIlIIIIlllIIIIlIIll = EnumAttachPosition.lIlIIIIIllIlll[0];
            final char lllllllllllllIIlIIIIlllIIIIIllIl = (Object)lllllllllllllIIlIIIIlllIIIIlIIlI.toCharArray();
            final double lllllllllllllIIlIIIIlllIIIIIllII = lllllllllllllIIlIIIIlllIIIIIllIl.length;
            int lllllllllllllIIlIIIIlllIIIIIlIll = EnumAttachPosition.lIlIIIIIllIlll[0];
            while (lllIIIIIlllIlII(lllllllllllllIIlIIIIlllIIIIIlIll, (int)lllllllllllllIIlIIIIlllIIIIIllII)) {
                final char lllllllllllllIIlIIIIlllIIIIllIII = lllllllllllllIIlIIIIlllIIIIIllIl[lllllllllllllIIlIIIIlllIIIIIlIll];
                lllllllllllllIIlIIIIlllIIIIlIlIl.append((char)(lllllllllllllIIlIIIIlllIIIIllIII ^ lllllllllllllIIlIIIIlllIIIIlIlII[lllllllllllllIIlIIIIlllIIIIlIIll % lllllllllllllIIlIIIIlllIIIIlIlII.length]));
                "".length();
                ++lllllllllllllIIlIIIIlllIIIIlIIll;
                ++lllllllllllllIIlIIIIlllIIIIIlIll;
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIIlllIIIIlIlIl);
        }
        
        @Override
        public String toString() {
            return this.getName();
        }
        
        private static void lllIIIIIlllIIll() {
            (lIlIIIIIllIlll = new int[7])[0] = ((0xAA ^ 0x8E) & ~(0x2A ^ 0xE));
            EnumAttachPosition.lIlIIIIIllIlll[1] = " ".length();
            EnumAttachPosition.lIlIIIIIllIlll[2] = "  ".length();
            EnumAttachPosition.lIlIIIIIllIlll[3] = "   ".length();
            EnumAttachPosition.lIlIIIIIllIlll[4] = (0xC ^ 0x8);
            EnumAttachPosition.lIlIIIIIllIlll[5] = (50 + 5 - 14 + 101 ^ 135 + 67 - 78 + 15);
            EnumAttachPosition.lIlIIIIIllIlll[6] = (0x96 ^ 0x90);
        }
        
        private static void lllIIIIIlllIIlI() {
            (lIlIIIIIllIllI = new String[EnumAttachPosition.lIlIIIIIllIlll[6]])[EnumAttachPosition.lIlIIIIIllIlll[0]] = lllIIIIIlllIIII("Ijg=", "whtio");
            EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[1]] = lllIIIIIlllIIIl("dm903/edfj0=", "uJPRk");
            EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[2]] = lllIIIIIlllIIIl("6YoBSgQL858=", "fpKdX");
            EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[3]] = lllIIIIIlllIIII("ICotFA==", "SCIqe");
            EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[4]] = lllIIIIIlllIIIl("qSzJNMKLV7k=", "jrvYq");
            EnumAttachPosition.lIlIIIIIllIllI[EnumAttachPosition.lIlIIIIIllIlll[5]] = lllIIIIIlllIIII("Nzw2CQ==", "YSXlx");
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        static {
            lllIIIIIlllIIll();
            lllIIIIIlllIIlI();
            final EnumAttachPosition[] enum$VALUES = new EnumAttachPosition[EnumAttachPosition.lIlIIIIIllIlll[3]];
            enum$VALUES[EnumAttachPosition.lIlIIIIIllIlll[0]] = EnumAttachPosition.UP;
            enum$VALUES[EnumAttachPosition.lIlIIIIIllIlll[1]] = EnumAttachPosition.SIDE;
            enum$VALUES[EnumAttachPosition.lIlIIIIIllIlll[2]] = EnumAttachPosition.NONE;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lllIIIIIlllIlII(final int lllllllllllllIIlIIIIlllIIIIIIlll, final int lllllllllllllIIlIIIIlllIIIIIIllI) {
            return lllllllllllllIIlIIIIlllIIIIIIlll < lllllllllllllIIlIIIIlllIIIIIIllI;
        }
    }
}
