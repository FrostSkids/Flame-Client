// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.Item;
import java.util.Arrays;
import net.minecraft.entity.EntityLivingBase;
import java.util.Iterator;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.stats.StatList;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import java.util.Random;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.PropertyBool;

public class BlockVine extends Block
{
    public static final /* synthetic */ PropertyBool SOUTH;
    public static final /* synthetic */ PropertyBool EAST;
    private static final /* synthetic */ String[] lIIIIlIIlIlIlI;
    public static final /* synthetic */ PropertyBool UP;
    private static final /* synthetic */ int[] lIIIIlIIlIlllI;
    public static final /* synthetic */ PropertyBool NORTH;
    public static final /* synthetic */ PropertyBool WEST;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public static final /* synthetic */ PropertyBool[] ALL_FACES;
    
    private static boolean lIlllIIIllIlIII(final Object lllllllllllllIlIIlIllllllIlllIIl, final Object lllllllllllllIlIIlIllllllIlllIII) {
        return lllllllllllllIlIIlIllllllIlllIIl != lllllllllllllIlIIlIllllllIlllIII;
    }
    
    private static void lIlllIIIlIlIlII() {
        (lIIIIlIIlIlIlI = new String[BlockVine.lIIIIlIIlIlllI[9]])[BlockVine.lIIIIlIIlIlllI[0]] = lIlllIIIlIlIIIl("Ct7lPOOpO1o=", "pdIXG");
        BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[1]] = lIlllIIIlIlIIlI("GQwwDQQ=", "wcByl");
        BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[2]] = lIlllIIIlIlIIll("M9NaOXCkqaI=", "AfrDS");
        BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[3]] = lIlllIIIlIlIIIl("dsjWAx4GJKI=", "IGwxO");
        BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[4]] = lIlllIIIlIlIIll("mhms1xb5N5A=", "PxgII");
        BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[5]] = lIlllIIIlIlIIIl("Z1Q7qJrr8s3O6gTYvwT80630u72Gy85B", "RqnSP");
    }
    
    private static void lIlllIIIllIIlII() {
        (lIIIIlIIlIlllI = new int[10])[0] = ((0x21 ^ 0x69) & ~(0x6B ^ 0x23));
        BlockVine.lIIIIlIIlIlllI[1] = " ".length();
        BlockVine.lIIIIlIIlIlllI[2] = "  ".length();
        BlockVine.lIIIIlIIlIlllI[3] = "   ".length();
        BlockVine.lIIIIlIIlIlllI[4] = (0xAC ^ 0xA8);
        BlockVine.lIIIIlIIlIlllI[5] = (120 + 45 - 105 + 131 ^ 96 + 14 + 34 + 42);
        BlockVine.lIIIIlIIlIlllI[6] = -" ".length();
        BlockVine.lIIIIlIIlIlllI[7] = 104 + 65 - 94 + 74 + (0xE7 ^ 0xB9) - (27 + 91 - 90 + 177) + (142 + 187 - 275 + 163);
        BlockVine.lIIIIlIIlIlllI[8] = (0x8B ^ 0x83);
        BlockVine.lIIIIlIIlIlllI[9] = (0x5E ^ 0x2F ^ (0x72 ^ 0x5));
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static boolean lIlllIIIllIIlll(final Object lllllllllllllIlIIlIllllllIllIlIl, final Object lllllllllllllIlIIlIllllllIllIlII) {
        return lllllllllllllIlIIlIllllllIllIlIl == lllllllllllllIlIIlIllllllIllIlII;
    }
    
    private boolean canPlaceOn(final Block lllllllllllllIlIIllIIIIIlIllllII) {
        if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIlIllllII.isFullCube() ? 1 : 0) && lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIlIllllII.blockMaterial.blocksMovement() ? 1 : 0)) {
            return BlockVine.lIIIIlIIlIlllI[1] != 0;
        }
        return BlockVine.lIIIIlIIlIlllI[0] != 0;
    }
    
    private static boolean lIlllIIIllIIlIl(final int lllllllllllllIlIIlIllllllIllIIII) {
        return lllllllllllllIlIIlIllllllIllIIII != 0;
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIlIIllIIIIIlIIllIII, final BlockPos lllllllllllllIlIIllIIIIIlIIlIlll, final int lllllllllllllIlIIllIIIIIlIIllIIl) {
        return lllllllllllllIlIIllIIIIIlIIllIII.getBiomeGenForCoords(lllllllllllllIlIIllIIIIIlIIlIlll).getFoliageColorAtPos(lllllllllllllIlIIllIIIIIlIIlIlll);
    }
    
    private static boolean lIlllIIIllIllIl(final int lllllllllllllIlIIlIllllllIlIlIlI) {
        return lllllllllllllIlIIlIllllllIlIlIlI > 0;
    }
    
    private static boolean lIlllIIIllIlllI(final int lllllllllllllIlIIlIlllllllIIIlIl, final int lllllllllllllIlIIlIlllllllIIIlII) {
        return lllllllllllllIlIIlIlllllllIIIlIl >= lllllllllllllIlIIlIlllllllIIIlII;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIllIIIIIlIIIllII, final BlockPos lllllllllllllIlIIllIIIIIlIIlIIII, final IBlockState lllllllllllllIlIIllIIIIIlIIIllll, final Block lllllllllllllIlIIllIIIIIlIIIlllI) {
        if (lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIlIIIllII.isRemote ? 1 : 0) && lIlllIIIllIIllI(this.recheckGrownSides(lllllllllllllIlIIllIIIIIlIIIllII, lllllllllllllIlIIllIIIIIlIIlIIII, lllllllllllllIlIIllIIIIIlIIIllll) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIlIIllIIIIIlIIIllII, lllllllllllllIlIIllIIIIIlIIlIIII, lllllllllllllIlIIllIIIIIlIIIllll, BlockVine.lIIIIlIIlIlllI[0]);
            lllllllllllllIlIIllIIIIIlIIIllII.setBlockToAir(lllllllllllllIlIIllIIIIIlIIlIIII);
            "".length();
        }
    }
    
    public static PropertyBool getPropertyFor(final EnumFacing lllllllllllllIlIIllIIIIIIIIIlIll) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIIllIIIIIIIIIlIll.ordinal()]) {
            case 2: {
                return BlockVine.UP;
            }
            case 3: {
                return BlockVine.NORTH;
            }
            case 4: {
                return BlockVine.SOUTH;
            }
            case 6: {
                return BlockVine.EAST;
            }
            case 5: {
                return BlockVine.WEST;
            }
            default: {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(lllllllllllllIlIIllIIIIIIIIIlIll).append(BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[5]])));
            }
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockVine.lIIIIlIIlIlllI[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockVine.lIIIIlIIlIlllI[0]] = BlockVine.UP;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockVine.lIIIIlIIlIlllI[1]] = BlockVine.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockVine.lIIIIlIIlIlllI[2]] = BlockVine.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockVine.lIIIIlIIlIlllI[3]] = BlockVine.SOUTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockVine.lIIIIlIIlIlllI[4]] = BlockVine.WEST;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIIllIIIIIllIIlllI, final BlockPos lllllllllllllIlIIllIIIIIllIIllIl, final IBlockState lllllllllllllIlIIllIIIIIllIIllII) {
        return null;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIIllIIIIIIIIllIII) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool south = BlockVine.SOUTH;
        int b;
        if (lIlllIIIllIllIl(lllllllllllllIlIIllIIIIIIIIllIII & BlockVine.lIIIIlIIlIlllI[1])) {
            b = BlockVine.lIIIIlIIlIlllI[1];
            "".length();
            if (" ".length() <= ((60 + 97 - 107 + 90 ^ 76 + 26 - 88 + 122) & (0x28 ^ 0x0 ^ (0x39 ^ 0x15) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            b = BlockVine.lIIIIlIIlIlllI[0];
        }
        final IBlockState withProperty = defaultState.withProperty((IProperty<Comparable>)south, (boolean)(b != 0));
        final PropertyBool west = BlockVine.WEST;
        int b2;
        if (lIlllIIIllIllIl(lllllllllllllIlIIllIIIIIIIIllIII & BlockVine.lIIIIlIIlIlllI[2])) {
            b2 = BlockVine.lIIIIlIIlIlllI[1];
            "".length();
            if ((0xD8 ^ 0xA5 ^ (0x78 ^ 0x1)) > (0x6B ^ 0x7F ^ (0x7C ^ 0x6C))) {
                return null;
            }
        }
        else {
            b2 = BlockVine.lIIIIlIIlIlllI[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)west, (boolean)(b2 != 0));
        final PropertyBool north = BlockVine.NORTH;
        int b3;
        if (lIlllIIIllIllIl(lllllllllllllIlIIllIIIIIIIIllIII & BlockVine.lIIIIlIIlIlllI[4])) {
            b3 = BlockVine.lIIIIlIIlIlllI[1];
            "".length();
            if (((0x6D ^ 0x5 ^ (0x36 ^ 0xF)) & (102 + 36 + 29 + 38 ^ 48 + 75 + 7 + 26 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            b3 = BlockVine.lIIIIlIIlIlllI[0];
        }
        final IBlockState withProperty3 = withProperty2.withProperty((IProperty<Comparable>)north, (boolean)(b3 != 0));
        final PropertyBool east = BlockVine.EAST;
        int b4;
        if (lIlllIIIllIllIl(lllllllllllllIlIIllIIIIIIIIllIII & BlockVine.lIIIIlIIlIlllI[8])) {
            b4 = BlockVine.lIIIIlIIlIlllI[1];
            "".length();
            if ((0x8A ^ 0x8E) <= " ".length()) {
                return null;
            }
        }
        else {
            b4 = BlockVine.lIIIIlIIlIlllI[0];
        }
        return withProperty3.withProperty((IProperty<Comparable>)east, (boolean)(b4 != 0));
    }
    
    @Override
    public boolean isFullCube() {
        return BlockVine.lIIIIlIIlIlllI[0] != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockVine.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlllIIIllIllII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final byte lllllllllllllIlIIlIllllllllllIlI = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIlIIlIllllllllllIlI[EnumFacing.DOWN.ordinal()] = BlockVine.lIIIIlIIlIlllI[1];
            "".length();
            if (-(0xC0 ^ 0xC5) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllllllllllIlI[EnumFacing.EAST.ordinal()] = BlockVine.lIIIIlIIlIlllI[9];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllllllllllIlI[EnumFacing.NORTH.ordinal()] = BlockVine.lIIIIlIIlIlllI[3];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllllllllllIlI[EnumFacing.SOUTH.ordinal()] = BlockVine.lIIIIlIIlIlllI[4];
            "".length();
            if (((0x2 ^ 0x12 ^ (0x9C ^ 0x85)) & (141 + 109 - 113 + 6 ^ 131 + 125 - 188 + 66 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllllllllllIlI[EnumFacing.UP.ordinal()] = BlockVine.lIIIIlIIlIlllI[2];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllllllllllIlI[EnumFacing.WEST.ordinal()] = BlockVine.lIIIIlIIlIlllI[5];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockVine.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIIlIllllllllllIlI;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockVine.lIIIIlIIlIlllI[0] != 0;
    }
    
    static {
        lIlllIIIllIIlII();
        lIlllIIIlIlIlII();
        UP = PropertyBool.create(BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[0]]);
        NORTH = PropertyBool.create(BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[1]]);
        EAST = PropertyBool.create(BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[2]]);
        SOUTH = PropertyBool.create(BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[3]]);
        WEST = PropertyBool.create(BlockVine.lIIIIlIIlIlIlI[BlockVine.lIIIIlIIlIlllI[4]]);
        final PropertyBool[] all_FACES = new PropertyBool[BlockVine.lIIIIlIIlIlllI[5]];
        all_FACES[BlockVine.lIIIIlIIlIlllI[0]] = BlockVine.UP;
        all_FACES[BlockVine.lIIIIlIIlIlllI[1]] = BlockVine.NORTH;
        all_FACES[BlockVine.lIIIIlIIlIlllI[2]] = BlockVine.SOUTH;
        all_FACES[BlockVine.lIIIIlIIlIlllI[3]] = BlockVine.WEST;
        all_FACES[BlockVine.lIIIIlIIlIlllI[4]] = BlockVine.EAST;
        ALL_FACES = all_FACES;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIIllIIIIIIIllIIIl) {
        return BlockVine.lIIIIlIIlIlllI[0];
    }
    
    public static int getNumGrownFaces(final IBlockState lllllllllllllIlIIllIIIIIIIIIIIIl) {
        int lllllllllllllIlIIllIIIIIIIIIIIll = BlockVine.lIIIIlIIlIlllI[0];
        final short lllllllllllllIlIIlIlllllllllllII;
        final float lllllllllllllIlIIlIlllllllllllIl = ((PropertyBool[])(Object)(lllllllllllllIlIIlIlllllllllllII = (short)(Object)BlockVine.ALL_FACES)).length;
        char lllllllllllllIlIIlIllllllllllllI = (char)BlockVine.lIIIIlIIlIlllI[0];
        "".length();
        if (" ".length() < " ".length()) {
            return (0x68 ^ 0x62) & ~(0x95 ^ 0x9F);
        }
        while (!lIlllIIIllIlllI(lllllllllllllIlIIlIllllllllllllI, (int)lllllllllllllIlIIlIlllllllllllIl)) {
            final PropertyBool lllllllllllllIlIIllIIIIIIIIIIIlI = lllllllllllllIlIIlIlllllllllllII[lllllllllllllIlIIlIllllllllllllI];
            if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIIIIIIIl.getValue((IProperty<Boolean>)lllllllllllllIlIIllIIIIIIIIIIIlI)) ? 1 : 0)) {
                ++lllllllllllllIlIIllIIIIIIIIIIIll;
            }
            ++lllllllllllllIlIIlIllllllllllllI;
        }
        return lllllllllllllIlIIllIIIIIIIIIIIll;
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIlIIllIIIIIlllllIll, final IBlockAccess lllllllllllllIlIIllIIIIIlllllIlI, final BlockPos lllllllllllllIlIIllIIIIIlllllIIl) {
        return lllllllllllllIlIIllIIIIIlllllIll.withProperty((IProperty<Comparable>)BlockVine.UP, lllllllllllllIlIIllIIIIIlllllIlI.getBlockState(lllllllllllllIlIIllIIIIIlllllIIl.up()).getBlock().isBlockNormalCube());
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIlIIllIIIIIllIIIllI, final BlockPos lllllllllllllIlIIllIIIIIllIIIIIl, final EnumFacing lllllllllllllIlIIllIIIIIllIIIIII) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIIllIIIIIllIIIIII.ordinal()]) {
            case 2: {
                return this.canPlaceOn(lllllllllllllIlIIllIIIIIllIIIllI.getBlockState(lllllllllllllIlIIllIIIIIllIIIIIl.up()).getBlock());
            }
            case 3:
            case 4:
            case 5:
            case 6: {
                return this.canPlaceOn(lllllllllllllIlIIllIIIIIllIIIllI.getBlockState(lllllllllllllIlIIllIIIIIllIIIIIl.offset(lllllllllllllIlIIllIIIIIllIIIIII.getOpposite())).getBlock());
            }
            default: {
                return BlockVine.lIIIIlIIlIlllI[0] != 0;
            }
        }
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIllIIIIIlllIIlII, final BlockPos lllllllllllllIlIIllIIIIIllIllIII) {
        final float lllllllllllllIlIIllIIIIIlllIIIlI = 0.0625f;
        float lllllllllllllIlIIllIIIIIlllIIIIl = 1.0f;
        float lllllllllllllIlIIllIIIIIlllIIIII = 1.0f;
        float lllllllllllllIlIIllIIIIIllIlllll = 1.0f;
        float lllllllllllllIlIIllIIIIIllIllllI = 0.0f;
        float lllllllllllllIlIIllIIIIIllIlllIl = 0.0f;
        float lllllllllllllIlIIllIIIIIllIlllII = 0.0f;
        boolean lllllllllllllIlIIllIIIIIllIllIll = BlockVine.lIIIIlIIlIlllI[0] != 0;
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIlllIIlII.getBlockState(lllllllllllllIlIIllIIIIIllIllIII).getValue((IProperty<Boolean>)BlockVine.WEST)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIllIllllI = Math.max(lllllllllllllIlIIllIIIIIllIllllI, 0.0625f);
            lllllllllllllIlIIllIIIIIlllIIIIl = 0.0f;
            lllllllllllllIlIIllIIIIIlllIIIII = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllIl = 1.0f;
            lllllllllllllIlIIllIIIIIllIlllll = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllII = 1.0f;
            lllllllllllllIlIIllIIIIIllIllIll = (BlockVine.lIIIIlIIlIlllI[1] != 0);
        }
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIlllIIlII.getBlockState(lllllllllllllIlIIllIIIIIllIllIII).getValue((IProperty<Boolean>)BlockVine.EAST)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIlllIIIIl = Math.min(lllllllllllllIlIIllIIIIIlllIIIIl, 0.9375f);
            lllllllllllllIlIIllIIIIIllIllllI = 1.0f;
            lllllllllllllIlIIllIIIIIlllIIIII = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllIl = 1.0f;
            lllllllllllllIlIIllIIIIIllIlllll = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllII = 1.0f;
            lllllllllllllIlIIllIIIIIllIllIll = (BlockVine.lIIIIlIIlIlllI[1] != 0);
        }
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIlllIIlII.getBlockState(lllllllllllllIlIIllIIIIIllIllIII).getValue((IProperty<Boolean>)BlockVine.NORTH)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIllIlllII = Math.max(lllllllllllllIlIIllIIIIIllIlllII, 0.0625f);
            lllllllllllllIlIIllIIIIIllIlllll = 0.0f;
            lllllllllllllIlIIllIIIIIlllIIIIl = 0.0f;
            lllllllllllllIlIIllIIIIIllIllllI = 1.0f;
            lllllllllllllIlIIllIIIIIlllIIIII = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllIl = 1.0f;
            lllllllllllllIlIIllIIIIIllIllIll = (BlockVine.lIIIIlIIlIlllI[1] != 0);
        }
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIlllIIlII.getBlockState(lllllllllllllIlIIllIIIIIllIllIII).getValue((IProperty<Boolean>)BlockVine.SOUTH)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIllIlllll = Math.min(lllllllllllllIlIIllIIIIIllIlllll, 0.9375f);
            lllllllllllllIlIIllIIIIIllIlllII = 1.0f;
            lllllllllllllIlIIllIIIIIlllIIIIl = 0.0f;
            lllllllllllllIlIIllIIIIIllIllllI = 1.0f;
            lllllllllllllIlIIllIIIIIlllIIIII = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllIl = 1.0f;
            lllllllllllllIlIIllIIIIIllIllIll = (BlockVine.lIIIIlIIlIlllI[1] != 0);
        }
        if (lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIllIllIll ? 1 : 0) && lIlllIIIllIIlIl(this.canPlaceOn(lllllllllllllIlIIllIIIIIlllIIlII.getBlockState(lllllllllllllIlIIllIIIIIllIllIII.up()).getBlock()) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIlllIIIII = Math.min(lllllllllllllIlIIllIIIIIlllIIIII, 0.9375f);
            lllllllllllllIlIIllIIIIIllIlllIl = 1.0f;
            lllllllllllllIlIIllIIIIIlllIIIIl = 0.0f;
            lllllllllllllIlIIllIIIIIllIllllI = 1.0f;
            lllllllllllllIlIIllIIIIIllIlllll = 0.0f;
            lllllllllllllIlIIllIIIIIllIlllII = 1.0f;
        }
        this.setBlockBounds(lllllllllllllIlIIllIIIIIlllIIIIl, lllllllllllllIlIIllIIIIIlllIIIII, lllllllllllllIlIIllIIIIIllIlllll, lllllllllllllIlIIllIIIIIllIllllI, lllllllllllllIlIIllIIIIIllIlllIl, lllllllllllllIlIIllIIIIIllIlllII);
    }
    
    @Override
    public boolean isReplaceable(final World lllllllllllllIlIIllIIIIIllllIIlI, final BlockPos lllllllllllllIlIIllIIIIIllllIIIl) {
        return BlockVine.lIIIIlIIlIlllI[1] != 0;
    }
    
    public BlockVine() {
        super(Material.vine);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockVine.UP, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.NORTH, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.EAST, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.SOUTH, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.WEST, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)));
        this.setTickRandomly((boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static String lIlllIIIlIlIIIl(final String lllllllllllllIlIIlIllllllllIIIll, final String lllllllllllllIlIIlIllllllllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllllllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIllllllllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIllllllllIIlll.init(BlockVine.lIIIIlIIlIlllI[2], lllllllllllllIlIIlIllllllllIlIII);
            return new String(lllllllllllllIlIIlIllllllllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllllllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllllllllIIllI) {
            lllllllllllllIlIIlIllllllllIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void harvestBlock(final World lllllllllllllIlIIllIIIIIIIlIlIIl, final EntityPlayer lllllllllllllIlIIllIIIIIIIlIIIlI, final BlockPos lllllllllllllIlIIllIIIIIIIlIIlll, final IBlockState lllllllllllllIlIIllIIIIIIIlIIllI, final TileEntity lllllllllllllIlIIllIIIIIIIIlllll) {
        if (lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIIIlIlIIl.isRemote ? 1 : 0) && lIlllIIIllIllII(lllllllllllllIlIIllIIIIIIIlIIIlI.getCurrentEquippedItem()) && lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIIIlIIIlI.getCurrentEquippedItem().getItem(), Items.shears)) {
            lllllllllllllIlIIllIIIIIIIlIIIlI.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            Block.spawnAsEntity(lllllllllllllIlIIllIIIIIIIlIlIIl, lllllllllllllIlIIllIIIIIIIlIIlll, new ItemStack(Blocks.vine, BlockVine.lIIIIlIIlIlllI[1], BlockVine.lIIIIlIIlIlllI[0]));
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        else {
            super.harvestBlock(lllllllllllllIlIIllIIIIIIIlIlIIl, lllllllllllllIlIIllIIIIIIIlIIIlI, lllllllllllllIlIIllIIIIIIIlIIlll, lllllllllllllIlIIllIIIIIIIlIIllI, lllllllllllllIlIIllIIIIIIIIlllll);
        }
    }
    
    private static boolean lIlllIIIllIlIIl(final int lllllllllllllIlIIlIllllllIlIllII) {
        return lllllllllllllIlIIlIllllllIlIllII <= 0;
    }
    
    @Override
    public int getBlockColor() {
        return ColorizerFoliage.getFoliageColorBasic();
    }
    
    private static boolean lIlllIIIllIlIll(final int lllllllllllllIlIIlIlllllllIIIIIl, final int lllllllllllllIlIIlIlllllllIIIIII) {
        return lllllllllllllIlIIlIlllllllIIIIIl < lllllllllllllIlIIlIlllllllIIIIII;
    }
    
    private static boolean lIlllIIIllIllII(final Object lllllllllllllIlIIlIllllllIllIIlI) {
        return lllllllllllllIlIIlIllllllIllIIlI != null;
    }
    
    private static boolean lIlllIIIllIlIlI(final int lllllllllllllIlIIlIllllllIllllIl, final int lllllllllllllIlIIlIllllllIllllII) {
        return lllllllllllllIlIIlIllllllIllllIl > lllllllllllllIlIIlIllllllIllllII;
    }
    
    @Override
    public int getRenderColor(final IBlockState lllllllllllllIlIIllIIIIIlIIlllll) {
        return ColorizerFoliage.getFoliageColorBasic();
    }
    
    private static String lIlllIIIlIlIIlI(String lllllllllllllIlIIlIlllllllIlIIII, final String lllllllllllllIlIIlIlllllllIIllll) {
        lllllllllllllIlIIlIlllllllIlIIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIlllllllIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlllllllIlIIll = new StringBuilder();
        final char[] lllllllllllllIlIIlIlllllllIlIIlI = lllllllllllllIlIIlIlllllllIIllll.toCharArray();
        int lllllllllllllIlIIlIlllllllIlIIIl = BlockVine.lIIIIlIIlIlllI[0];
        final long lllllllllllllIlIIlIlllllllIIlIll = (Object)((String)lllllllllllllIlIIlIlllllllIlIIII).toCharArray();
        final Exception lllllllllllllIlIIlIlllllllIIlIlI = (Exception)lllllllllllllIlIIlIlllllllIIlIll.length;
        int lllllllllllllIlIIlIlllllllIIlIIl = BlockVine.lIIIIlIIlIlllI[0];
        while (lIlllIIIllIlIll(lllllllllllllIlIIlIlllllllIIlIIl, (int)lllllllllllllIlIIlIlllllllIIlIlI)) {
            final char lllllllllllllIlIIlIlllllllIlIllI = lllllllllllllIlIIlIlllllllIIlIll[lllllllllllllIlIIlIlllllllIIlIIl];
            lllllllllllllIlIIlIlllllllIlIIll.append((char)(lllllllllllllIlIIlIlllllllIlIllI ^ lllllllllllllIlIIlIlllllllIlIIlI[lllllllllllllIlIIlIlllllllIlIIIl % lllllllllllllIlIIlIlllllllIlIIlI.length]));
            "".length();
            ++lllllllllllllIlIIlIlllllllIlIIIl;
            ++lllllllllllllIlIIlIlllllllIIlIIl;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlllllllIlIIll);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIIllIIIIIIlllIllI, final BlockPos lllllllllllllIlIIllIIIIIIlIlIllI, final IBlockState lllllllllllllIlIIllIIIIIIlIlIlIl, final Random lllllllllllllIlIIllIIIIIIlllIIll) {
        if (lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIIlllIllI.isRemote ? 1 : 0) && lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIIlllIllI.rand.nextInt(BlockVine.lIIIIlIIlIlllI[4]))) {
            final int lllllllllllllIlIIllIIIIIIlllIIlI = BlockVine.lIIIIlIIlIlllI[4];
            int lllllllllllllIlIIllIIIIIIlllIIIl = BlockVine.lIIIIlIIlIlllI[5];
            boolean lllllllllllllIlIIllIIIIIIlllIIII = BlockVine.lIIIIlIIlIlllI[0] != 0;
            int lllllllllllllIlIIllIIIIIIllIllll = -lllllllllllllIlIIllIIIIIIlllIIlI;
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        Label_0246:
            while (!lIlllIIIllIlIlI(lllllllllllllIlIIllIIIIIIllIllll, lllllllllllllIlIIllIIIIIIlllIIlI)) {
                int lllllllllllllIlIIllIIIIIIllIlllI = -lllllllllllllIlIIllIIIIIIlllIIlI;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                while (!lIlllIIIllIlIlI(lllllllllllllIlIIllIIIIIIllIlllI, lllllllllllllIlIIllIIIIIIlllIIlI)) {
                    int lllllllllllllIlIIllIIIIIIllIllIl = BlockVine.lIIIIlIIlIlllI[6];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    while (!lIlllIIIllIlIlI(lllllllllllllIlIIllIIIIIIllIllIl, BlockVine.lIIIIlIIlIlllI[1])) {
                        if (lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIlIlIllI.add(lllllllllllllIlIIllIIIIIIllIllll, lllllllllllllIlIIllIIIIIIllIllIl, lllllllllllllIlIIllIIIIIIllIlllI)).getBlock(), this) && lIlllIIIllIlIIl(--lllllllllllllIlIIllIIIIIIlllIIIl)) {
                            lllllllllllllIlIIllIIIIIIlllIIII = (BlockVine.lIIIIlIIlIlllI[1] != 0);
                            "".length();
                            if ("   ".length() < ((0xE8 ^ 0x9D ^ (0x68 ^ 0x52)) & (0x1 ^ 0x24 ^ (0x4D ^ 0x27) ^ -" ".length()))) {
                                return;
                            }
                            break Label_0246;
                        }
                        else {
                            ++lllllllllllllIlIIllIIIIIIllIllIl;
                        }
                    }
                    ++lllllllllllllIlIIllIIIIIIllIlllI;
                }
                ++lllllllllllllIlIIllIIIIIIllIllll;
            }
            final EnumFacing lllllllllllllIlIIllIIIIIIllIllII = EnumFacing.random(lllllllllllllIlIIllIIIIIIlllIIll);
            final BlockPos lllllllllllllIlIIllIIIIIIllIlIll = lllllllllllllIlIIllIIIIIIlIlIllI.up();
            if (lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIIllIllII, EnumFacing.UP) && lIlllIIIllIlIll(lllllllllllllIlIIllIIIIIIlIlIllI.getY(), BlockVine.lIIIIlIIlIlllI[7]) && lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIlllIllI.isAirBlock(lllllllllllllIlIIllIIIIIIllIlIll) ? 1 : 0)) {
                if (lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIIlllIIII ? 1 : 0)) {
                    IBlockState lllllllllllllIlIIllIIIIIIllIlIlI = lllllllllllllIlIIllIIIIIIlIlIlIl;
                    final Iterator<EnumFacing> iterator = EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if ((0xB4 ^ 0xB0) == 0x0) {
                        return;
                    }
                    while (!lIlllIIIllIIllI(iterator.hasNext() ? 1 : 0)) {
                        final EnumFacing lllllllllllllIlIIllIIIIIIllIlIIl = iterator.next();
                        if (!lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIIlllIIll.nextBoolean() ? 1 : 0) || lIlllIIIllIIllI(this.canPlaceOn(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIllIlIll.offset(lllllllllllllIlIIllIIIIIIllIlIIl)).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIllIlIlI = lllllllllllllIlIIllIIIIIIllIlIlI.withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIlIIl), (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0));
                        }
                    }
                    if (!lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIllIlIlI.getValue((IProperty<Boolean>)BlockVine.NORTH)) ? 1 : 0) || !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIllIlIlI.getValue((IProperty<Boolean>)BlockVine.EAST)) ? 1 : 0) || !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIllIlIlI.getValue((IProperty<Boolean>)BlockVine.SOUTH)) ? 1 : 0) || lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIllIlIlI.getValue((IProperty<Boolean>)BlockVine.WEST)) ? 1 : 0)) {
                        lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIlIll, lllllllllllllIlIIllIIIIIIllIlIlI, BlockVine.lIIIIlIIlIlllI[2]);
                        "".length();
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                }
            }
            else if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIllII.getAxis().isHorizontal() ? 1 : 0) && lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIlIlIl.getValue((IProperty<Boolean>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIllII))) ? 1 : 0)) {
                if (lIlllIIIllIIllI(lllllllllllllIlIIllIIIIIIlllIIII ? 1 : 0)) {
                    final BlockPos lllllllllllllIlIIllIIIIIIllIlIII = lllllllllllllIlIIllIIIIIIlIlIllI.offset(lllllllllllllIlIIllIIIIIIllIllII);
                    final Block lllllllllllllIlIIllIIIIIIllIIlll = lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIllIlIII).getBlock();
                    if (lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIIllIIlll.blockMaterial, Material.air)) {
                        final EnumFacing lllllllllllllIlIIllIIIIIIllIIllI = lllllllllllllIlIIllIIIIIIllIllII.rotateY();
                        final EnumFacing lllllllllllllIlIIllIIIIIIllIIlIl = lllllllllllllIlIIllIIIIIIllIllII.rotateYCCW();
                        final boolean lllllllllllllIlIIllIIIIIIllIIlII = lllllllllllllIlIIllIIIIIIlIlIlIl.getValue((IProperty<Boolean>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIIllI));
                        final boolean lllllllllllllIlIIllIIIIIIllIIIll = lllllllllllllIlIIllIIIIIIlIlIlIl.getValue((IProperty<Boolean>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIIlIl));
                        final BlockPos lllllllllllllIlIIllIIIIIIllIIIlI = lllllllllllllIlIIllIIIIIIllIlIII.offset(lllllllllllllIlIIllIIIIIIllIIllI);
                        final BlockPos lllllllllllllIlIIllIIIIIIllIIIIl = lllllllllllllIlIIllIIIIIIllIlIII.offset(lllllllllllllIlIIllIIIIIIllIIlIl);
                        if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIIlII ? 1 : 0) && lIlllIIIllIIlIl(this.canPlaceOn(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIllIIIlI).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIlIII, this.getDefaultState().withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIIllI), (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0)), BlockVine.lIIIIlIIlIlllI[2]);
                            "".length();
                            "".length();
                            if (-" ".length() >= ((0x36 ^ 0x19) & ~(0x6 ^ 0x29))) {
                                return;
                            }
                        }
                        else if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIIIll ? 1 : 0) && lIlllIIIllIIlIl(this.canPlaceOn(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIllIIIIl).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIlIII, this.getDefaultState().withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIIlIl), (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0)), BlockVine.lIIIIlIIlIlllI[2]);
                            "".length();
                            "".length();
                            if (-" ".length() >= (0x84 ^ 0xC1 ^ (0x4D ^ 0xC))) {
                                return;
                            }
                        }
                        else if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIIlII ? 1 : 0) && lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIlllIllI.isAirBlock(lllllllllllllIlIIllIIIIIIllIIIlI) ? 1 : 0) && lIlllIIIllIIlIl(this.canPlaceOn(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIlIlIllI.offset(lllllllllllllIlIIllIIIIIIllIIllI)).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIIIlI, this.getDefaultState().withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIllII.getOpposite()), (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0)), BlockVine.lIIIIlIIlIlllI[2]);
                            "".length();
                            "".length();
                            if (((32 + 91 - 58 + 139 ^ 33 + 6 + 33 + 122) & (0x1B ^ 0x30 ^ (0xB8 ^ 0x9D) ^ -" ".length())) != 0x0) {
                                return;
                            }
                        }
                        else if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIIIll ? 1 : 0) && lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIlllIllI.isAirBlock(lllllllllllllIlIIllIIIIIIllIIIIl) ? 1 : 0) && lIlllIIIllIIlIl(this.canPlaceOn(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIlIlIllI.offset(lllllllllllllIlIIllIIIIIIllIIlIl)).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIIIIl, this.getDefaultState().withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIllII.getOpposite()), (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0)), BlockVine.lIIIIlIIlIlllI[2]);
                            "".length();
                            "".length();
                            if (-(0xA7 ^ 0x84 ^ (0x57 ^ 0x70)) > 0) {
                                return;
                            }
                        }
                        else if (lIlllIIIllIIlIl(this.canPlaceOn(lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIllIlIII.up()).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIlIII, this.getDefaultState(), BlockVine.lIIIIlIIlIlllI[2]);
                            "".length();
                            "".length();
                            if (((0x5C ^ 0x55 ^ (0x2 ^ 0x54)) & (46 + 41 - 63 + 180 ^ 70 + 92 - 20 + 5 ^ -" ".length())) != ((66 + 106 - 56 + 136 ^ 90 + 100 - 93 + 90) & (99 + 15 + 22 + 111 ^ 99 + 76 - 143 + 144 ^ -" ".length()))) {
                                return;
                            }
                        }
                    }
                    else if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIIlll.blockMaterial.isOpaque() ? 1 : 0) && lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIllIIlll.isFullCube() ? 1 : 0)) {
                        lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIlIlIllI, lllllllllllllIlIIllIIIIIIlIlIlIl.withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIllIllII), (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0)), BlockVine.lIIIIlIIlIlllI[2]);
                        "".length();
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                }
            }
            else if (lIlllIIIllIlIlI(lllllllllllllIlIIllIIIIIIlIlIllI.getY(), BlockVine.lIIIIlIIlIlllI[1])) {
                final BlockPos lllllllllllllIlIIllIIIIIIllIIIII = lllllllllllllIlIIllIIIIIIlIlIllI.down();
                final IBlockState lllllllllllllIlIIllIIIIIIlIlllll = lllllllllllllIlIIllIIIIIIlllIllI.getBlockState(lllllllllllllIlIIllIIIIIIllIIIII);
                final Block lllllllllllllIlIIllIIIIIIlIllllI = lllllllllllllIlIIllIIIIIIlIlllll.getBlock();
                if (lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIIlIllllI.blockMaterial, Material.air)) {
                    IBlockState lllllllllllllIlIIllIIIIIIlIlllIl = lllllllllllllIlIIllIIIIIIlIlIlIl;
                    final Iterator<EnumFacing> iterator2 = EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIlllIIIllIIllI(iterator2.hasNext() ? 1 : 0)) {
                        final EnumFacing lllllllllllllIlIIllIIIIIIlIlllII = iterator2.next();
                        if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIlllIIll.nextBoolean() ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlIlllIl = lllllllllllllIlIIllIIIIIIlIlllIl.withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIlIlllII), (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0));
                        }
                    }
                    if (!lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIlllIl.getValue((IProperty<Boolean>)BlockVine.NORTH)) ? 1 : 0) || !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIlllIl.getValue((IProperty<Boolean>)BlockVine.EAST)) ? 1 : 0) || !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIlllIl.getValue((IProperty<Boolean>)BlockVine.SOUTH)) ? 1 : 0) || lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIlIlllIl.getValue((IProperty<Boolean>)BlockVine.WEST)) ? 1 : 0)) {
                        lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIIIII, lllllllllllllIlIIllIIIIIIlIlllIl, BlockVine.lIIIIlIIlIlllI[2]);
                        "".length();
                        "".length();
                        if (((89 + 204 - 120 + 64 ^ 86 + 150 - 222 + 164) & (0x67 ^ 0x6 ^ (0x8 ^ 0x36) ^ -" ".length())) < 0) {
                            return;
                        }
                    }
                }
                else if (lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIIlIllllI, this)) {
                    IBlockState lllllllllllllIlIIllIIIIIIlIllIll = lllllllllllllIlIIllIIIIIIlIlllll;
                    final Iterator<EnumFacing> iterator3 = EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    while (!lIlllIIIllIIllI(iterator3.hasNext() ? 1 : 0)) {
                        final EnumFacing lllllllllllllIlIIllIIIIIIlIllIlI = iterator3.next();
                        final PropertyBool lllllllllllllIlIIllIIIIIIlIllIIl = getPropertyFor(lllllllllllllIlIIllIIIIIIlIllIlI);
                        if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIlllIIll.nextBoolean() ? 1 : 0) && lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIlIlIlIl.getValue((IProperty<Boolean>)lllllllllllllIlIIllIIIIIIlIllIIl)) ? 1 : 0)) {
                            lllllllllllllIlIIllIIIIIIlIllIll = lllllllllllllIlIIllIIIIIIlIllIll.withProperty((IProperty<Comparable>)lllllllllllllIlIIllIIIIIIlIllIIl, (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0));
                        }
                    }
                    if (!lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIllIll.getValue((IProperty<Boolean>)BlockVine.NORTH)) ? 1 : 0) || !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIllIll.getValue((IProperty<Boolean>)BlockVine.EAST)) ? 1 : 0) || !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIIlIllIll.getValue((IProperty<Boolean>)BlockVine.SOUTH)) ? 1 : 0) || lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIlIllIll.getValue((IProperty<Boolean>)BlockVine.WEST)) ? 1 : 0)) {
                        lllllllllllllIlIIllIIIIIIlllIllI.setBlockState(lllllllllllllIlIIllIIIIIIllIIIII, lllllllllllllIlIIllIIIIIIlIllIll, BlockVine.lIIIIlIIlIlllI[2]);
                        "".length();
                    }
                }
            }
        }
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIIllIIIIIIlIIIIlI, final BlockPos lllllllllllllIlIIllIIIIIIlIIIIIl, final EnumFacing lllllllllllllIlIIllIIIIIIIlllIII, final float lllllllllllllIlIIllIIIIIIIllllll, final float lllllllllllllIlIIllIIIIIIIlllllI, final float lllllllllllllIlIIllIIIIIIIllllIl, final int lllllllllllllIlIIllIIIIIIIllllII, final EntityLivingBase lllllllllllllIlIIllIIIIIIIlllIll) {
        final IBlockState lllllllllllllIlIIllIIIIIIIlllIlI = this.getDefaultState().withProperty((IProperty<Comparable>)BlockVine.UP, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.NORTH, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.EAST, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.SOUTH, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)).withProperty((IProperty<Comparable>)BlockVine.WEST, (boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0));
        IBlockState withProperty;
        if (lIlllIIIllIIlIl(lllllllllllllIlIIllIIIIIIIlllIII.getAxis().isHorizontal() ? 1 : 0)) {
            withProperty = lllllllllllllIlIIllIIIIIIIlllIlI.withProperty((IProperty<Comparable>)getPropertyFor(lllllllllllllIlIIllIIIIIIIlllIII.getOpposite()), (boolean)(BlockVine.lIIIIlIIlIlllI[1] != 0));
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            withProperty = lllllllllllllIlIIllIIIIIIIlllIlI;
        }
        return withProperty;
    }
    
    private boolean recheckGrownSides(final World lllllllllllllIlIIllIIIIIlIlIlIIl, final BlockPos lllllllllllllIlIIllIIIIIlIllIIII, IBlockState lllllllllllllIlIIllIIIIIlIlIIlll) {
        final IBlockState lllllllllllllIlIIllIIIIIlIlIlllI = (IBlockState)lllllllllllllIlIIllIIIIIlIlIIlll;
        final Exception lllllllllllllIlIIllIIIIIlIlIIlII = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (((0x6A ^ 0x3A ^ (0x68 ^ 0x1B)) & (0xD4 ^ 0x99 ^ (0xC0 ^ 0xAE) ^ -" ".length())) < 0) {
            return ((0x61 ^ 0x7D ^ (0x2A ^ 0x72)) & (0x15 ^ 0x1B ^ (0x6 ^ 0x4C) ^ -" ".length())) != 0x0;
        }
        while (!lIlllIIIllIIllI(((Iterator)lllllllllllllIlIIllIIIIIlIlIIlII).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIlIIllIIIIIlIlIllIl = ((Iterator<EnumFacing>)lllllllllllllIlIIllIIIIIlIlIIlII).next();
            final PropertyBool lllllllllllllIlIIllIIIIIlIlIllII = getPropertyFor(lllllllllllllIlIIllIIIIIlIlIllIl);
            if (lIlllIIIllIIlIl(((boolean)((IBlockState)lllllllllllllIlIIllIIIIIlIlIIlll).getValue((IProperty<Boolean>)lllllllllllllIlIIllIIIIIlIlIllII)) ? 1 : 0) && lIlllIIIllIIllI(this.canPlaceOn(lllllllllllllIlIIllIIIIIlIlIlIIl.getBlockState(lllllllllllllIlIIllIIIIIlIllIIII.offset(lllllllllllllIlIIllIIIIIlIlIllIl)).getBlock()) ? 1 : 0)) {
                final IBlockState lllllllllllllIlIIllIIIIIlIlIlIll = lllllllllllllIlIIllIIIIIlIlIlIIl.getBlockState(lllllllllllllIlIIllIIIIIlIllIIII.up());
                if (lIlllIIIllIIlll(lllllllllllllIlIIllIIIIIlIlIlIll.getBlock(), this) && !lIlllIIIllIIllI(((boolean)lllllllllllllIlIIllIIIIIlIlIlIll.getValue((IProperty<Boolean>)lllllllllllllIlIIllIIIIIlIlIllII)) ? 1 : 0)) {
                    continue;
                }
                lllllllllllllIlIIllIIIIIlIlIIlll = ((IBlockState)lllllllllllllIlIIllIIIIIlIlIIlll).withProperty((IProperty<Comparable>)lllllllllllllIlIIllIIIIIlIlIllII, Boolean.valueOf((boolean)(BlockVine.lIIIIlIIlIlllI[0] != 0)));
            }
        }
        if (lIlllIIIllIIllI(getNumGrownFaces((IBlockState)lllllllllllllIlIIllIIIIIlIlIIlll))) {
            return BlockVine.lIIIIlIIlIlllI[0] != 0;
        }
        if (lIlllIIIllIlIII(lllllllllllllIlIIllIIIIIlIlIlllI, lllllllllllllIlIIllIIIIIlIlIIlll)) {
            lllllllllllllIlIIllIIIIIlIlIlIIl.setBlockState(lllllllllllllIlIIllIIIIIlIllIIII, (IBlockState)lllllllllllllIlIIllIIIIIlIlIIlll, BlockVine.lIIIIlIIlIlllI[2]);
            "".length();
        }
        return BlockVine.lIIIIlIIlIlllI[1] != 0;
    }
    
    private static String lIlllIIIlIlIIll(final String lllllllllllllIlIIlIlllllllllIIlI, final String lllllllllllllIlIIlIllllllllIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlllllllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllllllllIllll.getBytes(StandardCharsets.UTF_8)), BlockVine.lIIIIlIIlIlllI[8]), "DES");
            final Cipher lllllllllllllIlIIlIlllllllllIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlllllllllIlII.init(BlockVine.lIIIIlIIlIlllI[2], lllllllllllllIlIIlIlllllllllIlIl);
            return new String(lllllllllllllIlIIlIlllllllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlllllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlllllllllIIll) {
            lllllllllllllIlIIlIlllllllllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIllIIIIIIIIlIIlI) {
        int lllllllllllllIlIIllIIIIIIIIlIIll = BlockVine.lIIIIlIIlIlllI[0];
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIIIlIIlI.getValue((IProperty<Boolean>)BlockVine.SOUTH)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIIIIlIIll |= BlockVine.lIIIIlIIlIlllI[1];
        }
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIIIlIIlI.getValue((IProperty<Boolean>)BlockVine.WEST)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIIIIlIIll |= BlockVine.lIIIIlIIlIlllI[2];
        }
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIIIlIIlI.getValue((IProperty<Boolean>)BlockVine.NORTH)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIIIIlIIll |= BlockVine.lIIIIlIIlIlllI[4];
        }
        if (lIlllIIIllIIlIl(((boolean)lllllllllllllIlIIllIIIIIIIIlIIlI.getValue((IProperty<Boolean>)BlockVine.EAST)) ? 1 : 0)) {
            lllllllllllllIlIIllIIIIIIIIlIIll |= BlockVine.lIIIIlIIlIlllI[8];
        }
        return lllllllllllllIlIIllIIIIIIIIlIIll;
    }
    
    private static boolean lIlllIIIllIIllI(final int lllllllllllllIlIIlIllllllIlIlllI) {
        return lllllllllllllIlIIlIllllllIlIlllI == 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIIllIIIIIIIllIlIl, final Random lllllllllllllIlIIllIIIIIIIllIlII, final int lllllllllllllIlIIllIIIIIIIllIIll) {
        return null;
    }
}
