// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumWorldBlockLayer;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyDirection;

public class BlockLadder extends Block
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    private static final /* synthetic */ String[] lIIIIIlIlIlIlI;
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ int[] lIIIIIlIlIlIll;
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockLadder.lIIIIIlIlIlIll[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockLadder.lIIIIIlIlIlIll[0]] = BlockLadder.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIlllIlIIIIllIlII, final BlockPos lllllllllllllIlIIlllIlIIIIllIIll) {
        final IBlockState lllllllllllllIlIIlllIlIIIIllIlll = lllllllllllllIlIIlllIlIIIIllIlII.getBlockState(lllllllllllllIlIIlllIlIIIIllIIll);
        if (lIllIllIIlIlIlI(lllllllllllllIlIIlllIlIIIIllIlll.getBlock(), this)) {
            final float lllllllllllllIlIIlllIlIIIIllIllI = 0.125f;
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIIlllIlIIIIllIlll.getValue((IProperty<EnumFacing>)BlockLadder.FACING).ordinal()]) {
                case 3: {
                    this.setBlockBounds(0.0f, 0.0f, 1.0f - lllllllllllllIlIIlllIlIIIIllIllI, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, lllllllllllllIlIIlllIlIIIIllIllI);
                    "".length();
                    if (((0x95 ^ 0xC7) & ~(0x69 ^ 0x3B)) != 0x0) {
                        return;
                    }
                    break;
                }
                case 5: {
                    this.setBlockBounds(1.0f - lllllllllllllIlIIlllIlIIIIllIllI, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if ("   ".length() < ((0x78 ^ 0x30) & ~(0x41 ^ 0x9))) {
                        return;
                    }
                    break;
                }
                default: {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, lllllllllllllIlIIlllIlIIIIllIllI, 1.0f, 1.0f);
                    break;
                }
            }
        }
    }
    
    private static boolean lIllIllIIlIlIlI(final Object lllllllllllllIlIIlllIIllllIlIIll, final Object lllllllllllllIlIIlllIIllllIlIIlI) {
        return lllllllllllllIlIIlllIIllllIlIIll == lllllllllllllIlIIlllIIllllIlIIlI;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockLadder.lIIIIIlIlIlIll[0] != 0;
    }
    
    static {
        lIllIllIIlIlIIl();
        lIllIllIIlIlIII();
        FACING = PropertyDirection.create(BlockLadder.lIIIIIlIlIlIlI[BlockLadder.lIIIIIlIlIlIll[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockLadder.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIllIllIIlIllIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final long lllllllllllllIlIIlllIIlllllIIIll = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIlIIlllIIlllllIIIll[EnumFacing.DOWN.ordinal()] = BlockLadder.lIIIIIlIlIlIll[1];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIIlllIIlllllIIIll[EnumFacing.EAST.ordinal()] = BlockLadder.lIIIIIlIlIlIll[2];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIIlllIIlllllIIIll[EnumFacing.NORTH.ordinal()] = BlockLadder.lIIIIIlIlIlIll[3];
            "".length();
            if (((0xAA ^ 0x9A) & ~(0x43 ^ 0x73)) > " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIIlllIIlllllIIIll[EnumFacing.SOUTH.ordinal()] = BlockLadder.lIIIIIlIlIlIll[4];
            "".length();
            if (-" ".length() >= (149 + 48 - 58 + 34 ^ 47 + 23 + 75 + 24)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIIlllIIlllllIIIll[EnumFacing.UP.ordinal()] = BlockLadder.lIIIIIlIlIlIll[5];
            "".length();
            if (((0x93 ^ 0x9B) & ~(0xC9 ^ 0xC1)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIIlllIIlllllIIIll[EnumFacing.WEST.ordinal()] = BlockLadder.lIIIIIlIlIlIll[6];
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockLadder.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIIlllIIlllllIIIll;
    }
    
    private static boolean lIllIllIIlIllIl(final Object lllllllllllllIlIIlllIIllllIlIIII) {
        return lllllllllllllIlIIlllIIllllIlIIII != null;
    }
    
    private static void lIllIllIIlIlIIl() {
        (lIIIIIlIlIlIll = new int[8])[0] = ((0x68 ^ 0x32 ^ (0xF5 ^ 0xB5)) & (0xA ^ 0x21 ^ (0x57 ^ 0x66) ^ -" ".length()));
        BlockLadder.lIIIIIlIlIlIll[1] = " ".length();
        BlockLadder.lIIIIIlIlIlIll[2] = (0x4A ^ 0x4C);
        BlockLadder.lIIIIIlIlIlIll[3] = "   ".length();
        BlockLadder.lIIIIIlIlIlIll[4] = (0x46 ^ 0x42);
        BlockLadder.lIIIIIlIlIlIll[5] = "  ".length();
        BlockLadder.lIIIIIlIlIlIll[6] = (74 + 66 - 109 + 111 ^ 69 + 133 - 163 + 100);
        BlockLadder.lIIIIIlIlIlIll[7] = (121 + 147 - 212 + 135 ^ 151 + 85 - 102 + 49);
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIlllIIlllllIlIII) {
        return lllllllllllllIlIIlllIIlllllIlIII.getValue((IProperty<EnumFacing>)BlockLadder.FACING).getIndex();
    }
    
    private static String lIllIllIIlIIlll(final String lllllllllllllIlIIlllIIllllIllIll, final String lllllllllllllIlIIlllIIllllIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIIllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIllllIllIlI.getBytes(StandardCharsets.UTF_8)), BlockLadder.lIIIIIlIlIlIll[7]), "DES");
            final Cipher lllllllllllllIlIIlllIIllllIlllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlllIIllllIlllIl.init(BlockLadder.lIIIIIlIlIlIll[5], lllllllllllllIlIIlllIIllllIllllI);
            return new String(lllllllllllllIlIIlllIIllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIIllllIlllII) {
            lllllllllllllIlIIlllIIllllIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIIlllIIlllllIllIl) {
        EnumFacing lllllllllllllIlIIlllIIlllllIllll = EnumFacing.getFront(lllllllllllllIlIIlllIIlllllIllIl);
        if (lIllIllIIlIlIlI(lllllllllllllIlIIlllIIlllllIllll.getAxis(), EnumFacing.Axis.Y)) {
            lllllllllllllIlIIlllIIlllllIllll = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockLadder.FACING, lllllllllllllIlIIlllIIlllllIllll);
    }
    
    private static void lIllIllIIlIlIII() {
        (lIIIIIlIlIlIlI = new String[BlockLadder.lIIIIIlIlIlIll[1]])[BlockLadder.lIIIIIlIlIlIll[0]] = lIllIllIIlIIlll("MQI5xp4Iack=", "XYMmD");
    }
    
    protected boolean canBlockStay(final World lllllllllllllIlIIlllIIlllllllIII, final BlockPos lllllllllllllIlIIlllIIllllllIlll, final EnumFacing lllllllllllllIlIIlllIIlllllllIIl) {
        return lllllllllllllIlIIlllIIlllllllIII.getBlockState(lllllllllllllIlIIlllIIllllllIlll.offset(lllllllllllllIlIIlllIIlllllllIIl.getOpposite())).getBlock().isNormalCube();
    }
    
    private static boolean lIllIllIIlIlIll(final int lllllllllllllIlIIlllIIllllIIlllI) {
        return lllllllllllllIlIIlllIIllllIIlllI != 0;
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIlIIlllIlIIIlIIIIIl, final BlockPos lllllllllllllIlIIlllIlIIIlIIIIll) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIIlllIlIIIlIIIIIl, lllllllllllllIlIIlllIlIIIlIIIIll);
        return super.getSelectedBoundingBox(lllllllllllllIlIIlllIlIIIlIIIIIl, lllllllllllllIlIIlllIlIIIlIIIIll);
    }
    
    protected BlockLadder() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockLadder.FACING, EnumFacing.NORTH));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIIlllIlIIIIlIlIIl, final BlockPos lllllllllllllIlIIlllIlIIIIlIlIII) {
        int normalCube;
        if (lIllIllIIlIlIll(lllllllllllllIlIIlllIlIIIIlIlIIl.getBlockState(lllllllllllllIlIIlllIlIIIIlIlIII.west()).getBlock().isNormalCube() ? 1 : 0)) {
            normalCube = BlockLadder.lIIIIIlIlIlIll[1];
            "".length();
            if (((17 + 138 - 83 + 69 ^ 109 + 10 - 92 + 124) & (0x1C ^ 0x71 ^ (0x3F ^ 0x48) ^ -" ".length())) != 0x0) {
                return ((0x23 ^ 0x79 ^ (0x73 ^ 0x64)) & (25 + 228 - 208 + 196 ^ 166 + 64 - 214 + 172 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIllIIlIlIll(lllllllllllllIlIIlllIlIIIIlIlIIl.getBlockState(lllllllllllllIlIIlllIlIIIIlIlIII.east()).getBlock().isNormalCube() ? 1 : 0)) {
            normalCube = BlockLadder.lIIIIIlIlIlIll[1];
            "".length();
            if (null != null) {
                return ((0x27 ^ 0x11 ^ (0x18 ^ 0x1F)) & (0x13 ^ 0x72 ^ (0x7C ^ 0x2C) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIllIIlIlIll(lllllllllllllIlIIlllIlIIIIlIlIIl.getBlockState(lllllllllllllIlIIlllIlIIIIlIlIII.north()).getBlock().isNormalCube() ? 1 : 0)) {
            normalCube = BlockLadder.lIIIIIlIlIlIll[1];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x71 ^ 0x59) & ~(0x54 ^ 0x7C)) != 0x0;
            }
        }
        else {
            normalCube = (lllllllllllllIlIIlllIlIIIIlIlIIl.getBlockState(lllllllllllllIlIIlllIlIIIIlIlIII.south()).getBlock().isNormalCube() ? 1 : 0);
        }
        return normalCube != 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIIlllIlIIIlIIllll, final BlockPos lllllllllllllIlIIlllIlIIIlIIlIlI, final IBlockState lllllllllllllIlIIlllIlIIIlIIllIl) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIIlllIlIIIlIIllll, lllllllllllllIlIIlllIlIIIlIIlIlI);
        return super.getCollisionBoundingBox(lllllllllllllIlIIlllIlIIIlIIllll, lllllllllllllIlIIlllIlIIIlIIlIlI, lllllllllllllIlIIlllIlIIIlIIllIl);
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIlllIlIIIIIIIlII, final BlockPos lllllllllllllIlIIlllIlIIIIIIlIIl, final IBlockState lllllllllllllIlIIlllIlIIIIIIlIII, final Block lllllllllllllIlIIlllIlIIIIIIIlll) {
        final EnumFacing lllllllllllllIlIIlllIlIIIIIIIllI = lllllllllllllIlIIlllIlIIIIIIlIII.getValue((IProperty<EnumFacing>)BlockLadder.FACING);
        if (lIllIllIIlIllII(this.canBlockStay(lllllllllllllIlIIlllIlIIIIIIIlII, lllllllllllllIlIIlllIlIIIIIIlIIl, lllllllllllllIlIIlllIlIIIIIIIllI) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIlIIlllIlIIIIIIIlII, lllllllllllllIlIIlllIlIIIIIIlIIl, lllllllllllllIlIIlllIlIIIIIIlIII, BlockLadder.lIIIIIlIlIlIll[0]);
            lllllllllllllIlIIlllIlIIIIIIIlII.setBlockToAir(lllllllllllllIlIIlllIlIIIIIIlIIl);
            "".length();
        }
        super.onNeighborBlockChange(lllllllllllllIlIIlllIlIIIIIIIlII, lllllllllllllIlIIlllIlIIIIIIlIIl, lllllllllllllIlIIlllIlIIIIIIlIII, lllllllllllllIlIIlllIlIIIIIIIlll);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockLadder.lIIIIIlIlIlIll[0] != 0;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIIlllIlIIIIlIIIII, final BlockPos lllllllllllllIlIIlllIlIIIIIlIlIl, final EnumFacing lllllllllllllIlIIlllIlIIIIIllllI, final float lllllllllllllIlIIlllIlIIIIIlllIl, final float lllllllllllllIlIIlllIlIIIIIlllII, final float lllllllllllllIlIIlllIlIIIIIllIll, final int lllllllllllllIlIIlllIlIIIIIllIlI, final EntityLivingBase lllllllllllllIlIIlllIlIIIIIllIIl) {
        if (lIllIllIIlIlIll(lllllllllllllIlIIlllIlIIIIIllllI.getAxis().isHorizontal() ? 1 : 0) && lIllIllIIlIlIll(this.canBlockStay(lllllllllllllIlIIlllIlIIIIlIIIII, lllllllllllllIlIIlllIlIIIIIlIlIl, lllllllllllllIlIIlllIlIIIIIllllI) ? 1 : 0)) {
            return this.getDefaultState().withProperty((IProperty<Comparable>)BlockLadder.FACING, lllllllllllllIlIIlllIlIIIIIllllI);
        }
        final short lllllllllllllIlIIlllIlIIIIIlIIlI = (short)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (((120 + 174 - 138 + 42 ^ 98 + 25 + 12 + 31) & ("  ".length() ^ (0x57 ^ 0x35) ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!lIllIllIIlIllII(((Iterator)lllllllllllllIlIIlllIlIIIIIlIIlI).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIlIIlllIlIIIIIllIII = ((Iterator<EnumFacing>)lllllllllllllIlIIlllIlIIIIIlIIlI).next();
            if (lIllIllIIlIlIll(this.canBlockStay(lllllllllllllIlIIlllIlIIIIlIIIII, lllllllllllllIlIIlllIlIIIIIlIlIl, lllllllllllllIlIIlllIlIIIIIllIII) ? 1 : 0)) {
                return this.getDefaultState().withProperty((IProperty<Comparable>)BlockLadder.FACING, lllllllllllllIlIIlllIlIIIIIllIII);
            }
        }
        return this.getDefaultState();
    }
    
    private static boolean lIllIllIIlIllII(final int lllllllllllllIlIIlllIIllllIIllII) {
        return lllllllllllllIlIIlllIIllllIIllII == 0;
    }
}
