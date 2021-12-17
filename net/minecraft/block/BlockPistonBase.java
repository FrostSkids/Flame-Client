// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityPiston;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyEnum;
import java.util.List;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.BlockPistonStructureHelper;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.ItemStack;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.MathHelper;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyBool;

public class BlockPistonBase extends Block
{
    private static final /* synthetic */ String[] llIIlIIlIllIlI;
    public static final /* synthetic */ PropertyBool EXTENDED;
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ int[] llIIlIIlIllIll;
    private final /* synthetic */ boolean isSticky;
    
    private static boolean lIIIllIIIlllllIl(final int llllllllllllIlllIIlIIlllIllIlllI) {
        return llllllllllllIlllIIlIIlllIllIlllI != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockPistonBase.llIIlIIlIllIll[0] != 0;
    }
    
    public static EnumFacing getFacingFromEntity(final World llllllllllllIlllIIlIlIIIIIIIIlll, final BlockPos llllllllllllIlllIIlIlIIIIIIIIIll, final EntityLivingBase llllllllllllIlllIIlIlIIIIIIIIlIl) {
        if (lIIIllIIlIIIIllI(lIIIllIIlIIIIlII(MathHelper.abs((float)llllllllllllIlllIIlIlIIIIIIIIlIl.posX - llllllllllllIlllIIlIlIIIIIIIIIll.getX()), 2.0f)) && lIIIllIIlIIIIllI(lIIIllIIlIIIIlII(MathHelper.abs((float)llllllllllllIlllIIlIlIIIIIIIIlIl.posZ - llllllllllllIlllIIlIlIIIIIIIIIll.getZ()), 2.0f))) {
            final double llllllllllllIlllIIlIlIIIIIIIIlII = llllllllllllIlllIIlIlIIIIIIIIlIl.posY + llllllllllllIlllIIlIlIIIIIIIIlIl.getEyeHeight();
            if (lIIIllIIlIIIIlll(lIIIllIIlIIIIlIl(llllllllllllIlllIIlIlIIIIIIIIlII - llllllllllllIlllIIlIlIIIIIIIIIll.getY(), 2.0))) {
                return EnumFacing.UP;
            }
            if (lIIIllIIlIIIIlll(lIIIllIIlIIIIlIl(llllllllllllIlllIIlIlIIIIIIIIIll.getY() - llllllllllllIlllIIlIlIIIIIIIIlII, 0.0))) {
                return EnumFacing.DOWN;
            }
        }
        return llllllllllllIlllIIlIlIIIIIIIIlIl.getHorizontalFacing().getOpposite();
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIlllIIlIlIIIllIIllII, final BlockPos llllllllllllIlllIIlIlIIIllIIlIll, final IBlockState llllllllllllIlllIIlIlIIIllIIlIlI, final EntityLivingBase llllllllllllIlllIIlIlIIIllIIIIll, final ItemStack llllllllllllIlllIIlIlIIIllIIlIII) {
        llllllllllllIlllIIlIlIIIllIIllII.setBlockState(llllllllllllIlllIIlIlIIIllIIlIll, llllllllllllIlllIIlIlIIIllIIlIlI.withProperty((IProperty<Comparable>)BlockPistonBase.FACING, getFacingFromEntity(llllllllllllIlllIIlIlIIIllIIllII, llllllllllllIlllIIlIlIIIllIIlIll, llllllllllllIlllIIlIlIIIllIIIIll)), BlockPistonBase.llIIlIIlIllIll[2]);
        "".length();
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIllIIllII.isRemote ? 1 : 0)) {
            this.checkForMove(llllllllllllIlllIIlIlIIIllIIllII, llllllllllllIlllIIlIlIIIllIIlIll, llllllllllllIlllIIlIlIIIllIIlIlI);
        }
    }
    
    private static boolean lIIIllIIlIIIIIIl(final Object llllllllllllIlllIIlIIlllIlllIlIl, final Object llllllllllllIlllIIlIIlllIlllIlII) {
        return llllllllllllIlllIIlIIlllIlllIlIl == llllllllllllIlllIIlIIlllIlllIlII;
    }
    
    private static boolean lIIIllIIlIIIIlll(final int llllllllllllIlllIIlIIlllIllIIllI) {
        return llllllllllllIlllIIlIIlllIllIIllI > 0;
    }
    
    private static boolean lIIIllIIlIIIIIII(final int llllllllllllIlllIIlIIllllIIIlIIl, final int llllllllllllIlllIIlIIllllIIIlIII) {
        return llllllllllllIlllIIlIIllllIIIlIIl == llllllllllllIlllIIlIIllllIIIlIII;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockPistonBase.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIIIllIIlIIIIIlI($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final int llllllllllllIlllIIlIIllllIlIIllI = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlllIIlIIllllIlIIllI[EnumFacing.DOWN.ordinal()] = BlockPistonBase.llIIlIIlIllIll[1];
            "".length();
            if (((0x11 ^ 0x1) & ~(0xB9 ^ 0xA9)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlllIIlIIllllIlIIllI[EnumFacing.EAST.ordinal()] = BlockPistonBase.llIIlIIlIllIll[8];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlllIIlIIllllIlIIllI[EnumFacing.NORTH.ordinal()] = BlockPistonBase.llIIlIIlIllIll[3];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlllIIlIIllllIlIIllI[EnumFacing.SOUTH.ordinal()] = BlockPistonBase.llIIlIIlIllIll[6];
            "".length();
            if ((0x92 ^ 0x96) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlllIIlIIllllIlIIllI[EnumFacing.UP.ordinal()] = BlockPistonBase.llIIlIIlIllIll[2];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlllIIlIIllllIlIIllI[EnumFacing.WEST.ordinal()] = BlockPistonBase.llIIlIIlIllIll[5];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockPistonBase.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlllIIlIIllllIlIIllI;
    }
    
    private static boolean lIIIllIIIlllllII(final Object llllllllllllIlllIIlIIlllIlllIIII) {
        return llllllllllllIlllIIlIIlllIlllIIII == null;
    }
    
    private static int lIIIllIIlIIIIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private boolean doMove(final World llllllllllllIlllIIlIIlllllIIlIIl, final BlockPos llllllllllllIlllIIlIIlllllIIlIII, final EnumFacing llllllllllllIlllIIlIIlllllIlllll, final boolean llllllllllllIlllIIlIIlllllIIIllI) {
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIIlllllIIIllI ? 1 : 0)) {
            llllllllllllIlllIIlIIlllllIIlIIl.setBlockToAir(llllllllllllIlllIIlIIlllllIIlIII.offset(llllllllllllIlllIIlIIlllllIlllll));
            "".length();
        }
        final BlockPistonStructureHelper llllllllllllIlllIIlIIlllllIlllIl = new BlockPistonStructureHelper(llllllllllllIlllIIlIIlllllIIlIIl, llllllllllllIlllIIlIIlllllIIlIII, llllllllllllIlllIIlIIlllllIlllll, llllllllllllIlllIIlIIlllllIIIllI);
        final List<BlockPos> llllllllllllIlllIIlIIlllllIlllII = llllllllllllIlllIIlIIlllllIlllIl.getBlocksToMove();
        final List<BlockPos> llllllllllllIlllIIlIIlllllIllIll = llllllllllllIlllIIlIIlllllIlllIl.getBlocksToDestroy();
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIIlllllIlllIl.canMove() ? 1 : 0)) {
            return BlockPistonBase.llIIlIIlIllIll[0] != 0;
        }
        int llllllllllllIlllIIlIIlllllIllIlI = llllllllllllIlllIIlIIlllllIlllII.size() + llllllllllllIlllIIlIIlllllIllIll.size();
        final Block[] llllllllllllIlllIIlIIlllllIllIIl = new Block[llllllllllllIlllIIlIIlllllIllIlI];
        EnumFacing opposite;
        if (lIIIllIIIlllllIl(llllllllllllIlllIIlIIlllllIIIllI ? 1 : 0)) {
            opposite = llllllllllllIlllIIlIIlllllIlllll;
            "".length();
            if ((29 + 134 - 43 + 70 ^ 162 + 92 - 198 + 130) < " ".length()) {
                return ((0xBA ^ 0xA1 ^ (0xC1 ^ 0x90)) & (0x1A ^ 0x64 ^ (0x3B ^ 0xF) ^ -" ".length())) != 0x0;
            }
        }
        else {
            opposite = llllllllllllIlllIIlIIlllllIlllll.getOpposite();
        }
        final EnumFacing llllllllllllIlllIIlIIlllllIllIII = opposite;
        int llllllllllllIlllIIlIIlllllIlIlll = llllllllllllIlllIIlIIlllllIllIll.size() - BlockPistonBase.llIIlIIlIllIll[1];
        "".length();
        if (" ".length() <= 0) {
            return ((0xE4 ^ 0xB4) & ~(0x4 ^ 0x54)) != 0x0;
        }
        while (!lIIIllIIlIIIIllI(llllllllllllIlllIIlIIlllllIlIlll)) {
            final BlockPos llllllllllllIlllIIlIIlllllIlIllI = llllllllllllIlllIIlIIlllllIllIll.get(llllllllllllIlllIIlIIlllllIlIlll);
            final Block llllllllllllIlllIIlIIlllllIlIlIl = llllllllllllIlllIIlIIlllllIIlIIl.getBlockState(llllllllllllIlllIIlIIlllllIlIllI).getBlock();
            llllllllllllIlllIIlIIlllllIlIlIl.dropBlockAsItem(llllllllllllIlllIIlIIlllllIIlIIl, llllllllllllIlllIIlIIlllllIlIllI, llllllllllllIlllIIlIIlllllIIlIIl.getBlockState(llllllllllllIlllIIlIIlllllIlIllI), BlockPistonBase.llIIlIIlIllIll[0]);
            llllllllllllIlllIIlIIlllllIIlIIl.setBlockToAir(llllllllllllIlllIIlIIlllllIlIllI);
            "".length();
            --llllllllllllIlllIIlIIlllllIllIlI;
            llllllllllllIlllIIlIIlllllIllIIl[llllllllllllIlllIIlIIlllllIllIlI] = llllllllllllIlllIIlIIlllllIlIlIl;
            --llllllllllllIlllIIlIIlllllIlIlll;
        }
        int llllllllllllIlllIIlIIlllllIlIlII = llllllllllllIlllIIlIIlllllIlllII.size() - BlockPistonBase.llIIlIIlIllIll[1];
        "".length();
        if (((0x1A ^ 0x47 ^ (0xD ^ 0x49)) & (0x4B ^ 0x57 ^ (0x3F ^ 0x3A) ^ -" ".length())) > 0) {
            return ((0x31 ^ 0xA ^ (0xBD ^ 0x8C)) & (0xF8 ^ 0x9B ^ (0x1D ^ 0x74) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllIIlIIIIllI(llllllllllllIlllIIlIIlllllIlIlII)) {
            BlockPos llllllllllllIlllIIlIIlllllIlIIll = llllllllllllIlllIIlIIlllllIlllII.get(llllllllllllIlllIIlIIlllllIlIlII);
            final IBlockState llllllllllllIlllIIlIIlllllIlIIlI = llllllllllllIlllIIlIIlllllIIlIIl.getBlockState(llllllllllllIlllIIlIIlllllIlIIll);
            final Block llllllllllllIlllIIlIIlllllIlIIIl = llllllllllllIlllIIlIIlllllIlIIlI.getBlock();
            llllllllllllIlllIIlIIlllllIlIIIl.getMetaFromState(llllllllllllIlllIIlIIlllllIlIIlI);
            "".length();
            llllllllllllIlllIIlIIlllllIIlIIl.setBlockToAir(llllllllllllIlllIIlIIlllllIlIIll);
            "".length();
            llllllllllllIlllIIlIIlllllIlIIll = llllllllllllIlllIIlIIlllllIlIIll.offset(llllllllllllIlllIIlIIlllllIllIII);
            llllllllllllIlllIIlIIlllllIIlIIl.setBlockState(llllllllllllIlllIIlIIlllllIlIIll, Blocks.piston_extension.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonBase.FACING, llllllllllllIlllIIlIIlllllIlllll), BlockPistonBase.llIIlIIlIllIll[6]);
            "".length();
            llllllllllllIlllIIlIIlllllIIlIIl.setTileEntity(llllllllllllIlllIIlIIlllllIlIIll, BlockPistonMoving.newTileEntity(llllllllllllIlllIIlIIlllllIlIIlI, llllllllllllIlllIIlIIlllllIlllll, llllllllllllIlllIIlIIlllllIIIllI, (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0)));
            --llllllllllllIlllIIlIIlllllIllIlI;
            llllllllllllIlllIIlIIlllllIllIIl[llllllllllllIlllIIlIIlllllIllIlI] = llllllllllllIlllIIlIIlllllIlIIIl;
            --llllllllllllIlllIIlIIlllllIlIlII;
        }
        final BlockPos llllllllllllIlllIIlIIlllllIlIIII = llllllllllllIlllIIlIIlllllIIlIII.offset(llllllllllllIlllIIlIIlllllIlllll);
        if (lIIIllIIIlllllIl(llllllllllllIlllIIlIIlllllIIIllI ? 1 : 0)) {
            BlockPistonExtension.EnumPistonType enumPistonType;
            if (lIIIllIIIlllllIl(this.isSticky ? 1 : 0)) {
                enumPistonType = BlockPistonExtension.EnumPistonType.STICKY;
                "".length();
                if (((0xF0 ^ 0xC3) & ~(0x73 ^ 0x40)) != 0x0) {
                    return ((0x88 ^ 0xB7) & ~(0xA4 ^ 0x9B)) != 0x0;
                }
            }
            else {
                enumPistonType = BlockPistonExtension.EnumPistonType.DEFAULT;
            }
            final BlockPistonExtension.EnumPistonType llllllllllllIlllIIlIIlllllIIllll = enumPistonType;
            final IBlockState llllllllllllIlllIIlIIlllllIIlllI = Blocks.piston_head.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonExtension.FACING, llllllllllllIlllIIlIIlllllIlllll).withProperty(BlockPistonExtension.TYPE, llllllllllllIlllIIlIIlllllIIllll);
            final IBlockState withProperty = Blocks.piston_extension.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonMoving.FACING, llllllllllllIlllIIlIIlllllIlllll);
            final PropertyEnum<BlockPistonExtension.EnumPistonType> type = BlockPistonMoving.TYPE;
            BlockPistonExtension.EnumPistonType enumPistonType2;
            if (lIIIllIIIlllllIl(this.isSticky ? 1 : 0)) {
                enumPistonType2 = BlockPistonExtension.EnumPistonType.STICKY;
                "".length();
                if ("  ".length() <= 0) {
                    return ((7 + 151 - 131 + 171 ^ 117 + 91 - 191 + 137) & (0xA1 ^ 0xB2 ^ (0x59 ^ 0x16) ^ -" ".length())) != 0x0;
                }
            }
            else {
                enumPistonType2 = BlockPistonExtension.EnumPistonType.DEFAULT;
            }
            final IBlockState llllllllllllIlllIIlIIlllllIIllIl = withProperty.withProperty((IProperty<Comparable>)type, enumPistonType2);
            llllllllllllIlllIIlIIlllllIIlIIl.setBlockState(llllllllllllIlllIIlIIlllllIlIIII, llllllllllllIlllIIlIIlllllIIllIl, BlockPistonBase.llIIlIIlIllIll[6]);
            "".length();
            llllllllllllIlllIIlIIlllllIIlIIl.setTileEntity(llllllllllllIlllIIlIIlllllIlIIII, BlockPistonMoving.newTileEntity(llllllllllllIlllIIlIIlllllIIlllI, llllllllllllIlllIIlIIlllllIlllll, (boolean)(BlockPistonBase.llIIlIIlIllIll[1] != 0), (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0)));
        }
        int llllllllllllIlllIIlIIlllllIIllII = llllllllllllIlllIIlIIlllllIllIll.size() - BlockPistonBase.llIIlIIlIllIll[1];
        "".length();
        if ((0xB1 ^ 0xB5) < " ".length()) {
            return ((0x1C ^ 0x15) & ~(0x92 ^ 0x9B)) != 0x0;
        }
        while (!lIIIllIIlIIIIllI(llllllllllllIlllIIlIIlllllIIllII)) {
            llllllllllllIlllIIlIIlllllIIlIIl.notifyNeighborsOfStateChange(llllllllllllIlllIIlIIlllllIllIll.get(llllllllllllIlllIIlIIlllllIIllII), llllllllllllIlllIIlIIlllllIllIIl[llllllllllllIlllIIlIIlllllIllIlI++]);
            --llllllllllllIlllIIlIIlllllIIllII;
        }
        int llllllllllllIlllIIlIIlllllIIlIll = llllllllllllIlllIIlIIlllllIlllII.size() - BlockPistonBase.llIIlIIlIllIll[1];
        "".length();
        if ("  ".length() <= " ".length()) {
            return ((0xA7 ^ 0x97) & ~(0xB ^ 0x3B)) != 0x0;
        }
        while (!lIIIllIIlIIIIllI(llllllllllllIlllIIlIIlllllIIlIll)) {
            llllllllllllIlllIIlIIlllllIIlIIl.notifyNeighborsOfStateChange(llllllllllllIlllIIlIIlllllIlllII.get(llllllllllllIlllIIlIIlllllIIlIll), llllllllllllIlllIIlIIlllllIllIIl[llllllllllllIlllIIlIIlllllIllIlI++]);
            --llllllllllllIlllIIlIIlllllIIlIll;
        }
        if (lIIIllIIIlllllIl(llllllllllllIlllIIlIIlllllIIIllI ? 1 : 0)) {
            llllllllllllIlllIIlIIlllllIIlIIl.notifyNeighborsOfStateChange(llllllllllllIlllIIlIIlllllIlIIII, Blocks.piston_head);
            llllllllllllIlllIIlIIlllllIIlIIl.notifyNeighborsOfStateChange(llllllllllllIlllIIlIIlllllIIlIII, this);
        }
        return BlockPistonBase.llIIlIIlIllIll[1] != 0;
    }
    
    private static void lIIIllIIIllllIIl() {
        (llIIlIIlIllIlI = new String[BlockPistonBase.llIIlIIlIllIll[6]])[BlockPistonBase.llIIlIIlIllIll[0]] = lIIIllIIIlllIlll("0pYKrTY65Ls=", "DYbDV");
        BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[1]] = lIIIllIIIlllIlll("77AB1EILXb+5QYCReHkYHA==", "PbfZw");
        BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[2]] = lIIIllIIIllllIII("jjZJB/yTaSuwmLbFR7FTkQ==", "AnduR");
        BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[3]] = lIIIllIIIlllIlll("UU2lgNFpHX4i995ZpOCfKg==", "sUKjc");
    }
    
    private static String lIIIllIIIlllIlll(final String llllllllllllIlllIIlIIllllIIllllI, final String llllllllllllIlllIIlIIllllIIllIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIIllllIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIllllIIllIll.getBytes(StandardCharsets.UTF_8)), BlockPistonBase.llIIlIIlIllIll[7]), "DES");
            final Cipher llllllllllllIlllIIlIIllllIlIIIII = Cipher.getInstance("DES");
            llllllllllllIlllIIlIIllllIlIIIII.init(BlockPistonBase.llIIlIIlIllIll[2], llllllllllllIlllIIlIIllllIlIIIIl);
            return new String(llllllllllllIlllIIlIIllllIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIllllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIIllllIIlllll) {
            llllllllllllIlllIIlIIllllIIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIlllIIlIlIIIlIIllIll, final BlockPos llllllllllllIlllIIlIlIIIlIlIIIll, final EnumFacing llllllllllllIlllIIlIlIIIlIlIIIlI, final float llllllllllllIlllIIlIlIIIlIlIIIIl, final float llllllllllllIlllIIlIlIIIlIlIIIII, final float llllllllllllIlllIIlIlIIIlIIlllll, final int llllllllllllIlllIIlIlIIIlIIllllI, final EntityLivingBase llllllllllllIlllIIlIlIIIlIIllIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonBase.FACING, getFacingFromEntity(llllllllllllIlllIIlIlIIIlIIllIll, llllllllllllIlllIIlIlIIIlIlIIIll, llllllllllllIlllIIlIlIIIlIIllIIl)).withProperty((IProperty<Comparable>)BlockPistonBase.EXTENDED, (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0));
    }
    
    static {
        lIIIllIIIllllIlI();
        lIIIllIIIllllIIl();
        FACING = PropertyDirection.create(BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[0]]);
        EXTENDED = PropertyBool.create(BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[1]]);
    }
    
    private static boolean lIIIllIIlIIIIIll(final int llllllllllllIlllIIlIIlllIlllllIl, final int llllllllllllIlllIIlIIlllIlllllII) {
        return llllllllllllIlllIIlIIlllIlllllIl > llllllllllllIlllIIlIIlllIlllllII;
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public static EnumFacing getFacing(final int llllllllllllIlllIIlIlIIIIIIIllII) {
        final int llllllllllllIlllIIlIlIIIIIIIllIl = llllllllllllIlllIIlIlIIIIIIIllII & BlockPistonBase.llIIlIIlIllIll[4];
        EnumFacing front;
        if (lIIIllIIlIIIIIll(llllllllllllIlllIIlIlIIIIIIIllIl, BlockPistonBase.llIIlIIlIllIll[5])) {
            front = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            front = EnumFacing.getFront(llllllllllllIlllIIlIlIIIIIIIllIl);
        }
        return front;
    }
    
    @Override
    public boolean onBlockEventReceived(final World llllllllllllIlllIIlIlIIIIllIIIIl, final BlockPos llllllllllllIlllIIlIlIIIIlIlIIlI, final IBlockState llllllllllllIlllIIlIlIIIIlIlllll, final int llllllllllllIlllIIlIlIIIIlIlIIII, final int llllllllllllIlllIIlIlIIIIlIIllll) {
        final EnumFacing llllllllllllIlllIIlIlIIIIlIlllII = llllllllllllIlllIIlIlIIIIlIlllll.getValue((IProperty<EnumFacing>)BlockPistonBase.FACING);
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIIllIIIIl.isRemote ? 1 : 0)) {
            final boolean llllllllllllIlllIIlIlIIIIlIllIll = this.shouldBeExtended(llllllllllllIlllIIlIlIIIIllIIIIl, llllllllllllIlllIIlIlIIIIlIlIIlI, llllllllllllIlllIIlIlIIIIlIlllII);
            if (lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIIlIllIll ? 1 : 0) && lIIIllIIlIIIIIII(llllllllllllIlllIIlIlIIIIlIlIIII, BlockPistonBase.llIIlIIlIllIll[1])) {
                llllllllllllIlllIIlIlIIIIllIIIIl.setBlockState(llllllllllllIlllIIlIlIIIIlIlIIlI, llllllllllllIlllIIlIlIIIIlIlllll.withProperty((IProperty<Comparable>)BlockPistonBase.EXTENDED, (boolean)(BlockPistonBase.llIIlIIlIllIll[1] != 0)), BlockPistonBase.llIIlIIlIllIll[2]);
                "".length();
                return BlockPistonBase.llIIlIIlIllIll[0] != 0;
            }
            if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIIlIllIll ? 1 : 0) && lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIIlIlIIII)) {
                return BlockPistonBase.llIIlIIlIllIll[0] != 0;
            }
        }
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIIlIlIIII)) {
            if (lIIIllIIIllllIll(this.doMove(llllllllllllIlllIIlIlIIIIllIIIIl, llllllllllllIlllIIlIlIIIIlIlIIlI, llllllllllllIlllIIlIlIIIIlIlllII, (boolean)(BlockPistonBase.llIIlIIlIllIll[1] != 0)) ? 1 : 0)) {
                return BlockPistonBase.llIIlIIlIllIll[0] != 0;
            }
            llllllllllllIlllIIlIlIIIIllIIIIl.setBlockState(llllllllllllIlllIIlIlIIIIlIlIIlI, llllllllllllIlllIIlIlIIIIlIlllll.withProperty((IProperty<Comparable>)BlockPistonBase.EXTENDED, (boolean)(BlockPistonBase.llIIlIIlIllIll[1] != 0)), BlockPistonBase.llIIlIIlIllIll[2]);
            "".length();
            llllllllllllIlllIIlIlIIIIllIIIIl.playSoundEffect(llllllllllllIlllIIlIlIIIIlIlIIlI.getX() + 0.5, llllllllllllIlllIIlIlIIIIlIlIIlI.getY() + 0.5, llllllllllllIlllIIlIlIIIIlIlIIlI.getZ() + 0.5, BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[2]], 0.5f, llllllllllllIlllIIlIlIIIIllIIIIl.rand.nextFloat() * 0.25f + 0.6f);
            "".length();
            if (" ".length() == "   ".length()) {
                return ((0x29 ^ 0x1E) & ~(0x48 ^ 0x7F)) != 0x0;
            }
        }
        else if (lIIIllIIlIIIIIII(llllllllllllIlllIIlIlIIIIlIlIIII, BlockPistonBase.llIIlIIlIllIll[1])) {
            final TileEntity llllllllllllIlllIIlIlIIIIlIllIlI = llllllllllllIlllIIlIlIIIIllIIIIl.getTileEntity(llllllllllllIlllIIlIlIIIIlIlIIlI.offset(llllllllllllIlllIIlIlIIIIlIlllII));
            if (lIIIllIIIlllllIl((llllllllllllIlllIIlIlIIIIlIllIlI instanceof TileEntityPiston) ? 1 : 0)) {
                ((TileEntityPiston)llllllllllllIlllIIlIlIIIIlIllIlI).clearPistonTileEntity();
            }
            final IBlockState withProperty = Blocks.piston_extension.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonMoving.FACING, llllllllllllIlllIIlIlIIIIlIlllII);
            final PropertyEnum<BlockPistonExtension.EnumPistonType> type = BlockPistonMoving.TYPE;
            BlockPistonExtension.EnumPistonType enumPistonType;
            if (lIIIllIIIlllllIl(this.isSticky ? 1 : 0)) {
                enumPistonType = BlockPistonExtension.EnumPistonType.STICKY;
                "".length();
                if (((0x5F ^ 0x7C) & ~(0x43 ^ 0x60)) != 0x0) {
                    return ((0x67 ^ 0x29) & ~(0xF4 ^ 0xBA)) != 0x0;
                }
            }
            else {
                enumPistonType = BlockPistonExtension.EnumPistonType.DEFAULT;
            }
            llllllllllllIlllIIlIlIIIIllIIIIl.setBlockState(llllllllllllIlllIIlIlIIIIlIlIIlI, withProperty.withProperty((IProperty<Comparable>)type, enumPistonType), BlockPistonBase.llIIlIIlIllIll[3]);
            "".length();
            llllllllllllIlllIIlIlIIIIllIIIIl.setTileEntity(llllllllllllIlllIIlIlIIIIlIlIIlI, BlockPistonMoving.newTileEntity(this.getStateFromMeta(llllllllllllIlllIIlIlIIIIlIIllll), llllllllllllIlllIIlIlIIIIlIlllII, (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0), (boolean)(BlockPistonBase.llIIlIIlIllIll[1] != 0)));
            if (lIIIllIIIlllllIl(this.isSticky ? 1 : 0)) {
                final BlockPos llllllllllllIlllIIlIlIIIIlIllIIl = llllllllllllIlllIIlIlIIIIlIlIIlI.add(llllllllllllIlllIIlIlIIIIlIlllII.getFrontOffsetX() * BlockPistonBase.llIIlIIlIllIll[2], llllllllllllIlllIIlIlIIIIlIlllII.getFrontOffsetY() * BlockPistonBase.llIIlIIlIllIll[2], llllllllllllIlllIIlIlIIIIlIlllII.getFrontOffsetZ() * BlockPistonBase.llIIlIIlIllIll[2]);
                final Block llllllllllllIlllIIlIlIIIIlIllIII = llllllllllllIlllIIlIlIIIIllIIIIl.getBlockState(llllllllllllIlllIIlIlIIIIlIllIIl).getBlock();
                boolean llllllllllllIlllIIlIlIIIIlIlIlll = BlockPistonBase.llIIlIIlIllIll[0] != 0;
                if (lIIIllIIlIIIIIIl(llllllllllllIlllIIlIlIIIIlIllIII, Blocks.piston_extension)) {
                    final TileEntity llllllllllllIlllIIlIlIIIIlIlIllI = llllllllllllIlllIIlIlIIIIllIIIIl.getTileEntity(llllllllllllIlllIIlIlIIIIlIllIIl);
                    if (lIIIllIIIlllllIl((llllllllllllIlllIIlIlIIIIlIlIllI instanceof TileEntityPiston) ? 1 : 0)) {
                        final TileEntityPiston llllllllllllIlllIIlIlIIIIlIlIlIl = (TileEntityPiston)llllllllllllIlllIIlIlIIIIlIlIllI;
                        if (lIIIllIIlIIIIIIl(llllllllllllIlllIIlIlIIIIlIlIlIl.getFacing(), llllllllllllIlllIIlIlIIIIlIlllII) && lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIIlIlIlIl.isExtending() ? 1 : 0)) {
                            llllllllllllIlllIIlIlIIIIlIlIlIl.clearPistonTileEntity();
                            llllllllllllIlllIIlIlIIIIlIlIlll = (BlockPistonBase.llIIlIIlIllIll[1] != 0);
                        }
                    }
                }
                if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIIlIlIlll ? 1 : 0) && lIIIllIIIllllllI(llllllllllllIlllIIlIlIIIIlIllIII.getMaterial(), Material.air) && lIIIllIIIlllllIl(canPush(llllllllllllIlllIIlIlIIIIlIllIII, llllllllllllIlllIIlIlIIIIllIIIIl, llllllllllllIlllIIlIlIIIIlIllIIl, llllllllllllIlllIIlIlIIIIlIlllII.getOpposite(), (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0)) ? 1 : 0) && (!lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIIlIllIII.getMobilityFlag()) || !lIIIllIIIllllllI(llllllllllllIlllIIlIlIIIIlIllIII, Blocks.piston) || lIIIllIIlIIIIIIl(llllllllllllIlllIIlIlIIIIlIllIII, Blocks.sticky_piston))) {
                    this.doMove(llllllllllllIlllIIlIlIIIIllIIIIl, llllllllllllIlllIIlIlIIIIlIlIIlI, llllllllllllIlllIIlIlIIIIlIlllII, (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0));
                    "".length();
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return ((0x15 ^ 0x5E ^ (0x19 ^ 0xB)) & (0x1B ^ 0x48 ^ (0x9B ^ 0x91) ^ -" ".length())) != 0x0;
                    }
                }
            }
            else {
                llllllllllllIlllIIlIlIIIIllIIIIl.setBlockToAir(llllllllllllIlllIIlIlIIIIlIlIIlI.offset(llllllllllllIlllIIlIlIIIIlIlllII));
                "".length();
            }
            llllllllllllIlllIIlIlIIIIllIIIIl.playSoundEffect(llllllllllllIlllIIlIlIIIIlIlIIlI.getX() + 0.5, llllllllllllIlllIIlIlIIIIlIlIIlI.getY() + 0.5, llllllllllllIlllIIlIlIIIIlIlIIlI.getZ() + 0.5, BlockPistonBase.llIIlIIlIllIlI[BlockPistonBase.llIIlIIlIllIll[3]], 0.5f, llllllllllllIlllIIlIlIIIIllIIIIl.rand.nextFloat() * 0.15f + 0.6f);
        }
        return BlockPistonBase.llIIlIIlIllIll[1] != 0;
    }
    
    private static boolean lIIIllIIIllllIll(final int llllllllllllIlllIIlIIlllIllIllII) {
        return llllllllllllIlllIIlIIlllIllIllII == 0;
    }
    
    private static boolean lIIIllIIlIIIIIlI(final Object llllllllllllIlllIIlIIlllIlllIIlI) {
        return llllllllllllIlllIIlIIlllIlllIIlI != null;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIlllIIlIlIIIIlIIIIII, final BlockPos llllllllllllIlllIIlIlIIIIIlllIIl) {
        final IBlockState llllllllllllIlllIIlIlIIIIIlllllI = llllllllllllIlllIIlIlIIIIlIIIIII.getBlockState(llllllllllllIlllIIlIlIIIIIlllIIl);
        if (lIIIllIIlIIIIIIl(llllllllllllIlllIIlIlIIIIIlllllI.getBlock(), this) && lIIIllIIIlllllIl(((boolean)llllllllllllIlllIIlIlIIIIIlllllI.getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
            final float llllllllllllIlllIIlIlIIIIIllllIl = 0.25f;
            final EnumFacing llllllllllllIlllIIlIlIIIIIllllII = llllllllllllIlllIIlIlIIIIIlllllI.getValue((IProperty<EnumFacing>)BlockPistonBase.FACING);
            if (lIIIllIIlIIIIIlI(llllllllllllIlllIIlIlIIIIIllllII)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlllIIlIlIIIIIllllII.ordinal()]) {
                    case 1: {
                        this.setBlockBounds(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                        "".length();
                        if (((0x5A ^ 0x74) & ~(0xB ^ 0x25)) != 0x0) {
                            return;
                        }
                        return;
                    }
                    case 2: {
                        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                        "".length();
                        if ((0x9A ^ 0x9E) < " ".length()) {
                            return;
                        }
                        return;
                    }
                    case 3: {
                        this.setBlockBounds(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                        "".length();
                        if (((0x12 ^ 0x32) & ~(0x81 ^ 0xA1)) != 0x0) {
                            return;
                        }
                        return;
                    }
                    case 4: {
                        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                        return;
                    }
                    case 5: {
                        this.setBlockBounds(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        return;
                    }
                    case 6: {
                        this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                        break;
                    }
                }
                "".length();
                if (-" ".length() >= (0xB1 ^ 0x90 ^ (0xE ^ 0x2B))) {
                    return;
                }
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    private static void lIIIllIIIllllIlI() {
        (llIIlIIlIllIll = new int[9])[0] = ((0x78 ^ 0x39 ^ (0xC2 ^ 0xB8)) & (0x6E ^ 0xE ^ (0xC7 ^ 0x9C) ^ -" ".length()));
        BlockPistonBase.llIIlIIlIllIll[1] = " ".length();
        BlockPistonBase.llIIlIIlIllIll[2] = "  ".length();
        BlockPistonBase.llIIlIIlIllIll[3] = "   ".length();
        BlockPistonBase.llIIlIIlIllIll[4] = (0x68 ^ 0x6F);
        BlockPistonBase.llIIlIIlIllIll[5] = (0x69 ^ 0x6C);
        BlockPistonBase.llIIlIIlIllIll[6] = (0x1C ^ 0x18);
        BlockPistonBase.llIIlIIlIllIll[7] = (48 + 76 - 83 + 88 ^ 40 + 84 - 18 + 31);
        BlockPistonBase.llIIlIIlIllIll[8] = (0x20 ^ 0x26);
    }
    
    @Override
    public void addCollisionBoxesToList(final World llllllllllllIlllIIlIlIIIIIlIIIll, final BlockPos llllllllllllIlllIIlIlIIIIIlIlIIl, final IBlockState llllllllllllIlllIIlIlIIIIIlIIIIl, final AxisAlignedBB llllllllllllIlllIIlIlIIIIIlIIIII, final List<AxisAlignedBB> llllllllllllIlllIIlIlIIIIIIlllll, final Entity llllllllllllIlllIIlIlIIIIIIllllI) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.addCollisionBoxesToList(llllllllllllIlllIIlIlIIIIIlIIIll, llllllllllllIlllIIlIlIIIIIlIlIIl, llllllllllllIlllIIlIlIIIIIlIIIIl, llllllllllllIlllIIlIlIIIIIlIIIII, llllllllllllIlllIIlIlIIIIIIlllll, llllllllllllIlllIIlIlIIIIIIllllI);
    }
    
    private static int lIIIllIIlIIIIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIllIIlIIIlIIl(final int llllllllllllIlllIIlIIlllIllIlIlI) {
        return llllllllllllIlllIIlIIlllIllIlIlI >= 0;
    }
    
    private static boolean lIIIllIIIlllllll(final int llllllllllllIlllIIlIIllllIIIIlIl, final int llllllllllllIlllIIlIIllllIIIIlII) {
        return llllllllllllIlllIIlIIllllIIIIlIl >= llllllllllllIlllIIlIIllllIIIIlII;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllIIlIIllllIllIlII) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonBase.FACING, getFacing(llllllllllllIlllIIlIIllllIllIlII));
        final PropertyBool extended = BlockPistonBase.EXTENDED;
        int b;
        if (lIIIllIIlIIIIlll(llllllllllllIlllIIlIIllllIllIlII & BlockPistonBase.llIIlIIlIllIll[7])) {
            b = BlockPistonBase.llIIlIIlIllIll[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            b = BlockPistonBase.llIIlIIlIllIll[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)extended, (boolean)(b != 0));
    }
    
    @Override
    public boolean isFullCube() {
        return BlockPistonBase.llIIlIIlIllIll[0] != 0;
    }
    
    private static int lIIIllIIlIIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIIIllIIIllllIII(final String llllllllllllIlllIIlIIllllIIIllll, final String llllllllllllIlllIIlIIllllIIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIIllllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIllllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIIllllIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIIllllIIlIIll.init(BlockPistonBase.llIIlIIlIllIll[2], llllllllllllIlllIIlIIllllIIlIlII);
            return new String(llllllllllllIlllIIlIIllllIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIllllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIIllllIIlIIlI) {
            llllllllllllIlllIIlIIllllIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllIIlIIIlIll(final int llllllllllllIlllIIlIIlllIllIIIll, final int llllllllllllIlllIIlIIlllIllIIIlI) {
        return llllllllllllIlllIIlIIlllIllIIIll != llllllllllllIlllIIlIIlllIllIIIlI;
    }
    
    public BlockPistonBase(final boolean llllllllllllIlllIIlIlIIIllIlIlII) {
        super(Material.piston);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPistonBase.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockPistonBase.EXTENDED, (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0)));
        this.isSticky = llllllllllllIlllIIlIlIIIllIlIlII;
        this.setStepSound(BlockPistonBase.soundTypePiston);
        "".length();
        this.setHardness(0.5f);
        "".length();
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    public static boolean canPush(final Block llllllllllllIlllIIlIIlllllllIllI, final World llllllllllllIlllIIlIIlllllllIlIl, final BlockPos llllllllllllIlllIIlIIlllllllIlII, final EnumFacing llllllllllllIlllIIlIIlllllllIIll, final boolean llllllllllllIlllIIlIIlllllllIIlI) {
        if (lIIIllIIlIIIIIIl(llllllllllllIlllIIlIIlllllllIllI, Blocks.obsidian)) {
            return BlockPistonBase.llIIlIIlIllIll[0] != 0;
        }
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIIlllllllIlIl.getWorldBorder().contains(llllllllllllIlllIIlIIlllllllIlII) ? 1 : 0)) {
            return BlockPistonBase.llIIlIIlIllIll[0] != 0;
        }
        if (!lIIIllIIlIIIlIIl(llllllllllllIlllIIlIIlllllllIlII.getY()) || (lIIIllIIlIIIIIIl(llllllllllllIlllIIlIIlllllllIIll, EnumFacing.DOWN) && !lIIIllIIIlllllIl(llllllllllllIlllIIlIIlllllllIlII.getY()))) {
            return BlockPistonBase.llIIlIIlIllIll[0] != 0;
        }
        if (lIIIllIIlIIIlIlI(llllllllllllIlllIIlIIlllllllIlII.getY(), llllllllllllIlllIIlIIlllllllIlIl.getHeight() - BlockPistonBase.llIIlIIlIllIll[1]) && (!lIIIllIIlIIIIIIl(llllllllllllIlllIIlIIlllllllIIll, EnumFacing.UP) || lIIIllIIlIIIlIll(llllllllllllIlllIIlIIlllllllIlII.getY(), llllllllllllIlllIIlIIlllllllIlIl.getHeight() - BlockPistonBase.llIIlIIlIllIll[1]))) {
            if (lIIIllIIIllllllI(llllllllllllIlllIIlIIlllllllIllI, Blocks.piston) && lIIIllIIIllllllI(llllllllllllIlllIIlIIlllllllIllI, Blocks.sticky_piston)) {
                if (lIIIllIIIllllIll(lIIIllIIlIIIlIII(llllllllllllIlllIIlIIlllllllIllI.getBlockHardness(llllllllllllIlllIIlIIlllllllIlIl, llllllllllllIlllIIlIIlllllllIlII), -1.0f))) {
                    return BlockPistonBase.llIIlIIlIllIll[0] != 0;
                }
                if (lIIIllIIlIIIIIII(llllllllllllIlllIIlIIlllllllIllI.getMobilityFlag(), BlockPistonBase.llIIlIIlIllIll[2])) {
                    return BlockPistonBase.llIIlIIlIllIll[0] != 0;
                }
                if (lIIIllIIlIIIIIII(llllllllllllIlllIIlIIlllllllIllI.getMobilityFlag(), BlockPistonBase.llIIlIIlIllIll[1])) {
                    if (lIIIllIIIllllIll(llllllllllllIlllIIlIIlllllllIIlI ? 1 : 0)) {
                        return BlockPistonBase.llIIlIIlIllIll[0] != 0;
                    }
                    return BlockPistonBase.llIIlIIlIllIll[1] != 0;
                }
            }
            else if (lIIIllIIIlllllIl(((boolean)llllllllllllIlllIIlIIlllllllIlIl.getBlockState(llllllllllllIlllIIlIIlllllllIlII).getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
                return BlockPistonBase.llIIlIIlIllIll[0] != 0;
            }
            int n;
            if (lIIIllIIIlllllIl((llllllllllllIlllIIlIIlllllllIllI instanceof ITileEntityProvider) ? 1 : 0)) {
                n = BlockPistonBase.llIIlIIlIllIll[0];
                "".length();
                if (null != null) {
                    return ((0xA ^ 0x19) & ~(0xA2 ^ 0xB1)) != 0x0;
                }
            }
            else {
                n = BlockPistonBase.llIIlIIlIllIll[1];
            }
            return n != 0;
        }
        return BlockPistonBase.llIIlIIlIllIll[0] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllIIlIIllllIlIllII) {
        int llllllllllllIlllIIlIIllllIlIllIl = BlockPistonBase.llIIlIIlIllIll[0];
        llllllllllllIlllIIlIIllllIlIllIl |= llllllllllllIlllIIlIIllllIlIllII.getValue((IProperty<EnumFacing>)BlockPistonBase.FACING).getIndex();
        if (lIIIllIIIlllllIl(((boolean)llllllllllllIlllIIlIIllllIlIllII.getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
            llllllllllllIlllIIlIIllllIlIllIl |= BlockPistonBase.llIIlIIlIllIll[7];
        }
        return llllllllllllIlllIIlIIllllIlIllIl;
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIlllIIlIlIIIlIlIllII, final BlockPos llllllllllllIlllIIlIlIIIlIlIllll, final IBlockState llllllllllllIlllIIlIlIIIlIlIlllI) {
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIlIlIllII.isRemote ? 1 : 0) && lIIIllIIIlllllII(llllllllllllIlllIIlIlIIIlIlIllII.getTileEntity(llllllllllllIlllIIlIlIIIlIlIllll))) {
            this.checkForMove(llllllllllllIlllIIlIlIIIlIlIllII, llllllllllllIlllIIlIlIIIlIlIllll, llllllllllllIlllIIlIlIIIlIlIlllI);
        }
    }
    
    @Override
    public IBlockState getStateForEntityRender(final IBlockState llllllllllllIlllIIlIIllllIlllIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonBase.FACING, EnumFacing.UP);
    }
    
    private void checkForMove(final World llllllllllllIlllIIlIlIIIlIIIlIll, final BlockPos llllllllllllIlllIIlIlIIIlIIIlIlI, final IBlockState llllllllllllIlllIIlIlIIIlIIIllll) {
        final EnumFacing llllllllllllIlllIIlIlIIIlIIIlllI = llllllllllllIlllIIlIlIIIlIIIllll.getValue((IProperty<EnumFacing>)BlockPistonBase.FACING);
        final boolean llllllllllllIlllIIlIlIIIlIIIllIl = this.shouldBeExtended(llllllllllllIlllIIlIlIIIlIIIlIll, llllllllllllIlllIIlIlIIIlIIIlIlI, llllllllllllIlllIIlIlIIIlIIIlllI);
        if (lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIlIIIllIl ? 1 : 0) && lIIIllIIIllllIll(((boolean)llllllllllllIlllIIlIlIIIlIIIllll.getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
            if (lIIIllIIIlllllIl(new BlockPistonStructureHelper(llllllllllllIlllIIlIlIIIlIIIlIll, llllllllllllIlllIIlIlIIIlIIIlIlI, llllllllllllIlllIIlIlIIIlIIIlllI, (boolean)(BlockPistonBase.llIIlIIlIllIll[1] != 0)).canMove() ? 1 : 0)) {
                llllllllllllIlllIIlIlIIIlIIIlIll.addBlockEvent(llllllllllllIlllIIlIlIIIlIIIlIlI, this, BlockPistonBase.llIIlIIlIllIll[0], llllllllllllIlllIIlIlIIIlIIIlllI.getIndex());
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
            }
        }
        else if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIlIIIllIl ? 1 : 0) && lIIIllIIIlllllIl(((boolean)llllllllllllIlllIIlIlIIIlIIIllll.getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
            llllllllllllIlllIIlIlIIIlIIIlIll.setBlockState(llllllllllllIlllIIlIlIIIlIIIlIlI, llllllllllllIlllIIlIlIIIlIIIllll.withProperty((IProperty<Comparable>)BlockPistonBase.EXTENDED, (boolean)(BlockPistonBase.llIIlIIlIllIll[0] != 0)), BlockPistonBase.llIIlIIlIllIll[2]);
            "".length();
            llllllllllllIlllIIlIlIIIlIIIlIll.addBlockEvent(llllllllllllIlllIIlIlIIIlIIIlIlI, this, BlockPistonBase.llIIlIIlIllIll[1], llllllllllllIlllIIlIlIIIlIIIlllI.getIndex());
        }
    }
    
    private static boolean lIIIllIIlIIIlIlI(final int llllllllllllIlllIIlIIllllIIIIIIl, final int llllllllllllIlllIIlIIllllIIIIIII) {
        return llllllllllllIlllIIlIIllllIIIIIIl <= llllllllllllIlllIIlIIllllIIIIIII;
    }
    
    private boolean shouldBeExtended(final World llllllllllllIlllIIlIlIIIIlllIlll, final BlockPos llllllllllllIlllIIlIlIIIIlllIllI, final EnumFacing llllllllllllIlllIIlIlIIIIlllIlIl) {
        long llllllllllllIlllIIlIlIIIIlllIIIl;
        double llllllllllllIlllIIlIlIIIIlllIIlI = ((EnumFacing[])(Object)(llllllllllllIlllIIlIlIIIIlllIIIl = (long)(Object)EnumFacing.values())).length;
        double llllllllllllIlllIIlIlIIIIlllIIll = BlockPistonBase.llIIlIIlIllIll[0];
        "".length();
        if ("  ".length() >= "   ".length()) {
            return ((74 + 108 - 178 + 135 ^ 151 + 151 - 227 + 91) & (0xB1 ^ 0xA9 ^ (0x96 ^ 0xA3) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllIIIlllllll((int)llllllllllllIlllIIlIlIIIIlllIIll, (int)llllllllllllIlllIIlIlIIIIlllIIlI)) {
            final EnumFacing llllllllllllIlllIIlIlIIIIllllIlI = llllllllllllIlllIIlIlIIIIlllIIIl[llllllllllllIlllIIlIlIIIIlllIIll];
            if (lIIIllIIIllllllI(llllllllllllIlllIIlIlIIIIllllIlI, llllllllllllIlllIIlIlIIIIlllIlIl) && lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIIlllIlll.isSidePowered(llllllllllllIlllIIlIlIIIIlllIllI.offset(llllllllllllIlllIIlIlIIIIllllIlI), llllllllllllIlllIIlIlIIIIllllIlI) ? 1 : 0)) {
                return BlockPistonBase.llIIlIIlIllIll[1] != 0;
            }
            ++llllllllllllIlllIIlIlIIIIlllIIll;
        }
        if (lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIIlllIlll.isSidePowered(llllllllllllIlllIIlIlIIIIlllIllI, EnumFacing.DOWN) ? 1 : 0)) {
            return BlockPistonBase.llIIlIIlIllIll[1] != 0;
        }
        final BlockPos llllllllllllIlllIIlIlIIIIllllIIl = llllllllllllIlllIIlIlIIIIlllIllI.up();
        final byte llllllllllllIlllIIlIlIIIIlllIIII;
        llllllllllllIlllIIlIlIIIIlllIIIl = ((EnumFacing[])(Object)(llllllllllllIlllIIlIlIIIIlllIIII = (byte)(Object)EnumFacing.values())).length;
        llllllllllllIlllIIlIlIIIIlllIIlI = BlockPistonBase.llIIlIIlIllIll[0];
        "".length();
        if (((0x50 ^ 0xA) & ~(0x3E ^ 0x64)) > ((0x52 ^ 0x30) & ~(0x1C ^ 0x7E))) {
            return ((0xB ^ 0x68) & ~(0xD4 ^ 0xB7)) != 0x0;
        }
        while (!lIIIllIIIlllllll((int)llllllllllllIlllIIlIlIIIIlllIIlI, (int)llllllllllllIlllIIlIlIIIIlllIIIl)) {
            final EnumFacing llllllllllllIlllIIlIlIIIIllllIII = llllllllllllIlllIIlIlIIIIlllIIII[llllllllllllIlllIIlIlIIIIlllIIlI];
            if (lIIIllIIIllllllI(llllllllllllIlllIIlIlIIIIllllIII, EnumFacing.DOWN) && lIIIllIIIlllllIl(llllllllllllIlllIIlIlIIIIlllIlll.isSidePowered(llllllllllllIlllIIlIlIIIIllllIIl.offset(llllllllllllIlllIIlIlIIIIllllIII), llllllllllllIlllIIlIlIIIIllllIII) ? 1 : 0)) {
                return BlockPistonBase.llIIlIIlIllIll[1] != 0;
            }
            ++llllllllllllIlllIIlIlIIIIlllIIlI;
        }
        return BlockPistonBase.llIIlIIlIllIll[0] != 0;
    }
    
    private static boolean lIIIllIIIllllllI(final Object llllllllllllIlllIIlIIlllIllllIIl, final Object llllllllllllIlllIIlIIlllIllllIII) {
        return llllllllllllIlllIIlIIlllIllllIIl != llllllllllllIlllIIlIIlllIllllIII;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPistonBase.llIIlIIlIllIll[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonBase.llIIlIIlIllIll[0]] = BlockPistonBase.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonBase.llIIlIIlIllIll[1]] = BlockPistonBase.EXTENDED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlllIIlIlIIIlIllllIl, final BlockPos llllllllllllIlllIIlIlIIIlIllIlll, final IBlockState llllllllllllIlllIIlIlIIIlIlllIll, final Block llllllllllllIlllIIlIlIIIlIlllIlI) {
        if (lIIIllIIIllllIll(llllllllllllIlllIIlIlIIIlIllllIl.isRemote ? 1 : 0)) {
            this.checkForMove(llllllllllllIlllIIlIlIIIlIllllIl, llllllllllllIlllIIlIlIIIlIllIlll, llllllllllllIlllIIlIlIIIlIlllIll);
        }
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlllIIlIlIIIIIIlIlII, final BlockPos llllllllllllIlllIIlIlIIIIIIlIlll, final IBlockState llllllllllllIlllIIlIlIIIIIIlIIlI) {
        this.setBlockBoundsBasedOnState(llllllllllllIlllIIlIlIIIIIIlIlII, llllllllllllIlllIIlIlIIIIIIlIlll);
        return super.getCollisionBoundingBox(llllllllllllIlllIIlIlIIIIIIlIlII, llllllllllllIlllIIlIlIIIIIIlIlll, llllllllllllIlllIIlIlIIIIIIlIIlI);
    }
    
    private static boolean lIIIllIIlIIIIllI(final int llllllllllllIlllIIlIIlllIllIlIII) {
        return llllllllllllIlllIIlIIlllIllIlIII < 0;
    }
}
