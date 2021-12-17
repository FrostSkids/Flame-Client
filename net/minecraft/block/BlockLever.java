// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyBool;

public class BlockLever extends Block
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public static final /* synthetic */ PropertyBool POWERED;
    private static final /* synthetic */ int[] lIlIIlllllllll;
    private static final /* synthetic */ String[] lIlIIllllllIll;
    public static final /* synthetic */ PropertyEnum<EnumOrientation> FACING;
    
    private static boolean lllIlIlIIllIlll(final Object lllllllllllllIIIlIllIIlllllllIlI) {
        return lllllllllllllIIIlIllIIlllllllIlI != null;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIlIllIlIIIlIIIIIl) {
        final IBlockState withProperty = this.getDefaultState().withProperty(BlockLever.FACING, EnumOrientation.byMetadata(lllllllllllllIIIlIllIlIIIlIIIIIl & BlockLever.lIlIIlllllllll[8]));
        final PropertyBool powered = BlockLever.POWERED;
        int b;
        if (lllIlIlIIllIllI(lllllllllllllIIIlIllIlIIIlIIIIIl & BlockLever.lIlIIlllllllll[9])) {
            b = BlockLever.lIlIIlllllllll[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b = BlockLever.lIlIIlllllllll[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
    }
    
    private static boolean lllIlIlIIllIIlI(final Object lllllllllllllIIIlIllIlIIIIIIIIIl, final Object lllllllllllllIIIlIllIlIIIIIIIIII) {
        return lllllllllllllIIIlIllIlIIIIIIIIIl != lllllllllllllIIIlIllIlIIIIIIIIII;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIlIllIlIIlIIlIIll, final BlockPos lllllllllllllIIIlIllIlIIlIIlIlll, final IBlockState lllllllllllllIIIlIllIlIIlIIlIllI, final Block lllllllllllllIIIlIllIlIIlIIlIlIl) {
        if (lllIlIlIIllIIII(this.func_181091_e(lllllllllllllIIIlIllIlIIlIIlIIll, lllllllllllllIIIlIllIlIIlIIlIlll, lllllllllllllIIIlIllIlIIlIIlIllI) ? 1 : 0) && lllIlIlIIllIIll(func_181090_a(lllllllllllllIIIlIllIlIIlIIlIIll, lllllllllllllIIIlIllIlIIlIIlIlll, lllllllllllllIIIlIllIlIIlIIlIllI.getValue(BlockLever.FACING).getFacing().getOpposite()) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIIIlIllIlIIlIIlIIll, lllllllllllllIIIlIllIlIIlIIlIlll, lllllllllllllIIIlIllIlIIlIIlIllI, BlockLever.lIlIIlllllllll[0]);
            lllllllllllllIIIlIllIlIIlIIlIIll.setBlockToAir(lllllllllllllIIIlIllIlIIlIIlIlll);
            "".length();
        }
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIlIllIlIIIlllIIlI, final BlockPos lllllllllllllIIIlIllIlIIIllIIlll, IBlockState lllllllllllllIIIlIllIlIIIllIIllI, final EntityPlayer lllllllllllllIIIlIllIlIIIllIllll, final EnumFacing lllllllllllllIIIlIllIlIIIllIlllI, final float lllllllllllllIIIlIllIlIIIllIllIl, final float lllllllllllllIIIlIllIlIIIllIllII, final float lllllllllllllIIIlIllIlIIIllIlIll) {
        if (lllIlIlIIllIIII(lllllllllllllIIIlIllIlIIIlllIIlI.isRemote ? 1 : 0)) {
            return BlockLever.lIlIIlllllllll[1] != 0;
        }
        lllllllllllllIIIlIllIlIIIllIIllI = (byte)((IBlockState)lllllllllllllIIIlIllIlIIIllIIllI).cycleProperty((IProperty<Comparable>)BlockLever.POWERED);
        lllllllllllllIIIlIllIlIIIlllIIlI.setBlockState(lllllllllllllIIIlIllIlIIIllIIlll, (IBlockState)lllllllllllllIIIlIllIlIIIllIIllI, BlockLever.lIlIIlllllllll[4]);
        "".length();
        final double lllllllllllllIIIlIIllllIlIIIlllI = lllllllllllllIIIlIllIlIIIllIIlll.getX() + 0.5;
        final double lllllllllllllIIIlIIllllIlIIIllIl = lllllllllllllIIIlIllIlIIIllIIlll.getY() + 0.5;
        final double lllllllllllllIIIlIIllllIlIIlIlII = lllllllllllllIIIlIllIlIIIllIIlll.getZ() + 0.5;
        final String lllllllllllllIIIlIIllllIlIIlIIll = BlockLever.lIlIIllllllIll[BlockLever.lIlIIlllllllll[5]];
        final float lllllllllllllIIIlIIllllIlIIlIIlI = 0.3f;
        float lllllllllllllIIIlIIllllIlIIIlIIl;
        if (lllIlIlIIllIIII(((boolean)((IBlockState)lllllllllllllIIIlIllIlIIIllIIllI).getValue((IProperty<Boolean>)BlockLever.POWERED)) ? 1 : 0)) {
            lllllllllllllIIIlIIllllIlIIIlIIl = 0.6f;
            "".length();
            if (" ".length() > (0x8 ^ 0xC)) {
                return ((0xD4 ^ 0x9E) & ~(0x69 ^ 0x23)) != 0x0;
            }
        }
        else {
            lllllllllllllIIIlIIllllIlIIIlIIl = 0.5f;
        }
        lllllllllllllIIIlIllIlIIIlllIIlI.playSoundEffect(lllllllllllllIIIlIIllllIlIIIlllI, lllllllllllllIIIlIIllllIlIIIllIl, lllllllllllllIIIlIIllllIlIIlIlII, lllllllllllllIIIlIIllllIlIIlIIll, lllllllllllllIIIlIIllllIlIIlIIlI, lllllllllllllIIIlIIllllIlIIIlIIl);
        lllllllllllllIIIlIllIlIIIlllIIlI.notifyNeighborsOfStateChange(lllllllllllllIIIlIllIlIIIllIIlll, this);
        final EnumFacing lllllllllllllIIIlIllIlIIIllIlIlI = ((IBlockState)lllllllllllllIIIlIllIlIIIllIIllI).getValue(BlockLever.FACING).getFacing();
        lllllllllllllIIIlIllIlIIIlllIIlI.notifyNeighborsOfStateChange(lllllllllllllIIIlIllIlIIIllIIlll.offset(lllllllllllllIIIlIllIlIIIllIlIlI.getOpposite()), this);
        return BlockLever.lIlIIlllllllll[1] != 0;
    }
    
    private static boolean lllIlIlIIllIlII(final Object lllllllllllllIIIlIllIIllllllllIl, final Object lllllllllllllIIIlIllIIllllllllII) {
        return lllllllllllllIIIlIllIIllllllllIl == lllllllllllllIIIlIllIIllllllllII;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockLever$EnumOrientation() {
        final int[] $switch_TABLE$net$minecraft$block$BlockLever$EnumOrientation = BlockLever.$SWITCH_TABLE$net$minecraft$block$BlockLever$EnumOrientation;
        if (lllIlIlIIllIlll($switch_TABLE$net$minecraft$block$BlockLever$EnumOrientation)) {
            return $switch_TABLE$net$minecraft$block$BlockLever$EnumOrientation;
        }
        "".length();
        final byte lllllllllllllIIIlIllIlIIIIllIIIl = (Object)new int[EnumOrientation.values().length];
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.DOWN_X.ordinal()] = BlockLever.lIlIIlllllllll[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.DOWN_Z.ordinal()] = BlockLever.lIlIIlllllllll[9];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.EAST.ordinal()] = BlockLever.lIlIIlllllllll[5];
            "".length();
            if (((0x9 ^ 0x4F) & ~(0x34 ^ 0x72)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.NORTH.ordinal()] = BlockLever.lIlIIlllllllll[2];
            "".length();
            if (((0x11 ^ 0x4C) & ~(0x40 ^ 0x1D)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.SOUTH.ordinal()] = BlockLever.lIlIIlllllllll[3];
            "".length();
            if ("   ".length() <= ((0x3B ^ 0xC) & ~(0x91 ^ 0xA6))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.UP_X.ordinal()] = BlockLever.lIlIIlllllllll[8];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.UP_Z.ordinal()] = BlockLever.lIlIIlllllllll[10];
            "".length();
            if ((0x46 ^ 0x42) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIIl[EnumOrientation.WEST.ordinal()] = BlockLever.lIlIIlllllllll[4];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        return BlockLever.$SWITCH_TABLE$net$minecraft$block$BlockLever$EnumOrientation = (int[])(Object)lllllllllllllIIIlIllIlIIIIllIIIl;
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockLever.lIlIIlllllllll[1] != 0;
    }
    
    private static boolean lllIlIlIIllIllI(final int lllllllllllllIIIlIllIIllllllIlII) {
        return lllllllllllllIIIlIllIIllllllIlII > 0;
    }
    
    private static boolean lllIlIlIIllIIIl(final int lllllllllllllIIIlIllIlIIIIIIlIIl, final int lllllllllllllIIIlIllIlIIIIIIlIII) {
        return lllllllllllllIIIlIllIlIIIIIIlIIl >= lllllllllllllIIIlIllIlIIIIIIlIII;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIlIllIlIIlllIIIll, final BlockPos lllllllllllllIIIlIllIlIIlllIIIlI, final IBlockState lllllllllllllIIIlIllIlIIlllIIIIl) {
        return null;
    }
    
    private static String lllIlIlIIlIlIII(String lllllllllllllIIIlIllIlIIIIIlIlII, final String lllllllllllllIIIlIllIlIIIIIllIII) {
        lllllllllllllIIIlIllIlIIIIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllIlIIIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIIIlIllIlIIIIIlIllI = lllllllllllllIIIlIllIlIIIIIllIII.toCharArray();
        int lllllllllllllIIIlIllIlIIIIIlIlIl = BlockLever.lIlIIlllllllll[0];
        final double lllllllllllllIIIlIllIlIIIIIIllll = (Object)lllllllllllllIIIlIllIlIIIIIlIlII.toCharArray();
        final char lllllllllllllIIIlIllIlIIIIIIlllI = (char)lllllllllllllIIIlIllIlIIIIIIllll.length;
        float lllllllllllllIIIlIllIlIIIIIIllIl = BlockLever.lIlIIlllllllll[0];
        while (lllIlIlIIlllIII((int)lllllllllllllIIIlIllIlIIIIIIllIl, lllllllllllllIIIlIllIlIIIIIIlllI)) {
            final char lllllllllllllIIIlIllIlIIIIIllIlI = lllllllllllllIIIlIllIlIIIIIIllll[lllllllllllllIIIlIllIlIIIIIIllIl];
            lllllllllllllIIIlIllIlIIIIIlIlll.append((char)(lllllllllllllIIIlIllIlIIIIIllIlI ^ lllllllllllllIIIlIllIlIIIIIlIllI[lllllllllllllIIIlIllIlIIIIIlIlIl % lllllllllllllIIIlIllIlIIIIIlIllI.length]));
            "".length();
            ++lllllllllllllIIIlIllIlIIIIIlIlIl;
            ++lllllllllllllIIIlIllIlIIIIIIllIl;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllIlIIIIIlIlll);
    }
    
    private static void lllIlIlIIlIlllI() {
        (lIlIIlllllllll = new int[11])[0] = ((0xB1 ^ 0x9C) & ~(0x7C ^ 0x51));
        BlockLever.lIlIIlllllllll[1] = " ".length();
        BlockLever.lIlIIlllllllll[2] = (0xA0 ^ 0x87 ^ (0x60 ^ 0x42));
        BlockLever.lIlIIlllllllll[3] = (0x32 ^ 0x36);
        BlockLever.lIlIIlllllllll[4] = "   ".length();
        BlockLever.lIlIIlllllllll[5] = "  ".length();
        BlockLever.lIlIIlllllllll[6] = -" ".length();
        BlockLever.lIlIIlllllllll[7] = (0xA8 ^ 0xA7);
        BlockLever.lIlIIlllllllll[8] = (0x2A ^ 0x2D);
        BlockLever.lIlIIlllllllll[9] = (0x50 ^ 0x58);
        BlockLever.lIlIIlllllllll[10] = (0x22 ^ 0x24);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIlIllIlIIIIlllIll) {
        int lllllllllllllIIIlIllIlIIIIlllIlI = BlockLever.lIlIIlllllllll[0];
        lllllllllllllIIIlIllIlIIIIlllIlI |= lllllllllllllIIIlIllIlIIIIlllIll.getValue(BlockLever.FACING).getMetadata();
        if (lllIlIlIIllIIII(((boolean)lllllllllllllIIIlIllIlIIIIlllIll.getValue((IProperty<Boolean>)BlockLever.POWERED)) ? 1 : 0)) {
            lllllllllllllIIIlIllIlIIIIlllIlI |= BlockLever.lIlIIlllllllll[9];
        }
        return lllllllllllllIIIlIllIlIIIIlllIlI;
    }
    
    static {
        lllIlIlIIlIlllI();
        lllIlIlIIlIlIlI();
        FACING = PropertyEnum.create(BlockLever.lIlIIllllllIll[BlockLever.lIlIIlllllllll[0]], EnumOrientation.class);
        POWERED = PropertyBool.create(BlockLever.lIlIIllllllIll[BlockLever.lIlIIlllllllll[1]]);
    }
    
    public static int getMetadataForFacing(final EnumFacing lllllllllllllIIIlIllIlIIlIIlllll) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIIlIllIlIIlIIlllll.ordinal()]) {
            case 1: {
                return BlockLever.lIlIIlllllllll[0];
            }
            case 2: {
                return BlockLever.lIlIIlllllllll[2];
            }
            case 3: {
                return BlockLever.lIlIIlllllllll[3];
            }
            case 4: {
                return BlockLever.lIlIIlllllllll[4];
            }
            case 5: {
                return BlockLever.lIlIIlllllllll[5];
            }
            case 6: {
                return BlockLever.lIlIIlllllllll[1];
            }
            default: {
                return BlockLever.lIlIIlllllllll[6];
            }
        }
    }
    
    private static String lllIlIlIIlIlIIl(final String lllllllllllllIIIlIllIlIIIIlIIlll, final String lllllllllllllIIIlIllIlIIIIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIlIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIlIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIllIlIIIIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIllIlIIIIlIlIll.init(BlockLever.lIlIIlllllllll[5], lllllllllllllIIIlIllIlIIIIlIllII);
            return new String(lllllllllllllIIIlIllIlIIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIlIIIIlIlIlI) {
            lllllllllllllIIIlIllIlIIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    protected BlockLever() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockLever.FACING, EnumOrientation.NORTH).withProperty((IProperty<Comparable>)BlockLever.POWERED, (boolean)(BlockLever.lIlIIlllllllll[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    private static boolean lllIlIlIIlllIII(final int lllllllllllllIIIlIllIlIIIIIIIlIl, final int lllllllllllllIIIlIllIlIIIIIIIlII) {
        return lllllllllllllIIIlIllIlIIIIIIIlIl < lllllllllllllIIIlIllIlIIIIIIIlII;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIIlIllIlIIlIllIIlI, final BlockPos lllllllllllllIIIlIllIlIIlIlIIllI, final EnumFacing lllllllllllllIIIlIllIlIIlIllIIII, final float lllllllllllllIIIlIllIlIIlIlIllll, final float lllllllllllllIIIlIllIlIIlIlIlllI, final float lllllllllllllIIIlIllIlIIlIlIllIl, final int lllllllllllllIIIlIllIlIIlIlIllII, final EntityLivingBase lllllllllllllIIIlIllIlIIlIlIlIll) {
        final IBlockState lllllllllllllIIIlIllIlIIlIlIlIlI = this.getDefaultState().withProperty((IProperty<Comparable>)BlockLever.POWERED, (boolean)(BlockLever.lIlIIlllllllll[0] != 0));
        if (lllIlIlIIllIIII(func_181090_a(lllllllllllllIIIlIllIlIIlIllIIlI, lllllllllllllIIIlIllIlIIlIlIIllI, lllllllllllllIIIlIllIlIIlIllIIII.getOpposite()) ? 1 : 0)) {
            return lllllllllllllIIIlIllIlIIlIlIlIlI.withProperty(BlockLever.FACING, EnumOrientation.forFacings(lllllllllllllIIIlIllIlIIlIllIIII, lllllllllllllIIIlIllIlIIlIlIlIll.getHorizontalFacing()));
        }
        final float lllllllllllllIIIlIllIlIIlIlIIIIl = (float)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ("  ".length() <= " ".length()) {
            return null;
        }
        while (!lllIlIlIIllIIll(((Iterator)lllllllllllllIIIlIllIlIIlIlIIIIl).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIlIllIlIIlIlIlIIl = ((Iterator<EnumFacing>)lllllllllllllIIIlIllIlIIlIlIIIIl).next();
            if (lllIlIlIIllIIlI(lllllllllllllIIIlIllIlIIlIlIlIIl, lllllllllllllIIIlIllIlIIlIllIIII) && lllIlIlIIllIIII(func_181090_a(lllllllllllllIIIlIllIlIIlIllIIlI, lllllllllllllIIIlIllIlIIlIlIIllI, lllllllllllllIIIlIllIlIIlIlIlIIl.getOpposite()) ? 1 : 0)) {
                return lllllllllllllIIIlIllIlIIlIlIlIlI.withProperty(BlockLever.FACING, EnumOrientation.forFacings(lllllllllllllIIIlIllIlIIlIlIlIIl, lllllllllllllIIIlIllIlIIlIlIlIll.getHorizontalFacing()));
            }
        }
        if (lllIlIlIIllIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIlIllIlIIlIllIIlI, lllllllllllllIIIlIllIlIIlIlIIllI.down()) ? 1 : 0)) {
            return lllllllllllllIIIlIllIlIIlIlIlIlI.withProperty(BlockLever.FACING, EnumOrientation.forFacings(EnumFacing.UP, lllllllllllllIIIlIllIlIIlIlIlIll.getHorizontalFacing()));
        }
        return lllllllllllllIIIlIllIlIIlIlIlIlI;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockLever.lIlIIlllllllll[0] != 0;
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIIIlIllIlIIIlIlIIll, final BlockPos lllllllllllllIIIlIllIlIIIlIlIIlI, final IBlockState lllllllllllllIIIlIllIlIIIlIIllll, final EnumFacing lllllllllllllIIIlIllIlIIIlIlIIII) {
        int n;
        if (lllIlIlIIllIIII(((boolean)lllllllllllllIIIlIllIlIIIlIIllll.getValue((IProperty<Boolean>)BlockLever.POWERED)) ? 1 : 0)) {
            n = BlockLever.lIlIIlllllllll[7];
            "".length();
            if (" ".length() != " ".length()) {
                return (0x9E ^ 0xA6) & ~(0x93 ^ 0xAB);
            }
        }
        else {
            n = BlockLever.lIlIIlllllllll[0];
        }
        return n;
    }
    
    private static boolean lllIlIlIIllIIll(final int lllllllllllllIIIlIllIIllllllIllI) {
        return lllllllllllllIIIlIllIIllllllIllI == 0;
    }
    
    protected static boolean func_181090_a(final World lllllllllllllIIIlIllIlIIllIIIIIl, final BlockPos lllllllllllllIIIlIllIlIIllIIIIII, final EnumFacing lllllllllllllIIIlIllIlIIlIllllII) {
        return BlockButton.func_181088_a(lllllllllllllIIIlIllIlIIllIIIIIl, lllllllllllllIIIlIllIlIIllIIIIII, lllllllllllllIIIlIllIlIIlIllllII);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockLever.lIlIIlllllllll[0] != 0;
    }
    
    private static boolean lllIlIlIIllIIII(final int lllllllllllllIIIlIllIIlllllllIII) {
        return lllllllllllllIIIlIllIIlllllllIII != 0;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIIlIllIlIIllIIlIlI, final BlockPos lllllllllllllIIIlIllIlIIllIIllII) {
        final int lllllllllllllIIIlIllIlIIllIIIlIl;
        final Exception lllllllllllllIIIlIllIlIIllIIIllI = (Exception)((EnumFacing[])(Object)(lllllllllllllIIIlIllIlIIllIIIlIl = (int)(Object)EnumFacing.values())).length;
        double lllllllllllllIIIlIllIlIIllIIIlll = BlockLever.lIlIIlllllllll[0];
        "".length();
        if (null != null) {
            return ((0xC5 ^ 0x9E ^ (0xDE ^ 0x9B)) & (76 + 68 - 117 + 124 ^ 78 + 49 - 65 + 75 ^ -" ".length())) != 0x0;
        }
        while (!lllIlIlIIllIIIl((int)lllllllllllllIIIlIllIlIIllIIIlll, (int)lllllllllllllIIIlIllIlIIllIIIllI)) {
            final EnumFacing lllllllllllllIIIlIllIlIIllIIlIll = lllllllllllllIIIlIllIlIIllIIIlIl[lllllllllllllIIIlIllIlIIllIIIlll];
            if (lllIlIlIIllIIII(func_181090_a(lllllllllllllIIIlIllIlIIllIIlIlI, lllllllllllllIIIlIllIlIIllIIllII, lllllllllllllIIIlIllIlIIllIIlIll) ? 1 : 0)) {
                return BlockLever.lIlIIlllllllll[1] != 0;
            }
            ++lllllllllllllIIIlIllIlIIllIIIlll;
        }
        return BlockLever.lIlIIlllllllll[0] != 0;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIIlIllIlIIIlIllllI, final BlockPos lllllllllllllIIIlIllIlIIIlIlllIl, final IBlockState lllllllllllllIIIlIllIlIIIlIlllII) {
        if (lllIlIlIIllIIII(((boolean)lllllllllllllIIIlIllIlIIIlIlllII.getValue((IProperty<Boolean>)BlockLever.POWERED)) ? 1 : 0)) {
            lllllllllllllIIIlIllIlIIIlIllllI.notifyNeighborsOfStateChange(lllllllllllllIIIlIllIlIIIlIlllIl, this);
            final EnumFacing lllllllllllllIIIlIllIlIIIlIllIll = lllllllllllllIIIlIllIlIIIlIlllII.getValue(BlockLever.FACING).getFacing();
            lllllllllllllIIIlIllIlIIIlIllllI.notifyNeighborsOfStateChange(lllllllllllllIIIlIllIlIIIlIlllIl.offset(lllllllllllllIIIlIllIlIIIlIllIll.getOpposite()), this);
        }
        super.breakBlock(lllllllllllllIIIlIllIlIIIlIllllI, lllllllllllllIIIlIllIlIIIlIlllIl, lllllllllllllIIIlIllIlIIIlIlllII);
    }
    
    private static void lllIlIlIIlIlIlI() {
        (lIlIIllllllIll = new String[BlockLever.lIlIIlllllllll[4]])[BlockLever.lIlIIlllllllll[0]] = lllIlIlIIlIlIII("FyQIMRgW", "qEkXv");
        BlockLever.lIlIIllllllIll[BlockLever.lIlIIlllllllll[1]] = lllIlIlIIlIlIIl("3s1T3dJm9Xk=", "xVEjY");
        BlockLever.lIlIIllllllIll[BlockLever.lIlIIlllllllll[5]] = lllIlIlIIlIlIII("IhsnCgQ9VCoCAjMR", "PzInk");
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIIIlIllIlIIllIlIlll, final BlockPos lllllllllllllIIIlIllIlIIllIlIllI, final EnumFacing lllllllllllllIIIlIllIlIIllIlIlIl) {
        return func_181090_a(lllllllllllllIIIlIllIlIIllIlIlll, lllllllllllllIIIlIllIlIIllIlIllI, lllllllllllllIIIlIllIlIIllIlIlIl.getOpposite());
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIIIlIllIlIIIlIIlIll, final BlockPos lllllllllllllIIIlIllIlIIIlIIlIlI, final IBlockState lllllllllllllIIIlIllIlIIIlIIIlll, final EnumFacing lllllllllllllIIIlIllIlIIIlIIIllI) {
        int n;
        if (lllIlIlIIllIIll(((boolean)lllllllllllllIIIlIllIlIIIlIIIlll.getValue((IProperty<Boolean>)BlockLever.POWERED)) ? 1 : 0)) {
            n = BlockLever.lIlIIlllllllll[0];
            "".length();
            if ((0xA7 ^ 0xB5 ^ (0xB ^ 0x1D)) == 0x0) {
                return (0xA3 ^ 0x8B ^ (0xEB ^ 0x8F)) & (0x90 ^ 0x8C ^ (0x39 ^ 0x69) ^ -" ".length());
            }
        }
        else if (lllIlIlIIllIlII(lllllllllllllIIIlIllIlIIIlIIIlll.getValue(BlockLever.FACING).getFacing(), lllllllllllllIIIlIllIlIIIlIIIllI)) {
            n = BlockLever.lIlIIlllllllll[7];
            "".length();
            if ((0x8F ^ 0x8B) <= 0) {
                return (0x38 ^ 0x2F) & ~(0xA8 ^ 0xBF);
            }
        }
        else {
            n = BlockLever.lIlIIlllllllll[0];
        }
        return n;
    }
    
    private boolean func_181091_e(final World lllllllllllllIIIlIllIlIIlIIIIlll, final BlockPos lllllllllllllIIIlIllIlIIlIIIIllI, final IBlockState lllllllllllllIIIlIllIlIIlIIIlIIl) {
        if (lllIlIlIIllIIII(this.canPlaceBlockAt(lllllllllllllIIIlIllIlIIlIIIIlll, lllllllllllllIIIlIllIlIIlIIIIllI) ? 1 : 0)) {
            return BlockLever.lIlIIlllllllll[1] != 0;
        }
        this.dropBlockAsItem(lllllllllllllIIIlIllIlIIlIIIIlll, lllllllllllllIIIlIllIlIIlIIIIllI, lllllllllllllIIIlIllIlIIlIIIlIIl, BlockLever.lIlIIlllllllll[0]);
        lllllllllllllIIIlIllIlIIlIIIIlll.setBlockToAir(lllllllllllllIIIlIllIlIIlIIIIllI);
        "".length();
        return BlockLever.lIlIIlllllllll[0] != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockLever.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lllIlIlIIllIlll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final long lllllllllllllIIIlIllIlIIIIllIIll = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIIlIllIlIIIIllIIll[EnumFacing.DOWN.ordinal()] = BlockLever.lIlIIlllllllll[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIll[EnumFacing.EAST.ordinal()] = BlockLever.lIlIIlllllllll[10];
            "".length();
            if (((0xCE ^ 0xBD ^ (0xF5 ^ 0x90)) & (0x57 ^ 0x4A ^ (0x4 ^ 0xF) ^ -" ".length())) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIll[EnumFacing.NORTH.ordinal()] = BlockLever.lIlIIlllllllll[4];
            "".length();
            if (((0xC0 ^ 0x9E) & ~(0xC6 ^ 0x98)) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIll[EnumFacing.SOUTH.ordinal()] = BlockLever.lIlIIlllllllll[3];
            "".length();
            if ((70 + 26 - 87 + 149 ^ 56 + 10 - 52 + 140) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIll[EnumFacing.UP.ordinal()] = BlockLever.lIlIIlllllllll[5];
            "".length();
            if ((0x9D ^ 0x99) < "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIlIllIlIIIIllIIll[EnumFacing.WEST.ordinal()] = BlockLever.lIlIIlllllllll[2];
            "".length();
            if ((0x83 ^ 0x86) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockLever.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIlIllIlIIIIllIIll;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIlIllIlIIIlllllll, final BlockPos lllllllllllllIIIlIllIlIIIllllIlI) {
        float lllllllllllllIIIlIllIlIIIlllllIl = 0.1875f;
        switch ($SWITCH_TABLE$net$minecraft$block$BlockLever$EnumOrientation()[lllllllllllllIIIlIllIlIIIlllllll.getBlockState(lllllllllllllIIIlIllIlIIIllllIlI).getValue(BlockLever.FACING).ordinal()]) {
            case 2: {
                this.setBlockBounds(0.0f, 0.2f, 0.5f - lllllllllllllIIIlIllIlIIIlllllIl, lllllllllllllIIIlIllIlIIIlllllIl * 2.0f, 0.8f, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl);
                "".length();
                if (-" ".length() >= ((0x62 ^ 0x25) & ~(0xEA ^ 0xAD))) {
                    return;
                }
                break;
            }
            case 3: {
                this.setBlockBounds(1.0f - lllllllllllllIIIlIllIlIIIlllllIl * 2.0f, 0.2f, 0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 1.0f, 0.8f, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl);
                "".length();
                if (((0x72 ^ 0x3A ^ (0x96 ^ 0x9A)) & (0x90 ^ 0xC0 ^ (0x86 ^ 0x92) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 4: {
                this.setBlockBounds(0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 0.2f, 0.0f, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl, 0.8f, lllllllllllllIIIlIllIlIIIlllllIl * 2.0f);
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 0.2f, 1.0f - lllllllllllllIIIlIllIlIIIlllllIl * 2.0f, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl, 0.8f, 1.0f);
                "".length();
                if (((0x9D ^ 0x96) & ~(0x4C ^ 0x47)) == "   ".length()) {
                    return;
                }
                break;
            }
            case 6:
            case 7: {
                lllllllllllllIIIlIllIlIIIlllllIl = 0.25f;
                this.setBlockBounds(0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 0.0f, 0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl, 0.6f, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 1:
            case 8: {
                lllllllllllllIIIlIllIlIIIlllllIl = 0.25f;
                this.setBlockBounds(0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 0.4f, 0.5f - lllllllllllllIIIlIllIlIIIlllllIl, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl, 1.0f, 0.5f + lllllllllllllIIIlIllIlIIIlllllIl);
                break;
            }
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockLever.lIlIIlllllllll[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockLever.lIlIIlllllllll[0]] = BlockLever.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockLever.lIlIIlllllllll[1]] = BlockLever.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    public enum EnumOrientation implements IStringSerializable
    {
        EAST(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[2]], EnumOrientation.llIIIlIllIlIII[1], EnumOrientation.llIIIlIllIlIII[1], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[3]], EnumFacing.EAST);
        
        private static final /* synthetic */ EnumOrientation[] META_LOOKUP;
        
        DOWN_X(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[0]], EnumOrientation.llIIIlIllIlIII[0], EnumOrientation.llIIIlIllIlIII[0], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[1]], EnumFacing.DOWN);
        
        private static final /* synthetic */ int[] llIIIlIllIlIII;
        
        DOWN_Z(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[14]], EnumOrientation.llIIIlIllIlIII[7], EnumOrientation.llIIIlIllIlIII[7], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[15]], EnumFacing.DOWN), 
        UP_Z(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[10]], EnumOrientation.llIIIlIllIlIII[5], EnumOrientation.llIIIlIllIlIII[5], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[11]], EnumFacing.UP);
        
        private final /* synthetic */ String name;
        
        SOUTH(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[6]], EnumOrientation.llIIIlIllIlIII[3], EnumOrientation.llIIIlIllIlIII[3], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[7]], EnumFacing.SOUTH);
        
        private static final /* synthetic */ String[] llIIIlIIlIlIIl;
        private final /* synthetic */ int meta;
        
        WEST(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[4]], EnumOrientation.llIIIlIllIlIII[2], EnumOrientation.llIIIlIllIlIII[2], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[5]], EnumFacing.WEST);
        
        private final /* synthetic */ EnumFacing facing;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        
        UP_X(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[12]], EnumOrientation.llIIIlIllIlIII[6], EnumOrientation.llIIIlIllIlIII[6], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[13]], EnumFacing.UP), 
        NORTH(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[8]], EnumOrientation.llIIIlIllIlIII[4], EnumOrientation.llIIIlIllIlIII[4], EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[9]], EnumFacing.NORTH);
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static boolean lIIIlIIllIlIIIlI(final int llllllllllllIlllIlIlIlIlIllllIII) {
            return llllllllllllIlllIlIlIlIlIllllIII >= 0;
        }
        
        private static void lIIIlIIlIIIIIlII() {
            (llIIIlIIlIlIIl = new String[EnumOrientation.llIIIlIllIlIII[21]])[EnumOrientation.llIIIlIllIlIII[0]] = lIIIlIIlIIIIIIII("HgUUFD4C", "ZJCZa");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[1]] = lIIIlIIlIIIIIIIl("/1iLeoYd3t8=", "PVWOR");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[2]] = lIIIlIIlIIIIIIIl("NQpOHInWNAA=", "GFHCe");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[3]] = lIIIlIIlIIIIIIII("PzYAMw==", "ZWsGf");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[4]] = lIIIlIIlIIIIIIlI("qQWRIH2L/gw=", "yEUZt");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[5]] = lIIIlIIlIIIIIIII("NSo6EQ==", "BOIet");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[6]] = lIIIlIIlIIIIIIII("HSASMiE=", "NoGfi");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[7]] = lIIIlIIlIIIIIIII("EggEIRs=", "agqUs");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[8]] = lIIIlIIlIIIIIIII("LSs1PzI=", "cdgkz");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[9]] = lIIIlIIlIIIIIIIl("MiaBB6iSESI=", "Vsgrb");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[10]] = lIIIlIIlIIIIIIlI("qAhItCfKGV8=", "ddOCt");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[11]] = lIIIlIIlIIIIIIlI("2kOFIRVBju0=", "uxtSU");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[12]] = lIIIlIIlIIIIIIII("MigRHw==", "gxNGk");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[13]] = lIIIlIIlIIIIIIII("GQcVNg==", "lwJNy");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[14]] = lIIIlIIlIIIIIIIl("uuFpxPaWFz4=", "GVCrW");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[15]] = lIIIlIIlIIIIIIIl("OtwGERFQizU=", "YEFEE");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[16]] = lIIIlIIlIIIIIIlI("ZG0rGaCTBj431DfSU9Yoy7wriM7QmRow", "StOih");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[17]] = lIIIlIIlIIIIIIIl("al3rppSTLfW3f4rhVS6g0w==", "PDItO");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[18]] = lIIIlIIlIIIIIIlI("7nr70ABlfX95X60uSVg5CZScP1WORpL7", "SsTfe");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[19]] = lIIIlIIlIIIIIIIl("sJUE2ZtRn1RSEGRkMRkgvw==", "SaEoo");
            EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[20]] = lIIIlIIlIIIIIIlI("38bN9Es72HQhX9HVBtiog9rXnPtzQE3B", "PICdP");
        }
        
        private static boolean lIIIlIIllIlIIIIl(final int llllllllllllIlllIlIlIlIllIIIIIIl, final int llllllllllllIlllIlIlIlIllIIIIIII) {
            return llllllllllllIlllIlIlIlIllIIIIIIl >= llllllllllllIlllIlIlIlIllIIIIIII;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static void lIIIlIIllIlIIIII() {
            (llIIIlIllIlIII = new int[22])[0] = ((0xA9 ^ 0xA1 ^ (0x95 ^ 0x87)) & (96 + 66 - 149 + 115 ^ 107 + 151 - 253 + 149 ^ -" ".length()));
            EnumOrientation.llIIIlIllIlIII[1] = " ".length();
            EnumOrientation.llIIIlIllIlIII[2] = "  ".length();
            EnumOrientation.llIIIlIllIlIII[3] = "   ".length();
            EnumOrientation.llIIIlIllIlIII[4] = (0x84 ^ 0x92 ^ (0xBF ^ 0xAD));
            EnumOrientation.llIIIlIllIlIII[5] = (0x4D ^ 0x48);
            EnumOrientation.llIIIlIllIlIII[6] = (0xF5 ^ 0x93 ^ (0x38 ^ 0x58));
            EnumOrientation.llIIIlIllIlIII[7] = (0x98 ^ 0x9F);
            EnumOrientation.llIIIlIllIlIII[8] = (0xCA ^ 0xC2);
            EnumOrientation.llIIIlIllIlIII[9] = (0x9D ^ 0x94);
            EnumOrientation.llIIIlIllIlIII[10] = (0x8C ^ 0x96 ^ (0x12 ^ 0x2));
            EnumOrientation.llIIIlIllIlIII[11] = (0x1A ^ 0x7C ^ (0xF4 ^ 0x99));
            EnumOrientation.llIIIlIllIlIII[12] = (33 + 158 - 126 + 109 ^ 32 + 3 + 2 + 125);
            EnumOrientation.llIIIlIllIlIII[13] = (0xA2 ^ 0x95 ^ (0x6E ^ 0x54));
            EnumOrientation.llIIIlIllIlIII[14] = (0x58 ^ 0x56);
            EnumOrientation.llIIIlIllIlIII[15] = (0x4F ^ 0x40);
            EnumOrientation.llIIIlIllIlIII[16] = (132 + 66 - 181 + 154 ^ 57 + 152 - 26 + 4);
            EnumOrientation.llIIIlIllIlIII[17] = (0x9F ^ 0x8E);
            EnumOrientation.llIIIlIllIlIII[18] = (0x9F ^ 0x8D);
            EnumOrientation.llIIIlIllIlIII[19] = (0xB1 ^ 0xA2);
            EnumOrientation.llIIIlIllIlIII[20] = (0x84 ^ 0x90);
            EnumOrientation.llIIIlIllIlIII[21] = (0x17 ^ 0x2);
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static String lIIIlIIlIIIIIIlI(final String llllllllllllIlllIlIlIlIllIIlllll, final String llllllllllllIlllIlIlIlIllIIllllI) {
            try {
                final SecretKeySpec llllllllllllIlllIlIlIlIllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIlIllIIllllI.getBytes(StandardCharsets.UTF_8)), EnumOrientation.llIIIlIllIlIII[8]), "DES");
                final Cipher llllllllllllIlllIlIlIlIllIlIIIll = Cipher.getInstance("DES");
                llllllllllllIlllIlIlIlIllIlIIIll.init(EnumOrientation.llIIIlIllIlIII[2], llllllllllllIlllIlIlIlIllIlIIlII);
                return new String(llllllllllllIlllIlIlIlIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIlIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIlIlIllIlIIIlI) {
                llllllllllllIlllIlIlIlIllIlIIIlI.printStackTrace();
                return null;
            }
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Axis = EnumOrientation.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
            if (lIIIlIIllIlIIIll($switch_TABLE$net$minecraft$util$EnumFacing$Axis)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing$Axis;
            }
            "".length();
            final byte llllllllllllIlllIlIlIlIllIlllIII = (Object)new int[EnumFacing.Axis.values().length];
            try {
                llllllllllllIlllIlIlIlIllIlllIII[EnumFacing.Axis.X.ordinal()] = EnumOrientation.llIIIlIllIlIII[1];
                "".length();
                if ((0xA2 ^ 0xA7) == 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIlllIII[EnumFacing.Axis.Y.ordinal()] = EnumOrientation.llIIIlIllIlIII[2];
                "".length();
                if ((0xB0 ^ 0xB4) == 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIlllIII[EnumFacing.Axis.Z.ordinal()] = EnumOrientation.llIIIlIllIlIII[3];
                "".length();
                if (((0x8E ^ 0xC3 ^ "  ".length()) & (0x34 ^ 0x11 ^ (0xAC ^ 0xC6) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            return EnumOrientation.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis = (int[])(Object)llllllllllllIlllIlIlIlIllIlllIII;
        }
        
        private static boolean lIIIlIIllIlIIIll(final Object llllllllllllIlllIlIlIlIlIllllIlI) {
            return llllllllllllIlllIlIlIlIlIllllIlI != null;
        }
        
        private EnumOrientation(final String llllllllllllIlllIlIlIlIlllIllIll, final int llllllllllllIlllIlIlIlIlllIllIlI, final int llllllllllllIlllIlIlIlIlllIllIIl, final String llllllllllllIlllIlIlIlIlllIllIII, final EnumFacing llllllllllllIlllIlIlIlIlllIlllIl) {
            this.meta = llllllllllllIlllIlIlIlIlllIllIIl;
            this.name = llllllllllllIlllIlIlIlIlllIllIII;
            this.facing = llllllllllllIlllIlIlIlIlllIlllIl;
        }
        
        static {
            lIIIlIIllIlIIIII();
            lIIIlIIlIIIIIlII();
            final EnumOrientation[] enum$VALUES = new EnumOrientation[EnumOrientation.llIIIlIllIlIII[8]];
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[0]] = EnumOrientation.DOWN_X;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[1]] = EnumOrientation.EAST;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[2]] = EnumOrientation.WEST;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[3]] = EnumOrientation.SOUTH;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[4]] = EnumOrientation.NORTH;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[5]] = EnumOrientation.UP_Z;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[6]] = EnumOrientation.UP_X;
            enum$VALUES[EnumOrientation.llIIIlIllIlIII[7]] = EnumOrientation.DOWN_Z;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumOrientation[values().length];
            final boolean llllllllllllIlllIlIlIlIllllIIlll;
            final char llllllllllllIlllIlIlIlIllllIlIII = (char)((EnumOrientation[])(Object)(llllllllllllIlllIlIlIlIllllIIlll = (boolean)(Object)values())).length;
            char llllllllllllIlllIlIlIlIllllIlIIl = (char)EnumOrientation.llIIIlIllIlIII[0];
            "".length();
            if (((0x17 ^ 0x2D ^ (0x65 ^ 0x5A)) & (0x6 ^ 0x26 ^ (0x85 ^ 0xA0) ^ -" ".length())) != ((0x27 ^ 0x5E ^ (0x55 ^ 0x18)) & (0x63 ^ 0x7C ^ (0x38 ^ 0x13) ^ -" ".length()))) {
                return;
            }
            while (!lIIIlIIllIlIIIIl(llllllllllllIlllIlIlIlIllllIlIIl, llllllllllllIlllIlIlIlIllllIlIII)) {
                final EnumOrientation llllllllllllIlllIlIlIlIllllIlIll = llllllllllllIlllIlIlIlIllllIIlll[llllllllllllIlllIlIlIlIllllIlIIl];
                EnumOrientation.META_LOOKUP[llllllllllllIlllIlIlIlIllllIlIll.getMetadata()] = llllllllllllIlllIlIlIlIllllIlIll;
                ++llllllllllllIlllIlIlIlIllllIlIIl;
            }
        }
        
        public static EnumOrientation forFacings(final EnumFacing llllllllllllIlllIlIlIlIlllIIlIII, final EnumFacing llllllllllllIlllIlIlIlIlllIIIlIl) {
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlllIlIlIlIlllIIlIII.ordinal()]) {
                case 1: {
                    switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[llllllllllllIlllIlIlIlIlllIIIlIl.getAxis().ordinal()]) {
                        case 1: {
                            return EnumOrientation.DOWN_X;
                        }
                        case 3: {
                            return EnumOrientation.DOWN_Z;
                        }
                        default: {
                            throw new IllegalArgumentException(String.valueOf(new StringBuilder(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[16]]).append(llllllllllllIlllIlIlIlIlllIIIlIl).append(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[17]]).append(llllllllllllIlllIlIlIlIlllIIlIII)));
                        }
                    }
                    break;
                }
                case 2: {
                    switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[llllllllllllIlllIlIlIlIlllIIIlIl.getAxis().ordinal()]) {
                        case 1: {
                            return EnumOrientation.UP_X;
                        }
                        case 3: {
                            return EnumOrientation.UP_Z;
                        }
                        default: {
                            throw new IllegalArgumentException(String.valueOf(new StringBuilder(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[18]]).append(llllllllllllIlllIlIlIlIlllIIIlIl).append(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[19]]).append(llllllllllllIlllIlIlIlIlllIIlIII)));
                        }
                    }
                    break;
                }
                case 3: {
                    return EnumOrientation.NORTH;
                }
                case 4: {
                    return EnumOrientation.SOUTH;
                }
                case 5: {
                    return EnumOrientation.WEST;
                }
                case 6: {
                    return EnumOrientation.EAST;
                }
                default: {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder(EnumOrientation.llIIIlIIlIlIIl[EnumOrientation.llIIIlIllIlIII[20]]).append(llllllllllllIlllIlIlIlIlllIIlIII)));
                }
            }
        }
        
        public EnumFacing getFacing() {
            return this.facing;
        }
        
        private static String lIIIlIIlIIIIIIIl(final String llllllllllllIlllIlIlIlIllIlIllII, final String llllllllllllIlllIlIlIlIllIlIlIll) {
            try {
                final SecretKeySpec llllllllllllIlllIlIlIlIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIlIllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIlIlIlIllIllIIII = Cipher.getInstance("Blowfish");
                llllllllllllIlllIlIlIlIllIllIIII.init(EnumOrientation.llIIIlIllIlIII[2], llllllllllllIlllIlIlIlIllIllIIIl);
                return new String(llllllllllllIlllIlIlIlIllIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIlIllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIlIlIllIlIllll) {
                llllllllllllIlllIlIlIlIllIlIllll.printStackTrace();
                return null;
            }
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = EnumOrientation.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIIlIIllIlIIIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final String llllllllllllIlllIlIlIlIllIllIllI = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIlllIlIlIlIllIllIllI[EnumFacing.DOWN.ordinal()] = EnumOrientation.llIIIlIllIlIII[1];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIllIllI[EnumFacing.EAST.ordinal()] = EnumOrientation.llIIIlIllIlIII[6];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIllIllI[EnumFacing.NORTH.ordinal()] = EnumOrientation.llIIIlIllIlIII[3];
                "".length();
                if (((0x85 ^ 0x8E) & ~(0x1 ^ 0xA)) > (0x83 ^ 0x87)) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIllIllI[EnumFacing.SOUTH.ordinal()] = EnumOrientation.llIIIlIllIlIII[4];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIllIllI[EnumFacing.UP.ordinal()] = EnumOrientation.llIIIlIllIlIII[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIlllIlIlIlIllIllIllI[EnumFacing.WEST.ordinal()] = EnumOrientation.llIIIlIllIlIII[5];
                "".length();
                if ((69 + 141 - 133 + 107 ^ 17 + 112 - 99 + 158) != (1 + 11 + 137 + 44 ^ 169 + 130 - 138 + 36)) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return EnumOrientation.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlllIlIlIlIllIllIllI;
        }
        
        private static boolean lIIIlIIllIlIIlII(final int llllllllllllIlllIlIlIlIlIlllllIl, final int llllllllllllIlllIlIlIlIlIlllllII) {
            return llllllllllllIlllIlIlIlIlIlllllIl < llllllllllllIlllIlIlIlIlIlllllII;
        }
        
        public static EnumOrientation byMetadata(int llllllllllllIlllIlIlIlIlllIIlIll) {
            if (!lIIIlIIllIlIIIlI(llllllllllllIlllIlIlIlIlllIIlIll) || lIIIlIIllIlIIIIl(llllllllllllIlllIlIlIlIlllIIlIll, EnumOrientation.META_LOOKUP.length)) {
                llllllllllllIlllIlIlIlIlllIIlIll = EnumOrientation.llIIIlIllIlIII[0];
            }
            return EnumOrientation.META_LOOKUP[llllllllllllIlllIlIlIlIlllIIlIll];
        }
        
        private static String lIIIlIIlIIIIIIII(String llllllllllllIlllIlIlIlIllIIIllII, final String llllllllllllIlllIlIlIlIllIIIlIll) {
            llllllllllllIlllIlIlIlIllIIIllII = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlIlIllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIlIlIlIllIIIllll = new StringBuilder();
            final char[] llllllllllllIlllIlIlIlIllIIIlllI = llllllllllllIlllIlIlIlIllIIIlIll.toCharArray();
            int llllllllllllIlllIlIlIlIllIIIllIl = EnumOrientation.llIIIlIllIlIII[0];
            final boolean llllllllllllIlllIlIlIlIllIIIIlll = (Object)llllllllllllIlllIlIlIlIllIIIllII.toCharArray();
            final Exception llllllllllllIlllIlIlIlIllIIIIllI = (Exception)llllllllllllIlllIlIlIlIllIIIIlll.length;
            Exception llllllllllllIlllIlIlIlIllIIIIlIl = (Exception)EnumOrientation.llIIIlIllIlIII[0];
            while (lIIIlIIllIlIIlII((int)llllllllllllIlllIlIlIlIllIIIIlIl, (int)llllllllllllIlllIlIlIlIllIIIIllI)) {
                final char llllllllllllIlllIlIlIlIllIIlIIlI = llllllllllllIlllIlIlIlIllIIIIlll[llllllllllllIlllIlIlIlIllIIIIlIl];
                llllllllllllIlllIlIlIlIllIIIllll.append((char)(llllllllllllIlllIlIlIlIllIIlIIlI ^ llllllllllllIlllIlIlIlIllIIIlllI[llllllllllllIlllIlIlIlIllIIIllIl % llllllllllllIlllIlIlIlIllIIIlllI.length]));
                "".length();
                ++llllllllllllIlllIlIlIlIllIIIllIl;
                ++llllllllllllIlllIlIlIlIllIIIIlIl;
                "".length();
                if ("   ".length() > (0x9A ^ 0x8D ^ (0x78 ^ 0x6B))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIlIlIlIllIIIllll);
        }
    }
}
